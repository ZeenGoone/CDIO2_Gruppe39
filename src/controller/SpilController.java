package controller;

import desktop_resources.GUI;
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
		// terninger bliver kastet
		raflebaeger.slaaTerninger();
		
		//Laegger feltets vaerdi til spillers beholdning, opdaterer spillerscore på GUI og sætter terningslaget
		if(s.opdaterBeholdning(sp.getFelt(raflebaeger.getSum()-2).getVaerdi())){
			gc.opdaterSpillerScore(s);
		}
		else{
			System.out.println("LOG: opdatering af beholdning fejlede!");
			gc.afslutSpil();
		}
		gc.setTerninger(raflebaeger);
		
		// sætter spillers brik på spillepladen
		flytBrik(s, raflebaeger.getSum()-1);
		gc.visBesked(sp.getFelt(raflebaeger.getSum()-2).getBeskrivelse());
		
		// hvis vinder-beholdning opnået, sæt vinder til true
		if ( s.getBeholdning() >= sumForAtVinde) {
			GUIknap(s," har vundet gz", "Fedt spil!" );
			vinder = true;	
		}
		
		// landet på ekstratur
		if ( raflebaeger.getSum() == ekstraTurFelt ) {
			
			// i tilfælde af ekstratur returneres nuværende spiller
			fjernBrik(s, raflebaeger.getSum()-1);
			return s;
		}	
		
		// hvis ingen ekstratur gives turen videre til næste spiller
		fjernBrik(s, raflebaeger.getSum()-1);
		getNuvaerendespiller(s);
		return nuvaerendeSpiller;
		
	}
	
	public static Spiller hvemStarter(){
		
		// afgør hvem der starter via tilfældighed
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
	
	// sender en besked og knaptekst til GUI
	public static void GUIknap(Spiller s, String beskedtekst, String knaptekst){
		gc.visKnapBesked(s, beskedtekst, knaptekst);
	}
	
	// placerer brikken på spillepladen
	public static void flytBrik(Spiller s, int felt){
		gc.placerBrik(s, felt);
	}
	
	// fjerner brikken fra spillepladen
	public static void fjernBrik(Spiller s, int felt){
		gc.fjernBrik(s, felt);
	}
	
	// skifter rundt mellem spillere afhængigt af tur
	public static void getNuvaerendespiller ( Spiller s ) {
		if ( s.getBrik().getSpillerNummer() == 1) 
			nuvaerendeSpiller = s2;
		else if ( s.getBrik().getSpillerNummer() == 2)
			nuvaerendeSpiller = s1;
	}
}