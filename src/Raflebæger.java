
public class Rafleb�ger {
	
	int antalTerninger = 2;
	Terning[] b�ger = new Terning[antalTerninger];
	
	public Rafleb�ger(){
		this.b�ger[0] = new Terning();
		this.b�ger[1] = new Terning();
	}
	
	public int getTerning(int terningenummer){
		return b�ger[terningenummer].getTerning();
	}
	
	public void setTerning(int terningenummer, int ny_terningev�rdi){
		b�ger[terningenummer].setTerning(ny_terningev�rdi);
	}
	
	public void kastTerning(){
		b�ger[0].kastTerning();
		b�ger[1].kastTerning();
	}
	
	public int getSum(){
		return (b�ger[0].getTerning() + b�ger[1].getTerning());
	}
	
	public String toString() {
		return ("Rafleb�gerets terninger giver: " + b�ger[0].getTerning() + " og " + b�ger[1].getTerning());
	}

}
