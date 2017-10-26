package taschenrechner;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
public class Rechenkern extends Benutzeroberfläche {

	
	
	public Rechenkern(Rechenkern kern) {
		super();
		// TODO Auto-generated constructor stub
	}

	public double zahl;
	public double ergebnis;
	public int rechnen;
	public int rechnen1;
	// Arithmetische Operationen
	 


public Rechenkern()
{
	this.zahl=zahl;
	this.rechnen=rechnen;
	this.rechnen1=rechnen1;
}
    

	public void arithmetischeOperationen() {
		switch (rechnen) {
		// Addition
		case 1:
			ergebnis = zahl + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ergebnis));
			break;
		// Subtraktion
		case 2:
			ergebnis = zahl - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ergebnis));
			break;
		// Multiplikation
		case 3:
			ergebnis = zahl * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ergebnis));
			break;
		// Division
		case 4:
			ergebnis = zahl / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ergebnis));
			break;
		}
	}

	// trigonometirsche Operationen
	public void trigonometrischeOperationen() {
		switch (rechnen1) {
		// Cos
		case 1:
			ergebnis = Math.cos(zahl);
			// zahl + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ergebnis));
			break;
		// Sin
		case 2:
			ergebnis = Math.sin(zahl);
			// zahl + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ergebnis));
			break;
		// Tan
		case 3:
			ergebnis = Math.tan(zahl);
			// zahl + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ergebnis));
			break;
		// Division
		case 4:
		}
	}
}
