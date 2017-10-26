package taschenrechner;

import javax.swing.JFrame;






//import com.company.Benutzeroberfläche;
//import com.company.Benutzeroberfläche;

public class main extends JFrame{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objekt von Benutzeroberfläche erstellt
//Benutzeroberfläche obefläche=new Benutzeroberfläche();
//starte Gui
//obefläche.starteBenutzeroberfläche();
		Benutzeroberfläche oberfläche=new Benutzeroberfläche();
        //Rechenkern kern=new Rechenkern(kern);
        Rechenkern rechenkern=new Rechenkern();
        rechenkern.arithmetischeOperationen();
        rechenkern.trigonometrischeOperationen();
        oberfläche.buildgui();
       
       
     

//Benutzeroberfläche oberfläche=new Benutzeroberfläche();
//Benutzeroberfläche.main(args);

//Rechenkern kern=new Rechenkern();


	}

	
}
