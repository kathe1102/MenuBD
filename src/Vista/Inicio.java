/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jLabel1 = new javax.swing.JLabel();
        USUA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CLAVE = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 50, 168, 39);

        USUA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                USUAKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                USUAKeyTyped(evt);
            }
        });
        getContentPane().add(USUA);
        USUA.setBounds(120, 120, 150, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("USUARIO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 120, 52, 15);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("CLAVE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 180, 50, 15);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 255));
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 220, 120, 54);

        CLAVE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CLAVEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CLAVEKeyTyped(evt);
            }
        });
        getContentPane().add(CLAVE);
        CLAVE.setBounds(120, 180, 150, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGIN2.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 310, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String Usuario= USUA.getText();
        String contraseña =CLAVE.getText();
        if(Usuario.isEmpty()|| contraseña.isEmpty()){
            JOptionPane.showMessageDialog(null, "CAMPOS VACIOS");

        }else{
            if(Usuario.equals("kt")&& contraseña.equals("1234")){
                JOptionPane.showMessageDialog(null, "ACCESO CORRECTO");
                MenuPrincipal op=new MenuPrincipal();
                op.setVisible(true);
                op.setLocationRelativeTo(null);
                op.setSize(460,425);
                dispose();

               
            } else {
                JOptionPane.showMessageDialog(null, "USUARIO O CLAVE INCORRECTOS");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void USUAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_USUAKeyTyped
  

    }//GEN-LAST:event_USUAKeyTyped

    private void CLAVEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CLAVEKeyTyped

    }//GEN-LAST:event_CLAVEKeyTyped

    private void USUAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_USUAKeyPressed
      if(evt.getKeyCode()==evt.VK_ENTER){
  CLAVE.requestFocus();
   }
    }//GEN-LAST:event_USUAKeyPressed

    private void CLAVEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CLAVEKeyPressed
       if(evt.getKeyCode()==evt.VK_ENTER){
   jButton1.requestFocus();
   }
    }//GEN-LAST:event_CLAVEKeyPressed

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped
  
    }//GEN-LAST:event_jButton1KeyTyped

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
            if(evt.getKeyCode()==evt.VK_ENTER){
   jButton1.doClick();
   }
    }//GEN-LAST:event_jButton1KeyPressed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CLAVE;
    private javax.swing.JTextField USUA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
