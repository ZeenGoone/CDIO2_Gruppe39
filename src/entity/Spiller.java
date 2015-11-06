package entity;

public class Spiller {

	// Initialiserer attributter
	private static int maxSpillere = 0;
	private int startvaerdi = 1000;
	private boolean lykkedes = false;
	private Konto konto = new Konto(startvaerdi);
	private Brik spillerBrik;

	// Konstruktoer tae�ller maxspillere 1 op og en brik bliver tildelt med et spillernummer
	public Spiller(){
		++maxSpillere;
		spillerBrik = new Brik(maxSpillere);
	}

	// opdaterer spillerens beholdning
	public boolean opdaterBeholdning(int opdatering){
		return konto.setBeholdning(opdatering);
	}
	
	// get metoder
	public int getBeholdning(){
		return konto.getBeholdning();
	}
	public Brik getBrik(){
		return this.spillerBrik;
	}
}