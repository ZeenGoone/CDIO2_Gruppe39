package test;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Spiller;

public class testNegativBeholdning {

	@Test
	public void test() {
		
		// instantierer en spiller
		Spiller spiller = new Spiller();
		
		// kører testen 100000 gange med et tilfældigt negativt tal
		for(int i = 0;i < 100000;i++){
			spiller.opdaterBeholdning((int) (Math.random()*-10000));
			// sikrer at værdien stadig er 0 uanset hvilket negativt tal der bliver prøvet
			assertEquals(0, spiller.getBeholdning());
		}
	}
}
