package felt.entity;

public class Felt {
	
	//konstruktor
	private int vaerdi;
	public Felt( int i ) {
		this.vaerdi = i;
	}
	
	//Set & Get metode af felt vaerdi
	public void setVaerdi ( int vaerdi ) {
		this.vaerdi = vaerdi;
	}
	
	public int getVaerdi () {
		return vaerdi;
	}
}
