/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;
import CapaDatos.DInventario;
import CapaNegocios.NInventario;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
        this.ingCmp.setVisible(false);
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
        crearCompra = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ingCmp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombCmp = new javax.swing.JTextField();
        cantCmp = new javax.swing.JTextField();
        tipCmp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        descCmp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pCmp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pVta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaCompras = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("COMPRAS");

        crearCompra.setText("CREAR");
        crearCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCompraActionPerformed(evt);
            }
        });

        jButton2.setText("ACTUALIZAR");

        ingCmp.setText("INGRESAR");
        ingCmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingCmpActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Cantidad");

        jLabel4.setText("Tipo");

        nombCmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombCmpActionPerformed(evt);
            }
        });
        nombCmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombCmpKeyTyped(evt);
            }
        });

        cantCmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantCmpActionPerformed(evt);
            }
        });
        cantCmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantCmpKeyTyped(evt);
            }
        });

        jLabel5.setText("Descripción");

        jLabel6.setText("Precio Compra");

        pCmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pCmpActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio Venta");

        jScrollPane2.setViewportView(ListaCompras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(286, 286, 286))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombCmp)
                            .addComponent(cantCmp)
                            .addComponent(tipCmp)
                            .addComponent(descCmp)
                            .addComponent(pCmp)
                            .addComponent(pVta)
                            .addComponent(ingCmp, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(crearCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearCompra)
                    .addComponent(jButton2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombCmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cantCmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tipCmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(descCmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pCmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(pVta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(ingCmp))
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCompraActionPerformed
        this.ingCmp.setVisible(true);
        this.nombCmp.enable(true);
        this.cantCmp.enable(true);
        this.tipCmp.enable(true);
        this.descCmp.enable(true);
        this.pCmp.enable(true);
        this.pVta.enable(true);
    }//GEN-LAST:event_crearCompraActionPerformed

    private void cantCmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantCmpActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_cantCmpActionPerformed

    private void ingCmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingCmpActionPerformed
        // TODO add your handling code here:
        try{
            String rpta="";
            if(this.nombCmp.toString().isEmpty() || this.cantCmp.toString().isEmpty() || this.tipCmp.toString().isEmpty() || this.descCmp.toString().isEmpty() || this.pCmp.toString().isEmpty() || this.pVta.toString().isEmpty()){                
                JOptionPane.showMessageDialog(new JFrame(),"No ha ingresado datos en uno de los campos. Vuelva a intentar","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                rpta = NInventario.insertar(this.nombCmp.getText(), Integer.parseInt(this.cantCmp.getText()), Integer.parseInt(this.tipCmp.getText()), this.descCmp.getText(), Float.parseFloat(this.pCmp.getText()), Float.parseFloat(this.pVta.getText()));
                if (rpta.equals("OK")){
                    JOptionPane.showMessageDialog(new JFrame(),"Ingresado con exito...");
                    this.nombCmp.setText("");
                    this.cantCmp.setText("");
                    this.tipCmp.setText("");
                    this.descCmp.setText("");
                    this.pCmp.setText("");
                    this.pVta.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(),rpta);
                }                
            }            
        }
        catch(Exception e){
                   JOptionPane.showMessageDialog(new JFrame(),e.getMessage()+e.getStackTrace());
        }
    }//GEN-LAST:event_ingCmpActionPerformed

    private void pCmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pCmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pCmpActionPerformed

    private void nombCmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombCmpKeyTyped
        char c =evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z') &&(c!=' ')) evt.consume();
        if(nombCmp.getText().length()==15) evt.consume();
    }//GEN-LAST:event_nombCmpKeyTyped

    private void cantCmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantCmpKeyTyped
        char c =evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
        if (cantCmp.getText().length()== 8) evt.consume();
    }//GEN-LAST:event_cantCmpKeyTyped

    private void nombCmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombCmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombCmpActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaCompras;
    private javax.swing.JTextField cantCmp;
    private javax.swing.JButton crearCompra;
    private javax.swing.JTextField descCmp;
    private javax.swing.JButton ingCmp;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombCmp;
    private javax.swing.JTextField pCmp;
    private javax.swing.JTextField pVta;
    private javax.swing.JTextField tipCmp;
    // End of variables declaration//GEN-END:variables
}