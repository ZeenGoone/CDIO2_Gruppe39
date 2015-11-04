package controller;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_fields.Field;
import desktop_fields.Shipping;
import desktop_fields.Street;
import desktop_resources.GUI;
import entity.Spiller;
import entity.Terning;

public class GUIcontroller {

	// opretter spilleplade attribut
	private Spilleplade s;

	GUIcontroller(Spilleplade s){
		// saetter attributten lig spilleplade parameter
		this.s=s;
	}

	public Street getFeltVaerdier(int iterator){
		// Tjekker om feltet har defineret mere end en farve
		if(!s.getFelt(iterator).harToFarver()){
			return new Street.Builder()
					 .setTitle(s.getFelt(iterator).getFeltNavn())
					 .setSubText("\"" + s.getFelt(iterator).getVaerdi() + "\"")
					 .setBgColor(s.getFelt(iterator).getBaggrundsFarve())
					 .setDescription(s.getFelt(iterator).getBeskrivelse())
					 .build();
		}
		else{
			return new Street.Builder()
					 .setTitle(s.getFelt(iterator).getFeltNavn())
					 .setSubText("\"" + s.getFelt(iterator).getVaerdi() + "\"")
					 .setBgColor(s.getFelt(iterator).getBaggrundsFarve())
					 .setFgColor(s.getFelt(iterator).getForgrundsFarve())
					 .setDescription(s.getFelt(iterator).getBeskrivelse())
					 .build();
		}
	}
	public void startSpil(){

		// Koden til felterne
		Field[] fields = new Field[11];
		for(int i = 0;i < fields.length;i++){
			fields[i] = getFeltVaerdier(i);
		}
				
		// Laver felterne, SKAL komme foer alt andet man henter fra GUI
		GUI.create(fields);
		
		// Bilernes kode, skal nok i en klasse for sig.
		Car car1 = setCar(Color.ORANGE, Color.RED);
		Car car2 = setCar(Color.WHITE, Color.BLACK);
		
		// Tilfoejelse af spillere
		GUI.addPlayer("Spiller 1", 1000, car1);
		GUI.addPlayer("Spiller 2", 1000, car2);
	}
	public void opdaterSpillerScore(Spiller spiller){
		// Opdaterer GUI for den givne spiller til nuvaerende beholdning
		GUI.setBalance(spiller.getBrik().getSpillerNavn(), spiller.getBeholdning());
	}
	public Car setCar(Color c1, Color c2){
		// Laver et nyt objekt af typen Car og returner dette
		 return new Car.Builder()
			.typeTractor()
			.patternHorizontalDualColor()
			.primaryColor(c1)
			.secondaryColor(c2)
			.build();
	}
	public void placerBrik(Spiller s, int felt){
		// Placer brik paa spillepladen af den givne spiller
		GUI.setCar(felt, s.getBrik().getSpillerNavn());
	}
	public void fjernBrik(Spiller s, int felt){
		// Fjern bil fra felt
		GUI.removeCar(felt, s.getBrik().getSpillerNavn());
	}
	public void setTerninger(Raflebaeger raflebaeger){
		// Saetter den grafiske repraesentation af terningerne i GUI
		GUI.setDice(raflebaeger.getTerning(1), raflebaeger.getTerning(2));
	}
	public void visBesked(String besked){
		// Viser besked med OK knap i GUI
		GUI.showMessage(besked);
	}
	public void afslutSpil(){
		// Lukker GUI ned
		GUI.close();
	}

}