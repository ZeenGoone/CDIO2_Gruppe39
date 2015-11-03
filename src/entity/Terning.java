package entity;

public class Terning {
	
	// Initialiserer attributter
	private int antalOejne;
	private int terningesider;

	public Terning(){
		// Sætter antal sider på terningen til 6 som standard
		terningesider = 6;
	}
	
	public void setTerning(int terning){
		// Sætter antal øjne på en terning, kun til test
		this.antalOejne = terning;
	}
	
	public int getTerningesider(){
		
		/*
		 *  Returnerer antal sider på terningen, lidt overflødig da vi 
		 *  som standard sætter antalsider til 6, men i tilfælde af
		 *  der introduceres en konstruktør, hvor man selv kan sætte
		 *  antalsider, der forefindes setTerningesider men den benyttes
		 *  ikke til noget lige pt.
		 */
		
		return terningesider;
	}
	
	public void setTerningesider(int ny_terningesider){
		// Læs på getTerningesider
		this.terningesider = ny_terningesider;
	}
	
	public int slaaTerning(){
		// antalOejne sættes tilfældigt til et tal mellem 1 og terningens sider i dette tilfælde
		antalOejne = (int) (Math.random()*terningesider+1);
		return antalOejne;
	}
	
	public String toString() {
		return ("Terninge kastet med " + terningesider + " sider, blev til: " + antalOejne);
	}

	public int getAntalOejne() {
		// Returner hvad antal øjne terningerne viser lige nu
		return antalOejne;
	}
}