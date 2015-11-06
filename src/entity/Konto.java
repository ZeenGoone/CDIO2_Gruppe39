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
	
	// returnerer nuværende beholdning hvis større end 0
	public int getBeholdning(){
		if(this.beholdning > 0){
			return this.beholdning;
		}
		// hvis beholdning under 0, ændre til 0 og returner værdi
		else{
			this.beholdning = 0;
			return this.beholdning;
		}
		
	}
	
	// sætter beholdning og sikrer den er blevet ændret korrekt
	public boolean addBeholdning(int aendring){
		int tempbeholdning = beholdning;
		this.beholdning += aendring;
		return testBeholdningsAendring(tempbeholdning, aendring);
	}
	
	// sæt beholdning til en given værdi
	public boolean setBeholdning(int vaerdi){
		this.beholdning = vaerdi;
		return testBeholdningHolder(this.beholdning);
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
	
	// tester beholdning større end 0
	private boolean testBeholdningHolder(int vaerdi){
		this.beholdning = this.beholdning >= 0? this.beholdning:0;
		return true;
	}
}
