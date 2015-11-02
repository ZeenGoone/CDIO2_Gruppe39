package controller;

import java.awt.Color;

import entity.Felt;

public class Spilleplade {
	
	// Objekter til spilleplade klassen
	private static Felt[] spilleplade;
	// Konstruktør af spillepladen
	Spilleplade() {
	spilleplade = new Felt[11];
	//Indsætter Felt objekter i spilleplade array
	spilleplade[0] =  new Felt("Tower", 250, Color.PINK,"Du har fundet en skat i tårnet, og finder 250, heldige dig."); 
	spilleplade[1] =  new Felt("Crater", -100, Color.WHITE, Color.BLACK, "Du faldt og ødelagde udstyr, som du må købe igen for 100.");
	spilleplade[2] =  new Felt("Palace Gates", 100, Color.DARK_GRAY, "Du fik en masse rige venner, og fik 100.");
	spilleplade[3] =  new Felt("Cold Desert", -20, Color.GREEN, Color.BLACK, "Du brugte 20 på udstyr til at klare dig i området.");
	spilleplade[4] =  new Felt("Walled City", 180, Color.CYAN, "Du hjalp vagterne med banditter, og fik 180 for dit heltemod!");
	spilleplade[5] =  new Felt("Monastery", 0, Color.BLUE, Color.WHITE, "Du brugte dagen på at slappe af, og få lidt ro.");
	spilleplade[6] =  new Felt("Black Cave", -70, Color.ORANGE, Color.BLACK, "Du overnattede i grotten, og manglede 70 da du vågnede.");
	spilleplade[7] =  new Felt("Huts in the mountain", 60, Color.MAGENTA, "Du hjalp til i byen og tjente dig 60.");
	spilleplade[8] =  new Felt("The Werewall (werewolf-wall)", -80, Color.RED, Color.WHITE, "Du blev jagtet af varulve, og løb så hurtigt, at du tabte 80, men hurtigt kom videre!");
	spilleplade[9] =  new Felt("The Pit", -50, Color.LIGHT_GRAY, Color.BLACK, "Du blev berøvet, og mistede 50.");
	spilleplade[10] =  new Felt("Goldmine", 650, Color.YELLOW, "Du fandt guld, og solgte det for 650, du er rig!");
	}
	
	public Felt getFelt ( int feltNummer ) {
		// Henter feltNummer objektet fra spilleplade Array
		return spilleplade[feltNummer];
	}
}