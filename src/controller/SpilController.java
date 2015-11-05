package controller;

import desktop_resources.GUI;
import entity.Felt;
import entity.Spiller;

public class SpilController {

	//initialiserer de noedvendige objekter
	private static Spilleplade sp;
	private static GUIcontroller gc;
	private static Spiller s1;
	private static Spiller s2;
	private static Raflebaeger raflebaeger;
	
	private static int nuvarendespiller = 1;
	private static boolean vinder = false;
	
	public static void main(String[] args) {
		sp = new Spilleplade();
		gc = new GUIcontroller(sp);
		raflebaeger = new Raflebaeger();
		s1 = new Spiller();
		s2 = new Spiller();
		gc.startSpil();
		
		//Mens vinder ikke er fundet
		while(!vinder) {
			if ( nuvarendespiller == 1) {
				nuvarendespiller = 2;
				spilRunde(s1);
			}
			else {
				spilRunde(s2);
				nuvarendespiller = 1;
			}
			if (!vinder) {
				GUI.getUserButtonPressed("Spiller " + nuvarendespiller + "s tur", "Tryk for at kaste!");	
			}			
		}
		gc.afslutSpil();
	}


	public static void spilRunde(Spiller s) {

		raflebaeger.slaaTerninger();
		
		//Laegger feltets vaerdi til spillers beholdning
		s.opdaterBeholdning(sp.getFelt(raflebaeger.getSum()-2).getVaerdi());
		gc.opdaterSpillerScore(s);
		gc.setTerninger(raflebaeger);
		flytBrik(s, raflebaeger.getSum()-1);
		gc.visBesked(sp.getFelt(raflebaeger.getSum()-2).getBeskrivelse());
		
		if ( raflebaeger.getSum() == 10 ) {
			getNuvaerendespiller( nuvarendespiller );
		}	
		if ( s.getBeholdning() >= 1200) {
			getNuvaerendespiller( nuvarendespiller );
			GUI.getUserButtonPressed("Spiller " + nuvarendespiller + " har vundet gz", "Fedt spil!");
			vinder = true;	
		}
		fjernBrik(s, raflebaeger.getSum()-1);
	}

	public static void flytBrik(Spiller s, int felt){
		gc.placerBrik(s, felt);
	}
	
	public static void fjernBrik(Spiller s, int felt){
		gc.fjernBrik(s, felt);
	}
	
	public static void getNuvaerendespiller ( int nuvaerendespiller ) {
		if ( nuvaerendespiller == 1) 
			nuvarendespiller =  2;
		else if ( nuvaerendespiller == 2)
			nuvarendespiller = 1;
	}
}