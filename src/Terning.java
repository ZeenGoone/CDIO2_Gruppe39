
public class Terning {
	
	private int terning;
	private int terningesider = 6;

	public Terning(){
		super();
	}
	
	public int getTerning(){
		return terning;
	}
	
	public void setTerning(int terning){
		this.terning = terning;
	}
	
	public int getTerningesider(){
		return terningesider;
	}
	
	public void setTerningesider(int ny_terningesider){
		this.terningesider = ny_terningesider;
	}
	
	
	
	public int kastTerning(){
		terning = (int)(Math.random()*terningesider+1);
		return terning;
	}
	
	public String toString() {
		return ("Terninge kastet med " + terningesider + " sider, blev til: " + terning);
	}
}
