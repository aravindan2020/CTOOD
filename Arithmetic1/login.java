package Arithmetic1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class login {

	private JFrame frame;
	private JTextField us;
	private JPasswordField ps;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel us_l1 = new JLabel("USERNAME");
		us_l1.setBounds(97, 65, 89, 30);
		frame.getContentPane().add(us_l1);
		
		JLabel ps_l2 = new JLabel("PASSWORD");
		ps_l2.setBounds(97, 119, 65, 14);
		frame.getContentPane().add(ps_l2);
		
		us = new JTextField();
		us.setBounds(180, 70, 86, 20);
		frame.getContentPane().add(us);
		us.setColumns(10);
		
		ps = new JPasswordField();
		ps.setBounds(180, 116, 86, 20);
		frame.getContentPane().add(ps);
		
		JButton b1 = new JButton("LOGIN");
		b1.setBounds(143, 162, 89, 23);
		frame.getContentPane().add(b1);
	}
}
