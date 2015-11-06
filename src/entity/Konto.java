package entity;

public class Konto {

	// kan på sigt være nødvendigt at lave en double, men i dette projekt holder vi os til integers
	int beholdning;
	
	// Konstruktør hvis beholdning fra start skal være andet end 0
	Konto(int startBeholdning){
		this.beholdning = startBeholdning;
	}
	Konto(){
		this.beholdning = 0;
	}
	
	// returnerer nuværende beholdning
	public int getBeholdning(){
		return this.beholdning;
	}
	
	// sætter beholdning og sikrer den er blevet ændret korrekt
	public boolean setBeholdning(int aendring){
		int tempbeholdning = beholdning;
		this.beholdning += aendring;
		return testBeholdningsAendring(tempbeholdning, aendring);
	}
	
	// tester at beholdning er opdateret korrekt
	private boolean testBeholdningsAendring(int beholdning, int aendring){
		
		// testen kun aktuel hvis den nye beholdning er over 0
		if(this.beholdning > 0){
			return this.beholdning == beholdning + aendring? true:false;
		}
		// hvis ikke over nul sæt beholdning til 0
		else{
			this.beholdning = 0;
			return true;
		}
	}
}
