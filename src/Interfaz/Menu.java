/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Proxecto2av.Prenda;
import java.util.ArrayList;

/**
 *
 * @author Ara
 */
public class Menu extends javax.swing.JFrame {
//ArrayList tipo=new ArrayList();
//ArrayList referencia=new ArrayList();
//ArrayList talla=new ArrayList();
//ArrayList unidades=new ArrayList();
//ArrayList prezo=new ArrayList();
Prenda prend=new Prenda();

    /**
     * Creates new form Ventana2
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anhadir = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txTipo = new javax.swing.JTextField();
        txReferencia = new javax.swing.JTextField();
        txTalla = new javax.swing.JTextField();
        txUnidades = new javax.swing.JTextField();
        txPrezo = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        anhadir.setBackground(java.awt.Color.white);
        anhadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAnadir.png"))); // NOI18N
        anhadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anhadirActionPerformed(evt);
            }
        });
        getContentPane().add(anhadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 130, 130));

        Buscar.setBackground(java.awt.Color.white);
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBuscar.png"))); // NOI18N
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 130, 130));

        jButton3.setBackground(java.awt.Color.white);
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBorrar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 130, 130));

        txArea.setColumns(20);
        txArea.setRows(5);
        jScrollPane1.setViewportView(txArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 260, 160));

        jLabel1.setText("Tipo de prenda: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setText("Referencia: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel3.setText("Talla: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel4.setText("Unidades: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel5.setText("Prezo: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        txTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTipoActionPerformed(evt);
            }
        });
        getContentPane().add(txTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 80, -1));

        txReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txReferenciaActionPerformed(evt);
            }
        });
        getContentPane().add(txReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 90, -1));
        getContentPane().add(txTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 90, -1));
        getContentPane().add(txUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 110, -1));

        txPrezo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPrezoActionPerformed(evt);
            }
        });
        getContentPane().add(txPrezo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 120, -1));

        jMenu1.setText("Salir");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void anhadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anhadirActionPerformed
    prend.ponerTipo(this.txTipo.getText());
    prend.ponerRef(this.txReferencia.getText());
    prend.ponerTalla(this.txTalla.getText());
    prend.ponerUnidades(Integer.parseInt(txUnidades.getText()));
    prend.ponerPrecio(Float.parseFloat(txPrezo.getText()));
    
       
       
    }//GEN-LAST:event_anhadirActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
     txArea.append("Mostrar datos de busqueda: "+"\n Tipo de prenda:"+prend.buscarTipo(this.txTipo.getText())+"\n Referencia: "+prend.buscarRef(this.txReferencia.getText()));
     
    }//GEN-LAST:event_BuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      /*  Borrar ventana5=new Borrar();
       ventana5.setVisible(true);*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTipoActionPerformed

    private void txPrezoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPrezoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPrezoActionPerformed

    private void txReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txReferenciaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton anhadir;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txArea;
    private javax.swing.JTextField txPrezo;
    private javax.swing.JTextField txReferencia;
    private javax.swing.JTextField txTalla;
    private javax.swing.JTextField txTipo;
    private javax.swing.JTextField txUnidades;
    // End of variables declaration//GEN-END:variables
}
