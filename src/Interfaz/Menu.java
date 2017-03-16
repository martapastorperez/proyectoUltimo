/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Proxecto2av.Coleccion;
import Proxecto2av.Prenda;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ara
 */
public class Menu extends javax.swing.JFrame {
ArrayList <String> tipo=new ArrayList();
ArrayList <String> referencia=new ArrayList();
ArrayList <String>talla=new ArrayList();
ArrayList <Integer> unidades=new ArrayList();
ArrayList <Float> precio=new ArrayList();






Prenda prend= new Prenda( tipo, referencia, talla, unidades, precio);

    /**
     * Creates new form Ventana2
     */
    public Menu() {
        initComponents();
        try {
        prend.leerLineas();
        } catch (IOException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
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
        borrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txArea = new javax.swing.JTextArea();
        txTipo = new javax.swing.JTextField();
        txReferencia = new javax.swing.JTextField();
        txTalla = new javax.swing.JTextField();
        txUnidades = new javax.swing.JTextField();
        txPrezo = new javax.swing.JTextField();
        busRef = new javax.swing.JTextField();
        borrarref = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        anhadir.setBackground(java.awt.Color.white);
        anhadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAnadir.png"))); // NOI18N
        anhadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anhadirMouseClicked(evt);
            }
        });
        anhadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anhadirActionPerformed(evt);
            }
        });
        getContentPane().add(anhadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 690, 130, 130));

        Buscar.setBackground(java.awt.Color.white);
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBuscar.png"))); // NOI18N
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, 130, 130));

        borrar.setBackground(java.awt.Color.white);
        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBorrar.png"))); // NOI18N
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 680, 130, 130));

        txArea.setColumns(20);
        txArea.setRows(5);
        jScrollPane1.setViewportView(txArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 290, 320));

        txTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTipoActionPerformed(evt);
            }
        });
        getContentPane().add(txTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 120, 30));

        txReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txReferenciaActionPerformed(evt);
            }
        });
        getContentPane().add(txReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 120, 30));
        getContentPane().add(txTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 120, 30));
        getContentPane().add(txUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 120, 30));

        txPrezo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPrezoActionPerformed(evt);
            }
        });
        getContentPane().add(txPrezo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 120, 30));

        busRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busRefActionPerformed(evt);
            }
        });
        getContentPane().add(busRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 120, 30));

        borrarref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarrefActionPerformed(evt);
            }
        });
        getContentPane().add(borrarref, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 610, 120, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RESTOVENTANASblanco.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Salir");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIR.png"))); // NOI18N
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
        prend.escribirTexto("proyecto.txt");
        System.exit(0);    
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void anhadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anhadirActionPerformed
  
    int indice=(prend.buscarRef(this.txReferencia.getText()));
    if(indice<0){
        prend.ponerTipo(this.txTipo.getText().toLowerCase());
        prend.ponerRef(this.txReferencia.getText().toLowerCase());
        prend.ponerTalla(this.txTalla.getText().toLowerCase());
        prend.ponerUnidades(Integer.parseInt(txUnidades.getText().toLowerCase()));
        prend.ponerPrecio(Float.parseFloat(txPrezo.getText().toLowerCase()));
        prend.escribirTexto("proyecto.txt");//cambio guars¡dar fichero
        txArea.append("Prenda añadida."+"\n");     
        }else{
        
            txArea.append("La referencia ya está en uso, introduzca otra."+"\n");
     }  
    
    
       
       
    }//GEN-LAST:event_anhadirActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
     int indice=(prend.buscarRef(this.busRef.getText()));
     if(indice<0){
            txArea.append("NO EXISTE LA PRENDA."+"\n");
        }else{
            txArea.append("MOSTRAR DATOS DE BÚSQUEDA: "+"\n Tipo de prenda: "+tipo.get(indice)+"\n Referencia: "+referencia.get(indice)+ "\n Talla: "+talla.get(indice)+"\n Precio: "+ precio.get(indice)+"\n Unidades: "+unidades.get(indice)+"\n");
            
        }

    }//GEN-LAST:event_BuscarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
      boolean indice=(prend.borrarRef(this.busRef.getText()));
        if(indice==false){
           txArea.append("NO EXISTE LA PRENDA."+"\n");
        }else{
         txArea.append("PRENDA BORRADA."+"\n");
        }      
    }//GEN-LAST:event_borrarActionPerformed

    private void txTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTipoActionPerformed

    private void txPrezoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPrezoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPrezoActionPerformed

    private void txReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txReferenciaActionPerformed

    private void anhadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anhadirMouseClicked

    }//GEN-LAST:event_anhadirMouseClicked

    private void busRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busRefActionPerformed
      prend.buscarRef(this.txReferencia.getText());
    }//GEN-LAST:event_busRefActionPerformed

    private void borrarrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarrefActionPerformed
       prend.buscarRef(this.txReferencia.getText());
      // TODO add your handling code here:
    }//GEN-LAST:event_borrarrefActionPerformed

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
    private javax.swing.JButton borrar;
    private javax.swing.JTextField borrarref;
    private javax.swing.JTextField busRef;
    private javax.swing.JLabel jLabel8;
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
