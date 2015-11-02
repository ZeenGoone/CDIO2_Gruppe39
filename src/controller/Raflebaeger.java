package controller;
import entity.Terning;

public class Raflebaeger {
	
	int antalTerninger = 2;
	Terning[] baeger = new Terning[antalTerninger];
	
	public Raflebaeger(){
		this.baeger[0] = new Terning();
		this.baeger[1] = new Terning();
	}
	
	public int getTerning(int terningenummer){
		return baeger[terningenummer].getAntalOejne();
	}
	
	public void setTerning(int terningenummer, int ny_terningevaerdi){
		baeger[terningenummer].setTerning(ny_terningevaerdi);
	}
	
	public void kastTerning(){
		baeger[0].kastTerning();
		baeger[1].kastTerning();
	}
	
	public int getSum(){
		return (baeger[0].getAntalOejne() + baeger[1].getAntalOejne());
	}
	
	public String toString() {
		return ("Raflebægerets terninger giver: " + baeger[0].getAntalOejne() + " og " + baeger[1].getAntalOejne());
	}

}
