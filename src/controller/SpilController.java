package controller;

import desktop_resources.GUI;
import entity.Felt;
import entity.Spiller;

public class SpilController {

	//initialiserer de noedvendige objekter
	private static Spilleplade sp;
	private static GUIcontroller gc;
	Spiller s1 = new Spiller();	
	Spiller s2 = new Spiller();	
	Raflebaeger raflebaeger = new Raflebaeger();
	private int nuvarendespiller;

	public static void main(String[] args) {
		sp = new Spilleplade();
		gc = new GUIcontroller(sp);
		gc.startSpil();
	}
	
	public void spilRunde(Spiller s){
		raflebaeger.slaaTerninger();
		raflebaeger.getSum();
	}

	public void flytBrik(int a, String b){

	}
}