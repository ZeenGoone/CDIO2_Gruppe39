package controller;

import desktop_resources.GUI;
import entity.Felt;
import entity.Spiller;

public class SpilController {

	// initialiserer attributter
	private static Spilleplade sp;
	private static GUIcontroller gc;
	private static Spiller s1;
	private static Spiller s2;
	private static Raflebaeger raflebaeger;
	private static Spiller nuvaerendeSpiller;
	private static int ekstraTurFelt = 10;
	private static int sumForAtVinde = 3000;
	
	private static boolean vinder = false;
	
	public static void main(String[] args) {
		// initialiserer variable
		sp = new Spilleplade();
		gc = new GUIcontroller(sp);
		raflebaeger = new Raflebaeger();
		s1 = new Spiller();
		s2 = new Spiller();
		gc.startSpil();
		
		nuvaerendeSpiller = hvemStarter();
		
		//Mens vinder ikke er fundet		
		while(!vinder) {
			// finder hvilken spiller der skal kaste, og spiller en runde med denne spiller
			nuvaerendeSpiller = spilRunde(nuvaerendeSpiller);
			if (!vinder) {
				GUIknap(nuvaerendeSpiller, "s tur", "Tryk for at kaste!");	
			}			
		}
		// while løkken er afsluttet, vinder er fundet, afslut spil
		gc.afslutSpil();
	}

	public static Spiller spilRunde(Spiller s) {

		raflebaeger.slaaTerninger();
		
		//Laegger feltets vaerdi til spillers beholdning
		s.opdaterBeholdning(sp.getFelt(raflebaeger.getSum()-2).getVaerdi());
		gc.opdaterSpillerScore(s);
		gc.setTerninger(raflebaeger);
		flytBrik(s, raflebaeger.getSum()-1);
		gc.visBesked(sp.getFelt(raflebaeger.getSum()-2).getBeskrivelse());
		
		if ( s.getBeholdning() >= sumForAtVinde) {
			GUIknap(s," har vundet gz", "Fedt spil!" );
			vinder = true;	
		}
		// landet på ekstratur
		if ( raflebaeger.getSum() == ekstraTurFelt ) {
			fjernBrik(s, raflebaeger.getSum()-1);
			return s;
		}	
		fjernBrik(s, raflebaeger.getSum()-1);
		getNuvaerendespiller(s);
		return nuvaerendeSpiller;
		
	}
	
	public static Spiller hvemStarter(){
		//afgoer hvem der starter via math.random
		int hvemStarter = (int) (Math.random()*2)+1 ;
		
		if(hvemStarter == 1 ){
			gc.visStartBesked(s1.getBrik().getSpillerNummer());
			return s1;
		}
		else{
			gc.visStartBesked(s2.getBrik().getSpillerNummer());
			return s2;
		}
	}
	
	public static void GUIknap(Spiller s, String beskedtekst, String knaptekst){
		GUI.getUserButtonPressed("Spiller " + s.getBrik().getSpillerNummer() + beskedtekst, knaptekst);
	}
	
	public static void flytBrik(Spiller s, int felt){
		gc.placerBrik(s, felt);
	}
	
	public static void fjernBrik(Spiller s, int felt){
		gc.fjernBrik(s, felt);
	}
	
	public static void getNuvaerendespiller ( Spiller s ) {
		if ( s.getBrik().getSpillerNummer() == 1) 
			nuvaerendeSpiller = s2;
		else if ( s.getBrik().getSpillerNummer() == 2)
			nuvaerendeSpiller = s1;
	}
}