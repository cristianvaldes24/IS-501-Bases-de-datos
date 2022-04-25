package proyectobasesdedatos1;

import com.sun.jdi.connect.spi.Connection;
//import org.mariadb.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author bryan
 */
public class Cita extends javax.swing.JFrame {

    public static final String sURL = "jdbc:mariadb://proyecto.co7ggp7wsw2h.us-east-1.rds.amazonaws.com:3306";
    public static final String USERNAME = "admin";
    public static final String PASSWORD = "Administrador";

    PreparedStatement ps;
    ResultSet rs;
    //Connection coneccion = (Connection) DriverManager.getConnection(sURL,"admin","administrador");

    public static Connection getConection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdc.Driver");
            con = (Connection) DriverManager.getConnection(sURL, USERNAME, PASSWORD);
            //JOptionpane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception e) {
            System.err.println(e);
        }
        return con;
    }

    public Cita() throws SQLException {
        initComponents();

    }

    /**
     * Creates new form Cita
     */
    private void limpiarCajas() {
        Fecha_Hora_Entrada.setText(null);
        FEcha_Salida.setText(null);
        Tipo_Mantenimiento.setText(null);
        Reparacion.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TItulo = new javax.swing.JLabel();
        Entrada = new javax.swing.JLabel();
        Fecha_Hora_Entrada = new javax.swing.JTextField();
        Mantenimiento = new javax.swing.JLabel();
        Tipo_Mantenimiento = new javax.swing.JTextField();
        Reparar = new javax.swing.JLabel();
        Reparacion = new javax.swing.JTextField();
        FEcha_Salida = new javax.swing.JTextField();
        Salida = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TItulo.setFont(new java.awt.Font("Modern No. 20", 0, 36)); // NOI18N
        TItulo.setText("Crea la Cita");

        Entrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Entrada.setText("Fecha de Entrada:");

        Mantenimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Mantenimiento.setText("Mantenimiento:");

        Reparar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Reparar.setText("Reparación:");

        Salida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Salida.setText("Fecha de Salida:");

        Crear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Crear)
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mantenimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Reparar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Entrada, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Fecha_Hora_Entrada, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Tipo_Mantenimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Reparacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Salida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FEcha_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TItulo)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TItulo)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tipo_Mantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mantenimiento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reparar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entrada)
                    .addComponent(Fecha_Hora_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FEcha_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(Crear)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed

        Connection con = null;

        try {
            con = getConection();
            ps = con.PreparedStatement("INSERT INTO CITAS (fecha_hora_entrada, tipo_mantenimiento, reparacion, telefono, fecha_hora_salida) VALUES(?,?,?,?,?)");
            ps.setDate(1, Date.valueOf(Fecha_Hora_Entrada.getText()));
            ps.setString(2, Tipo_Mantenimiento.getText());
            ps.setString(3, Reparacion.getText());
            ps.setDate(4, Date.valueOf(FEcha_Salida.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Cita Guardada");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guerdar la cita");
                limpiarCajas();
            }

            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_CrearActionPerformed

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
            java.util.logging.Logger.getLogger(Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crear;
    private javax.swing.JLabel Entrada;
    private javax.swing.JTextField FEcha_Salida;
    private javax.swing.JTextField Fecha_Hora_Entrada;
    private javax.swing.JLabel Mantenimiento;
    private javax.swing.JTextField Reparacion;
    private javax.swing.JLabel Reparar;
    private javax.swing.JLabel Salida;
    private javax.swing.JLabel TItulo;
    private javax.swing.JTextField Tipo_Mantenimiento;
    // End of variables declaration//GEN-END:variables
}
