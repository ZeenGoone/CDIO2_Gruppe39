package spilleplade.controller;

import felt.entity.Felt;

public class Spilleplade {
	
	//Opjekter til spilleplade klassen
	private static Felt f1 = new Felt(); 
	private static Felt f2 = new Felt();
	private static Felt f3 = new Felt();
	private static Felt f4 = new Felt();
	private static Felt f5 = new Felt();
	private static Felt f6 = new Felt();
	private static Felt f7 = new Felt();
	private static Felt f8 = new Felt();
	private static Felt f9 = new Felt();
	private static Felt f10 = new Felt();
	private static Felt f11 = new Felt();

	private static int[] spilleplade = new int [11];
	
	public static void spilleplade (String[] args) {
	
	//Tildeler hvert feltobjekt værdi
	f1.setVaerdi( 250 );
	spilleplade[0] =  f1.getVaerdi();
	f2.setVaerdi( -100 );
	spilleplade[1] =  f2.getVaerdi();
	f3.setVaerdi( 100 );
	spilleplade[2] =  f3.getVaerdi();
	f4.setVaerdi( 20 );
	spilleplade[3] =  f4.getVaerdi();
	f5.setVaerdi( 180 );
	spilleplade[4] =  f5.getVaerdi();
	f6.setVaerdi( 0 );
	spilleplade[5] =  f6.getVaerdi();
	f7.setVaerdi( -70 );
	spilleplade[6] =  f7.getVaerdi();
	f8.setVaerdi( 60 );
	spilleplade[7] =  f8.getVaerdi();
	f9.setVaerdi( -80 );
	spilleplade[8] =  f9.getVaerdi();
	f10.setVaerdi( -50 );
	spilleplade[9] =  f10.getVaerdi();
	f11.setVaerdi( 650 );
	spilleplade[10] =  f11.getVaerdi();
		
		
		
	}
	
	
	
	
}
