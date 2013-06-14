/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Articulo.java
 *
 * Created on 22/08/2008, 07:40:21 PM
 */

package omoikane.formularios;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import omoikane.sistema.*;

/**
 *
 * @author Octavio
 */
public class CorteCajaDetalles extends javax.swing.JInternalFrame {

    BufferedImage fondo;
    public int ID;
    /** Creates new form Articulo */
    public CorteCajaDetalles() {
        initComponents();
        //Instrucciones para el funcionamiento del fondo semistransparente
        this.setOpaque(false);
        ((JPanel)this.getContentPane()).setOpaque(false);
        this.getLayeredPane().setOpaque(false);
        this.getRootPane().setOpaque(false);
        this.generarFondo(this);

        Herramientas.centrarVentana(this);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDCorte = new javax.swing.JTextField();
        txtIDCaja = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroVenta = new javax.swing.JTextField();
        txtHasta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIDAlmacen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtImpuestos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        txtDesde = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtRetiro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDeposito = new javax.swing.JTextField();
        txtEfectivo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setTitle("Corte de Caja");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html><head><style type='text/css'>body { font-family: 'Roboto Thin'; font-size: 28px; }</style></head>\n<body>\nCorte de Caja\n</body></html>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 80, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Corte:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Caja:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Creacion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        txtIDCorte.setEditable(false);
        getContentPane().add(txtIDCorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 260, -1));

        txtIDCaja.setEditable(false);
        getContentPane().add(txtIDCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 260, -1));

        txtFecha.setEditable(false);
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 260, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de Ventas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Subtotal:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hasta:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        txtNumeroVenta.setEditable(false);
        getContentPane().add(txtNumeroVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 260, -1));

        txtHasta.setEditable(false);
        getContentPane().add(txtHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 260, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Almacen:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        txtIDAlmacen.setEditable(false);
        txtIDAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(txtIDAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 260, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Impuesto:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        txtImpuestos.setEditable(false);
        getContentPane().add(txtImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 260, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("total");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 20));

        txtTotal.setEditable(false);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 260, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Descuento:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));

        txtDescuento.setEditable(false);
        getContentPane().add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 260, -1));

        txtDesde.setEditable(false);
        getContentPane().add(txtDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 260, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Desde:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 20));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 10, 10));

        txtSubtotal.setEditable(false);
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 260, -1));

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Retiro:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 20));

        txtRetiro.setEditable(false);
        getContentPane().add(txtRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 260, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Deposito:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 20));

        txtDeposito.setEditable(false);
        getContentPane().add(txtDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 260, -1));

        txtEfectivo.setEditable(false);
        getContentPane().add(txtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 260, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Efectivo en caja:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_btnCerrarActionPerformed

    private void txtIDAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDAlmacenActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtIDAlmacenActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDeposito;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHasta;
    public javax.swing.JTextField txtIDAlmacen;
    private javax.swing.JTextField txtIDCaja;
    private javax.swing.JTextField txtIDCorte;
    private javax.swing.JTextField txtImpuestos;
    private javax.swing.JTextField txtNumeroVenta;
    private javax.swing.JTextField txtRetiro;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables


    public String getTxtDescuento()   { return this.txtDescuento.getText(); }
    public String getTxtDesde()   { return this.txtDesde.getText(); }
    public String getTxtFecha()   { return this.txtFecha.getText(); }
    public String getTxthasta()   { return this.txtHasta.getText(); }
    public String getTxtIDAlmacen()   { return this.txtIDAlmacen.getText(); }
    public String getTxtIDCaja()   { return this.txtIDCaja.getText(); }
    public String getTxtIDCorte()   { return this.txtIDCorte.getText(); }
    public String getTxtImpuesto()   { return this.txtImpuestos.getText(); }
    public String getTxtNumeroVenta()   { return this.txtNumeroVenta.getText(); }
    public String getTxtSubtotal()   { return this.txtSubtotal.getText(); }
    public String getTxtRetiro()   { return this.txtRetiro.getText(); }
    public String getTxtDeposito()   { return this.txtDeposito.getText(); }
    public String getTxtEfectivo()   { return this.txtEfectivo.getText(); }
    public String getTxtTotal()   { return this.txtTotal.getText(); }

    public void setTxtDescuento     (String txt)     { txtDescuento.setText(txt); }
    public void setTxtDesde         (String txt)     { txtDesde.setText(txt); }
    public void setTxtFecha         (String txt)     { txtFecha.setText(txt); }
    public void setTxtHasta         (String txt)     { txtHasta.setText(txt); }
    public void setTxtIDAlmacen     (String txt)     { txtIDAlmacen.setText(txt); }
    public void setTxtIDCaja        (String txt)     { txtIDCaja.setText(txt); }
    public void setTxtIDCorte       (String txt)     { txtIDCorte.setText(txt); }
    public void setTxtImpuesto      (String txt)     { txtImpuestos.setText(txt); }
    public void setTxtNumeroVenta   (String txt)     { txtNumeroVenta.setText(txt); }
    public void setTxtSubtotal      (String txt)     { txtSubtotal.setText(txt); }
    public void setTxtRetiro        (String txt)     { txtRetiro.setText(txt); }
    public void setTxtDeposito      (String txt)     { txtDeposito.setText(txt); }
    public void setTxtEfectivo      (String txt)     { txtEfectivo.setText(txt); }
    public void setTxtTotal         (String txt)     { txtTotal.setText(txt); }

    public void paintComponent(Graphics g)
    {
      Graphics2D g2d = (Graphics2D) g;
      g2d.drawImage(fondo, 0, 0, null);

    }
    public void generarFondo(Component componente)
    {
      Rectangle areaDibujo = this.getBounds();
      BufferedImage tmp;
      GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();

      tmp = gc.createCompatibleImage(areaDibujo.width, areaDibujo.height,BufferedImage.TRANSLUCENT);
      Graphics2D g2d = (Graphics2D) tmp.getGraphics();
      g2d.setColor(new Color(0,0,0,165));
      g2d.fillRect(0,0,areaDibujo.width,areaDibujo.height);
      fondo = tmp;
    }
}