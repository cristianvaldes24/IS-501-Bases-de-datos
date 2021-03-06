/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

/**
 *
 * @author bryan
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TallerAutomotriz = new javax.swing.JLabel();
        BasesI = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        Cliente = new javax.swing.JLabel();
        ID_Usuario = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        Aceptar = new javax.swing.JButton();
        Crear = new javax.swing.JButton();
        Logo2 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TallerAutomotriz.setFont(new java.awt.Font("Bodoni MT Condensed", 3, 36)); // NOI18N
        TallerAutomotriz.setText("Taller Automotriz");
        getContentPane().add(TallerAutomotriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 50));

        BasesI.setFont(new java.awt.Font("Bodoni MT Condensed", 3, 36)); // NOI18N
        BasesI.setText("Bases I");
        getContentPane().add(BasesI, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 100, 50));

        Exit.setBackground(new java.awt.Color(0, 0, 102));
        Exit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, -1, -1));

        Cliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cliente.setText("Usuario");
        getContentPane().add(Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 60, 20));

        ID_Usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ID_Usuario.setText("Id");
        getContentPane().add(ID_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 180, 30));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 180, 30));

        Aceptar.setText("Log in");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 80, 30));

        Crear.setText("Sing up");
        getContentPane().add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 80, 30));

        Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/47-470408_mercedes-png-image-mercedes-benz22.png"))); // NOI18N
        getContentPane().add(Logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 320, 390));

        jLabelFondo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/24185.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1194, 771));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AceptarActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel BasesI;
    private javax.swing.JLabel Cliente;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel ID_Usuario;
    private javax.swing.JLabel Logo2;
    private javax.swing.JLabel TallerAutomotriz;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
