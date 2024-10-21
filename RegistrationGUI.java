package HotelReservationSystem;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.awt.Color;
import javax.swing.ImageIcon;

public class RegistrationGUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldFullName;
    private JTextField textFieldEmail;
    private JTextField textFieldContactNumber;
    private JPasswordField passwordField;
    private JPasswordField passwordFieldConfirm;
    private JButton btnSubmit;

    // HashMap to store users
    public static HashMap<String, String> registeredUsers = new HashMap<>();

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                RegistrationGUI frame = new RegistrationGUI();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public RegistrationGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 964, 549);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(34, 38, 41));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblFullName = new JLabel("Full Name");
        lblFullName.setForeground(new Color(255, 255, 255));
        lblFullName.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblFullName.setBounds(10, 147, 93, 28);
        contentPane.add(lblFullName);
        
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setForeground(new Color(255, 255, 255));
        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblEmail.setBounds(10, 185, 93, 28);
        contentPane.add(lblEmail);
        
        JLabel lblContactNumber = new JLabel("Contact Number");
        lblContactNumber.setForeground(new Color(255, 255, 255));
        lblContactNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblContactNumber.setBounds(10, 223, 108, 28);
        contentPane.add(lblContactNumber);
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(new Color(255, 255, 255));
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPassword.setBounds(10, 261, 108, 28);
        contentPane.add(lblPassword);
        
        JLabel lblConfirmPassword = new JLabel("Confirm Password");
        lblConfirmPassword.setForeground(new Color(255, 255, 255));
        lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblConfirmPassword.setBounds(10, 296, 121, 28);
        contentPane.add(lblConfirmPassword);
        
        JLabel lblTerms = new JLabel("Terms and Conditions");
        lblTerms.setForeground(new Color(255, 255, 255));
        lblTerms.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTerms.setBounds(10, 318, 260, 52);
        contentPane.add(lblTerms);
        
        JCheckBox chckbxTerms = new JCheckBox("<html>By <b>registering</b>, you agree to our <br> <b>Terms and Conditions and Privacy Policy.<b> </html>");
        chckbxTerms.setBackground(new Color(34, 38, 41));
        chckbxTerms.setForeground(new Color(255, 255, 255));
        chckbxTerms.setFont(new Font("Tahoma", Font.PLAIN, 12));
        chckbxTerms.setBounds(6, 364, 292, 39);
        contentPane.add(chckbxTerms);
        
        textFieldFullName = new JTextField();
        textFieldFullName.setForeground(new Color(255, 255, 255));
        textFieldFullName.setBackground(new Color(42, 47, 51));
        textFieldFullName.setBounds(140, 153, 250, 19);
        contentPane.add(textFieldFullName);
        
        textFieldEmail = new JTextField();
        textFieldEmail.setForeground(new Color(255, 255, 255));
        textFieldEmail.setBackground(new Color(42, 47, 51));
        textFieldEmail.setBounds(140, 191, 250, 19);
        contentPane.add(textFieldEmail);
        
        textFieldContactNumber = new JTextField();
        textFieldContactNumber.setForeground(new Color(255, 255, 255));
        textFieldContactNumber.setBackground(new Color(42, 47, 51));
        textFieldContactNumber.setBounds(140, 229, 250, 19);
        contentPane.add(textFieldContactNumber);
        
        passwordField = new JPasswordField();
        passwordField.setForeground(new Color(255, 255, 255));
        passwordField.setBackground(new Color(42, 47, 51));
        passwordField.setBounds(140, 267, 250, 19);
        contentPane.add(passwordField);
        
        passwordFieldConfirm = new JPasswordField();
        passwordFieldConfirm.setForeground(new Color(255, 255, 255));
        passwordFieldConfirm.setBackground(new Color(42, 47, 51));
        passwordFieldConfirm.setBounds(141, 302, 250, 19);
        contentPane.add(passwordFieldConfirm);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setBackground(new Color(34, 38, 41));
        btnSubmit.setForeground(new Color(255, 255, 255));
        btnSubmit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                String email = textFieldEmail.getText();
                String password = new String(passwordField.getPassword());
                String confirmPass = new String(passwordFieldConfirm.getPassword());
                
                // Validate input fields
                if (!password.equals(confirmPass)) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match. Please try again.");
                    return;
                }
                if (email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields!");
                    return;
                }
                
                // Check if the user is already registered
                if (registeredUsers.containsKey(email)) {
                    JOptionPane.showMessageDialog(null, "This email is already registered!");
                    return;
                }

                // Register the user
                registeredUsers.put(email, password);
                JOptionPane.showMessageDialog(null, "Registration successful!");
                
                // Redirect to login screen
                Login login = new Login();
                dispose();
                login.setVisible(true);
            }
        });
        btnSubmit.setBounds(10, 421, 85, 21);
        btnSubmit.setVisible(false);  
        contentPane.add(btnSubmit);
        
        JButton btnAlreadyHaveAccount = new JButton("Already have an account?");
        btnAlreadyHaveAccount.setForeground(new Color(255, 255, 255));
        btnAlreadyHaveAccount.setBackground(new Color(34, 38, 41));
        btnAlreadyHaveAccount.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Login login = new Login();
        		login.setVisible(true);
        		dispose();
        	}
        });
        btnAlreadyHaveAccount.setBounds(257, 421, 186, 21);
        contentPane.add(btnAlreadyHaveAccount);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(42, 47, 51));
        panel.setBounds(475, -14, 500, 546);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Logo");
        lblNewLabel.setIcon(new ImageIcon(RegistrationGUI.class.getResource("/HotelReservationSystem/Gold and Black Hotel Resort Creative Logo.png")));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(0, 45, 417, 381);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon(RegistrationGUI.class.getResource("/HotelReservationSystem/reg.png")));
        lblNewLabel_1.setBounds(177, 10, 121, 117);
        contentPane.add(lblNewLabel_1);
        
        chckbxTerms.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                btnSubmit.setVisible(chckbxTerms.isSelected());
            }
        });
    }
}
