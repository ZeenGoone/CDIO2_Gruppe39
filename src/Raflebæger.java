
public class Raflebæger {
	
	int antalTerninger = 2;
	Terning[] bæger = new Terning[antalTerninger];
	
	public Raflebæger(){
		this.bæger[0] = new Terning();
		this.bæger[1] = new Terning();
	}
	
	public int getTerning(int terningenummer){
		return bæger[terningenummer].getTerning();
	}
	
	public void setTerning(int terningenummer, int ny_terningeværdi){
		bæger[terningenummer].setTerning(ny_terningeværdi);
	}
	
	public void kastTerning(){
		bæger[0].kastTerning();
		bæger[1].kastTerning();
	}
	
	public int getSum(){
		return (bæger[0].getTerning() + bæger[1].getTerning());
	}
	
	public String toString() {
		return ("Raflebægerets terninger giver: " + bæger[0].getTerning() + " og " + bæger[1].getTerning());
	}

}
