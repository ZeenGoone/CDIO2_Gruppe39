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
		// få vist hvad den givne ternings antal øjne er lige nu
		return baeger[terningenummer].getAntalOejne();
	}
	
	public void slaaTerninger(){
		// de to terninger kalder der slaaTerning metode
		baeger[0].slaaTerning();
		baeger[1].slaaTerning();
	}
	
	public int getSum(){
		// her lægges antal øjne på de to terninger sammen
		return (baeger[0].getAntalOejne() + baeger[1].getAntalOejne());
	}
	
	public String toString() {
		return ("Raflebægerets terninger giver: " + baeger[0].getAntalOejne() + " og " + baeger[1].getAntalOejne());
	}

}
