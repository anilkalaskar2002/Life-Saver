
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class User_Register extends javax.swing.JFrame {

    /**
     * Creates new form User_Register
     */
    public User_Register() {
        initComponents();
        connect();
    }

    
    
    
    
    Connection conn;
    Statement stmt;
    PreparedStatement pst;
   
    
    
    public void connect(){
          
        try {  
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
            System.out.println("success in db connection....");
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("User Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 33, -1, -1));

        txtfname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtfname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        getContentPane().add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 124, 277, 31));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full_Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 124, -1, -1));

        txtuname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtuname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        getContentPane().add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 202, 277, 31));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 268, 277, 31));

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtemail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 346, 277, 31));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 202, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 268, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 346, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 429, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 429, 109, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homebackground.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
           String fname,uname,password,email;
           
           fname = txtfname.getText();
           uname = txtuname.getText();
           password = txtpassword.getText();
           email= txtemail.getText();
           
           if(fname.equals("") && uname.equals("") && password.equals("") && email.equals("")){
               JOptionPane.showMessageDialog(null,"All fields are medantory...");
           }else{
               JFrame f=new JFrame();
               JOptionPane.showMessageDialog(f, "Record Saved");
           }
           
           pst=conn.prepareStatement("insert into User_register(fname,uname,password,email)values(?,?,?,?)");
           
           pst.setString(1, fname);
           pst.setString(2, uname);
           pst.setString(3, password);
           pst.setString(4, email);
          
           
           pst.executeUpdate();
           
           
//           Table_update();
           
           txtfname.setText("");
           txtuname.setText("");
           txtpassword.setText("");
           txtemail.setText("");
           txtfname.requestFocus();
           
           
           } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LoginPage l1 = new LoginPage();
        l1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(User_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}
