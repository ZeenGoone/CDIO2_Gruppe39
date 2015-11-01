package spilleplade.controller;

import felt.entity.Felt;

public class Spilleplade {
	
	//Opjekter til spilleplade klassen
	
	private  Felt f1 = new Felt( 250 ); 
	private  Felt f2 = new Felt( -100 );
	private  Felt f3 = new Felt( 100 );
	private  Felt f4 = new Felt( 20 );
	private  Felt f5 = new Felt( 180 );
	private  Felt f6 = new Felt( 0 );
	private  Felt f7 = new Felt( -70 );
	private  Felt f8 = new Felt( 60 );
	private  Felt f9 = new Felt( -80 );
	private  Felt f10 = new Felt( -50 );
	private  Felt f11 = new Felt( 650 );

	private static int[] spilleplade = new int [11];
	
	public void spilleplade () {
	
	//Tildeler hvert feltobjekt værdi
	
	spilleplade[0] =  f1.getVaerdi();
	spilleplade[1] =  f2.getVaerdi();
	spilleplade[2] =  f3.getVaerdi();
	spilleplade[3] =  f4.getVaerdi();
	spilleplade[4] =  f5.getVaerdi();
	spilleplade[5] =  f6.getVaerdi();
	spilleplade[6] =  f7.getVaerdi();
	spilleplade[7] =  f8.getVaerdi();
	spilleplade[8] =  f9.getVaerdi();
	spilleplade[9] =  f10.getVaerdi();
	spilleplade[10] =  f11.getVaerdi();
	}
	
	public int getFeltVaerdi ( int i ) {
		return spilleplade[ i-2 ];
	}
	
	
}
