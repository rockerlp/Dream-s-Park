/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDatos.DProveedor;
import CapaNegocios.NProveedor;
import javax.swing.DefaultListModel;
import java.sql.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jfpal
 */
public class ProvScn extends javax.swing.JFrame {

    /**
     * Creates new form ProvScn
     */
    public ProvScn() {
        initComponents();
        GetData();
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

        CrearBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IngBtn = new javax.swing.JButton();
        NomTxt = new javax.swing.JTextField();
        DirTxt = new javax.swing.JTextField();
        TelfTxt = new javax.swing.JTextField();
        BuscBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Prov_Tbl = new javax.swing.JTable();
        EditBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        ElimBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CrearBtn.setText("CREAR");
        CrearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel4.setText("Telefono");

        IngBtn.setText("INGRESAR");
        IngBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngBtnActionPerformed(evt);
            }
        });

        NomTxt.setEnabled(false);

        DirTxt.setEnabled(false);

        TelfTxt.setEnabled(false);

        BuscBtn.setText("Actualizar");
        BuscBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("PROVEEDORES");

        Prov_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Prov_Tbl.setFocusable(false);
        Prov_Tbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Prov_Tbl.getTableHeader().setReorderingAllowed(false);
        Prov_Tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Prov_TblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Prov_Tbl);
        if (Prov_Tbl.getColumnModel().getColumnCount() > 0) {
            Prov_Tbl.getColumnModel().getColumn(0).setMinWidth(0);
            Prov_Tbl.getColumnModel().getColumn(0).setPreferredWidth(0);
            Prov_Tbl.getColumnModel().getColumn(0).setMaxWidth(0);
            Prov_Tbl.getColumnModel().getColumn(1).setResizable(false);
            Prov_Tbl.getColumnModel().getColumn(2).setResizable(false);
            Prov_Tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        EditBtn.setText("EDITAR");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        SaveBtn.setText("GUARDAR");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DirTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(TelfTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(NomTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CrearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ElimBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IngBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(BuscBtn))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(CrearBtn)
                    .addComponent(IngBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DirTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn)
                    .addComponent(SaveBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TelfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ElimBtn)
                    .addComponent(CancelBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(BuscBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearBtnActionPerformed

        this.IngBtn.setVisible(true);
        this.NomTxt.enable(true);
        this.DirTxt.enable(true);
        this.TelfTxt.enable(true);
        this.CrearBtn.setVisible(false);
        this.CancelBtn.setVisible(true);
        this.NomTxt.setText("");
        this.DirTxt.setText("");
        this.TelfTxt.setText("");

    }//GEN-LAST:event_CrearBtnActionPerformed

    private void IngBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngBtnActionPerformed
        PushData();        
        this.NomTxt.enable(false);
        this.DirTxt.enable(false);
        this.TelfTxt.enable(false);
        if(this.CrearBtn.isEnabled()){
            this.CancelBtn.setVisible(false);
        }
        else{
            this.CancelBtn.setVisible(true);
        }
        
    }//GEN-LAST:event_IngBtnActionPerformed

    private void BuscBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscBtnActionPerformed
        GetData();

       
    }//GEN-LAST:event_BuscBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
        this.NomTxt.enable(true);
        this.DirTxt.enable(true);
        this.TelfTxt.enable(true);
        this.SaveBtn.setVisible(true);
        this.EditBtn.setVisible(false);
        this.ElimBtn.setVisible(false);
        
                
        
    }//GEN-LAST:event_EditBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        SaveData();
        this.EditBtn.setVisible(false);
        this.ElimBtn.setVisible(false);
        this.CancelBtn.setVisible(false);
        this.CrearBtn.setVisible(true);
        
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void ElimBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimBtnActionPerformed
        DeleteData();
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
            this.DirTxt.enable(false);
            this.TelfTxt.enable(false);
        }
        if(!this.EditBtn.isVisible()&&this.SaveBtn.isVisible()&&!this.ElimBtn.isVisible()){
            this.EditBtn.setVisible(true);
            this.ElimBtn.setVisible(true);
            
            this.NomTxt.enable(false);
            this.DirTxt.enable(false);
            this.TelfTxt.enable(false);
            this.SaveBtn.setVisible(false);
            flag=false;
        }
        if(this.EditBtn.isVisible()&&this.ElimBtn.isVisible()&&!this.SaveBtn.isVisible()&&flag){
            this.EditBtn.setVisible(false);
            this.ElimBtn.setVisible(false);
            this.CrearBtn.setVisible(true);
            this.CancelBtn.setVisible(false);
            this.NomTxt.setText("");
            this.DirTxt.setText("");
            this.TelfTxt.setText("");
        }
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void Prov_TblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Prov_TblMouseClicked
        this.CrearBtn.setVisible(false);
        this.EditBtn.setVisible(true);
        this.ElimBtn.setVisible(true);
        this.CancelBtn.setVisible(true);
        int index = this.Prov_Tbl.convertRowIndexToModel(this.Prov_Tbl.getSelectedRow());
        this.NomTxt.setText((String)this.Prov_Tbl.getModel().getValueAt(index, 1)); 
        this.DirTxt.setText((String)this.Prov_Tbl.getModel().getValueAt(index, 2));
        this.TelfTxt.setText((String)this.Prov_Tbl.getModel().getValueAt(index, 3)); 
    }//GEN-LAST:event_Prov_TblMouseClicked

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
            java.util.logging.Logger.getLogger(ProvScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProvScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProvScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProvScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProvScn().setVisible(true);
            }
        });
    }
    
    public void DeleteData(){
        int index = this.Prov_Tbl.convertRowIndexToModel(this.Prov_Tbl.getSelectedRow());
        String rpta="";
        try {
            //int i=Integer.parseInt(this.Prov_Tbl.getModel().getValueAt(index, 0).toString());
            rpta = NProveedor.Eliminar(Integer.parseInt(this.Prov_Tbl.getModel().getValueAt(index, 0).toString()),this.NomTxt.getText(), this.DirTxt.getText(), this.TelfTxt.getText());
            if (rpta.equals("OK")){
                    JOptionPane.showMessageDialog(new JFrame(),"Eliminado con exito...");
                    this.NomTxt.setText("");
                    this.DirTxt.setText("");
                    this.TelfTxt.setText("");
                    this.NomTxt.enable(false);
                    this.DirTxt.enable(false);
                    this.TelfTxt.enable(false);
                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(),rpta);

                }
        } catch (SQLException ex) {
            Logger.getLogger(ProvScn.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetData();
    }
    
    public void SaveData(){
        int index = this.Prov_Tbl.convertRowIndexToModel(this.Prov_Tbl.getSelectedRow());
        String rpta="";
        try {
            //int i=Integer.parseInt(this.Prov_Tbl.getModel().getValueAt(index, 0).toString());
            rpta = NProveedor.Editar(Integer.parseInt(this.Prov_Tbl.getModel().getValueAt(index, 0).toString()),this.NomTxt.getText(), this.DirTxt.getText(), this.TelfTxt.getText());
            if (rpta.equals("OK")){
                    JOptionPane.showMessageDialog(new JFrame(),"Editado con exito...");
                    this.NomTxt.setText("");
                    this.DirTxt.setText("");
                    this.TelfTxt.setText("");
                    this.NomTxt.enable(false);
                    this.DirTxt.enable(false);
                    this.TelfTxt.enable(false);
                    this.EditBtn.setVisible(true);
                    this.ElimBtn.setVisible(true);
                    this.SaveBtn.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(),rpta);

                }
        } catch (SQLException ex) {
            Logger.getLogger(ProvScn.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetData();
    }
    
   
    
    public void GetData(){
         ResultSet rs = null;
        DefaultTableModel model=null;
       
        try {
            
            rs = new NProveedor().Mostrar();
            if(this.Prov_Tbl.getRowCount()!=0){
                 model = (DefaultTableModel)this.Prov_Tbl.getModel();
                model.setRowCount(0);
            }
            
            model = (DefaultTableModel)this.Prov_Tbl.getModel();
            
            while(rs.next()){
                model.addRow( new Object[] {rs.getInt("idProveedor"), rs.getString("nombre"), rs.getString("direccion"), rs.getString("telefono") });
            }
            this.Prov_Tbl.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(ProvScn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void PushData(){
        try{
            String rpta="";
            if((this.DirTxt.getText().equals(""))||(this.TelfTxt.getText().equals(""))||(this.NomTxt.getText().equals(""))){
                if(this.DirTxt.getText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo Nombre. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);

                }
                if(this.TelfTxt.getText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo Direccion. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);

                }
                if(this.NomTxt.getText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo Telfono. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);

                }
            }
           else{
                rpta = NProveedor.insertar(this.NomTxt.getText(), this.DirTxt.getText(), this.TelfTxt.getText());
                if (rpta.equals("OK")){
                    JOptionPane.showMessageDialog(new JFrame(),"Ingresado con exito...");
                    this.NomTxt.setText("");
                    this.DirTxt.setText("");
                    this.TelfTxt.setText("");         
                    this.CrearBtn.setVisible(true);
                    this.IngBtn.setVisible(false);
                    this.NomTxt.enable(true);
                    this.DirTxt.enable(true);
                    this.TelfTxt.enable(true);
                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(),rpta);

                }
                
                
            }
            
        }
        catch(Exception e){
                   JOptionPane.showMessageDialog(new JFrame(),e.getMessage()+e.getStackTrace());

        }
        GetData();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscBtn;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton CrearBtn;
    private javax.swing.JTextField DirTxt;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton ElimBtn;
    private javax.swing.JButton IngBtn;
    private javax.swing.JTextField NomTxt;
    private javax.swing.JTable Prov_Tbl;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField TelfTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
