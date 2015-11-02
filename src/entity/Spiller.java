package entity;

public class Spiller {

	private static int maxSpillere = 0;
	private int spillerNummer = 0;
	private int beholdning = 1000;


	public Spiller(){
		++maxSpillere;
		spillerNummer = maxSpillere;
	}

	// opdaterer spillerens beholdning
	public void opdaterBeholdning(int opdatering){
		beholdning += opdatering;
		if( beholdning < 0){
			beholdning = 0;
		}
	}
	
	// get metoder
	public int getBeholdning(){
		return beholdning;
	}
	
	public int getSpillerNummer(){
		return spillerNummer;
	}	
}