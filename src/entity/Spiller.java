package entity;

public class Spiller {

	private static int maxSpillere = 0;
	private int spillerNummer = 0;
	private int beholdning = 1000;
	private Brik spillerBrik;


	public Spiller(){
		++maxSpillere;
		spillerNummer = maxSpillere;
		spillerBrik = new Brik(spillerNummer);
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