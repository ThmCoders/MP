package taschenrechner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gui1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui1 window = new gui1();
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
	public gui1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 450, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(18, 257, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(18, 291, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(323, 155, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setBounds(66, 11, 346, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(18, 119, 63, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Of");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setBounds(18, 145, 52, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(323, 257, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(323, 189, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(323, 223, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(18, 325, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton button = new JButton("New button");
		button.setBounds(18, 223, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(213, 155, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(213, 189, 89, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(213, 223, 89, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(213, 257, 89, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(87, 62, 34, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.setBounds(114, 155, 89, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("New button");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.setBounds(114, 189, 89, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("New button");
		button_8.setBounds(114, 223, 89, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_10 = new JButton("New button");
		button_10.setBounds(114, 257, 89, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("New button");
		button_11.setBounds(112, 291, 89, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("New button");
		button_12.setBounds(213, 291, 89, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("New button");
		button_13.setBounds(323, 291, 89, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("New button");
		button_14.setBounds(112, 325, 89, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("New button");
		button_15.setBounds(213, 325, 89, 23);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("New button");
		button_16.setBounds(323, 325, 89, 23);
		frame.getContentPane().add(button_16);
		
		JButton button_9 = new JButton("New button");
		button_9.setBounds(141, 62, 34, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_17 = new JButton("New button");
		button_17.setBounds(195, 62, 34, 23);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("New button");
		button_18.setBounds(249, 62, 34, 23);
		frame.getContentPane().add(button_18);
	}
}
