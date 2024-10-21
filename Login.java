package HotelReservationSystem;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 405);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 38, 41));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(263, 160, 135, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(112, 217, 58, 15);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(42, 47, 51));
		textField.setBounds(202, 208, 203, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBackground(new Color(42, 47, 51));
		passwordField.setBounds(202, 256, 203, 38);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(112, 265, 80, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = textField.getText();
				String password = new String(passwordField.getPassword());
				
				if (email.isEmpty() || password.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please put your Email and Password!");
				}
				else {
					// Check if the user exists and the password is correct
					if (RegistrationGUI.registeredUsers.containsKey(email) && 
					    RegistrationGUI.registeredUsers.get(email).equals(password)) {
						JOptionPane.showMessageDialog(null, "Login successful!");
						// Redirect to the main system
					} else {
						JOptionPane.showMessageDialog(null, "Invalid email or password.");
					}
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(34, 38, 41));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(263, 304, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");

		// Load the image
		ImageIcon originalIcon = new ImageIcon(Login.class.getResource("/HotelReservationSystem/Login.png"));

		// Resize the image to fit within the JLabel bounds (328x203)
		Image resizedImage = originalIcon.getImage().getScaledInstance(328, 203, Image.SCALE_SMOOTH);

		// Set the resized image as an icon to the label
		lblNewLabel_2.setIcon(new ImageIcon(resizedImage));

		// Set the bounds for the label
		lblNewLabel_2.setBounds(140, 0, 271, 150);

		// Add the label to the content pane
		contentPane.add(lblNewLabel_2);
		
		JButton btnNoAccountYet = new JButton("No account yet? Register");
		btnNoAccountYet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationGUI reg = new RegistrationGUI();
				reg.setVisible(true);
				dispose();
			}
		});
		btnNoAccountYet.setForeground(Color.WHITE);
		btnNoAccountYet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNoAccountYet.setBackground(new Color(34, 38, 41));
		btnNoAccountYet.setBounds(207, 335, 198, 21);
		contentPane.add(btnNoAccountYet);
	}
}
