/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package CapaPresentacion;

/**
 *
 * @author jfpal
 */
public class EditarCargoScn extends javax.swing.JFrame {
    
    /**
     * Creates new form EditarCargo
     */
    public EditarCargoScn() {
        initComponents();
        this.IngBtn.setVisible(false);
        this.SaveBtn.setVisible(false);
        this.ElimBtn.setVisible(false);
        this.EditBtn.setVisible(false);
        this.CancelBtn.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        descTxt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NomTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        crgTbl = new javax.swing.JTable();
        ElimBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        CrearBtn = new javax.swing.JButton();
        IngBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Cargos");

        jScrollPane1.setEnabled(false);

        descTxt.setColumns(20);
        descTxt.setRows(5);
        descTxt.setEnabled(false);
        jScrollPane1.setViewportView(descTxt);

        jLabel2.setText("Descripcion:");

        jLabel3.setText("Nombre:");

        NomTxt.setEnabled(false);

        crgTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Nombre", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        crgTbl.setEnabled(false);
        jScrollPane2.setViewportView(crgTbl);
        if (crgTbl.getColumnModel().getColumnCount() > 0) {
            crgTbl.getColumnModel().getColumn(0).setMinWidth(0);
            crgTbl.getColumnModel().getColumn(0).setPreferredWidth(0);
            crgTbl.getColumnModel().getColumn(0).setMaxWidth(0);
            crgTbl.getColumnModel().getColumn(1).setResizable(false);
            crgTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        ElimBtn.setText("ELIMINAR");
        ElimBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimBtnActionPerformed(evt);
            }
        });

        CancelBtn.setText("CANCELAR");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        SaveBtn.setText("GUARDAR");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        EditBtn.setText("EDITAR");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        CrearBtn.setText("CREAR");
        CrearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearBtnActionPerformed(evt);
            }
        });

        IngBtn.setText("INGRESAR");
        IngBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(292, 292, 292))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ElimBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(CrearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(IngBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SaveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CancelBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(NomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearBtn)
                    .addComponent(IngBtn)
                    .addComponent(SaveBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditBtn)
                    .addComponent(ElimBtn)
                    .addComponent(CancelBtn))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                            
    private void ElimBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimBtnActionPerformed
        //DeleteData();
        this.EditBtn.setVisible(false);
        this.ElimBtn.setVisible(false);
        this.CancelBtn.setVisible(false);
        this.CrearBtn.setVisible(true);
        
    }//GEN-LAST:event_ElimBtnActionPerformed
    
    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
        boolean flag=true;
        if(this.IngBtn.isVisible()&&!this.CrearBtn.isVisible()&&!this.EditBtn.isVisible()&&!this.ElimBtn.isVisible()){
            this.CrearBtn.setVisible(true);
            this.IngBtn.setVisible(false);
            this.CancelBtn.setVisible(false);
            this.NomTxt.enable(false);
            this.descTxt.enable(false);
            this.crgTbl.enable(false);
        }
        if(!this.EditBtn.isVisible()&&this.SaveBtn.isVisible()&&!this.ElimBtn.isVisible()){
            this.EditBtn.setVisible(true);
            this.ElimBtn.setVisible(true);
            
            this.NomTxt.enable(false);
            this.descTxt.enable(false);
            this.crgTbl.enable(false);
            this.SaveBtn.setVisible(false);
            flag=false;
        }
        if(this.EditBtn.isVisible()&&this.ElimBtn.isVisible()&&!this.SaveBtn.isVisible()&&flag){
            this.EditBtn.setVisible(false);
            this.ElimBtn.setVisible(false);
            this.CrearBtn.setVisible(true);
            this.CancelBtn.setVisible(false);
            this.NomTxt.setText("");
            this.descTxt.setText("");
            this.crgTbl.enable(false);
        }
    }//GEN-LAST:event_CancelBtnActionPerformed
    
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        //SaveData();
        this.EditBtn.setVisible(false);
        this.ElimBtn.setVisible(false);
        this.CancelBtn.setVisible(false);
        this.CrearBtn.setVisible(true);
        
    }//GEN-LAST:event_SaveBtnActionPerformed
    
    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
        this.NomTxt.enable(true);
        this.descTxt.enable(true);
        this.crgTbl.enable(true);
        this.SaveBtn.setVisible(true);
        this.EditBtn.setVisible(false);
        this.ElimBtn.setVisible(false);
        
    }//GEN-LAST:event_EditBtnActionPerformed
    
    private void CrearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearBtnActionPerformed
        
        this.IngBtn.setVisible(true);
        this.NomTxt.enable(true);
        this.descTxt.enable(true);
        this.crgTbl.enable(true);
        this.CrearBtn.setVisible(false);
        this.CancelBtn.setVisible(true);
        this.NomTxt.setText("");
        this.descTxt.setText("");
        this.crgTbl.enable(false);
    }//GEN-LAST:event_CrearBtnActionPerformed
    
    private void IngBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngBtnActionPerformed
        //PushData();
        this.NomTxt.enable(false);
        this.descTxt.enable(false);
        this.crgTbl.enable(false);
        if(this.CrearBtn.isEnabled()){
            this.CancelBtn.setVisible(false);
        }
        else{
            this.CancelBtn.setVisible(true);
        }
        
    }//GEN-LAST:event_IngBtnActionPerformed
    
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
            java.util.logging.Logger.getLogger(EditarCargoScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCargoScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCargoScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCargoScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCargoScn().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton CrearBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton ElimBtn;
    private javax.swing.JButton IngBtn;
    private javax.swing.JTextField NomTxt;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTable crgTbl;
    private javax.swing.JTextArea descTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
