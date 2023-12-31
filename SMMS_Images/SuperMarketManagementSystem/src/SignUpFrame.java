
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author waniya_mustafa
 */
public class SignUpFrame extends javax.swing.JFrame {

        /**
         * Creates new form SignUpFrame
         */
        public SignUpFrame() {
                initComponents();
                ImageIcon background_img = new ImageIcon(
                                "C:\\Users\\MINAHIL SHAKOOR\\Desktop\\Grocery_Management_System_Java\\SMMS_Images\\SignUp.jpg",
                                "");

                Image img = background_img.getImage();
                Image temp_img = img.getScaledInstance(1100, 820, Image.SCALE_SMOOTH);
                background_img = new ImageIcon(temp_img);
                JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
                backgrnd.setBounds(0, 0, 1100, 820);
                this.add(backgrnd);
                this.setTitle("Sign Up");
                this.setResizable(false);
                panel1.setOpaque(true);
                panel1.setBackground(new Color(0, 0, 0, 90));
                buttonGroup1.add(Male);
                buttonGroup1.add(Female);
                signUpBtn.setOpaque(true);
                setExtendedState(JFrame.MAXIMIZED_BOTH);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLocationRelativeTo(null);

        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addField = new javax.swing.JTextField();
        pssField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        Female = new javax.swing.JRadioButton();
        Male = new javax.swing.JRadioButton();
        signUpBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setPreferredSize(new java.awt.Dimension(466, 685));
        panel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Hubballi", 1, 26)); // NOI18N
        jLabel1.setText("Name:");
        panel1.add(jLabel1);
        jLabel1.setBounds(210, 110, 81, 34);

        nameField.setBackground(new java.awt.Color(204, 204, 204));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        panel1.add(nameField);
        nameField.setBounds(210, 140, 249, 38);

        jLabel2.setFont(new java.awt.Font("Hubballi", 1, 26)); // NOI18N
        jLabel2.setText("Gender:");
        panel1.add(jLabel2);
        jLabel2.setBounds(210, 470, 100, 34);

        jLabel3.setFont(new java.awt.Font("Hubballi", 1, 26)); // NOI18N
        jLabel3.setText("Phone Number:");
        panel1.add(jLabel3);
        jLabel3.setBounds(210, 290, 196, 34);

        phoneField.setBackground(new java.awt.Color(204, 204, 204));
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });
        panel1.add(phoneField);
        phoneField.setBounds(210, 330, 249, 38);

        jLabel4.setFont(new java.awt.Font("Hubballi", 1, 26)); // NOI18N
        jLabel4.setText("Address:");
        panel1.add(jLabel4);
        jLabel4.setBounds(210, 380, 180, 34);

        addField.setBackground(new java.awt.Color(204, 204, 204));
        addField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFieldActionPerformed(evt);
            }
        });
        panel1.add(addField);
        addField.setBounds(210, 420, 249, 38);

        pssField.setBackground(new java.awt.Color(204, 204, 204));
        pssField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pssFieldActionPerformed(evt);
            }
        });
        panel1.add(pssField);
        pssField.setBounds(210, 240, 249, 34);

        jLabel5.setFont(new java.awt.Font("Hubballi", 1, 24)); // NOI18N
        jLabel5.setText("Password:");
        panel1.add(jLabel5);
        jLabel5.setBounds(210, 200, 130, 32);

        Female.setBackground(new java.awt.Color(204, 204, 204));
        Female.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Female.setText("Female");
        panel1.add(Female);
        Female.setBounds(220, 520, 110, 29);

        Male.setBackground(new java.awt.Color(204, 204, 204));
        Male.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Male.setText("Male");
        panel1.add(Male);
        Male.setBounds(360, 520, 70, 29);

        signUpBtn.setBackground(new java.awt.Color(255, 102, 102));
        signUpBtn.setFont(new java.awt.Font("Hoefler Text", 1, 24)); // NOI18N
        signUpBtn.setText("Sign Up");
        signUpBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        signUpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        panel1.add(signUpBtn);
        signUpBtn.setBounds(290, 580, 166, 42);

        getContentPane().add(panel1);
        panel1.setBounds(670, 0, 630, 800);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginFrame.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-3, -34, 1300, 860);

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameFieldActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_nameFieldActionPerformed

        private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_phoneFieldActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_phoneFieldActionPerformed

        private void addFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addFieldActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_addFieldActionPerformed

        private void pssFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pssFieldActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_pssFieldActionPerformed

        private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_signUpBtnActionPerformed
                if (nameField.getText().length() != 0 && pssField.getText().length() != 0
                                && addField.getText().length() != 0
                                && phoneField.getText().length() != 0) {
                        if (!Female.isSelected() && !Male.isSelected()) {
                                JOptionPane.showMessageDialog(this, "Please select gender option!", "ERROR",
                                                JOptionPane.ERROR_MESSAGE);
                        } else {
                                String data = "";
                                try {
                                        File myObj = new File(
                                                        "C:\\Users\\MINAHIL SHAKOOR\\Desktop\\Grocery_Management_System_Java\\SuperMarketManagementSystem\\src\\ID_Counter.txt");
                                        Scanner myReader = new Scanner(myObj);

                                        while (myReader.hasNextLine()) {
                                                data = myReader.nextLine();
                                        }
                                        try {
                                                FileWriter myWriter = new FileWriter(
                                                                "C:\\Users\\MINAHIL SHAKOOR\\Desktop\\Grocery_Management_System_Java\\SuperMarketManagementSystem\\src\\"
                                                                                + data + ".txt");
                                                String info = "";
                                                if (Male.isSelected()) {
                                                        info = data + "," + nameField.getText() + ","
                                                                        + pssField.getText() + ","
                                                                        + addField.getText() + ","
                                                                        + phoneField.getText() + "," + "Male";

                                                } else {
                                                        info = data + "," + nameField.getText() + ","
                                                                        + pssField.getText() + ","
                                                                        + addField.getText() + ","
                                                                        + phoneField.getText() + "," + "Female";

                                                }
                                                myWriter.write(info);
                                                myWriter.close();
                                                JOptionPane.showMessageDialog(this,
                                                                "User Successfully Registered!\nYour Login ID is: "
                                                                                + data,
                                                                "ALERT", JOptionPane.INFORMATION_MESSAGE);
                                                this.setVisible(false);
                                        } catch (IOException e) {
                                                JOptionPane.showMessageDialog(this, "Application ERROR", "ERROR",
                                                                JOptionPane.ERROR_MESSAGE);

                                        }
                                        myReader.close();

                                } catch (FileNotFoundException e) {
                                        JOptionPane.showMessageDialog(this, "Application ERROR", "ERROR",
                                                        JOptionPane.ERROR_MESSAGE);
                                }
                                int ID = Integer.parseInt(data);
                                ID++;
                                try {
                                        FileWriter myWriter = new FileWriter(
                                                        "C:\\Users\\MINAHIL SHAKOOR\\Desktop\\Grocery_Management_System_Java\\SuperMarketManagementSystem\\src\\ID_Counter.txt");
                                        myWriter.write("" + ID);
                                        myWriter.close();
                                        this.setVisible(false);
                                } catch (IOException e) {
                                        JOptionPane.showMessageDialog(this, "Application ERROR", "ERROR",
                                                        JOptionPane.ERROR_MESSAGE);
                                }

                        }
                } else {

                        JOptionPane.showMessageDialog(this, "Input field can not be empty!", "ERROR",
                                        JOptionPane.ERROR_MESSAGE);
                }
        }// GEN-LAST:event_signUpBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JTextField addField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField phoneField;
    private javax.swing.JPasswordField pssField;
    private javax.swing.JButton signUpBtn;
    // End of variables declaration//GEN-END:variables
}
