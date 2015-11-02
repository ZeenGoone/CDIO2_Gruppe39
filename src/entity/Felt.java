package entity;

import java.awt.Color;

public class Felt {
	
	private String feltNavn;
	private int vaerdi;
	private Color baggrundsFarve;
	private Color forgrundsFarve;
	private String beskrivelse;
	private boolean harToFarver = false;
	
	//konstruktor
	public Felt( String feltNavn, int vaerdi, Color baggrundsFarve, Color forgrundsFarve, String beskrivelse) {
		this.feltNavn = feltNavn;
		this.vaerdi = vaerdi;
		this.baggrundsFarve = baggrundsFarve;
		this.forgrundsFarve = forgrundsFarve;
		this.beskrivelse = beskrivelse;
		this.harToFarver = true;
	}
	public Felt( String feltNavn, int vaerdi, Color baggrundsFarve, String beskrivelse) {
		this.feltNavn = feltNavn;
		this.vaerdi = vaerdi;
		this.baggrundsFarve = baggrundsFarve;
		this.beskrivelse = beskrivelse;
		this.harToFarver = false;
	}

	public String getFeltNavn() {return feltNavn;}
	public int getVaerdi() {return vaerdi;}
	public Color getBaggrundsFarve() {return baggrundsFarve;}
	public Color getForgrundsFarve() {return forgrundsFarve;}
	public String getBeskrivelse() {return beskrivelse;}
	public boolean harToFarver() {return this.harToFarver;}

}
