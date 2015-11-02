package spil.entity;

public class Terning {
	private int antalOejne;
	
	public Terning(){
		antalOejne = 0;
	}

	public int getAntalOejne() {
		return antalOejne;
	}

	public void setAntalOejne(int antalOejne) {
		this.antalOejne = antalOejne;
	}
	public void slaaTerning(){
		antalOejne = (int) (Math.random()*6) + 1;
	}
}
