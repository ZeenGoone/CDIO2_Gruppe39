package entity;

public class Terning {
	
	// Initialiserer attributter
	private int antalOejne;
	private int terningesider;

	public Terning(){
		
		// Saetter antal sider paa terningen til 6 som standard
		terningesider = 6;
	}
	
	public void setTerning(int terning){
		
		// Saetter antal øjne på en terning, kun til test
		this.antalOejne = terning;
	}
	
	public int getTerningesider(){
		
		/*
		 *  Returnerer antal sider paa terningen, lidt overfloedig da vi 
		 *  som standard saetter antalsider til 6, men i tilfaelde af
		 *  der introduceres en konstruktoer, hvor man selv kan saette
		 *  antalsider, der forefindes setTerningesider men den benyttes
		 *  ikke til noget lige pt.
		 */
		
		return terningesider;
	}
	
	public void setTerningesider(int ny_terningesider){
		
		// Laes paa getTerningesider
		this.terningesider = ny_terningesider;
	}
	
	public int slaaTerning(){
		
		// antalOejne saettes tilfaeldigt til et tal mellem 1 og terningens sider i dette tilfaelde
		antalOejne = (int) (Math.random()*terningesider+1);
		return antalOejne;
	}

	public int getAntalOejne() {
		
		// Returner hvad antal oejne terningerne viser lige nu
		return antalOejne;
	}
	
	public String toString() {
		return ("Terninge kastet med " + terningesider + " sider, blev til: " + antalOejne);
	}

}