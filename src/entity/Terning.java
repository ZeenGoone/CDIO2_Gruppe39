package entity;

public class Terning {
	
	private int antalOejne;
	private int terningesider;

	public Terning(){
		terningesider = 6;
	}
	
	public void setTerning(int terning){
		this.antalOejne = terning;
	}
	
	public int getTerningesider(){
		return terningesider;
	}
	
	public void setTerningesider(int ny_terningesider){
		this.terningesider = ny_terningesider;
	}
	
	public int kastTerning(){
		antalOejne = (int) (Math.random()*terningesider+1);
		return antalOejne;
	}
	
	public String toString() {
		return ("Terninge kastet med " + terningesider + " sider, blev til: " + antalOejne);
	}

	public int getAntalOejne() {
		return antalOejne;
	}
}
