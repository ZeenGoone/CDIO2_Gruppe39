package spil.entity;

public class Spiller {

	private static int maxSpillere = 0;
	private int beholdning = 1000;


	public Spiller(){
		++maxSpillere;
	}

	
	// opdaterer spillerens beholdning
	public void opdaterBeholdning(){
		 beholdning =+ beholdning;
		
	}
	
	// get metoder
	public int getBeholdning(){
		return beholdning;
	}


	
	
	
}


