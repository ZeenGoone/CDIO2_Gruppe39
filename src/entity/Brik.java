package entity;

public class Brik {
	// Initialiserer attribut
	private int spillerNummer;

	// Konstruktør giver brikken et spillernummer den hører til
	public Brik(int spillerNummer){
		this.spillerNummer = spillerNummer;
	}
	public int getSpillerNummer(){
		// Returner hvilket spillernummer objektet(brik) hører til
		return this.spillerNummer;
	}
	public String getSpillerNavn(){
		// Returner SpillerNavn baseret på spillernummer
		return "Spiller " + spillerNummer;
	}
}