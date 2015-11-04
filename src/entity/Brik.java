package entity;

public class Brik {
	// Initialiserer attribut
	private int spillerNummer;

	// Konstruktoer giver brikken et spillernummer den hører til
	public Brik(int spillerNummer){
		this.spillerNummer = spillerNummer;
	}
	public int getSpillerNummer(){
		// Returner hvilket spillernummer objektet(brik) hoerer til
		return this.spillerNummer;
	}
	public String getSpillerNavn(){
		// Returner SpillerNavn baseret paa spillernummer
		return "Spiller " + spillerNummer;
	}
}