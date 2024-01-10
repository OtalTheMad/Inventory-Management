package forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class menu_main extends javax.swing.JFrame {
    
    private menu_usuarios abrirFormUsuarios;
    
    public menu_main() {
        
        initComponents();
        Color appColor = new Color(153,204,255);
        Color buttonColor = new Color(102,204,255);
       
        
        btnGestionInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btnGestionInventario.setBackground(appColor);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                btnGestionInventario.setBackground(buttonColor);
            }
        });
        btnEdicion.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btnEdicion.setBackground(appColor);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                btnEdicion.setBackground(buttonColor);
            }
        });
        btnListado.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btnListado.setBackground(appColor);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                btnListado.setBackground(buttonColor);
            }
        });
        
    }
    
    //Métodos de Ventanas
    private void abrirMenuUsuarios()
    {
        if (abrirFormUsuarios == null || !abrirFormUsuarios.isVisible())
        {
            abrirFormUsuarios = new menu_usuarios();
            abrirFormUsuarios.setVisible(true);
        }
        else
        {
            abrirFormUsuarios.toFront();
        }
    }
    
    //Métodos de Validación
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layout_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo_label = new javax.swing.JLabel();
        nav_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblUsuarios = new javax.swing.JLabel();
        nav_header = new javax.swing.JPanel();
        logo_label1 = new javax.swing.JLabel();
        btnGestionInventario = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnEdicion = new javax.swing.JButton();
        sidebar1 = new javax.swing.JPanel();
        sidebar2 = new javax.swing.JPanel();
        sidebar3 = new javax.swing.JPanel();
        sidebar4 = new javax.swing.JPanel();
        lowerbar1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnPronto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú - Inventory Management");
        setResizable(false);
        setSize(new java.awt.Dimension(700, 700));
        setType(java.awt.Window.Type.UTILITY);

        layout_panel.setBackground(new java.awt.Color(153, 204, 255));
        layout_panel.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setLayout(null);

        logo_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/icons/logo-black-130.png"))); // NOI18N
        logo_label.setText("<html></html>");
        logo_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(logo_label);
        logo_label.setBounds(150, 10, 70, 80);

        layout_panel.add(jPanel2);
        jPanel2.setBounds(-10, -10, 360, 140);

        nav_panel.setBackground(new java.awt.Color(153, 204, 255));
        nav_panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nav_panel.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Navegación");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nav_panel.add(jLabel2);
        jLabel2.setBounds(30, 10, 140, 30);

        lblInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(0, 0, 0));
        lblInicio.setText("Inicio");
        nav_panel.add(lblInicio);
        lblInicio.setBounds(30, 70, 100, 15);

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nav_panel.add(jSeparator2);
        jSeparator2.setBounds(10, 50, 330, 10);

        lblUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuarios.setText("Usuarios");
        lblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseClicked(evt);
            }
        });
        nav_panel.add(lblUsuarios);
        lblUsuarios.setBounds(30, 110, 100, 15);

        layout_panel.add(nav_panel);
        nav_panel.setBounds(0, 130, 350, 680);

        nav_header.setBackground(new java.awt.Color(102, 204, 255));
        nav_header.setLayout(null);

        logo_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/icons/logo-black-250.png"))); // NOI18N
        logo_label1.setText("<html></html>");
        logo_label1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nav_header.add(logo_label1);
        logo_label1.setBounds(660, 0, 170, 120);

        layout_panel.add(nav_header);
        nav_header.setBounds(350, 0, 860, 130);

        btnGestionInventario.setBackground(new java.awt.Color(102, 204, 255));
        btnGestionInventario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionInventario.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/icons/inventoryManagementIcon32px.png"))); // NOI18N
        btnGestionInventario.setText("<html>GESTIÓN DE INVENTARIO</html>");
        btnGestionInventario.setBorderPainted(false);
        btnGestionInventario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGestionInventario.setVerifyInputWhenFocusTarget(false);
        btnGestionInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionInventarioActionPerformed(evt);
            }
        });
        layout_panel.add(btnGestionInventario);
        btnGestionInventario.setBounds(400, 520, 230, 150);

        btnListado.setBackground(new java.awt.Color(102, 204, 255));
        btnListado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListado.setForeground(new java.awt.Color(0, 0, 0));
        btnListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/icons/clipboardInventoryManagement.png"))); // NOI18N
        btnListado.setText("<html>LISTADO DE PRODUCTOS</html>");
        btnListado.setBorderPainted(false);
        btnListado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnListado.setVerifyInputWhenFocusTarget(false);
        layout_panel.add(btnListado);
        btnListado.setBounds(660, 520, 230, 150);

        btnEdicion.setBackground(new java.awt.Color(102, 204, 255));
        btnEdicion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdicion.setForeground(new java.awt.Color(0, 0, 0));
        btnEdicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/icons/addremove_InventoryManagement.png"))); // NOI18N
        btnEdicion.setText("<html>EDICIÓN Y ELIMINACIÓN DE PRODUCTOS</html>");
        btnEdicion.setBorderPainted(false);
        btnEdicion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEdicion.setVerifyInputWhenFocusTarget(false);
        layout_panel.add(btnEdicion);
        btnEdicion.setBounds(930, 520, 230, 150);

        sidebar1.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout sidebar1Layout = new javax.swing.GroupLayout(sidebar1);
        sidebar1.setLayout(sidebar1Layout);
        sidebar1Layout.setHorizontalGroup(
            sidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        sidebar1Layout.setVerticalGroup(
            sidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        layout_panel.add(sidebar1);
        sidebar1.setBounds(350, 130, 30, 220);

        sidebar2.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout sidebar2Layout = new javax.swing.GroupLayout(sidebar2);
        sidebar2.setLayout(sidebar2Layout);
        sidebar2Layout.setHorizontalGroup(
            sidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        sidebar2Layout.setVerticalGroup(
            sidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        layout_panel.add(sidebar2);
        sidebar2.setBounds(1180, 130, 30, 220);

        sidebar3.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout sidebar3Layout = new javax.swing.GroupLayout(sidebar3);
        sidebar3.setLayout(sidebar3Layout);
        sidebar3Layout.setHorizontalGroup(
            sidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        sidebar3Layout.setVerticalGroup(
            sidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        layout_panel.add(sidebar3);
        sidebar3.setBounds(350, 350, 30, 460);

        sidebar4.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout sidebar4Layout = new javax.swing.GroupLayout(sidebar4);
        sidebar4.setLayout(sidebar4Layout);
        sidebar4Layout.setHorizontalGroup(
            sidebar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        sidebar4Layout.setVerticalGroup(
            sidebar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        layout_panel.add(sidebar4);
        sidebar4.setBounds(380, 790, 830, 20);

        lowerbar1.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout lowerbar1Layout = new javax.swing.GroupLayout(lowerbar1);
        lowerbar1.setLayout(lowerbar1Layout);
        lowerbar1Layout.setHorizontalGroup(
            lowerbar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        lowerbar1Layout.setVerticalGroup(
            lowerbar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        layout_panel.add(lowerbar1);
        lowerbar1.setBounds(1180, 350, 30, 460);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        layout_panel.add(jSeparator1);
        jSeparator1.setBounds(400, 220, 750, 20);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Inicio");
        layout_panel.add(jLabel1);
        jLabel1.setBounds(400, 140, 300, 70);

        btnUsuarios.setBackground(new java.awt.Color(102, 204, 255));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/icons/user_icon_x64.png"))); // NOI18N
        btnUsuarios.setText("<html>USUARIOS</html>");
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUsuarios.setVerifyInputWhenFocusTarget(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        layout_panel.add(btnUsuarios);
        btnUsuarios.setBounds(400, 300, 230, 150);

        btnProveedores.setBackground(new java.awt.Color(102, 204, 255));
        btnProveedores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(0, 0, 0));
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/icons/clipboardInventoryManagement.png"))); // NOI18N
        btnProveedores.setText("<html>PROVEEDORES</html>");
        btnProveedores.setBorderPainted(false);
        btnProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnProveedores.setVerifyInputWhenFocusTarget(false);
        layout_panel.add(btnProveedores);
        btnProveedores.setBounds(660, 300, 230, 150);

        btnPronto.setBackground(new java.awt.Color(102, 204, 255));
        btnPronto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPronto.setForeground(new java.awt.Color(0, 0, 0));
        btnPronto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/icons/addremove_InventoryManagement.png"))); // NOI18N
        btnPronto.setText("<html>Coming Soon...</html>");
        btnPronto.setBorderPainted(false);
        btnPronto.setEnabled(false);
        btnPronto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPronto.setVerifyInputWhenFocusTarget(false);
        layout_panel.add(btnPronto);
        btnPronto.setBounds(930, 300, 230, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layout_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layout_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionInventarioActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        abrirMenuUsuarios();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void lblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseClicked
        abrirMenuUsuarios();
    }//GEN-LAST:event_lblUsuariosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdicion;
    private javax.swing.JButton btnGestionInventario;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnPronto;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel layout_panel;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JLabel logo_label;
    private javax.swing.JLabel logo_label1;
    private javax.swing.JPanel lowerbar1;
    private javax.swing.JPanel nav_header;
    private javax.swing.JPanel nav_panel;
    private javax.swing.JPanel sidebar1;
    private javax.swing.JPanel sidebar2;
    private javax.swing.JPanel sidebar3;
    private javax.swing.JPanel sidebar4;
    // End of variables declaration//GEN-END:variables
}
