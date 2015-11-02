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

	private static Spilleplade s;

	GUIcontroller(Spilleplade s){
		this.s=s;
	}

	public Street getFeltVaerdier(int iterator){
		if(s.getFelt(iterator).harToFarver()){
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
		fields[0] = getFeltVaerdier(0);
		fields[1] = getFeltVaerdier(1);
		fields[2] = getFeltVaerdier(2);
		fields[3] = getFeltVaerdier(3);
		fields[4] = getFeltVaerdier(4);
		fields[5] = getFeltVaerdier(5);
		fields[6] = getFeltVaerdier(6);
		fields[7] = getFeltVaerdier(7);
		fields[8] = getFeltVaerdier(8);
		fields[9] = getFeltVaerdier(9);
		fields[10] =getFeltVaerdier(10);
		
		// Laver felterne, SKAL komme før alt andet man henter fra GUI
		GUI.create(fields);
		
		// Bilernes kode, skal nok i en klasse for sig.
		Car car1 = setCar(Color.ORANGE, Color.RED);
		Car car2 = setCar(Color.WHITE, Color.BLACK);
		
		// Tilføjelse af spillere
		GUI.addPlayer("Spiller 1", 1000, car1);
		GUI.addPlayer("Spiller 2", 1000, car2);
	}
	
	public Car setCar(Color c1, Color c2){
		 return new Car.Builder()
			.typeTractor()
			.patternHorizontalDualColor()
			.primaryColor(c1)
			.secondaryColor(c2)
			.build();
	}
	
	public void setBilPaaFelt(int spillernummer, int felt){
		if(spillernummer == 1){
			//Placere en bil på et felt, fra en spiller
			GUI.setCar(felt, "Spiller 1");
		}
		else{
			//Placere en bil på et felt, fra en spiller
			GUI.setCar(felt, "Spiller 2");
		}
	}
	
	public void fjernBilFraFelt(int spillernummer, int felt){
		if(spillernummer == 1){
			// Fjern bil fra felt
			GUI.removeCar(felt, "Spiller 1");
		}
		else{
			// Fjern bil fra felt
			GUI.removeCar(felt, "Spiller 2");
		}
	}
	
	public void setTerninger(Raflebaeger raflebaeger){
		GUI.setDice(raflebaeger.getTerning(1), raflebaeger.getTerning(2));
	}

	public void afslutSpil(){
		GUI.close();
	}

}