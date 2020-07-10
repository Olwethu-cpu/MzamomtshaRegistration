

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import java.awt.Color;

public class Second {

	private JFrame frame;
	private JTextField LearnerName;
	private JTextField Gender;
	private JTextField ParentSurname;
	private JTextField LearnerSurname;
	private JTextField Grade;
	private JTextField ParentAddress;
	private JTextField DateOfBirth;
	private JTextField ParentName;
	private JTextField ParentContacts;
	private JTextField Password;
	private JTextField UserName;
	private JTextField NoOfChildren;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Second window = new Second();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Connection con = null;
        String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
        String username = "root" ;
        String password = "Branden16odz";

        try {
        	try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
        	con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root","root","Branden16odz");
            System.out.println("Connected!");
        } catch(SQLException ex) {
        	throw new Error("Error",ex);
        } finally {
        	
         try {
           if (con != null) {
        	  con.close(); 
           }
         }catch(SQLException ex) {
        	 System.out.println(ex.getMessage());
         }
        }   	
    }

	

	/**
	 * Create the application.
	 */
	public Second() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 508, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBackground(Color.GREEN);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    JOptionPane.showMessageDialog(frame ,"You have successfully registered!!");
			}
		});
		btnRegister.setBounds(166, 173, 150, 23);
		frame.getContentPane().add(btnRegister);
		
		LearnerName = new JTextField();
		LearnerName.setBounds(98, 52, 72, 20);
		frame.getContentPane().add(LearnerName);
		LearnerName.setColumns(10);
		
		Gender = new JTextField();
		Gender.setBounds(60, 145, 110, 20);
		frame.getContentPane().add(Gender);
		Gender.setColumns(10);
		
		ParentSurname = new JTextField();
		ParentSurname.setBounds(272, 114, 54, 20);
		frame.getContentPane().add(ParentSurname);
		ParentSurname.setColumns(10);
		
		LearnerSurname = new JTextField();
		LearnerSurname.setBounds(108, 83, 62, 20);
		frame.getContentPane().add(LearnerSurname);
		LearnerSurname.setColumns(10);
		
		Grade = new JTextField();
		Grade.setBounds(216, 52, 110, 20);
		frame.getContentPane().add(Grade);
		Grade.setColumns(10);
		
		ParentAddress = new JTextField();
		ParentAddress.setBounds(428, 52, 54, 20);
		frame.getContentPane().add(ParentAddress);
		ParentAddress.setColumns(10);
		
		DateOfBirth = new JTextField();
		DateOfBirth.setBounds(84, 114, 86, 20);
		frame.getContentPane().add(DateOfBirth);
		DateOfBirth.setColumns(10);
		
		ParentName = new JTextField();
		ParentName.setBounds(254, 83, 72, 20);
		frame.getContentPane().add(ParentName);
		ParentName.setColumns(10);
		
		ParentContacts = new JTextField();
		ParentContacts.setBounds(272, 145, 54, 20);
		frame.getContentPane().add(ParentContacts);
		ParentContacts.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.GREEN);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname = UserName.getText();
				String pword = Password.getText();	
				
				if(uname.equals("abcde") && pword.equals("12345")) {
					JOptionPane.showMessageDialog(frame,"You have successfully logged in.");
				}
				else
				{
					JOptionPane.showMessageDialog(frame,"Invalid UserName or Password!");
				}
			}
		});
		btnLogin.setBounds(155, 318, 178, 23);
		frame.getContentPane().add(btnLogin);
		
		Password = new JTextField();
		Password.setBounds(247, 287, 86, 20);
		frame.getContentPane().add(Password);
		Password.setColumns(10);
		
		UserName = new JTextField();
		UserName.setBounds(247, 256, 86, 20);
		frame.getContentPane().add(UserName);
		UserName.setColumns(10);
		
		JTextPane txtpnRegister = new JTextPane();
		txtpnRegister.setBackground(Color.LIGHT_GRAY);
		txtpnRegister.setText("   Register");
		txtpnRegister.setFont(new Font("Berlin Sans FB", Font.BOLD, 25));
		txtpnRegister.setBounds(166, 11, 145, 30);
		frame.getContentPane().add(txtpnRegister);
		
		JTextPane txtpnAdmin = new JTextPane();
		txtpnAdmin.setBackground(Color.LIGHT_GRAY);
		txtpnAdmin.setFont(new Font("Berlin Sans FB", Font.BOLD, 25));
		txtpnAdmin.setText("Administrator");
		txtpnAdmin.setBounds(155, 222, 178, 30);
		frame.getContentPane().add(txtpnAdmin);
		
		JLabel lblNewLabel = new JLabel("LearnerName");
		lblNewLabel.setBounds(10, 55, 78, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LearnerSurname");
		lblNewLabel_1.setBounds(10, 86, 99, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DateOfBirth");
		lblNewLabel_2.setBounds(10, 117, 72, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(10, 148, 61, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Grade");
		lblNewLabel_4.setBounds(176, 55, 43, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ParentName");
		lblNewLabel_5.setBounds(176, 86, 76, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ParentSurname");
		lblNewLabel_6.setBounds(178, 117, 99, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("ParentAddress");
		lblNewLabel_7.setBounds(336, 55, 99, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("NoOfChildren");
		lblNewLabel_8.setBounds(336, 86, 99, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("UserName");
		lblNewLabel_9.setBounds(155, 259, 82, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Password");
		lblNewLabel_10.setBounds(155, 290, 82, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		NoOfChildren = new JTextField();
		NoOfChildren.setBounds(422, 83, 62, 20);
		frame.getContentPane().add(NoOfChildren);
		NoOfChildren.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("ParentContacts");
		lblNewLabel_11.setBounds(177, 148, 100, 14);
		frame.getContentPane().add(lblNewLabel_11);
	}
}
