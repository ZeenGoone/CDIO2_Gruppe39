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
	private static int nuvarendespiller = 0;

	public static void main(String[] args) {
		sp = new Spilleplade();
		gc = new GUIcontroller(sp);
		gc.startSpil();
		boolean vinder = false;


		//Mens vinder ikke er fundet
		while(s1.getBeholdning() < 1200 || s2.getBeholdning() < 1200) {
			if ( nuvarendespiller == 1) {
				spilRunde(s1);
				nuvarendespiller = 2;
			}
			else {
				spilRunde(s2);
				nuvarendespiller = 1;
			}
			if (vinder == false) {
				GUI.getUserButtonPressed("Spiller " + nuvarendespiller + "s tur", "Tryk for at kaste!");
			}
			else if ( vinder == true) {
				GUI.getUserButtonPressed("Spiller " + nuvarendespiller + " har vundet gz");
			}
		}

	}


	public static void spilRunde(Spiller s){

		raflebaeger.slaaTerninger();
		
		//Lægger feltets værdi til spillers beholdning
		s.opdaterBeholdning(sp.getFelt(raflebaeger.getSum()).getVaerdi());
		
		gc.opdaterSpillerScore(s);


	}

	public void flytBrik(int a, String b){

	}
}