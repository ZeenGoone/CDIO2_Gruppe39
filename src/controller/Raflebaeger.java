package controller;
import entity.Terning;

public class Raflebaeger {
	
	// Initialiserer attributter
	int antalTerninger = 2;
	Terning[] baeger = new Terning[antalTerninger];
	
	public Raflebaeger(){
		// laver to instanser af Terning klassen
		this.baeger[0] = new Terning();
		this.baeger[1] = new Terning();
	}
	
	public int getTerning(int terningenummer){
		// få vist hvad den givne ternings antal oejne er lige nu
		return this.baeger[terningenummer-1].getAntalOejne();
	}
	
	public void slaaTerninger(){
		// de to terninger kalder der slaaTerning metode
		this.baeger[0].slaaTerning();
		this.baeger[1].slaaTerning();
	}
	
	public int getSum(){
		// her laegges antal oejne paa de to terninger sammen
		return (this.baeger[0].getAntalOejne() + this.baeger[1].getAntalOejne());
	}
	
	public String toString() {
		return ("Raflebægerets terninger giver: " + this.baeger[0].getAntalOejne() + " og " + this.baeger[1].getAntalOejne());
	}

}
