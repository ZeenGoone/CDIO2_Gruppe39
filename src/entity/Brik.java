package entity;

public class Brik {
	private int spillerNummer;

	public Brik(int spillerNummer){
		this.spillerNummer = spillerNummer;
	}
	public int getSpillerNummer(){
		return this.spillerNummer;
	}
	public String getSpillerNavn(){
		return "Spiller " + spillerNummer;
	}
}