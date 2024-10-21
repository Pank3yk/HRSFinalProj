package HotelReservationSystem;

import java.awt.EventQueue;
import java.awt.Image;
import java.text.Collator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HeroPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HeroPage frame = new HeroPage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public HeroPage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1263, 812);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        ImageIcon originalIcon = new ImageIcon(HeroPage.class.getResource("/HotelReservationSystem/pexels-photo-4223678new.png"));
        contentPane.setLayout(null);
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1210, 768);
        contentPane.add(layeredPane);
        

        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setBounds(0, 0, 1272, 786);
        layeredPane.add(lblNewLabel, new Integer(0));  
        lblNewLabel.setIcon(new ImageIcon(HeroPage.class.getResource("/HotelReservationSystem/pexels-photo-4223678new.png"))); 

     
        JButton btnNewButton = new JButton("Book Now!");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBounds(39, 527, 188, 72);
        btnNewButton.setBackground(new Color(0, 0, 0, 0)); 
        btnNewButton.setOpaque(false);
        btnNewButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        layeredPane.add(btnNewButton, new Integer(1));  
        
        JButton btnNewButton_1 = new JButton("Login");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(null, 
                        "Are you sure you want to proceed?", 
                        "Confirm",                           
                        JOptionPane.YES_NO_OPTION,           
                        JOptionPane.QUESTION_MESSAGE);      


                if (response == JOptionPane.YES_OPTION) {
  
                    Login login = new Login();
                    login.setVisible(true);
                    dispose(); 
                } else if (response == JOptionPane.NO_OPTION) {

                    JOptionPane.showMessageDialog(null, "Login cancelled.");
                } else {

                    JOptionPane.showMessageDialog(null, "Dialog was closed without a selection.");
                }
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBounds(678, 527, 188, 72);
        btnNewButton_1.setBackground(new Color(0, 0, 0, 0));
        btnNewButton_1.setOpaque(false);
        btnNewButton_1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        layeredPane.add(btnNewButton_1, new Integer(2));
        
        JButton btnNewButton_2 = new JButton("Register");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(null, 
                        "Are you sure you want to proceed?", 
                        "Confirm",                           
                        JOptionPane.YES_NO_OPTION,           
                        JOptionPane.QUESTION_MESSAGE);      

                if (response == JOptionPane.YES_OPTION) {
            		RegistrationGUI reg = new RegistrationGUI();
            		reg.setVisible(true);
            		dispose();
                }
                else if (response == JOptionPane.NO_OPTION) {
                	JOptionPane.showMessageDialog(null, "Login Cancelled");
                }
                else {
                	JOptionPane.showMessageDialog(null, "Dialog was closed without a selection.");
                }
        	}
        });
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton_2.setBounds(892, 527, 188, 72);
        btnNewButton_2.setBackground(new Color(0, 0, 0, 0));
        btnNewButton_2.setOpaque(false);
        btnNewButton_2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        layeredPane.add(btnNewButton_2, new Integer(3));
        
        JButton btnNewButton_3 = new JButton("<html>Check room <br>availability</html>");
        btnNewButton_3.setForeground(new Color(255, 255, 255));
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton_3.setBounds(250, 527, 188, 72);
        btnNewButton_3.setBackground(new Color(0, 0, 0, 0));
        btnNewButton_3.setOpaque(false);
        btnNewButton_3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        layeredPane.add(btnNewButton_3, new Integer(4));
        
        JButton btnNewButton_4 = new JButton("<html>Check booking<br> details</html>");
        btnNewButton_4.setForeground(new Color(255, 255, 255));
        btnNewButton_4.setBackground(new Color(240, 240, 240));
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton_4.setBounds(463, 527, 188, 72);
        btnNewButton_4.setBackground(new Color(0, 0, 0, 0));
        btnNewButton_4.setOpaque(false);
        btnNewButton_4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        layeredPane.add(btnNewButton_4, new Integer(5));
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(HeroPage.class.getResource("/HotelReservationSystem/Gold and Black Hotel Resort Creative Logo.png")));
        lblNewLabel_1.setBounds(379, 27, 676, 429);
        layeredPane.add(lblNewLabel_1, new Integer(6));
        layeredPane.add(lblNewLabel_1);

    
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
              
                Image resizedImage = originalIcon.getImage().getScaledInstance(layeredPane.getWidth(), layeredPane.getHeight(), Image.SCALE_SMOOTH);
                lblNewLabel.setIcon(new ImageIcon(resizedImage));
            }
        });
    }
}
