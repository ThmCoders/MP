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
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(18, 325, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton button = new JButton("New button");
		button.setBounds(18, 223, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_5 = new JButton("=");
		button_5.setBounds(378, 325, 46, 23);
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
		
		JButton button_14 = new JButton("New button");
		button_14.setBounds(112, 325, 89, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_3 = new JButton("/");
		button_3.setBounds(378, 291, 46, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_1 = new JButton("=");
		button_1.setBounds(322, 325, 46, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(322, 291, 46, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_4 = new JButton("6");
		button_4.setBounds(322, 257, 46, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_9 = new JButton("9");
		button_9.setBounds(322, 223, 46, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_12 = new JButton("=");
		button_12.setBounds(322, 189, 46, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("..");
		button_13.setBounds(322, 155, 46, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_15 = new JButton("..");
		button_15.setBounds(378, 155, 46, 23);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("+");
		button_16.setBounds(378, 189, 46, 23);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("-");
		button_17.setBounds(378, 223, 46, 23);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("*");
		button_18.setBounds(378, 257, 46, 23);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("=");
		button_19.setBounds(266, 325, 46, 23);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("2");
		button_20.setBounds(266, 291, 46, 23);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("5");
		button_21.setBounds(266, 257, 46, 23);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("8");
		button_22.setBounds(266, 223, 46, 23);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("=");
		button_23.setBounds(266, 189, 46, 23);
		frame.getContentPane().add(button_23);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(236, 89, 46, 23);
		frame.getContentPane().add(btnC);
		
		JButton button_25 = new JButton("0");
		button_25.setBounds(210, 325, 46, 23);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("1");
		button_26.setBounds(211, 291, 46, 23);
		frame.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("4");
		button_27.setBounds(213, 257, 46, 23);
		frame.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("7");
		button_28.setBounds(210, 223, 46, 23);
		frame.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("=");
		button_29.setBounds(211, 189, 46, 23);
		frame.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("<-");
		button_30.setBounds(163, 89, 63, 23);
		frame.getContentPane().add(button_30);
	}
}
