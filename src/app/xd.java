/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexion.conex;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/**
 *
 * @author RYZEN 7
 */
public class xd extends javax.swing.JFrame {
conex con=new conex();
        Connection cn=con.ConectarBD();

    public xd() {
        initComponents();
        this.setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setExtendedState(JFrame.NORMAL);
        setResizable(false);
        setVisible(true);
        this.ocultar1.setVisible(false);
        //recordar contraseña
        String[] credentials = getCredentialsFromFile();
    if (credentials != null) {
        txtUsuarioLogin.setText(credentials[0]);
        txtPasswordLogin.setText(credentials[1]);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsuarioLogin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        abrirRegistro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPasswordLogin = new javax.swing.JPasswordField();
        ver1 = new javax.swing.JLabel();
        ocultar1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VET CLINIC - VETERINARIA");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/istockphoto-1503385646-612x612-removebg-preview.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image-removebg-preview.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -120, 290, 370));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login Image.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 160, -1));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel5.setText("Bienvenido!");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 60));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel6.setText("Inicie sesión con su cuenta...");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 50));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login Image.png"))); // NOI18N
        jLabel14.setText("jLabel3");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 160, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 130));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Correo electrónico");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 150, 30));

        txtUsuarioLogin.setBackground(new java.awt.Color(204, 204, 204));
        txtUsuarioLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtUsuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioLoginActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 370, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Contraseña");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, 30));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setText("Recuérdame");
        jCheckBox1.setBorder(null);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 130, 30));

        btnLogin.setBackground(new java.awt.Color(51, 51, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Iniciar sesión");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 360, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lock.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("No recuerdo mi contraseña");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 180, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("¿Aún no posees usuario?");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        abrirRegistro.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        abrirRegistro.setForeground(new java.awt.Color(0, 102, 204));
        abrirRegistro.setText("Crea una cuenta");
        abrirRegistro.setBorder(null);
        abrirRegistro.setBorderPainted(false);
        abrirRegistro.setContentAreaFilled(false);
        abrirRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirRegistroActionPerformed(evt);
            }
        });
        jPanel2.add(abrirRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("©Proyecto de Software 2024");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 230, -1));

        txtPasswordLogin.setBackground(new java.awt.Color(204, 204, 204));
        txtPasswordLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jPanel2.add(txtPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 370, 40));

        ver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image-removebg-preview (6) (2).png"))); // NOI18N
        ver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver1MouseClicked(evt);
            }
        });
        jPanel2.add(ver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 30, 30));

        ocultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image-removebg-preview (7) (1).png"))); // NOI18N
        ocultar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultar1MouseClicked(evt);
            }
        });
        jPanel2.add(ocultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 450, 540));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/159.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -10, 740, 660));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/06.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-420, 210, 730, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/04.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -110, 520, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1092, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioLoginActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
if(jCheckBox1.isSelected()){
    //Guardar la contraseña en un archivo de configuracion o base de datos
    String usuario = txtUsuarioLogin.getText();
        String password = txtPasswordLogin.getText();
        saveCredentialsToFile(usuario, password);
    } else {
        // Borrar las credenciales guardadas
        deleteCredentialsFile();
    }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
private void saveCredentialsToFile(String usuario, String password) {
    try {
        // Utiliza un archivo de configuración o base de datos para guardar el usuario y la contraseña
        FileWriter fileWriter = new FileWriter("credentials.txt");
        fileWriter.write(usuario + "," + password);
        fileWriter.close();
    } catch (IOException e) {
        // Manejar la excepción
    }
}
private String[] getCredentialsFromFile() {
    try {
        // Utiliza un archivo de configuración o base de datos para recuperar el usuario y la contraseña
        FileReader fileReader = new FileReader("credentials.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String credentials = bufferedReader.readLine();
        bufferedReader.close();
        return credentials.split(",");
    } catch (IOException e) {
        // Manejar la excepción
        return null;
    }
}
private void deleteCredentialsFile() {
    try {
        // Borrar el archivo de configuración o base de datos que contiene el usuario y la contraseña
        File file = new File("credentials.txt");
        file.delete();
    } catch (Exception e) {
        // Manejar la excepción
    }
}
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
String usuario=txtUsuarioLogin.getText();
String pass=txtPasswordLogin.getText();
//Validar
if(txtUsuarioLogin.getText().equals("")||txtPasswordLogin.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios");
}else{
if(!usuario.equals("")||!pass.equals("")){
    //contiene datos
    try {
        PreparedStatement ps =(PreparedStatement) cn.prepareStatement("SELECT tipousuario from usuarios where email='"+usuario+"' and contraseña='"+pass+"'");
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            String tipousuario=rs.getString("tipousuario");
            if(tipousuario.equalsIgnoreCase("Usuario Paciente")){
                usuarioPaciente usuarioPaciente = new usuarioPaciente();
                dispose();
                usuarioPaciente.setVisible(true);
            }
            if(tipousuario.equalsIgnoreCase("Médico Veterinario")){
                medicoVeterinario mv = new medicoVeterinario();
                dispose();
                mv.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se ha podido realizar el inicio de sesión");
    }
}else{
    JOptionPane.showMessageDialog(null, "Por favor llene los campos");
}
}
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void abrirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirRegistroActionPerformed
        registroUsuario registro = new registroUsuario();
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_abrirRegistroActionPerformed

    private void ver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver1MouseClicked
ver1.setVisible(false);
ocultar1.setVisible(true);
txtPasswordLogin.setEchoChar((char)0);
    }//GEN-LAST:event_ver1MouseClicked

    private void ocultar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultar1MouseClicked
      ver1.setVisible(true);
      ocultar1.setVisible(false);
      txtPasswordLogin.setEchoChar('*');
    }//GEN-LAST:event_ocultar1MouseClicked

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
            java.util.logging.Logger.getLogger(xd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirRegistro;
    private javax.swing.JButton btnLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel ocultar1;
    private javax.swing.JPasswordField txtPasswordLogin;
    private javax.swing.JTextField txtUsuarioLogin;
    private javax.swing.JLabel ver1;
    // End of variables declaration//GEN-END:variables
void limpiar(){
    txtUsuarioLogin.setText("");
    txtPasswordLogin.setText("");
}
}
