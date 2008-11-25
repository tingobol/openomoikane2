/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package omoikane.principal

import omoikane.principal.*
import omoikane.sistema.*
import groovy.sql.*;

/**
 *
 * @author Octavio
 */
class Grupos {
    static def queryGrupos  = ""
    static def escritorio = omoikane.principal.Principal.escritorio

      
    static def lanzarCatalogo()
    {
        def cat = (new omoikane.formularios.CatalogoGrupos())
        cat.setVisible(true);
        escritorio.getPanelEscritorio().add(cat)
        cat.toFront()
        try { cat.setSelected(true) } catch(Exception e) { Dialogos.lanzarDialogoError(null, "Error al iniciar formulario catálogo de Grupos", Herramientas.getStackTraceString(e)) }
        cat.txtBusqueda.requestFocus()
        poblarGrupos(cat.getTablaGrupos(),"")

    }

    static def lanzarFormNuevoGrupo()
    {
        def formGrupo = new omoikane.formularios.Grupo()
        formGrupo.setVisible(true)
        escritorio.getPanelEscritorio().add(formGrupo)
        formGrupo.toFront()
        try { formGrupo.setSelected(true) } catch(Exception e) { Dialogos.lanzarDialogoError(null, "Error al iniciar formulario detalles Grupo", Herramientas.getStackTraceString(e)) }
        formGrupo.setEditable(true);
        formGrupo.setModoNuevo();
        formGrupo
    }

        static def guardar(formGrupo)
    {
        def descripcion = formGrupo.getTxtDescripcion()

        def db = Sql.newInstance("jdbc:mysql://localhost/omoikane?user=root&password=", "root", "", "com.mysql.jdbc.Driver")
        def tablaGrupos = db.dataSet('grupos')
        tablaGrupos.add(descripcion:descripcion)
        db.close()
        Dialogos.lanzarAlerta("Grupo $descripcion agregado.")
        formGrupo.dispose()
    }

    static def lanzarDetallesGrupo(ID)
    {
        def formGrupo = new omoikane.formularios.Grupo()
        formGrupo.setVisible(true)
        escritorio.getPanelEscritorio().add(formGrupo)
        formGrupo.toFront()
        try { formGrupo.setSelected(true) } catch(Exception e) { Dialogos.lanzarDialogoError(null, "Error al iniciar formulario detalles Grupo", Herramientas.getStackTraceString(e)) }

        def db   = Sql.newInstance("jdbc:mysql://localhost/omoikane?user=root&password=", "root", "", "com.mysql.jdbc.Driver")
        def grupo = db.rows("SELECT * FROM grupos WHERE id_grupo = $ID")

        formGrupo.setTxtIDGrupo    ((String)grupo[0].id_grupo)
        formGrupo.setTxtDescripcion   (grupo[0].descripcion)
        formGrupo.setTxtDescuento     ((Double)grupo[0].descuento as String)
        formGrupo.setTxtUModificacion (grupo[0].uModificacion as String)
        formGrupo.setModoDetalles();

        db.close()
        formGrupo
    }

    static def poblarGrupos(tablaMovs,txtBusqueda)
    {

        def dataTabMovs = tablaMovs.getModel()
         try {
            def db = Sql.newInstance("jdbc:mysql://localhost/omoikane?user=root&password=", "root", "", "com.mysql.jdbc.Driver")
            def movimientos = db.rows(queryGrupos =("SELECT * FROM grupos WHERE (descripcion LIKE '%"+txtBusqueda+"%' OR id_grupo LIKE '%"+txtBusqueda+"%')") )
            db.close()
            def filaNva = []

            movimientos.each {
                filaNva = [it.id_grupo, it.descripcion]
                dataTabMovs.addRow(filaNva.toArray())
            }
        } catch(Exception e) {
            Dialogos.lanzarDialogoError(null, "Error grave. No hay conexion con la base de datos!", omoikane.sistema.Herramientas.getStackTraceString(e))
        }
    }

    static def lanzarModificarGrupo(ID)
    {
        def formGrupo = new omoikane.formularios.Grupo()
        formGrupo.setVisible(true)
        escritorio.getPanelEscritorio().add(formGrupo)
        formGrupo.toFront()
        try { formGrupo.setSelected(true) } catch(Exception e) { Dialogos.lanzarDialogoError(null, "Error al iniciar formulario detalles Grupo", Herramientas.getStackTraceString(e)) }

        def db   = Sql.newInstance("jdbc:mysql://localhost/omoikane?user=root&password=", "root", "", "com.mysql.jdbc.Driver")
        def grupo = db.rows("SELECT * FROM grupos WHERE id_grupo = $ID")
        db.close()

        formGrupo.setTxtIDGrupo    ((String)grupo[0].id_grupo)
        formGrupo.setTxtDescripcion   (grupo[0].descripcion)
        formGrupo.setTxtDescuento    ((Double)grupo[0].descuento as String)
        formGrupo.setTxtUModificacion (grupo[0].uModificacion as String)
        formGrupo.setModoModificar();
        formGrupo
    }
    static def modificar(formGrupo)
    {
        def db   = Sql.newInstance("jdbc:mysql://localhost/omoikane?user=root&password=", "root", "", "com.mysql.jdbc.Driver")
        db.executeUpdate("UPDATE grupos SET descripcion = ? , descuento = ? WHERE id_grupo = ?"
            , [
                formGrupo.getTxtDescripcion(),
                formGrupo.getTxtDescuento(),
                formGrupo.getTxtIDGrupo()
            ])
        Dialogos.lanzarAlerta("Grupo modificado con éxito!")
    }

        static def eliminarGrupo(ID)
    {
        def db = Sql.newInstance("jdbc:mysql://localhost/omoikane?user=root&password=", "root", "", "com.mysql.jdbc.Driver")
        db.execute("DELETE FROM grupos WHERE id_grupo = " + ID)
        db.close()
        Dialogos.lanzarAlerta("Grupo " + ID + " supuestamente eliminado")
        
    }

        static def lanzarImprimir()
    {
        def reporte = new Reporte('omoikane/reportes/ReporteGrupos.jasper', [QueryTxt:queryGrupos]);
        reporte.lanzarPreview()
    }
}

