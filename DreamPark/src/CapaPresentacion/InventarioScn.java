/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;
import CapaDatos.Conexion;
import CapaDatos.DInventario;
import CapaNegocios.NInventario;
import CapaDatos.DTipoInv;
import CapaNegocios.NTipInv;
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
 * @author lhtc9
 */
public class InventarioScn extends javax.swing.JFrame {

    /**
     * Creates new form InventarioScn
     */
    public InventarioScn() {
        initComponents();
        GetData();
        GetTipInv();
        this.ingInv.setVisible(false);
        this.editInv.setVisible(false);
        this.guardaInv.setVisible(false);
        this.eliminaInv.setVisible(false);
        this.cancelaInv.setVisible(false);
        
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
        creaInv = new javax.swing.JButton();
        actualizaInv = new javax.swing.JButton();
        ingInv = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombInv = new javax.swing.JTextField();
        cantInv = new javax.swing.JTextField();
        pCmpInv = new javax.swing.JTextField();
        pVtaInv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInv = new javax.swing.JTable();
        editInv = new javax.swing.JButton();
        guardaInv = new javax.swing.JButton();
        eliminaInv = new javax.swing.JButton();
        cancelaInv = new javax.swing.JButton();
        etqTipoInv = new javax.swing.JLabel();
        cmbTipInv = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tipo de Item");
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("INVENTARIO");

        creaInv.setText("CREAR");
        creaInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaInvActionPerformed(evt);
            }
        });

        actualizaInv.setText("ACTUALIZAR");

        ingInv.setText("INGRESAR");
        ingInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingInvActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Cantidad");

        nombInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombInvActionPerformed(evt);
            }
        });
        nombInv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombInvKeyTyped(evt);
            }
        });

        cantInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantInvActionPerformed(evt);
            }
        });
        cantInv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantInvKeyTyped(evt);
            }
        });

        jLabel6.setText("Precio Compra");

        jLabel7.setText("Precio Venta");

        tablaInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Cantidad", "Precio Compra", "Precio Venta", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInv.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaInv);
        if (tablaInv.getColumnModel().getColumnCount() > 0) {
            tablaInv.getColumnModel().getColumn(0).setMinWidth(0);
            tablaInv.getColumnModel().getColumn(0).setPreferredWidth(0);
            tablaInv.getColumnModel().getColumn(0).setMaxWidth(0);
            tablaInv.getColumnModel().getColumn(1).setResizable(false);
            tablaInv.getColumnModel().getColumn(2).setResizable(false);
            tablaInv.getColumnModel().getColumn(3).setResizable(false);
            tablaInv.getColumnModel().getColumn(4).setResizable(false);
            tablaInv.getColumnModel().getColumn(5).setMinWidth(0);
            tablaInv.getColumnModel().getColumn(5).setPreferredWidth(0);
            tablaInv.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        editInv.setText("Editar");
        editInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editInvActionPerformed(evt);
            }
        });

        guardaInv.setText("Guardar");

        eliminaInv.setText("Eliminar");

        cancelaInv.setText("Cancelar");

        etqTipoInv.setText("Tipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(etqTipoInv))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(ingInv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pVtaInv, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(pCmpInv)
                            .addComponent(cantInv)
                            .addComponent(nombInv)
                            .addComponent(creaInv, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cmbTipInv, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editInv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardaInv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminaInv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelaInv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actualizaInv))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel1)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actualizaInv, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(editInv)
                                .addComponent(guardaInv)
                                .addComponent(eliminaInv)
                                .addComponent(cancelaInv)))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(creaInv)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pCmpInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pVtaInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etqTipoInv)
                                .addComponent(cmbTipInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(ingInv)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creaInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaInvActionPerformed
        this.ingInv.setVisible(true);
        this.nombInv.enable(true);
        this.cantInv.enable(true);
        this.pCmpInv.enable(true);
        this.pVtaInv.enable(true);
        this.creaInv.setVisible(false);
        this.cancelaInv.setVisible(true);
        this.nombInv.setText("");
        this.cantInv.setText("");
        this.pCmpInv.setText("");
        this.pVtaInv.setText("");
    }//GEN-LAST:event_creaInvActionPerformed

    private void cantInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantInvActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_cantInvActionPerformed

    private void ingInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingInvActionPerformed
        PushData();        
        this.nombInv.enable(false);
        this.cantInv.enable(false);
        this.pCmpInv.enable(false);
        this.pCmpInv.enable(false);
        this.cmbTipInv.enable(false);
        if(this.creaInv.isEnabled()){
            this.cancelaInv.setVisible(false);
        }
        else{
            this.cancelaInv.setVisible(true);
        }
    }//GEN-LAST:event_ingInvActionPerformed
    private void BuscBtnActionPerformed(java.awt.event.ActionEvent evt) {
        GetData();
    }
    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        this.nombInv.enable(true);
        this.cantInv.enable(true);
        this.pCmpInv.enable(true);
        this.pVtaInv.enable(true);
        this.guardaInv.setVisible(true);
        this.editInv.setVisible(false);
        this.eliminaInv.setVisible(false);
    }  
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        SaveData();
        this.editInv.setVisible(false);
        this.eliminaInv.setVisible(false);
        this.cancelaInv.setVisible(false);
        this.creaInv.setVisible(true);
    }
    private void ElimBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        DeleteData();
        this.editInv.setVisible(false);
        this.eliminaInv.setVisible(false);
        this.cancelaInv.setVisible(false);
        this.creaInv.setVisible(true);
    } 
    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        boolean flag=true;
        if(this.ingInv.isVisible()&&!this.creaInv.isVisible()&&!this.editInv.isVisible()&&!this.eliminaInv.isVisible()){
            this.creaInv.setVisible(true);
            this.ingInv.setVisible(false);
            this.cancelaInv.setVisible(false);
            this.nombInv.enable(false);
            this.cantInv.enable(false);
            this.pCmpInv.enable(false);
            this.pVtaInv.enable(false);
        }
        if(!this.editInv.isVisible()&&this.guardaInv.isVisible()&&!this.eliminaInv.isVisible()){
            this.editInv.setVisible(true);
            this.eliminaInv.setVisible(true);
            
            this.nombInv.enable(false);
            this.cantInv.enable(false);
            this.pCmpInv.enable(false);
            this.pVtaInv.enable(false);
            this.guardaInv.setVisible(false);
            flag=false;
        }
        if(this.editInv.isVisible()&&this.eliminaInv.isVisible()&&!this.guardaInv.isVisible()&&flag){
            this.editInv.setVisible(false);
            this.eliminaInv.setVisible(false);
            this.creaInv.setVisible(true);
            this.cancelaInv.setVisible(false);
            this.nombInv.setText("");
            this.cantInv.setText("");
            this.pCmpInv.setText("");
            this.pVtaInv.setText("");
        }
    }  
    private void CompTblMouseClicked(java.awt.event.MouseEvent evt) {                                      
        this.creaInv.setVisible(false);
        this.editInv.setVisible(true);
        this.eliminaInv.setVisible(true);
        this.cancelaInv.setVisible(true);
        int index = this.tablaInv.convertRowIndexToModel(this.tablaInv.getSelectedRow());
        this.nombInv.setText((String)this.tablaInv.getModel().getValueAt(index, 1)); 
        this.cantInv.setText((String)this.tablaInv.getModel().getValueAt(index, 2));
        this.pCmpInv.setText((String)this.tablaInv.getModel().getValueAt(index, 3));
        this.pVtaInv.setText((String)this.tablaInv.getModel().getValueAt(index, 3));
    } 
    
    private void nombInvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombInvKeyTyped
        char c =evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z') &&(c!=' ')) evt.consume();
        if(nombInv.getText().length()==15) evt.consume();
    }//GEN-LAST:event_nombInvKeyTyped

    private void cantInvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantInvKeyTyped
        char c =evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
        if (cantInv.getText().length()== 8) evt.consume();
    }//GEN-LAST:event_cantInvKeyTyped

    private void nombInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombInvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombInvActionPerformed

    private void editInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editInvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editInvActionPerformed

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
            java.util.logging.Logger.getLogger(InventarioScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioScn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioScn().setVisible(true);
            }
        });
    }
    public void DeleteData(){
        int index = this.tablaInv.convertRowIndexToModel(this.tablaInv.getSelectedRow());
        String rpta="";
        try {
            rpta = NInventario.Eliminar(Integer.parseInt(this.tablaInv.getModel().getValueAt(index, 0).toString()),this.nombInv.getText(), this.cantInv.getText(), this.pCmpInv.getText(),this.pVtaInv.getText());
            if (rpta.equals("OK")){
                    JOptionPane.showMessageDialog(new JFrame(),"Eliminado con exito...");
                    this.nombInv.setText("");
                    this.cantInv.setText("");
                    this.pCmpInv.setText("");
                    this.pVtaInv.setText("");
                    this.nombInv.enable(false);
                    this.cantInv.enable(false);
                    this.pCmpInv.enable(false);
                    this.pVtaInv.enable(false);
                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(),rpta);

                }
        } catch (SQLException ex) {
            Logger.getLogger(InventarioScn.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetData();
    }
    public void SaveData(){
        int index = this.tablaInv.convertRowIndexToModel(this.tablaInv.getSelectedRow());
        String rpta="";
        try {
            //int i=Integer.parseInt(this.tabla.getModel().getValueAt(index, 0).toString());
            rpta = NInventario.Editar(Integer.parseInt(this.tablaInv.getModel().getValueAt(index, 0).toString()),this.nombInv.getText(), this.cantInv.getText(), this.pCmpInv.getText(),this.pVtaInv.getText());
            if (rpta.equals("OK")){
                    JOptionPane.showMessageDialog(new JFrame(),"Editado con exito...");
                    this.nombInv.setText("");
                    this.cantInv.setText("");
                    this.pCmpInv.setText("");
                    this.pVtaInv.setText("");
                    this.nombInv.enable(false);
                    this.cantInv.enable(false);
                    this.pCmpInv.enable(false);
                    this.pVtaInv.enable(false);
                    this.editInv.setVisible(true);
                    this.eliminaInv.setVisible(true);
                    this.guardaInv.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(),rpta);

                }
        } catch (SQLException ex) {
            Logger.getLogger(InventarioScn.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetData();
    }   
    public void GetData(){
         ResultSet rs = null;
        DefaultTableModel model=null;
       
        try {
            
            rs = new NInventario().Mostrar();
            if(this.tablaInv.getRowCount()!=0){
                 model = (DefaultTableModel)this.tablaInv.getModel();
                model.setRowCount(0);
            }
            
            model = (DefaultTableModel)this.tablaInv.getModel();
            
            while(rs.next()){
                model.addRow( new Object[] {rs.getInt("idInventario"), rs.getString("nombre"), rs.getString("cantidad"), rs.getString("pCmp"), rs.getString("pVta") });
            }
            this.tablaInv.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(InventarioScn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void PushData(){
        try{
            String rpta="";
            if((this.cantInv.getText().equals(""))||(this.pVtaInv.getText().equals(""))||(this.pCmpInv.getText().equals(""))||(this.nombInv.getText().equals(""))){
                if(this.cantInv.getText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo Cantidad. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);

                }
                if(this.pCmpInv.getText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo Precio Compra. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);

                }
                if(this.pVtaInv.getText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo Precio Venta. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);

                }
                if(this.nombInv.getText().equals("")){
                    JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en el campo Nombre. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);

                }
            }
           else{
                String tmp =this.cmbTipInv.getSelectedItem().toString();
                tmp = "select idInv from Inventario where " + tmp;
                Connection con = new Conexion().getCon();
                CallableStatement st=null;
                ResultSet rs = null;
                rs = st.executeQuery(tmp);
                System.out.println(rs);
                rpta = NInventario.insertar(this.nombInv.getText(), this.cantInv.getText(), this.pCmpInv.getText(),this.pVtaInv.getText(),rs.getString("idInv"));
                if (rpta.equals("OK")){
                    JOptionPane.showMessageDialog(new JFrame(),"Ingresado con exito...");
                    this.nombInv.setText("");
                    this.cantInv.setText("");
                    this.pCmpInv.setText("");
                    this.pVtaInv.setText("");
                    this.creaInv.setVisible(true);
                    this.ingInv.setVisible(false);
                    this.nombInv.enable(true);
                    this.cantInv.enable(true);
                    this.pCmpInv.enable(true);
                    this.pVtaInv.enable(true);
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
    public void GetTipInv(){
        ResultSet rs = null;
        try {            
            rs = new NTipInv().MostrarListTInv();                   
            while(rs.next()){
                cmbTipInv.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventarioScn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizaInv;
    private javax.swing.JButton cancelaInv;
    private javax.swing.JTextField cantInv;
    private javax.swing.JComboBox<String> cmbTipInv;
    private javax.swing.JButton creaInv;
    private javax.swing.JButton editInv;
    private javax.swing.JButton eliminaInv;
    private javax.swing.JLabel etqTipoInv;
    private javax.swing.JButton guardaInv;
    private javax.swing.JButton ingInv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombInv;
    private javax.swing.JTextField pCmpInv;
    private javax.swing.JTextField pVtaInv;
    private javax.swing.JTable tablaInv;
    // End of variables declaration//GEN-END:variables
}
