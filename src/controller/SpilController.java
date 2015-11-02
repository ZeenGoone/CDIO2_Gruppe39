package controller;

import entity.Spiller;

public class SpilController {

	//initialiserer de n�dvendige objekter

	Spiller s1 = new Spiller();	
	Spiller s2 = new Spiller();	
	Raflebaeger raflebaeger = new Raflebaeger();

	private String nuvarendespiller;



	public static void main(String[] args) {


	}
	
	public void spilRunde(Spiller s){
		raflebaeger.kastTerning();
	}

	public void flytBrik(int a, String b){

	}

	public void startBreaet(Fields[] felter){

	}
}