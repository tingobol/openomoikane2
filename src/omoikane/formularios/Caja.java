/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Caja.java
 *
 * Created on 8/12/2008, 10:47:24 PM
 */

package omoikane.formularios;

import java.awt.image.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Usuario
 */
public class Caja extends javax.swing.JInternalFrame {

    BufferedImage          fondo;
    DefaultTableModel      modelo;
    Double                 impuestos = 0.0;
    /** Creates new form Caja */
    public Caja() {
        initComponents();

        this.setOpaque(false);
        ((JPanel)this.getContentPane()).setOpaque(false);
        this.getLayeredPane().setOpaque(false);
        this.getRootPane().setOpaque(false);
        this.generarFondo(this);
        modelo = (DefaultTableModel)this.tablaVenta.getModel();
    }
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
      g2d.setColor(new Color(55,55,255,165));
      g2d.fillRect(0,0,areaDibujo.width,areaDibujo.height);
      fondo = tmp;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        btnTerminar = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        btnCancelacion = new javax.swing.JButton();
        txtCaptura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNArticulos = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        btnCancelacion1 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Caja 1");

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/64x64/back.png"))); // NOI18N
        btnCerrar.setText("Cerrar [Esc]");
        btnCerrar.setRequestFocusEnabled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Artículo", "Concepto", "Cantidad", "Precio", "Descuento", "Total"
            }
        ));
        jScrollPane1.setViewportView(tablaVenta);

        btnTerminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32x32/accept.png"))); // NOI18N
        btnTerminar.setText("Terminar Venta[Enter]");

        btnCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32x32/page_search.png"))); // NOI18N
        btnCatalogo.setText("Buscar Artículo [F2]");
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });

        btnCancelacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32x32/page_remove.png"))); // NOI18N
        btnCancelacion.setText("Cancelar Venta [F12]");
        btnCancelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelacionActionPerformed(evt);
            }
        });

        txtCaptura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapturaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Captura");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("A0000000");

        jPanel3.setBackground(new Color(255,255,255,165));

        jPanel1.setBackground(new Color(255,0,0,235));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 31, 15);

        txtTotal.setBackground(new java.awt.Color(153, 51, 0));
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 42));
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotal.setText("$ 0.00");
        jPanel1.add(txtTotal);
        txtTotal.setBounds(0, 10, 250, 60);

        jPanel2.setBackground(new Color(0,255,0,220));
        jPanel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Descuento");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 0, 70, 15);

        txtDescuento.setBackground(new java.awt.Color(153, 51, 0));
        txtDescuento.setFont(new java.awt.Font("Tahoma", 1, 24));
        txtDescuento.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescuento.setText("$ 0.00");
        jPanel2.add(txtDescuento);
        txtDescuento.setBounds(0, 10, 250, 30);

        jPanel4.setBackground(new Color(55,55,255,160));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Artículos");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(0, 0, 60, 15);

        txtNArticulos.setBackground(new java.awt.Color(153, 51, 0));
        txtNArticulos.setFont(new java.awt.Font("Tahoma", 1, 24));
        txtNArticulos.setForeground(new java.awt.Color(255, 255, 255));
        txtNArticulos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNArticulos.setText("0");
        jPanel4.add(txtNArticulos);
        txtNArticulos.setBounds(0, 10, 250, 30);

        jPanel5.setBackground(new Color(55,55,255,160));
        jPanel5.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Cliente");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(0, 0, 60, 15);

        jLabel13.setBackground(new java.awt.Color(153, 51, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Público en general");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(0, 10, 250, 30);

        jPanel6.setBackground(new Color(55,55,255,160));
        jPanel6.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Fecha");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(0, 0, 60, 15);

        txtFecha.setBackground(new java.awt.Color(153, 51, 0));
        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 24));
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFecha.setText("09-12-2008");
        jPanel6.add(txtFecha);
        txtFecha.setBounds(0, 10, 250, 30);

        jPanel7.setBackground(new Color(55,55,255,160));
        jPanel7.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Subtotal");
        jPanel7.add(jLabel16);
        jLabel16.setBounds(0, 0, 60, 15);

        txtSubtotal.setBackground(new java.awt.Color(153, 51, 0));
        txtSubtotal.setFont(new java.awt.Font("Tahoma", 1, 24));
        txtSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        txtSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSubtotal.setText("0");
        jPanel7.add(txtSubtotal);
        txtSubtotal.setBounds(0, 10, 250, 30);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32x32/page_remove.png"))); // NOI18N
        btnCancelacion1.setText("Cancelar Artículo [Supr]");
        btnCancelacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelacion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(174, 174, 174))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(363, 363, 363)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCaptura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTerminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCatalogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelacion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelacion)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelacion)
                            .addComponent(btnCatalogo)
                            .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelacion1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        if(!omoikane.sistema.Usuarios.cerrojo(omoikane.sistema.Usuarios.SUPERVISOR)){
        this.dispose();
        omoikane.principal.Principal.cerrarSesion();
        }else{
        this.dispose();
        ((javax.swing.JInternalFrame)((omoikane.principal.MenuPrincipal)omoikane.principal.Principal.getMenuPrincipal()).getMenuPrincipal()).requestFocusInWindow();}
}//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        // TODO add your handling code here:

}//GEN-LAST:event_btnCatalogoActionPerformed

    private void btnCancelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelacionActionPerformed
        // TODO add your handling code here:
        
}//GEN-LAST:event_btnCancelacionActionPerformed

    private void txtCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapturaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtCapturaActionPerformed

    private void btnCancelacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelacion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelacion1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelacion;
    private javax.swing.JButton btnCancelacion1;
    public javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaVenta;
    public javax.swing.JTextField txtCaptura;
    private javax.swing.JLabel txtDescuento;
    public javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtNArticulos;
    private javax.swing.JLabel txtSubtotal;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables

}
