package controller;

import entity.Felt;
import entity.Spiller;

public class SpilController {

	//initialiserer de n�dvendige objekter
	private static Spilleplade sp = new Spilleplade();
	private static GUIcontroller gc;
	Spiller s1 = new Spiller();	
	Spiller s2 = new Spiller();	
	Raflebaeger raflebaeger = new Raflebaeger();
	private String nuvarendespiller;

	public static void main(String[] args) {
		gc = new GUIcontroller(sp);
		gc.startSpil();

	}
	
	public void spilRunde(Spiller s){
		raflebaeger.kastTerning();
	}

	public void flytBrik(int a, String b){

	}
}