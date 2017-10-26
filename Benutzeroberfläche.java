package taschenrechner;



import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;





	
	public class Benutzeroberfläche extends main {

		public JFrame frame;
		public JTextField textField;
		public final ButtonGroup buttonGroup = new ButtonGroup();
		public final ButtonGroup buttonGroup_1 = new ButtonGroup();
		public JButton btnNewButton;
		public JButton btnNewButton_1;
		public JButton btnNewButton_2;
		public JButton button;
		public JButton button_1;
		public JButton button_2;
		public JButton button_3;
		public JButton button_4;
		public JButton button_5;
		public JButton button_6;
		public JButton button_7;
		public JButton button_8;
		public JButton button_9;
		public JButton button_10;
		public JButton button_11;
		public JButton button_12;
		public JButton button_13;
		public JButton button_14;
		public JButton button_15;
		public JButton button_16;
		public JButton button_17;
		public JButton button_18;
		public JButton button_19;
		public JButton button_20;
		public JButton button_21;
		public JButton button_22;
		public JButton button_23;
		public JButton button_24;
		public JButton button_25;
		public JButton button_26;
		public JButton button_27;
		public JButton button_28;
		public JButton button_29;
		public JButton button_30;
		public JButton button_31;
		public JButton button_32;
		public JButton button_33;
		public JButton button_34;
		public JButton button_35;
		public JButton button_36;
		public JButton button_37;
		public JButton button_38;
		public JButton button_39;
		public JButton button_40;
		public JButton button_41;
		public JButton button_42;
		public JButton button_43;
		public JButton button_44;
		public JButton button_45;
		public JButton button_46;
		public JButton button_47;
		public JButton button_48;
		public JButton button_49;
		public JButton button_50;
		public JButton button_51;
		public JRadioButton Bin;
		public JRadioButton Hex;
		public JRadioButton Okt;
		public JRadioButton Dez;
		public JRadioButton On;
		public JRadioButton Off;
		public final ButtonGroup buttonGroup_2 = new ButtonGroup();
		public JLabel label1;
		
		  public Rechenkern kern;
		  
		 
		    
		  
		  
		  public void Sperren() {
				// On.setEnabled(true);
				// Off.setEnabled(false);
				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				textField.setEnabled(false);
				button_1.setEnabled(false);
				button_2.setEnabled(false);
				button_3.setEnabled(false);
				button_4.setEnabled(false);
				button_5.setEnabled(false);
				button_6.setEnabled(false);
				button_7.setEnabled(false);
				button_8.setEnabled(false);
				button_9.setEnabled(false);
				button_10.setEnabled(false);
				button_11.setEnabled(false);
				button_12.setEnabled(false);
				button_13.setEnabled(false);
				button_14.setEnabled(false);
				button_15.setEnabled(false);
				/*
				 * button_16.setEnabled(false); button_17.setEnabled(false);
				 * button_18.setEnabled(false); button_19.setEnabled(false);
				 * button_20.setEnabled(false); button_21.setEnabled(false);
				 * button_22.setEnabled(false); button_23.setEnabled(false);
				 * button_24.setEnabled(false); button_25.setEnabled(false);
				 * button_26.setEnabled(false); button_27.setEnabled(false);
				 * button_28.setEnabled(false); button_29.setEnabled(false);
				 * button_30.setEnabled(false); button_31.setEnabled(false);
				 * button_32.setEnabled(false); button_33.setEnabled(false);
				 * button_34.setEnabled(false); button_35.setEnabled(false);
				 * button_36.setEnabled(false); button_37.setEnabled(false);
				 * button_38.setEnabled(false); button_39.setEnabled(false);
				 * button_40.setEnabled(false); button_41.setEnabled(false);
				 * button_42.setEnabled(false); button_43.setEnabled(false);
				 * button_44.setEnabled(false); button_45.setEnabled(false);
				 * button_46.setEnabled(false); button_47.setEnabled(false);
				 * button_48.setEnabled(false); button_49.setEnabled(false);
				 * button_50.setEnabled(false); button_51.setEnabled(false);
				 * Bin.setEnabled(false); Hex.setEnabled(false); Okt.setEnabled(false);
				 * Dez.setEnabled(false);
				 */

				// alle restlichen Buttons auch

			}
		  public void Entsperren() {
				// On.setEnabled(false);
				// Off.setEnabled(true);
				btnNewButton.setEnabled(true);
				btnNewButton_1.setEnabled(true);
				btnNewButton_2.setEnabled(true);
				textField.setEnabled(true);
				button_1.setEnabled(true);
				button_2.setEnabled(true);
				button_3.setEnabled(true);
				button_4.setEnabled(true);
				button_5.setEnabled(true);
				button_6.setEnabled(true);
				button_7.setEnabled(true);
				button_8.setEnabled(true);
				button_9.setEnabled(true);
				button_10.setEnabled(true);
				button_11.setEnabled(true);
				button_12.setEnabled(true);
				button_13.setEnabled(true);
				button_14.setEnabled(true);
				button_15.setEnabled(true);
				/*
				 * button_16.setEnabled(false); button_17.setEnabled(true);
				 * button_18.setEnabled(false); button_19.setEnabled(true);
				 * button_20.setEnabled(false); button_21.setEnabled(true);
				 * button_22.setEnabled(false); button_23.setEnabled(true);
				 * button_24.setEnabled(false); button_25.setEnabled(true);
				 * button_26.setEnabled(false); button_27.setEnabled(true);
				 * button_28.setEnabled(false); button_29.setEnabled(true);
				 * button_30.setEnabled(false); button_31.setEnabled(true);
				 * button_32.setEnabled(false); button_33.setEnabled(true);
				 * button_34.setEnabled(false); button_35.setEnabled(true);
				 * button_36.setEnabled(false); button_37.setEnabled(true);
				 * button_38.setEnabled(false); button_39.setEnabled(true);
				 * button_40.setEnabled(false); button_41.setEnabled(true);
				 * button_42.setEnabled(false); button_43.setEnabled(true);
				 * button_44.setEnabled(false); button_45.setEnabled(true);
				 * button_46.setEnabled(false); button_47.setEnabled(true);
				 * button_48.setEnabled(false); button_49.setEnabled(true);
				 * button_50.setEnabled(false); button_51.setEnabled(true);
				 * Bin.setEnabled(false); Hex.setEnabled(false); Okt.setEnabled(true);
				 * Dez.setEnabled(true);
				 */

			}
		  public void buildgui()
		  {

		

		// Rechner rechner1=new Rechner();

		// public Benutzeroberfläche1(Rechner rechner) {
		// this.rechner = rechner;
		// }

		/**
		 * Launch the application.
		 */
		
		// ein paar Variablen für Rechnungen

		/**
		 * Create the application.
		 */
		//public Benutzeroberfläche() {
		//	initialize();
		//}
		

		// sperrt alle Buttons bei Off. Problem: aber sperrt nicht alle
		

		// entsperrt alle Buttons bei On. Problem: aber sperrt nicht alle

		

		/**
		 * Initialize the contents of the frame.
		 */
		

			frame = new JFrame();
			frame.setBounds(100, 100, 511, 374);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);

			btnNewButton = new JButton("=");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// textField.setText("=");
					kern.arithmetischeOperationen(); // ruft Methode arithmetischeOperationen() auf
					kern.trigonometrischeOperationen(); // ruft Methode trigonometrischeOperationen() auf
					label1.setText(""); // löscht das label nach Rechnung

				}
			});
			btnNewButton.setBounds(424, 285, 47, 51);
			frame.getContentPane().add(btnNewButton);

			button_1 = new JButton("0");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "0");
				}
			});
			button_1.setBounds(271, 313, 47, 23);
			frame.getContentPane().add(button_1);

			button_2 = new JButton("1");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "1");
				}
			});
			button_2.setBounds(271, 286, 47, 23);
			frame.getContentPane().add(button_2);

			button_3 = new JButton("2");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "2");
				}
			});
			button_3.setBounds(322, 286, 47, 23);
			frame.getContentPane().add(button_3);

			button_4 = new JButton("3");
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "3");
				}
			});
			button_4.setBounds(373, 286, 47, 23);
			frame.getContentPane().add(button_4);

			button_5 = new JButton("4");
			button_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "4");
				}
			});
			button_5.setBounds(271, 258, 47, 23);
			frame.getContentPane().add(button_5);

			button_6 = new JButton("5");
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "5");
				}
			});
			button_6.setBounds(322, 258, 47, 23);
			frame.getContentPane().add(button_6);

			button_7 = new JButton("6");
			button_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "6");
				}
			});
			button_7.setBounds(373, 258, 47, 23);
			frame.getContentPane().add(button_7);

			button_8 = new JButton("7");
			button_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "7");

				}

			});
			button_8.setBounds(271, 224, 47, 23);
			frame.getContentPane().add(button_8);

			button_9 = new JButton("8");
			button_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "8");
				}
			});
			button_9.setBounds(322, 224, 47, 23);
			frame.getContentPane().add(button_9);

			button_10 = new JButton("9");
			button_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "9");
				}
			});
			button_10.setBounds(373, 224, 47, 23);
			frame.getContentPane().add(button_10);

			button_11 = new JButton(".");
			button_11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + ".");
				}
			});
			button_11.setBounds(322, 313, 47, 23);
			frame.getContentPane().add(button_11);

			button_13 = new JButton("+");
			button_13.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					// zahl wird vom Benutzer von Zahlen gewählt
					kern.zahl = Double.parseDouble(textField.getText());
					kern.rechnen = 1; // ruft case 1 von arithmetischeOperationen auf
					textField.setText("");
					label1.setText(kern.zahl + "+"); // zahl erscheint mit operation oben im label

				}
			});
			button_13.setBounds(424, 258, 47, 23);
			frame.getContentPane().add(button_13);

			button_14 = new JButton("-");
			button_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// textField.setText(textField.getText() + "-");

					kern.zahl = Double.parseDouble(textField.getText()); // zahl wird vom Benutzer von Zahlen gewählt
					kern.rechnen = 2; // ruft case 2 von arithmetischeOperationen auf
					textField.setText("");
					label1.setText(kern.zahl + "-"); // zahl erscheint mit operation oben im label
				}
			});
			button_14.setBounds(424, 224, 47, 23);
			frame.getContentPane().add(button_14);

			button_15 = new JButton("*");
			button_15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// textField.setText(textField.getText() + "*");
					kern.zahl = Double.parseDouble(textField.getText()); // zahl wird vom Benutzer von Zahlen gewählt
					kern.rechnen = 3; // ruft case 3 von arithmetischeOperationen auf
					textField.setText("");
					label1.setText(kern.zahl + "-"); // zahl erscheint mit operation oben im label

				}
			});
			button_15.setBounds(424, 195, 47, 23);
			frame.getContentPane().add(button_15);

			button_16 = new JButton("/");
			buttonGroup_2.add(button_16);
			button_16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// textField.setText(textField.getText() + "/");
					kern.zahl = Double.parseDouble(textField.getText()); // zahl wird vom Benutzer von Zahlen gewählt
					kern.rechnen = 4; // ruft case 4 von arithmetischeOperationen auf
					textField.setText("");
					label1.setText(kern.zahl + "-"); // zahl erscheint mit operation oben im label
				}
			});
			button_16.setBounds(424, 167, 47, 23);
			frame.getContentPane().add(button_16);

			button_17 = new JButton("a");
			button_17.setBounds(271, 195, 47, 23);
			frame.getContentPane().add(button_17);

			button_18 = new JButton("b");
			button_18.setBounds(322, 195, 47, 23);
			frame.getContentPane().add(button_18);

			button_19 = new JButton("c");
			button_19.setBounds(373, 195, 47, 23);
			frame.getContentPane().add(button_19);

			button_20 = new JButton("d");
			button_20.setBounds(271, 167, 47, 23);
			frame.getContentPane().add(button_20);

			button_21 = new JButton("e");
			buttonGroup_2.add(button_21);
			button_21.setBounds(322, 167, 47, 23);
			frame.getContentPane().add(button_21);

			button_22 = new JButton("f");
			buttonGroup_2.add(button_22);
			button_22.setBounds(373, 167, 47, 23);
			frame.getContentPane().add(button_22);

			button_26 = new JButton("MR");
			button_26.setBounds(322, 58, 47, 23);
			frame.getContentPane().add(button_26);

			button_23 = new JButton("MS");
			button_23.setBounds(373, 84, 47, 23);
			frame.getContentPane().add(button_23);

			button_24 = new JButton("M+");
			button_24.setBounds(373, 58, 47, 23);
			frame.getContentPane().add(button_24);

			button_25 = new JButton("M-");
			button_25.setBounds(425, 58, 46, 23);
			frame.getContentPane().add(button_25);

			button_29 = new JButton("Im");
			button_29.setBounds(68, 313, 65, 23);
			frame.getContentPane().add(button_29);

			button_30 = new JButton("Sum");
			button_30.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_30.setBounds(68, 286, 65, 23);
			frame.getContentPane().add(button_30);

			button_31 = new JButton("(");
			button_31.setBounds(68, 258, 65, 23);
			frame.getContentPane().add(button_31);

			button_32 = new JButton("Bruch");
			button_32.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_32.setBounds(0, 285, 65, 23);
			frame.getContentPane().add(button_32);

			button_33 = new JButton("10^x");
			button_33.setBounds(68, 195, 65, 23);
			frame.getContentPane().add(button_33);

			button_34 = new JButton("%");
			button_34.setBounds(143, 195, 65, 23);
			frame.getContentPane().add(button_34);

			button_35 = new JButton("...");
			button_35.setBounds(142, 313, 65, 23);
			frame.getContentPane().add(button_35);

			button_36 = new JButton("Quersumme");
			button_36.setBounds(142, 286, 65, 23);
			frame.getContentPane().add(button_36);

			button_37 = new JButton(")");
			button_37.setBounds(142, 258, 65, 23);
			frame.getContentPane().add(button_37);

			button_38 = new JButton("Re");
			button_38.setBounds(0, 313, 65, 23);
			frame.getContentPane().add(button_38);

			button_39 = new JButton("i");
			button_39.setBounds(142, 224, 65, 23);
			frame.getContentPane().add(button_39);

			button_40 = new JButton("x!");
			button_40.setBounds(0, 258, 65, 23);
			frame.getContentPane().add(button_40);

			button_27 = new JButton("x^2");
			button_27.setBounds(0, 195, 65, 23);
			frame.getContentPane().add(button_27);

			button_28 = new JButton("Wurzel");
			button_28.setBounds(142, 167, 65, 23);
			frame.getContentPane().add(button_28);

			textField = new JTextField();
			textField.setBounds(111, 23, 348, 31);
			frame.getContentPane().add(textField);
			textField.setColumns(10);

			btnNewButton_1 = new JButton("C");
			btnNewButton_1.addActionListener(new ActionListener() {
				// Button C zum löschen der Anzeige
				public void actionPerformed(ActionEvent e) {
					textField.setText(" ");
				}
			});
			btnNewButton_1.setBounds(262, 58, 56, 23);
			frame.getContentPane().add(btnNewButton_1);

			button_41 = new JButton("<--");
			button_41.addActionListener(new ActionListener() {

				// Methode, die das letzte eingetippte Zeichen löscht
				public void actionPerformed(ActionEvent e) {

					int Länge = textField.getText().length(); // Länge der Zeichenkette im Textfeld
					int Nummer = textField.getText().length() - 1; // Nummer des letzen Zeichens, dass gelöscht werden soll
					String Speicher; // speichert das korrigierte Wort

					if (Länge > 0) {
						StringBuilder zurück = new StringBuilder(textField.getText()); // Zeichenkette im
																						// Textfeld-->String-Objekt
						zurück.deleteCharAt(Nummer); // löscht das letzte zeichen der Zeichenkette an der Stelle "Nummer"
						Speicher = zurück.toString(); // speichert das korrigierte Wort in Speicher
						textField.setText(Speicher); // setzt den Text im Textfeld neu
					}

				}
			});
			button_41.setBounds(193, 58, 65, 23);
			frame.getContentPane().add(button_41);

			btnNewButton_2 = new JButton("e");
			btnNewButton_2.setBounds(68, 224, 65, 23);
			frame.getContentPane().add(btnNewButton_2);

			button_42 = new JButton("PI");
			button_42.setBounds(0, 224, 65, 23);
			frame.getContentPane().add(button_42);

			button_43 = new JButton("Log");
			button_43.setBounds(0, 167, 65, 23);
			frame.getContentPane().add(button_43);

			button_44 = new JButton("M");
			button_44.setBounds(322, 84, 47, 23);
			frame.getContentPane().add(button_44);

			button = new JButton("Cos");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					kern.zahl = Double.parseDouble(textField.getText()); // zahl wird vom Benutzer von Zahlen gewählt
					kern.rechnen1 = 1; // ruft case 1 von trigonometrischeOperationen auf
					textField.setText("");
					label1.setText("Cos(" + kern.zahl + ")"); // zahl erscheint mit operation oben im label
				}
			});
			button.setBounds(0, 142, 65, 23);
			frame.getContentPane().add(button);

			JButton button_12 = new JButton("Sin");
			button_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					kern.zahl = Double.parseDouble(textField.getText()); // zahl wird vom Benutzer von Zahlen gewählt
					kern.rechnen1 = 2; // ruft case 2 von trigonometrischeOperationen auf
					textField.setText("");
					label1.setText("Sin(" + kern.zahl + ")"); // zahl erscheint mit operation oben im label
				}
			});
			button_12.setBounds(68, 142, 65, 23);
			frame.getContentPane().add(button_12);

			button_45 = new JButton("Tan");
			button_45.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					kern.zahl = Double.parseDouble(textField.getText()); // zahl wird vom Benutzer von Zahlen gewählt
					kern.rechnen1 = 3; // ruft case 3 von trigonometrischeOperationen auf
					textField.setText("");
					label1.setText("Tan(" + kern.zahl + ")"); // zahl erscheint mit operation oben im label

				}
			});
			button_45.setBounds(142, 142, 65, 23);
			frame.getContentPane().add(button_45);

			button_46 = new JButton("j");
			button_46.setBounds(373, 142, 47, 23);
			frame.getContentPane().add(button_46);

			button_47 = new JButton("i");
			button_47.setBounds(322, 142, 47, 23);
			frame.getContentPane().add(button_47);

			button_48 = new JButton("h");
			button_48.setBounds(271, 142, 47, 23);
			frame.getContentPane().add(button_48);

			button_49 = new JButton("g");
			button_49.setBounds(424, 142, 47, 23);
			frame.getContentPane().add(button_49);

			button_50 = new JButton("New button");
			button_50.setBounds(373, 313, 47, 23);
			frame.getContentPane().add(button_50);

			button_51 = new JButton("Mod");
			button_51.setBounds(68, 167, 65, 23);
			frame.getContentPane().add(button_51);

			Bin = new JRadioButton("Bin");
			buttonGroup_1.add(Bin);
			Bin.setBounds(0, 112, 47, 23);
			frame.getContentPane().add(Bin);

			Hex = new JRadioButton("Hex");
			buttonGroup_1.add(Hex);
			Hex.setBounds(0, 84, 47, 23);
			frame.getContentPane().add(Hex);

			Dez = new JRadioButton("Dez");
			buttonGroup_1.add(Dez);
			Dez.setBounds(49, 112, 47, 23);
			frame.getContentPane().add(Dez);

			Okt = new JRadioButton("Okt");
			buttonGroup_1.add(Okt);
			Okt.setBounds(49, 84, 47, 23);
			frame.getContentPane().add(Okt);

			On = new JRadioButton("On");
			On.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Entsperren(); // ruft Methode Entsperren auf
				}
			});
			buttonGroup.add(On);
			On.setBounds(0, 11, 109, 23);
			frame.getContentPane().add(On);

			Off = new JRadioButton("Off");
			Off.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Sperren();

				}
			});
			buttonGroup.add(Off);
			Off.setBounds(0, 37, 65, 23);
			frame.getContentPane().add(Off);

			label1 = new JLabel("");
			label1.setBounds(412, 0, 47, 23);
			frame.getContentPane().add(label1);

		}

		  }
	
	
