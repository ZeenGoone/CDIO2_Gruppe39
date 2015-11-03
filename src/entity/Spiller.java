package entity;

public class Spiller {

	// Initialiserer attributter
	private static int maxSpillere = 0;
	private int beholdning = 1000;
	private Brik spillerBrik;

	// Konstruktør tæller maxspillere 1 op og en brik bliver tildelt med et spillernummer
	public Spiller(){
		++maxSpillere;
		spillerBrik = new Brik(maxSpillere);
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
	public Brik getBrik(){
		return this.spillerBrik;
	}
}