/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package agencia.views;

import agencia.models.Hotel;
import agencia.controllers.ctrlHotel;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author andre
 */
public class hotel extends javax.swing.JFrame {
DefaultTableModel model;
ctrlHotel ctrl = new ctrlHotel();
    /**
     * Creates new form hotel
     */
    public hotel() {
        initComponents();
        grpFrm.setVisible(false);
        grpTbl.setVisible(true);
        String[] headers = {"ID", "Nombre", "Teléfono", "# Plazas", "Calle", "Colonia", "CP", "Ciudad", "Estado", "País"};
        model = new DefaultTableModel(null, headers);
        tblHotel.setModel(model);
        MostrarDatos();
        Limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        grpFrm = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCol = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCp = new javax.swing.JTextField();
        txtCD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEdo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNumP = new javax.swing.JTextField();
        btnDo = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnNvo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtidHotel = new javax.swing.JTextField();
        btnDel = new javax.swing.JButton();
        grpTbl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHotel = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Hotel");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("Calle:");

        jLabel6.setText("Colonia:");

        jLabel7.setText("CP:");

        txtCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCDActionPerformed(evt);
            }
        });

        jLabel8.setText("Ciudad:");

        jLabel9.setText("Estado:");

        txtEdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdoActionPerformed(evt);
            }
        });

        jLabel10.setText("País:");

        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });

        jLabel11.setText("Núm. Plazas:");

        btnDo.setText("Aceptar");
        btnDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout grpFrmLayout = new javax.swing.GroupLayout(grpFrm);
        grpFrm.setLayout(grpFrmLayout);
        grpFrmLayout.setHorizontalGroup(
            grpFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grpFrmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grpFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grpFrmLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtNom)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(grpFrmLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtCp, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                    .addGroup(grpFrmLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtCD, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtEdo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtPais))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grpFrmLayout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        grpFrmLayout.setVerticalGroup(
            grpFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grpFrmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grpFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtNumP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(grpFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(grpFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtEdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(grpFrmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDo)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        btnNvo.setText("Agregar");
        btnNvo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNvoActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        txtidHotel.setEnabled(false);

        btnDel.setText("Eliminar");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        tblHotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHotelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHotel);

        javax.swing.GroupLayout grpTblLayout = new javax.swing.GroupLayout(grpTbl);
        grpTbl.setLayout(grpTblLayout);
        grpTblLayout.setHorizontalGroup(
            grpTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grpTblLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        grpTblLayout.setVerticalGroup(
            grpTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grpTblLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBack.setText("Regresar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnNvo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(btnDel)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grpFrm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grpTbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtidHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(btnNvo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addComponent(grpFrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grpTbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCDActionPerformed

    private void txtEdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdoActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void btnNvoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNvoActionPerformed
        grpFrm.setVisible(true);
        grpTbl.setVisible(false);
        btnNvo.setEnabled(false);
    }//GEN-LAST:event_btnNvoActionPerformed

    private void btnDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoActionPerformed
        Hotel ht = RecuperarInformacion();
        if(ht.getIdHotel() > 0)
        {
            ctrl.modificar(ht);
            
        } else{
            ctrl.insertar(ht);
        }
        grpFrm.setVisible(false);
        grpTbl.setVisible(true);
        Limpiar();
        MostrarDatos();
        
        
    }//GEN-LAST:event_btnDoActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Limpiar();
        grpFrm.setVisible(false);
        grpTbl.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tblHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHotelMouseClicked
        if(evt.getClickCount() == 1){
            JTable receptor = (JTable)evt.getSource();
            
            txtidHotel.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtNom.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtTel.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtCalle.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            txtNumP.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            txtCol.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());
            txtCp.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 6).toString());
            txtCD.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 7).toString());
            txtEdo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 8).toString());
            txtPais.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 9).toString());
            
            btnNvo.setEnabled(false);
            btnDel.setEnabled(true);
            grpFrm.setVisible(true);
            grpTbl.setVisible(false);
        }
    }//GEN-LAST:event_tblHotelMouseClicked

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        ctrl.eliminar(Integer.parseInt(txtidHotel.getText()));
        MostrarDatos();
        Limpiar();
        btnNvo.setEnabled(true);
            btnDel.setEnabled(false);
            grpFrm.setVisible(false);
            grpTbl.setVisible(true);
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void MostrarDatos(){
        try {
            model.setRowCount(0);
            ResultSet rs = ctrl.mostrar("");
            while(rs.next()){
                Object[] oHotel = {rs.getString("idHotel"), rs.getString("nombre"), rs.getString("telefono"), 
                rs.getString("numeroPlazas"), rs.getString("calle"), rs.getString("colonia"), 
                rs.getString("cp"), rs.getString("ciudad"), rs.getString("estado"), rs.getString("pais")};
                
                model.addRow(oHotel);
            }
        } catch (Exception e) {
        }
    }
    
    private Hotel RecuperarInformacion(){
        Hotel h = new Hotel();
        int id = (txtidHotel.getText().isEmpty()?0 : Integer.parseInt(txtidHotel.getText()));
        
        h.setIdHotel(id);
        h.setNombre(txtNom.getText());
        h.setTelefono(txtTel.getText());
        h.setCalle(txtCalle.getText());
        h.setNumeroPlazas(Integer.parseInt(txtNumP.getText()));
        h.setColonia(txtCol.getText());
        h.setCp(Integer.parseInt(txtCp.getText()));
        h.setCiudad(txtCD.getText());
        h.setEstado(txtEdo.getText());
        h.setPais(txtPais.getText());
        
        return h;
    }
    
    private void Limpiar(){
        txtidHotel.setText("");
        txtNom.setText("");
        txtTel.setText("");
        txtCalle.setText("");
        txtNumP.setText("");
        txtCol.setText("");
        txtCp.setText("");
        txtCD.setText("");
        txtEdo.setText("");
        txtPais.setText("");
        btnNvo.setEnabled(true);
        btnDel.setEnabled(false);
    }
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
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDo;
    private javax.swing.JButton btnNvo;
    private javax.swing.JPanel grpFrm;
    private javax.swing.JPanel grpTbl;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHotel;
    private javax.swing.JTextField txtCD;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCol;
    private javax.swing.JTextField txtCp;
    private javax.swing.JTextField txtEdo;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNumP;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtidHotel;
    // End of variables declaration//GEN-END:variables
}