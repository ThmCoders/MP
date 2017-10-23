package taschenrechner;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
// Benutzeroberfläche entspricht Gui-Start im Klassendiagramm
public class Benutzeroberfläche extends JFrame{

	//startet die Benutzeroberfläche von main aus
	public void starteBenutzeroberfläche()
	{
		JFrame frame;
		JTextField textField;

		/**
		 * Launch the application.
		 */
		

		/**
		 * Create the application.
		 */
		

		/**
		 * Initialize the contents of the frame.
		 */
		
			frame = new JFrame();
			frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
			frame.setBounds(100, 100, 450, 397);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JButton btnNewButton = new JButton("Mod");
			btnNewButton.setBounds(10, 257, 70, 23);
			frame.getContentPane().add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Wurzel");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_1.setBounds(10, 291, 70, 23);
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
			rdbtnNewRadioButton.setBounds(10, 85, 63, 23);
			frame.getContentPane().add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Of");
			rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			rdbtnNewRadioButton_1.setBounds(10, 111, 52, 23);
			frame.getContentPane().add(rdbtnNewRadioButton_1);
			
			JButton btnNewButton_6 = new JButton("New button");
			btnNewButton_6.setBounds(10, 325, 70, 23);
			frame.getContentPane().add(btnNewButton_6);
			
			JButton btnLog = new JButton("Log");
			btnLog.setBounds(10, 223, 70, 23);
			frame.getContentPane().add(btnLog);
			
			JButton button_5 = new JButton("");
			button_5.setBounds(378, 325, 46, 23);
			frame.getContentPane().add(button_5);
			
			JButton btnCos = new JButton("Cos");
			btnCos.setBounds(84, 155, 70, 23);
			frame.getContentPane().add(btnCos);
			
			JButton btnSin = new JButton("Sin");
			btnSin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnSin.setBounds(84, 189, 70, 23);
			frame.getContentPane().add(btnSin);
			
			JButton btnTan = new JButton("Tan");
			btnTan.setBounds(84, 223, 70, 23);
			frame.getContentPane().add(btnTan);
			
			JButton btnPi = new JButton("Pi");
			btnPi.setBounds(84, 257, 70, 23);
			frame.getContentPane().add(btnPi);
			
			JButton btnE = new JButton("e");
			btnE.setBounds(84, 291, 70, 23);
			frame.getContentPane().add(btnE);
			
			JButton button_14 = new JButton("New button");
			button_14.setBounds(84, 325, 70, 23);
			frame.getContentPane().add(button_14);
			
			JButton button_3 = new JButton("/");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("/");
				}
			});
			button_3.setBounds(378, 291, 46, 23);
			frame.getContentPane().add(button_3);
			
			JButton button_1 = new JButton("");
			button_1.setBounds(332, 325, 46, 23);
			frame.getContentPane().add(button_1);
			
			JButton button_2 = new JButton("3");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("3");
				}
			});
			button_2.setBounds(332, 291, 46, 23);
			frame.getContentPane().add(button_2);
			
			JButton button_4 = new JButton("6");
			button_4.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					textField.setText("6");
				}
			});
			button_4.setBounds(332, 257, 46, 23);
			frame.getContentPane().add(button_4);
			
			JButton button_9 = new JButton("9");
			button_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("9");
				}
			});
			button_9.setBounds(332, 223, 46, 23);
			frame.getContentPane().add(button_9);
			
			JButton button_12 = new JButton("");
			button_12.setBounds(332, 189, 46, 23);
			frame.getContentPane().add(button_12);
			
			JButton button_13 = new JButton("..");
			button_13.setBounds(332, 155, 46, 23);
			frame.getContentPane().add(button_13);
			
			JButton button_15 = new JButton("..");
			button_15.setBounds(378, 155, 46, 23);
			frame.getContentPane().add(button_15);
			
			JButton button_16 = new JButton("+");
			button_16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("+");
				}
			});
			button_16.setBounds(378, 189, 46, 23);
			frame.getContentPane().add(button_16);
			
			JButton button_17 = new JButton("-");
			button_17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("-");
				}
			});
			button_17.setBounds(378, 223, 46, 23);
			frame.getContentPane().add(button_17);
			
			JButton button_18 = new JButton("*");
			button_18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("*");
				}
			});
			button_18.setBounds(378, 257, 46, 23);
			frame.getContentPane().add(button_18);
			
			JButton button_19 = new JButton("=");
			button_19.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("=");
				}
			});
			button_19.setBounds(286, 325, 46, 23);
			frame.getContentPane().add(button_19);
			
			JButton button_20 = new JButton("2");
			button_20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("2");
				}
			});
			button_20.setBounds(286, 291, 46, 23);
			frame.getContentPane().add(button_20);
			
			JButton button_21 = new JButton("5");
			button_21.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("5");
				}
			});
			button_21.setBounds(286, 257, 46, 23);
			frame.getContentPane().add(button_21);
			
			JButton button_22 = new JButton("8");
			button_22.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("8");
				}
			});
			button_22.setBounds(286, 223, 46, 23);
			frame.getContentPane().add(button_22);
			
			JButton button_23 = new JButton("");
			button_23.setBounds(286, 189, 46, 23);
			frame.getContentPane().add(button_23);
			
			JButton btnC = new JButton("C");
			btnC.setBounds(236, 89, 46, 23);
			frame.getContentPane().add(btnC);
			
			JButton button_25 = new JButton("0");
			button_25.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					textField.setText("0");
				}
			});
			button_25.setBounds(236, 325, 46, 23);
			frame.getContentPane().add(button_25);
			
			JButton button_26 = new JButton("1");
			button_26.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("1");
				}
			});
			button_26.setBounds(236, 291, 46, 23);
			frame.getContentPane().add(button_26);
			
			JButton button_27 = new JButton("4");
			button_27.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("4");
				}
			});
			button_27.setBounds(236, 257, 46, 23);
			frame.getContentPane().add(button_27);
			
			JButton button_28 = new JButton("7");
			button_28.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("7");
				}
			});
			button_28.setBounds(236, 223, 46, 23);
			frame.getContentPane().add(button_28);
			
			JButton button_29 = new JButton("");
			button_29.setBounds(236, 189, 46, 23);
			frame.getContentPane().add(button_29);
			
			JButton button_30 = new JButton("<-");
			button_30.setBounds(163, 89, 63, 23);
			frame.getContentPane().add(button_30);
			
			JButton btnInt = new JButton("Int");
			btnInt.setBounds(10, 189, 70, 23);
			frame.getContentPane().add(btnInt);
			
			JButton button = new JButton("..");
			button.setBounds(378, 123, 46, 23);
			frame.getContentPane().add(button);
			
			JButton button_6 = new JButton("..");
			button_6.setBounds(332, 123, 46, 23);
			frame.getContentPane().add(button_6);
			
			JButton button_7 = new JButton("..");
			button_7.setBounds(286, 155, 46, 23);
			frame.getContentPane().add(button_7);
			
			JButton button_8 = new JButton("..");
			button_8.setBounds(286, 123, 46, 23);
			frame.getContentPane().add(button_8);
			
			JButton button_10 = new JButton("New button");
			button_10.setBounds(156, 325, 70, 23);
			frame.getContentPane().add(button_10);
			
			JButton button_11 = new JButton("New button");
			button_11.setBounds(156, 291, 70, 23);
			frame.getContentPane().add(button_11);
			
			JButton button_24 = new JButton("New button");
			button_24.setBounds(156, 257, 70, 23);
			frame.getContentPane().add(button_24);
			
			JButton button_31 = new JButton("New button");
			button_31.setBounds(156, 223, 70, 23);
			frame.getContentPane().add(button_31);
			
			JButton button_32 = new JButton("New button");
			button_32.setBounds(156, 189, 70, 23);
			frame.getContentPane().add(button_32);
			
			JButton button_33 = new JButton("New button");
			button_33.setBounds(156, 155, 70, 23);
			frame.getContentPane().add(button_33);
			
			//wichtig sodass oberfläche sichtbar wird bei start
			frame.setVisible(true);
		}
	}

