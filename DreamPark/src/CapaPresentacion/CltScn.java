/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package CapaPresentacion;

import CapaNegocios.NCliente;
import CapaDatos.DCliente;
import javax.swing.DefaultListModel;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lhtc9
 */
public class CltScn extends javax.swing.JFrame {
    
    private static CltScn clt = new CltScn();
    
    /**
     * Creates new form CltScn
     */
    private CltScn() {
        initComponents();
        GetData();
        this.ingClt.setVisible(false);
        this.guardaClt.setVisible(false);
        this.eliminaClt.setVisible(false);
        this.editClt.setVisible(false);
        this.cancelaClt.setVisible(false);
    }
    
    public static CltScn getClt() {
        return clt;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titClt = new javax.swing.JLabel();
        creaClt = new javax.swing.JButton();
        actualListClt = new javax.swing.JButton();
        ingClt = new javax.swing.JButton();
        cancelaClt = new javax.swing.JButton();
        editClt = new javax.swing.JButton();
        eliminaClt = new javax.swing.JButton();
        guardaClt = new javax.swing.JButton();
        cedClt = new javax.swing.JLabel();
        nomClt = new javax.swing.JLabel();
        apeClt = new javax.swing.JLabel();
        cedulaClt = new javax.swing.JTextField();
        apellidosClt = new javax.swing.JTextField();
        nombreClt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListClt = new javax.swing.JTable();
        direccionClt = new javax.swing.JTextField();
        fNacClt = new javax.swing.JLabel();
        dirClt = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titClt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titClt.setForeground(new java.awt.Color(0, 0, 255));
        titClt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titClt.setText("CLIENTES");
        titClt.setToolTipText("");

        creaClt.setText("CREAR");
        creaClt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaCltActionPerformed(evt);
            }
        });

        actualListClt.setText("ACTUALIZAR");
        actualListClt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualListCltActionPerformed(evt);
            }
        });

        ingClt.setText("INGRESAR");
        ingClt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingCltActionPerformed(evt);
            }
        });

        cancelaClt.setText("Cancelar");
        cancelaClt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaCltActionPerformed(evt);
            }
        });

        editClt.setText("Editar");
        editClt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCltActionPerformed(evt);
            }
        });

        eliminaClt.setText("Eliminar");
        eliminaClt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaCltActionPerformed(evt);
            }
        });

        guardaClt.setText("Guardar");
        guardaClt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardaCltActionPerformed(evt);
            }
        });

        cedClt.setText("Cédula");

        nomClt.setText("Nombre");

        apeClt.setText("Apellidos");

        tablaListClt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idClt", "Cédula", "Nombres", "Apellidos", "Fecha Nac", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaListClt.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaListClt.setShowVerticalLines(false);
        tablaListClt.getTableHeader().setReorderingAllowed(false);
        tablaListClt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListCltMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaListClt);
        if (tablaListClt.getColumnModel().getColumnCount() > 0) {
            tablaListClt.getColumnModel().getColumn(0).setMinWidth(0);
            tablaListClt.getColumnModel().getColumn(0).setPreferredWidth(0);
            tablaListClt.getColumnModel().getColumn(0).setMaxWidth(0);
            tablaListClt.getColumnModel().getColumn(1).setResizable(false);
            tablaListClt.getColumnModel().getColumn(2).setResizable(false);
            tablaListClt.getColumnModel().getColumn(3).setResizable(false);
            tablaListClt.getColumnModel().getColumn(4).setResizable(false);
            tablaListClt.getColumnModel().getColumn(5).setResizable(false);
        }

        fNacClt.setText("Fecha Nacimiento");

        dirClt.setText("Dirección");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomClt)
                                    .addComponent(apeClt)
                                    .addComponent(dirClt)
                                    .addComponent(fNacClt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(creaClt)
                                    .addComponent(cedulaClt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreClt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidosClt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(direccionClt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingClt)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cedClt))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(editClt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guardaClt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eliminaClt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelaClt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(actualListClt)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(titClt)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titClt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creaClt)
                    .addComponent(actualListClt)
                    .addComponent(editClt)
                    .addComponent(cancelaClt)
                    .addComponent(eliminaClt)
                    .addComponent(guardaClt))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cedClt)
                            .addComponent(cedulaClt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomClt)
                            .addComponent(nombreClt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apeClt)
                            .addComponent(apellidosClt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fNacClt)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(direccionClt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dirClt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ingClt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {apellidosClt, cedulaClt, creaClt, direccionClt, ingClt, nombreClt});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void creaCltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaCltActionPerformed
        this.ingClt.setVisible(true);
        this.cedulaClt.enable(true);
        this.nombreClt.enable(true);
        this.apellidosClt.enable(true);
        this.jDateChooser1.enable(true);
        this.direccionClt.enable(true);
        this.creaClt.setVisible(false);
        this.cancelaClt.setVisible(true);
        this.cedulaClt.setText("");
        this.nombreClt.setText("");
        this.apellidosClt.setText("");
        this.jDateChooser1.setDateFormatString("yyyy-MM-dd");
        this.direccionClt.setText("");
    }//GEN-LAST:event_creaCltActionPerformed
    
    private void ingCltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingCltActionPerformed
        PushData();
        this.cedulaClt.enable(false);
        this.nombreClt.enable(false);
        this.apellidosClt.enable(false);
        this.jDateChooser1.enable(false);
        this.direccionClt.enable(false);
        if(this.creaClt.isEnabled()){
            this.cancelaClt.setVisible(false);
        }
        else{
            this.cancelaClt.setVisible(true);
        }
    }//GEN-LAST:event_ingCltActionPerformed
    
    private void editCltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCltActionPerformed
        this.cedulaClt.enable(true);
        this.nombreClt.enable(true);
        this.apellidosClt.enable(true);
        this.jDateChooser1.enable(true);
        this.direccionClt.enable(true);
        this.guardaClt.setVisible(true);
        this.editClt.setVisible(false);
        this.eliminaClt.setVisible(false);
    }//GEN-LAST:event_editCltActionPerformed
    
    private void guardaCltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardaCltActionPerformed
        SaveData();
        this.cancelaClt.setVisible(false);
        this.creaClt.setVisible(true);
        this.editClt.setVisible(false);
        this.eliminaClt.setVisible(false);
    }//GEN-LAST:event_guardaCltActionPerformed
    
    private void eliminaCltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaCltActionPerformed
        DeleteData();
        this.editClt.setVisible(false);
        this.eliminaClt.setVisible(false);
        this.cancelaClt.setVisible(false);
        this.creaClt.setVisible(true);
    }//GEN-LAST:event_eliminaCltActionPerformed
    
    private void cancelaCltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaCltActionPerformed
        boolean flag=true;
        if(this.ingClt.isVisible()&&!this.creaClt.isVisible()&&!this.editClt.isVisible()&&!this.eliminaClt.isVisible()){
            this.creaClt.setVisible(true);
            this.ingClt.setVisible(false);
            this.cancelaClt.setVisible(false);
            this.cedulaClt.enable(false);
            this.nombreClt.enable(false);
            this.apellidosClt.enable(false);
            this.jDateChooser1.enable(false);
            this.direccionClt.enable(false);
        }
        if(!this.editClt.isVisible()&&this.guardaClt.isVisible()&&!this.eliminaClt.isVisible()){
            this.editClt.setVisible(true);
            this.eliminaClt.setVisible(true);
            this.cedulaClt.enable(false);
            this.nombreClt.enable(false);
            this.apellidosClt.enable(false);
            this.jDateChooser1.enable(false);
            this.direccionClt.enable(false);
            this.guardaClt.setVisible(false);
            flag=false;
        }
        if(this.editClt.isVisible()&&this.eliminaClt.isVisible()&&!this.guardaClt.isVisible()&&flag){
            this.editClt.setVisible(false);
            this.eliminaClt.setVisible(false);
            this.creaClt.setVisible(true);
            this.cancelaClt.setVisible(false);
            this.cedulaClt.setText("");
            this.nombreClt.setText("");
            this.apellidosClt.setText("");
            this.jDateChooser1.setDateFormatString("yyyy-MM-dd");
            this.direccionClt.setText("");
        }
    }//GEN-LAST:event_cancelaCltActionPerformed
    
    private void actualListCltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualListCltActionPerformed
        GetData();
    }//GEN-LAST:event_actualListCltActionPerformed
    
    private void tablaListCltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListCltMouseClicked
        java.util.Date date = null;
        this.creaClt.setVisible(false);
        this.editClt.setVisible(true);
        this.eliminaClt.setVisible(true);
        this.cancelaClt.setVisible(true);
        int index = this.tablaListClt.convertRowIndexToModel(this.tablaListClt.getSelectedRow());
         DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = formatter.parse((String)this.tablaListClt.getModel().getValueAt(index, 4));
        } catch (ParseException ex) {
            Logger.getLogger(RsrvScn.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jDateChooser1.setDate(date);
        
        this.cedulaClt.setText((String)this.tablaListClt.getModel().getValueAt(index, 1));
        this.nombreClt.setText((String)this.tablaListClt.getModel().getValueAt(index, 2));
        this.apellidosClt.setText((String)this.tablaListClt.getModel().getValueAt(index, 3));
        this.direccionClt.setText((String)this.tablaListClt.getModel().getValueAt(index, 5));
    }//GEN-LAST:event_tablaListCltMouseClicked
    
    /**
     * @param args the command line arguments
     **/
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
            java.util.logging.Logger.getLogger(CltScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CltScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CltScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CltScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CltScn().setVisible(true);
            }
        });
    }
    protected void SaveData(){
        int an = this.jDateChooser1.getDate().getYear()+1900;
                int mon=this.jDateChooser1.getDate().getMonth()+1;
                int day =this.jDateChooser1.getDate().getDate();
                String fch = ""+an+"-0"+mon+"-"+day;
        
        int index = this.tablaListClt.convertRowIndexToModel(this.tablaListClt.getSelectedRow());
        String rpta="";
        try {
            rpta = NCliente.Editar(Integer.parseInt(this.tablaListClt.getModel().getValueAt(index, 0).toString()),this.cedulaClt.getText(), this.nombreClt.getText(), this.apellidosClt.getText(), fch, this.direccionClt.getText());
            if (rpta.equals("OK")){
                JOptionPane.showMessageDialog(new JFrame(),"Editado con exito...");
                this.cedulaClt.setText("");
                this.nombreClt.setText("");
                this.apellidosClt.setText("");
                this.jDateChooser1.setDateFormatString("yyyy-MM-dd");
                this.direccionClt.setText("");
                this.cedulaClt.enable(false);
                this.nombreClt.enable(false);
                this.apellidosClt.enable(false);
                this.jDateChooser1.enable(false);
                this.direccionClt.enable(false);
                this.editClt.setVisible(true);
                this.eliminaClt.setVisible(true);
                this.guardaClt.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(),rpta);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CltScn.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetData();
    }
    protected void DeleteData(){
        int index = this.tablaListClt.convertRowIndexToModel(this.tablaListClt.getSelectedRow());
        String rpta="";
        try {
            rpta = NCliente.Eliminar(Integer.parseInt(this.tablaListClt.getModel().getValueAt(index, 0).toString()),this.cedulaClt.getText(), this.nombreClt.getText(), this.apellidosClt.getText(), this.jDateChooser1.getDateFormatString(), this.direccionClt.getText());
            if (rpta.equals("OK")){
                JOptionPane.showMessageDialog(new JFrame(),"Eliminado con exito...");
                this.cedulaClt.setText("");
                this.nombreClt.setText("");
                this.apellidosClt.setText("");
                this.jDateChooser1.setDateFormatString("yyyy-MM-dd");
                this.direccionClt.setText("");
                this.cedulaClt.enable(false);
                this.nombreClt.enable(false);
                this.apellidosClt.enable(false);
                this.jDateChooser1.enable(false);
                this.direccionClt.enable(false);
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(),rpta);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CltScn.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetData();
    }
    protected void GetData(){
        ResultSet rs = null;
        DefaultTableModel model=null;
        try {
            rs = new NCliente().Mostrar2();
            if(this.tablaListClt.getRowCount()!=0){
                model = (DefaultTableModel)this.tablaListClt.getModel();
                model.setRowCount(0);
            }
            model = (DefaultTableModel)this.tablaListClt.getModel();
            while(rs.next()){
                model.addRow( new Object[] {rs.getInt("idCliente"), rs.getString("CI_RUC"), rs.getString("nombres"), 
                    rs.getString("apellidos"),rs.getString("fechaNacimiento")
                , rs.getString("direccion")});
            }
            this.tablaListClt.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(CltScn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    protected void PushData(){
        try{
            String rpta="";
            if((this.cedulaClt.getText().equals(""))||(this.nombreClt.getText().equals(""))||(this.apellidosClt.getText().equals(""))||(this.jDateChooser1.getCalendar()==null)||(this.direccionClt.getText().equals(""))){
                if(this.cedulaClt.getText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo Cédula. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);
                    
                }
                if(this.nombreClt.getText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo Nombre. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);
                    
                }
                if(this.apellidosClt.getText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo Apellido. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);
                    
                }
                if(this.jDateChooser1.getDateFormatString().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo Fecha de Nacimiento. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);
                    
                }
                if(this.direccionClt.getText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo Dirección. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);
                    
                }
            }
            else{
                int an = this.jDateChooser1.getDate().getYear()+1900;
                int mon=this.jDateChooser1.getDate().getMonth()+1;
                int day =this.jDateChooser1.getDate().getDate();
                String fch = ""+an+"-0"+mon+"-"+day;
                rpta = NCliente.insertar(this.cedulaClt.getText(), this.nombreClt.getText(), this.apellidosClt.getText(),fch, this.direccionClt.getText());
                if (rpta.equals("OK")){
                    JOptionPane.showMessageDialog(new JFrame(),"Ingresado con exito...");
                    this.cedulaClt.setText("");
                    this.nombreClt.setText("");
                    this.apellidosClt.setText("");
                    this.jDateChooser1.setDateFormatString("yyyy-MM-dd");
                    this.direccionClt.setText("");
                    this.creaClt.setVisible(true);
                    this.ingClt.setVisible(false);
                    this.cedulaClt.enable(true);
                    this.nombreClt.enable(true);
                    this.apellidosClt.enable(true);
                    this.jDateChooser1.enable(true);
                    this.direccionClt.enable(true);
                }
                else{JOptionPane.showMessageDialog(new JFrame(),rpta);}
            }
        }
        catch(Exception e){JOptionPane.showMessageDialog(new JFrame(),e.getMessage()+e.getStackTrace());}
        GetData();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualListClt;
    private javax.swing.JLabel apeClt;
    private javax.swing.JTextField apellidosClt;
    private javax.swing.JButton cancelaClt;
    private javax.swing.JLabel cedClt;
    private javax.swing.JTextField cedulaClt;
    private javax.swing.JButton creaClt;
    private javax.swing.JLabel dirClt;
    private javax.swing.JTextField direccionClt;
    private javax.swing.JButton editClt;
    private javax.swing.JButton eliminaClt;
    private javax.swing.JLabel fNacClt;
    private javax.swing.JButton guardaClt;
    private javax.swing.JButton ingClt;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomClt;
    private javax.swing.JTextField nombreClt;
    private javax.swing.JTable tablaListClt;
    private javax.swing.JLabel titClt;
    // End of variables declaration//GEN-END:variables
}
