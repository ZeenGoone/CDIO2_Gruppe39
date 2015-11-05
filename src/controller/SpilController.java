package controller;

import desktop_resources.GUI;
import entity.Felt;
import entity.Spiller;

public class SpilController {

	//initialiserer de noedvendige objekter
	private static Spilleplade sp;
	private static GUIcontroller gc;
	static Spiller s1 = new Spiller();	
	static Spiller s2 = new Spiller();	
	static Raflebaeger raflebaeger = new Raflebaeger();
	private static int nuvarendespiller = 1;

	public static void main(String[] args) {
		sp = new Spilleplade();
		gc = new GUIcontroller(sp);
		gc.startSpil();
		boolean vinder = false;


		//Mens vinder ikke er fundet
		while(vinder == false) {
			if ( nuvarendespiller == 1) {
				nuvarendespiller = 2;
				spilRunde(s1);
			}
			else {
				spilRunde(s2);
				nuvarendespiller = 1;
			}
			if (vinder == false) {
				GUI.getUserButtonPressed("Spiller " + nuvarendespiller + "s tur", "Tryk for at kaste!");	
			}
			
		}

	}


	public static void spilRunde(Spiller s){

		raflebaeger.slaaTerninger();
		
		//Lægger feltets værdi til spillers beholdning
		s.opdaterBeholdning(sp.getFelt(raflebaeger.getSum()-2).getVaerdi());
		gc.opdaterSpillerScore(s);
		
		gc.visBesked(sp.getFelt(raflebaeger.getSum()-2).getBeskrivelse());
		
		if ( raflebaeger.getSum() == 10 ) {
			getNuvaerendespiller( nuvarendespiller );
		}	
		
		
		if ( s.getBeholdning() >= 1200) {
			getNuvaerendespiller( nuvarendespiller );
			GUI.getUserButtonPressed("Spiller " + nuvarendespiller + " har vundet gz", "Fedt spil!");
			gc.afslutSpil();
			
			//vinder = true;
		}
	}

	public void flytBrik(int a, String b){

	}
	
	public static void getNuvaerendespiller ( int nuvaerendespiller ) {
		if ( nuvaerendespiller == 1) 
			nuvarendespiller =  2;
		else if ( nuvaerendespiller == 2)
			nuvarendespiller = 1;
	}
}