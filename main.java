package taschenrechner;

import javax.swing.JFrame;






//import com.company.Benutzeroberfl�che;
//import com.company.Benutzeroberfl�che;

public class main extends JFrame{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objekt von Benutzeroberfl�che erstellt
//Benutzeroberfl�che obefl�che=new Benutzeroberfl�che();
//starte Gui
//obefl�che.starteBenutzeroberfl�che();
		Benutzeroberfl�che oberfl�che=new Benutzeroberfl�che();
        //Rechenkern kern=new Rechenkern(kern);
        Rechenkern rechenkern=new Rechenkern();
        rechenkern.arithmetischeOperationen();
        rechenkern.trigonometrischeOperationen();
        oberfl�che.buildgui();
       
       
     

//Benutzeroberfl�che oberfl�che=new Benutzeroberfl�che();
//Benutzeroberfl�che.main(args);

//Rechenkern kern=new Rechenkern();


	}

	
}
