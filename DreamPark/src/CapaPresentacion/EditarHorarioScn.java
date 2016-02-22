/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package CapaPresentacion;

import CapaNegocios.NEmpleado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.SpinnerDateModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jfpal
 */
public class EditarHorarioScn extends javax.swing.JFrame {
    private static EditarHorarioScn edtH = new EditarHorarioScn();
    /**
     * Creates new form EditarHorarioScn
     */
    private EditarHorarioScn() {
        initComponents();
        GetData();
        this.IngBtn.setVisible(false);
        this.SaveBtn.setVisible(false);
        this.ElimBtn.setVisible(false);
        this.EditBtn.setVisible(false);
        this.CancelBtn.setVisible(false);
        this.inSpn.setEnabled(false);
        this.fnSpn.setEnabled(false);
        //this.inSpn.setValue("00:00:00");
        //this.fnSpn.setValue("00:00:00");
    }
    
    public static EditarHorarioScn getEdtH() {
        return edtH;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ElimBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CancelBtn = new javax.swing.JButton();
        NomTxt = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        horTbl = new javax.swing.JTable();
        CrearBtn = new javax.swing.JButton();
        IngBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Date date1 = new Date();
        SpinnerDateModel sm1 =
        new SpinnerDateModel(date1, null, null, Calendar.HOUR_OF_DAY);
        inSpn = new javax.swing.JSpinner(sm1);
        Date date2 = new Date();
        SpinnerDateModel sm2 =
        new SpinnerDateModel(date2, null, null, Calendar.HOUR_OF_DAY);
        fnSpn = new javax.swing.JSpinner(sm2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(666, 470));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        ElimBtn.setText("ELIMINAR");
        ElimBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        CancelBtn.setText("CANCELAR");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        NomTxt.setEnabled(false);

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

        horTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Hora Inicio", "Hora Fin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        horTbl.setFocusable(false);
        horTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        horTbl.getTableHeader().setReorderingAllowed(false);
        horTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(horTbl);
        if (horTbl.getColumnModel().getColumnCount() > 0) {
            horTbl.getColumnModel().getColumn(0).setResizable(false);
            horTbl.getColumnModel().getColumn(1).setResizable(false);
            horTbl.getColumnModel().getColumn(2).setResizable(false);
        }

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

        jLabel1.setText("Horarios");

        jLabel2.setText("Hora Inicio:");

        jLabel4.setText("Hora Fin:");

        JSpinner.DateEditor de1 = new JSpinner.DateEditor(inSpn, "HH:mm:ss");
        inSpn.setEditor(de1);
        inSpn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                inSpnStateChanged(evt);
            }
        });

        JSpinner.DateEditor de2 = new JSpinner.DateEditor(fnSpn, "HH:mm:ss");
        fnSpn.setEditor(de2);
        fnSpn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fnSpnStateChanged(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CrearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ElimBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnSpn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inSpn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(52, 52, 52)
                                .addComponent(NomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(NomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(inSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fnSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(CrearBtn)
                            .addGap(18, 18, 18)
                            .addComponent(EditBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(SaveBtn)
                            .addGap(18, 18, 18)
                            .addComponent(CancelBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IngBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ElimBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
        boolean flag=true;
        if(this.IngBtn.isVisible()&&!this.CrearBtn.isVisible()&&!this.EditBtn.isVisible()&&!this.ElimBtn.isVisible()){
            this.CrearBtn.setVisible(true);
            this.IngBtn.setVisible(false);
            this.CancelBtn.setVisible(false);
            this.NomTxt.enable(false);
            this.horTbl.enable(false);
            this.inSpn.setEnabled(false);
            this.fnSpn.setEnabled(false);
        }
        if(!this.EditBtn.isVisible()&&this.SaveBtn.isVisible()&&!this.ElimBtn.isVisible()){
            this.EditBtn.setVisible(true);
            this.ElimBtn.setVisible(true);
            
            this.NomTxt.enable(false);
            this.horTbl.enable(false);
            this.inSpn.setEnabled(false);
            this.fnSpn.setEnabled(false);
            this.SaveBtn.setVisible(false);
            flag=false;
        }
        if(this.EditBtn.isVisible()&&this.ElimBtn.isVisible()&&!this.SaveBtn.isVisible()&&flag){
            this.EditBtn.setVisible(false);
            this.ElimBtn.setVisible(false);
            this.CrearBtn.setVisible(true);
            this.CancelBtn.setVisible(false);
            this.NomTxt.setText("");
            this.inSpn.setValue("00:00:00");
            this.fnSpn.setValue("00:00:00");
        }
    }//GEN-LAST:event_CancelBtnActionPerformed
    
    private void ElimBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimBtnActionPerformed
        DeleteData();
        this.EditBtn.setVisible(false);
        this.ElimBtn.setVisible(false);
        this.CancelBtn.setVisible(false);
        this.CrearBtn.setVisible(true);
    }//GEN-LAST:event_ElimBtnActionPerformed
    
    private void IngBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngBtnActionPerformed
        PushData();
        this.NomTxt.enable(false);
        this.horTbl.enable(false);
        this.inSpn.setEnabled(false);
        this.fnSpn.setEnabled(false);
        if(this.CrearBtn.isEnabled()){
            this.CancelBtn.setVisible(false);
        }
        else{
            this.CancelBtn.setVisible(true);
        }
    }//GEN-LAST:event_IngBtnActionPerformed
    
    private void CrearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearBtnActionPerformed
        
        this.IngBtn.setVisible(true);
        this.NomTxt.enable(true);
        this.horTbl.enable(true);
        this.inSpn.setEnabled(true);
        this.fnSpn.setEnabled(true);
        this.CrearBtn.setVisible(false);
        this.CancelBtn.setVisible(true);
        this.NomTxt.setText("");
        //this.inSpn.setValue("00:00:00");
        //this.fnSpn.setValue("00:00:00");
    }//GEN-LAST:event_CrearBtnActionPerformed
    
    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
        this.NomTxt.enable(true);
        this.horTbl.enable(true);
        this.inSpn.setEnabled(true);
        this.fnSpn.setEnabled(true);
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
    
    private void inSpnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_inSpnStateChanged
        
        this.inSpn.setToolTipText("Changed");
        
        
    }//GEN-LAST:event_inSpnStateChanged
    
    private void fnSpnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fnSpnStateChanged
        this.fnSpn.setToolTipText("Changed");
    }//GEN-LAST:event_fnSpnStateChanged
    
    private void horTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horTblMouseClicked
        // TODO add your handling code here:
        this.CrearBtn.setVisible(false);
        this.EditBtn.setVisible(true);
        this.ElimBtn.setVisible(true);
        this.CancelBtn.setVisible(true);
        int index = this.horTbl.convertRowIndexToModel(this.horTbl.getSelectedRow());
        this.NomTxt.setText((String)this.horTbl.getModel().getValueAt(index, 0));
        //String timeIn = new SimpleDateFormat("HH:mm:ss").format((String)this.horTbl.getModel().getValueAt(index, 1));
        //String timeFn= new SimpleDateFormat("HH:mm:ss").format((String)this.horTbl.getModel().getValueAt(index, 2));
        //SpinnerDateModel
        SimpleDateFormat fm = new SimpleDateFormat("HH:mm:ss");
        
        try {
            this.inSpn.setValue(fm.parseObject((String)this.horTbl.getModel().getValueAt(index, 1)));
            this.fnSpn.setValue(fm.parseObject((String)this.horTbl.getModel().getValueAt(index, 2)));
            
        } catch (ParseException ex) {
            Logger.getLogger(EditarHorarioScn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //this.DirTxt.setText((String)this.Prov_Tbl.getModel().getValueAt(index, 2));
        //this.TelfTxt.setText((String)this.Prov_Tbl.getModel().getValueAt(index, 3));
        
    }//GEN-LAST:event_horTblMouseClicked
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
        Object obj=null;
        EmpleadoScn emp = EmpleadoScn.getEmp();
        javax.swing.JComboBox hCmb = emp.getHorCombo();
        
        int size = emp.getHorCombo().getItemCount();
        for(int i=size-1;i>=0;i--){
            obj =hCmb.getItemAt(i);
            
            if(!obj.equals(" ")){
                if(!obj.equals("<Editar>")){
                    hCmb.removeItemAt(i);
                }
                
            }
        }
        
        
        
        emp.GetDataHorario();
        
    }//GEN-LAST:event_formWindowClosed
    
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
            java.util.logging.Logger.getLogger(EditarHorarioScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarHorarioScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarHorarioScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarHorarioScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarHorarioScn().setVisible(true);
            }
        });
    }
    
    protected void GetData(){
        ResultSet rs = null;
        DefaultTableModel model=null;
        
        try {
            
            rs = new NEmpleado().MostrarHorarios();
            if(this.horTbl.getRowCount()!=0){
                model = (DefaultTableModel)this.horTbl.getModel();
                model.setRowCount(0);
            }
            
            model = (DefaultTableModel)this.horTbl.getModel();
            
            while(rs.next()){
                model.addRow( new Object[] {rs.getString("Nombre"),
                    rs.getString("Inicio"),rs.getString("Fin")});
            }
            this.horTbl.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(ProvScn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void PushData(){
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        try{
            String rpta="";
            if((this.inSpn.getToolTipText().equals(""))||
                    (this.NomTxt.getText().equals(""))||
                    (this.fnSpn.getToolTipText().equals(""))){
                if(this.NomTxt.getText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo Nombre. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);
                    
                }
                if(this.inSpn.getToolTipText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo de hora de inicio. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);
                    
                }
                if(this.fnSpn.getToolTipText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo de hora Final. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);
                    
                }
                
            }
            else{
                String timeIn= new SimpleDateFormat("HH:mm").format(this.inSpn.getValue())+":00";
                String timeFn= new SimpleDateFormat("HH:mm").format(this.fnSpn.getValue())+":00";
                
                rpta = NEmpleado.InsertarHorario(this.NomTxt.getText(), timeIn,timeFn);
                if (rpta.equals("OK")){
                    JOptionPane.showMessageDialog(new JFrame(),"Ingresado con exito...");
                    this.NomTxt.setText("");
                    //this.inSpn.setValue(date);
                    this.CrearBtn.setVisible(true);
                    this.IngBtn.setVisible(false);
                    this.NomTxt.enable(true);
                    this.inSpn.enable(true);
                    this.fnSpn.enable(true);
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
    
    protected void SaveData(){
        int index = this.horTbl.convertRowIndexToModel(this.horTbl.getSelectedRow());
        String timeIn= new SimpleDateFormat("h:mm a").format(this.inSpn.getValue())+":00";
        String timeFn= new SimpleDateFormat("h:mm a").format(this.fnSpn.getValue())+":00";
        
        String rpta="";
        try {
            //int i=Integer.parseInt(this.Prov_Tbl.getModel().getValueAt(index, 0).toString());
            rpta = NEmpleado.EditarHorario(this.NomTxt.getText(), timeIn, timeFn);
            if (rpta.equals("OK")){
                JOptionPane.showMessageDialog(new JFrame(),"Editado con exito...");
                this.NomTxt.setText("");
                this.NomTxt.enable(false);
                this.inSpn.enable(false);
                this.fnSpn.enable(false);
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
    
    protected void DeleteData(){
        int index = this.horTbl.convertRowIndexToModel(this.horTbl.getSelectedRow());
        String rpta="";
        try {
            //int i=Integer.parseInt(this.Prov_Tbl.getModel().getValueAt(index, 0).toString());
            rpta = NEmpleado.EliminarHorario(this.NomTxt.getText());
            if (rpta.equals("OK")){
                JOptionPane.showMessageDialog(new JFrame(),"Eliminado con exito...");
                this.NomTxt.setText("");
                
                this.NomTxt.enable(false);
                this.inSpn.enable(false);
                this.fnSpn.enable(false);
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(),rpta);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProvScn.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetData();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton CrearBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton ElimBtn;
    private javax.swing.JButton IngBtn;
    private javax.swing.JTextField NomTxt;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JSpinner fnSpn;
    private javax.swing.JTable horTbl;
    private javax.swing.JSpinner inSpn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
