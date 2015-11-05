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
	private static boolean vinder = false;

	public static void main(String[] args) {
		sp = new Spilleplade();
		gc = new GUIcontroller(sp);
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
	}


	public static void spilRunde(Spiller s){

		raflebaeger.slaaTerninger();
		
		//L�gger feltets v�rdi til spillers beholdning
		s.opdaterBeholdning(sp.getFelt(raflebaeger.getSum()-2).getVaerdi());
		gc.opdaterSpillerScore(s);
		gc.placerBrik(s, raflebaeger.getSum());
		
		gc.visBesked(sp.getFelt(raflebaeger.getSum()-2).getBeskrivelse());
		
		if ( raflebaeger.getSum() == 10 ) {
			getNuvaerendespiller( nuvarendespiller );
		}	
		
		
		if ( s.getBeholdning() >= 3000) {
			getNuvaerendespiller( nuvarendespiller );
			GUI.getUserButtonPressed("Spiller " + nuvarendespiller + " har vundet gz", "Fedt spil!");
			gc.afslutSpil();
		}
		gc.fjernBrik(s, raflebaeger.getSum());
	}

	public void flytBrik(Spiller s, int felt){
		gc.placerBrik(s, felt);
	}
	
	public static void getNuvaerendespiller ( int nuvaerendespiller ) {
		if ( nuvaerendespiller == 1) 
			nuvarendespiller =  2;
		else if ( nuvaerendespiller == 2)
			nuvarendespiller = 1;
	}
}