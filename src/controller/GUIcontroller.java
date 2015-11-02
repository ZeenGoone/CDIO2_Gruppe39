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

	private static Spiller s1 = new Spiller();
	private static Spiller s2 = new Spiller();
	private static Terning t1 = new Terning();
	private static Terning t2 = new Terning();
	private static int currentPlayer = 1;

	GUIcontroller(){
		// Koden til felterne
		Field[] fields = new Field[11];

		fields[0] = new Street.Builder()
				.setTitle("Tower")
				.setBgColor(Color.YELLOW)
				.setSubText("+250")
				.setDescription("Du har fundet en skat i tårnet, og finder 250, heldige dig.")
				.build();

		fields[1] = new Street
				.Builder()
				.setTitle("Crater")
				.setBgColor(Color.BLACK)
				.setFgColor(Color.WHITE)
				.setSubText("-100")
				.setDescription("Du faldt og ødelagde udstyr, som du må købe igen for 100.")
				.build();

		fields[2] = new Street
				.Builder()
				.setTitle("Palace Gates")
				.setBgColor(Color.YELLOW)
				.setSubText("+100")
				.setDescription("Du fik en masse rige venner, og fik 100.")
				.build();

		fields[3] = new Street.Builder()
				.setTitle("Cold Desert")
				.setBgColor(Color.BLACK)
				.setFgColor(Color.WHITE)
				.setSubText("-20")
				.setDescription("Du brugte 20 på udstyr til at klare dig i området.")
				.build();

		fields[4] = new Street.Builder()
				.setTitle("Walled City")
				.setBgColor(Color.YELLOW)
				.setSubText("+180")
				.setDescription("Du hjalp vagterne med banditter, og fik 180 for dit heltemod!")
				.build();

		fields[5] = new Street.Builder()
				.setTitle("Monastery")
				.setBgColor(Color.BLUE)
				.setFgColor(Color.WHITE)
				.setSubText("0")
				.setDescription("Du brugte dagen på at slappe af, og få lidt ro.")
				.build();

		fields[6] = new Street.Builder()
				.setTitle("Black Cave")
				.setBgColor(Color.BLACK)
				.setFgColor(Color.WHITE)
				.setSubText("-70")
				.setDescription("Du overnattede i grotten, og manglede 70 da du vågnede.")
				.build();

		fields[7] = new Street.Builder()
				.setTitle("Huts in the mountain")
				.setBgColor(Color.YELLOW)
				.setSubText("+60")
				.setDescription("Du hjalp til i byen og tjente dig 60.")
				.build();

		fields[8] = new Street.Builder()
				.setTitle("The Werewall (werewolf-wall)")
				.setBgColor(Color.RED)
				.setFgColor(Color.WHITE)
				.setSubText("-80 + Ekstra Tur!")
				.setDescription("Du blev jagtet af varulve, og løb så hurtigt, at du tabte 80, men hurtigt kom videre!")
				.build();

		fields[9] = new Street.Builder()
				.setTitle("The Pit")
				.setBgColor(Color.BLACK)
				.setFgColor(Color.WHITE)
				.setSubText("-50")
				.setDescription("Du blev berøvet, og mistede 50.")
				.build();

		fields[10] = new Street.Builder()
				.setTitle("Goldmine")
				.setBgColor(Color.YELLOW)
				.setSubText("+650")
				.setDescription("Du fandt guld, og solgte det for 650, du er rig!")
				.build();
		// Laver felterne, SKAL komme før alt andet man henter fra GUI
		GUI.create(fields);
		
		// Bilernes kode, skal nok i en klasse for sig.
		Car car1 = new Car.Builder()
				.typeTractor()
				.patternHorizontalDualColor()
				.primaryColor(Color.ORANGE)
				.secondaryColor(Color.RED)
				.build();

		Car car2 = new Car.Builder()
				.typeTractor()
				.patternHorizontalDualColor()
				.primaryColor(Color.WHITE)
				.secondaryColor(Color.BLACK)
				.build();
		
		// Tilføjelse af spillere
		GUI.addPlayer("Spiller 1", 1000, car1);
		GUI.addPlayer("Spiller 2", 1000, car2);
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
			boolean vinder = false;
	public void setTerninger(Raflebaeger raflebaeger){
		GUI.setDice(raflebaeger.getTerning(1), raflebaeger.getTerning(2));
	}

	public void afslutSpil(){
		GUI.close();
	}

}