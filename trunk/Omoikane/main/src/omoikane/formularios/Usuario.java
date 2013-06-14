
/* Author Phesus        //////////////////////////////
 *  ORC,ACR             /////////////
 *                     /////////////
 *                    /////////////
 *                   /////////////
 * //////////////////////////////                   */

package omoikane.formularios;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPEnrollmentFactory;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import omoikane.principal.Principal;
import omoikane.sistema.*;
import omoikane.sistema.huellas.EnrollmentDialog;
import omoikane.sistema.huellas.MiniLeerHuella;
import omoikane.sistema.huellas.TemplateMap;
import org.apache.log4j.Logger;

public class Usuario extends javax.swing.JInternalFrame {

    BufferedImage fondo;
    public int ID;
    public byte[] huella1;
    public byte[] huella2;
    public byte[] huella3;
    private TemplateMap templates = new TemplateMap();

    public static Logger logger        = Logger.getLogger(Usuario.class);
    /** Creates new form Articulo */
    public Usuario() {
        initComponents();
        //Instrucciones para el funcionamiento del fondo semistransparente
        this.HA2.setVisible(false);
        this.HA3.setVisible(false);
        this.JH2.setVisible(false);
        this.JH3.setVisible(false);
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
        txtIDUSR = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUModificacion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPerfil = new javax.swing.JComboBox();
        txtNIP = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        JH3 = new javax.swing.JButton();
        JH1 = new javax.swing.JButton();
        JH2 = new javax.swing.JButton();
        HA1 = new javax.swing.JLabel();
        HA2 = new javax.swing.JLabel();
        HA3 = new javax.swing.JLabel();

        setTitle("Usuario");
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html><head><style type='text/css'>body { font-family: 'Roboto Thin'; font-size: 28px; }</style></head>\n<body>\nUsuario\n</body></html>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnCerrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCerrar.setText("Cerrar [ESC]");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 107, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha de Alta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Huella 1:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        txtIDUSR.setEditable(false);
        txtIDUSR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtIDUSR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDUSR.setFocusable(false);
        getContentPane().add(txtIDUSR, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 70, 260, 25));

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setFocusable(false);
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 100, 260, 25));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Huella 2:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Perfil:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txtUModificacion.setEditable(false);
        txtUModificacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUModificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUModificacion.setFocusable(false);
        getContentPane().add(txtUModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 320, 260, 25));

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar [F6]");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 107, 30));

        btnModificar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnModificar.setText("Modificar [F6]");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 107, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 130, 260, 25));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("N.I.P.:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Huella 3:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("<html>Última<br>Modificación:</html>");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        txtPerfil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cajero", "Capturista", "Supervisor", "Gerente", "Administrador", "Propietario" }));
        txtPerfil.setEnabled(false);
        txtPerfil.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        txtPerfil.setMinimumSize(new java.awt.Dimension(6, 21));
        txtPerfil.setPreferredSize(new java.awt.Dimension(6, 21));
        getContentPane().add(txtPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 280, 260, 25));

        txtNIP.setEditable(false);
        txtNIP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 250, 260, 25));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 10, 10));

        JH3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JH3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/record.png"))); // NOI18N
        JH3.setText("Capturar Huella");
        JH3.setEnabled(false);
        getContentPane().add(JH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 220, 210, 25));

        JH1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/record.png"))); // NOI18N
        JH1.setText("Capturar Huella");
        JH1.setEnabled(false);
        JH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JH1ActionPerformed(evt);
            }
        });
        getContentPane().add(JH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 160, 210, 25));

        JH2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JH2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/record.png"))); // NOI18N
        JH2.setText("Capturar Huella");
        JH2.setEnabled(false);
        getContentPane().add(JH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 190, 210, 25));

        HA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/accept.png"))); // NOI18N
        HA1.setEnabled(false);
        getContentPane().add(HA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, 20));

        HA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/accept.png"))); // NOI18N
        HA2.setEnabled(false);
        getContentPane().add(HA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, 20));

        HA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/accept.png"))); // NOI18N
        HA3.setEnabled(false);
        getContentPane().add(HA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Usuarios.guardar(this);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Usuarios.modificar(this);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void JH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JH1ActionPerformed
        // TODO add your handling code here:
        final Frame usuarioFrame = (Frame) Principal.getEscritorio().getEscritorioFrame();
        (new Thread() {
            public void run() {

                EnrollmentDialog enrollmentDialog = new EnrollmentDialog(usuarioFrame, 10, null, getTemplates());
                enrollmentDialog.setVisible(true);

                huella1 = templates.serializar();

                if(huella1!=null)
                {HA1.setEnabled(true);
                JH1.requestFocusInWindow();}
            }
        }
        ).start();
}//GEN-LAST:event_JH1ActionPerformed


    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        this.JH1.requestFocusInWindow();
    }//GEN-LAST:event_formFocusGained

    public void setEditable(boolean editable)
    {
        this.txtNombre.setEditable(editable);
        this.txtPerfil.setEnabled(editable);
        this.txtNIP.setEditable(editable);
    }

    public void setModoDetalles()
    {
        setEditable(false);
        this.btnGuardar.setVisible(false);
        this.btnModificar.setVisible(false);
        this.HA1.setEnabled(true);
        this.HA2.setEnabled(true);
        this.HA3.setEnabled(true);

    }

    public void setModoModificar()
    {
        setEditable(true);
        this.btnGuardar.setVisible(false);
        this.btnModificar.setVisible(true);
        this.HA1.setEnabled(true);
        this.HA2.setEnabled(true);
        this.HA3.setEnabled(true);
        this.JH1.setEnabled(true);
        this.JH2.setEnabled(true);
        this.JH3.setEnabled(true);
    }

    public void setModoNuevo()
    {
        setEditable(true);
        this.btnModificar.setVisible(false);
        this.JH1.setEnabled(true);
        this.JH2.setEnabled(true);
        this.JH3.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HA1;
    private javax.swing.JLabel HA2;
    private javax.swing.JLabel HA3;
    private javax.swing.JButton JH1;
    private javax.swing.JButton JH2;
    private javax.swing.JButton JH3;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIDUSR;
    private javax.swing.JPasswordField txtNIP;
    public javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox txtPerfil;
    private javax.swing.JTextField txtUModificacion;
    // End of variables declaration//GEN-END:variables

    public String getTxtIDUSR()         { return txtIDUSR.getText();                            }
    public String getTxtFecha()         { return txtFecha.getText();                            }
    public byte[] getTxtH1()            { return huella1;                                       }
    public byte[] getTxtH2()            { return huella2;                                       }
    public byte[] getTxtH3()            { return huella3;                                       }
    public String getTxtNombre()        { return txtNombre.getText();                           }
    public String getTxtNIP()           { return txtNIP.getText();                              }
    public String getTxtUModificacion() { return txtUModificacion.getText();                    }
    public String getTxtPerfil()        { return String.valueOf(txtPerfil.getSelectedItem());   }

    public void setTxtPerfil(String txt)        { txtPerfil.setSelectedItem(txt);}
    public void setTxtIDUSR(String txt)         { txtIDUSR.setText(txt);         }
    public void setTxtFecha(String txt)         { txtFecha.setText(txt);         }
    public void setTxtNombre(String Nombre)     { txtNombre.setText(Nombre);     }
    public void setTxtNIP(String cp)            { txtNIP.setText(cp);            }
    public void setTxtUModificacion(String txt) { txtUModificacion.setText(txt); }

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

    public TemplateMap getTemplates() {
        return templates;
    }

    public void setTemplates(TemplateMap templates) {
        this.templates = templates;
    }
}