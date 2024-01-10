package forms;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import classes.empleados_data;
import java.util.Date;

public class menu_usuarios extends javax.swing.JFrame {

    private menu_main abrirFormMain;
    
    public menu_usuarios() {
        initComponents();
    }
    
    //Variables de Clases
    empleados_data empleadosData = new empleados_data();
    //Variables de Tabla
    int EID = empleadosData.getEID();
    String nombre = empleadosData.getNombreEmp();
    String apellido = empleadosData.getApellidoEmp();
    String nombreCompleto = empleadosData.getNombreCompleto();
    Date fechaSeleccionada = empleadosData.getFecha();
    
    
    //Métodos de Manipulación de Datos
    public void cargarTabla()
    {
        DefaultTableModel tablaUsuarios = (DefaultTableModel) jTable1.getModel();
        
        Object[] fila = {EID, nombre, apellido, nombreCompleto, fechaSeleccionada};
        
        tablaUsuarios.addRow(fila);
    }

    
    //Métodos de Ventanas
    private void abrirMenuMain()
    {
        if (abrirFormMain == null || !abrirFormMain.isVisible())
        {
            abrirFormMain = new menu_main();
            abrirFormMain.setVisible(true);
        }
        else
        {
            abrirFormMain.toFront();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layout_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo_label = new javax.swing.JLabel();
        nav_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nav_header = new javax.swing.JPanel();
        logo_label1 = new javax.swing.JLabel();
        sidebar1 = new javax.swing.JPanel();
        sidebar2 = new javax.swing.JPanel();
        sidebar3 = new javax.swing.JPanel();
        sidebar4 = new javax.swing.JPanel();
        lowerbar1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtEID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1208, 808));
        setSize(new java.awt.Dimension(700, 700));

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
        logo_label.setBounds(120, 30, 70, 80);

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuarios");
        nav_panel.add(jLabel3);
        jLabel3.setBounds(30, 110, 100, 15);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Inicio");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        nav_panel.add(jLabel4);
        jLabel4.setBounds(30, 70, 100, 15);

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nav_panel.add(jSeparator2);
        jSeparator2.setBounds(10, 50, 330, 10);

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
        jLabel1.setText("Usuarios");
        layout_panel.add(jLabel1);
        jLabel1.setBounds(400, 140, 300, 70);

        jTable1.setForeground(new java.awt.Color(51, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdEmpleado", "PrimerNombre", "PrimerApellido", "NombreCompleto", "FechaInicio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        layout_panel.add(jScrollPane1);
        jScrollPane1.setBounds(400, 230, 500, 220);

        btnAgregar.setBackground(new java.awt.Color(51, 204, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("<html>\nAgregar\n<html>");
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAgregar.setIconTextGap(10);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        layout_panel.add(btnAgregar);
        btnAgregar.setBounds(400, 480, 110, 50);

        btnUpdate.setBackground(new java.awt.Color(51, 204, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        layout_panel.add(btnUpdate);
        btnUpdate.setBounds(530, 480, 110, 50);

        btnRead.setBackground(new java.awt.Color(51, 204, 255));
        btnRead.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRead.setForeground(new java.awt.Color(0, 0, 0));
        btnRead.setText("Cargar Tabla");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });
        layout_panel.add(btnRead);
        btnRead.setBounds(660, 480, 110, 50);

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        layout_panel.add(btnDelete);
        btnDelete.setBounds(790, 480, 110, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ID Empleado");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        layout_panel.add(jLabel5);
        jLabel5.setBounds(990, 230, 110, 20);

        txtEID.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtEID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        layout_panel.add(txtEID);
        txtEID.setBounds(960, 258, 180, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Primer Nombre");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        layout_panel.add(jLabel6);
        jLabel6.setBounds(990, 300, 110, 20);

        txtFirstName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        layout_panel.add(txtFirstName);
        txtFirstName.setBounds(960, 330, 180, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Primer Apellido");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        layout_panel.add(jLabel7);
        jLabel7.setBounds(990, 370, 110, 20);

        txtLastName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        layout_panel.add(txtLastName);
        txtLastName.setBounds(960, 400, 180, 30);

        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        layout_panel.add(jDateChooser1);
        jDateChooser1.setBounds(960, 480, 180, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Fecha de Inicio");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        layout_panel.add(jLabel8);
        jLabel8.setBounds(990, 450, 110, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layout_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1211, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layout_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        EID = Integer.parseInt(txtEID.getText());
        nombre = txtFirstName.getText();
        apellido = txtLastName.getText();
        nombreCompleto = nombre + " " + apellido;
        fechaSeleccionada = jDateChooser1.getDate();
        
        empleadosData.setEID(EID);
        empleadosData.setNombreEmp(nombre);
        empleadosData.setApellidoEmp(apellido);
        empleadosData.setNombreCompleto(nombreCompleto);
        empleadosData.setFecha(fechaSeleccionada);
        
        cargarTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        abrirMenuMain();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(menu_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel layout_panel;
    private javax.swing.JLabel logo_label;
    private javax.swing.JLabel logo_label1;
    private javax.swing.JPanel lowerbar1;
    private javax.swing.JPanel nav_header;
    private javax.swing.JPanel nav_panel;
    private javax.swing.JPanel sidebar1;
    private javax.swing.JPanel sidebar2;
    private javax.swing.JPanel sidebar3;
    private javax.swing.JPanel sidebar4;
    private javax.swing.JTextField txtEID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
