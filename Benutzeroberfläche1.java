package taschenrechner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Benutzeroberfläche1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Benutzeroberfläche1 window = new Benutzeroberfläche1();
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
	public Benutzeroberfläche1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 511, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("=");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("=");
			}
		});
		btnNewButton.setBounds(424, 285, 47, 51);
		frame.getContentPane().add(btnNewButton);

		JButton button_1 = new JButton("0");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
			}
		});
		button_1.setBounds(271, 313, 47, 23);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		button_2.setBounds(271, 286, 47, 23);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("2");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("2");
			}
		});
		button_3.setBounds(322, 286, 47, 23);
		frame.getContentPane().add(button_3);

		JButton button_4 = new JButton("3");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3");
			}
		});
		button_4.setBounds(373, 286, 47, 23);
		frame.getContentPane().add(button_4);

		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("4");
			}
		});
		button_5.setBounds(271, 258, 47, 23);
		frame.getContentPane().add(button_5);

		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("5");
			}
		});
		button_6.setBounds(322, 258, 47, 23);
		frame.getContentPane().add(button_6);

		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6");
			}
		});
		button_7.setBounds(373, 258, 47, 23);
		frame.getContentPane().add(button_7);

		JButton button_8 = new JButton("7");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("7");
			}
		});
		button_8.setBounds(271, 224, 47, 23);
		frame.getContentPane().add(button_8);

		JButton button_9 = new JButton("8");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("8");
			}
		});
		button_9.setBounds(322, 224, 47, 23);
		frame.getContentPane().add(button_9);

		JButton button_10 = new JButton("9");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");
			}
		});
		button_10.setBounds(373, 224, 47, 23);
		frame.getContentPane().add(button_10);

		JButton button_11 = new JButton(".");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(".");
			}
		});
		button_11.setBounds(322, 313, 47, 23);
		frame.getContentPane().add(button_11);

		JButton button_13 = new JButton("+");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("+");
			}
		});
		button_13.setBounds(424, 258, 47, 23);
		frame.getContentPane().add(button_13);

		JButton button_14 = new JButton("-");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("-");
			}
		});
		button_14.setBounds(424, 224, 47, 23);
		frame.getContentPane().add(button_14);

		JButton button_15 = new JButton("*");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("*");
			}
		});
		button_15.setBounds(424, 195, 47, 23);
		frame.getContentPane().add(button_15);

		JButton button_16 = new JButton("/");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("/");
			}
		});
		button_16.setBounds(424, 167, 47, 23);
		frame.getContentPane().add(button_16);

		JButton button_17 = new JButton("a");
		button_17.setBounds(271, 195, 47, 23);
		frame.getContentPane().add(button_17);

		JButton button_18 = new JButton("b");
		button_18.setBounds(322, 195, 47, 23);
		frame.getContentPane().add(button_18);

		JButton button_19 = new JButton("c");
		button_19.setBounds(373, 195, 47, 23);
		frame.getContentPane().add(button_19);

		JButton button_20 = new JButton("d");
		button_20.setBounds(271, 167, 47, 23);
		frame.getContentPane().add(button_20);

		JButton button_21 = new JButton("e");
		button_21.setBounds(322, 167, 47, 23);
		frame.getContentPane().add(button_21);

		JButton button_22 = new JButton("f");
		button_22.setBounds(373, 167, 47, 23);
		frame.getContentPane().add(button_22);

		JButton button_26 = new JButton("MR");
		button_26.setBounds(322, 58, 47, 23);
		frame.getContentPane().add(button_26);

		JButton button_23 = new JButton("MS");
		button_23.setBounds(373, 84, 47, 23);
		frame.getContentPane().add(button_23);

		JButton button_24 = new JButton("M+");
		button_24.setBounds(373, 58, 47, 23);
		frame.getContentPane().add(button_24);

		JButton button_25 = new JButton("M-");
		button_25.setBounds(425, 58, 46, 23);
		frame.getContentPane().add(button_25);

		JButton button_29 = new JButton("Im");
		button_29.setBounds(68, 313, 65, 23);
		frame.getContentPane().add(button_29);

		JButton button_30 = new JButton("Sum");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_30.setBounds(68, 286, 65, 23);
		frame.getContentPane().add(button_30);

		JButton button_31 = new JButton("(");
		button_31.setBounds(68, 258, 65, 23);
		frame.getContentPane().add(button_31);

		JButton button_32 = new JButton("Bruch");
		button_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_32.setBounds(0, 285, 65, 23);
		frame.getContentPane().add(button_32);

		JButton button_33 = new JButton("10^x");
		button_33.setBounds(68, 195, 65, 23);
		frame.getContentPane().add(button_33);

		JButton button_34 = new JButton("%");
		button_34.setBounds(143, 195, 65, 23);
		frame.getContentPane().add(button_34);

		JButton button_35 = new JButton("...");
		button_35.setBounds(142, 313, 65, 23);
		frame.getContentPane().add(button_35);

		JButton button_36 = new JButton("Quersumme");
		button_36.setBounds(142, 286, 65, 23);
		frame.getContentPane().add(button_36);

		JButton button_37 = new JButton(")");
		button_37.setBounds(142, 258, 65, 23);
		frame.getContentPane().add(button_37);

		JButton button_38 = new JButton("Re");
		button_38.setBounds(0, 313, 65, 23);
		frame.getContentPane().add(button_38);

		JButton button_39 = new JButton("i");
		button_39.setBounds(142, 224, 65, 23);
		frame.getContentPane().add(button_39);

		JButton button_40 = new JButton("x!");
		button_40.setBounds(0, 258, 65, 23);
		frame.getContentPane().add(button_40);

		JButton button_27 = new JButton("x^2");
		button_27.setBounds(0, 195, 65, 23);
		frame.getContentPane().add(button_27);

		JButton button_28 = new JButton("Wurzel");
		button_28.setBounds(142, 167, 65, 23);
		frame.getContentPane().add(button_28);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
		rdbtnNewRadioButton.setBounds(0, 11, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton radioButton = new JRadioButton("Of");
		radioButton.setBounds(0, 31, 109, 23);
		frame.getContentPane().add(radioButton);

		textField = new JTextField();
		textField.setBounds(111, 11, 348, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(279, 58, 39, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton button_41 = new JButton("<--");
		button_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_41.setBounds(208, 58, 65, 23);
		frame.getContentPane().add(button_41);

		JButton btnNewButton_2 = new JButton("e");
		btnNewButton_2.setBounds(68, 224, 65, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton button_42 = new JButton("PI");
		button_42.setBounds(0, 224, 65, 23);
		frame.getContentPane().add(button_42);

		JButton button_43 = new JButton("Log");
		button_43.setBounds(0, 167, 65, 23);
		frame.getContentPane().add(button_43);

		JButton button_44 = new JButton("M");
		button_44.setBounds(322, 84, 47, 23);
		frame.getContentPane().add(button_44);

		JButton button = new JButton("Cos");
		button.setBounds(0, 142, 65, 23);
		frame.getContentPane().add(button);

		JButton button_12 = new JButton("Sin");
		button_12.setBounds(68, 142, 65, 23);
		frame.getContentPane().add(button_12);

		JButton button_45 = new JButton("Tan");
		button_45.setBounds(142, 142, 65, 23);
		frame.getContentPane().add(button_45);

		JButton button_46 = new JButton("j");
		button_46.setBounds(373, 142, 47, 23);
		frame.getContentPane().add(button_46);

		JButton button_47 = new JButton("i");
		button_47.setBounds(322, 142, 47, 23);
		frame.getContentPane().add(button_47);

		JButton button_48 = new JButton("h");
		button_48.setBounds(271, 142, 47, 23);
		frame.getContentPane().add(button_48);

		JButton button_49 = new JButton("g");
		button_49.setBounds(424, 142, 47, 23);
		frame.getContentPane().add(button_49);

		JButton button_50 = new JButton("New button");
		button_50.setBounds(373, 313, 47, 23);
		frame.getContentPane().add(button_50);

		JButton button_51 = new JButton("Mod");
		button_51.setBounds(68, 167, 65, 23);
		frame.getContentPane().add(button_51);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Bin");
		rdbtnNewRadioButton_1.setBounds(0, 112, 47, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);

		JRadioButton radioButton_1 = new JRadioButton("Hex");
		radioButton_1.setBounds(0, 84, 47, 23);
		frame.getContentPane().add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("Dez");
		radioButton_2.setBounds(49, 112, 47, 23);
		frame.getContentPane().add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("Okt");
		radioButton_3.setBounds(49, 84, 47, 23);
		frame.getContentPane().add(radioButton_3);
	}
}
