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
			spiller.setBeholdning(0);
			spiller.opdaterBeholdning((int) (Math.random()*-10000));
			// sikrer at værdien stadig er 0 uanset hvilket negativt tal der bliver prøvet
			assertEquals(0, spiller.getBeholdning());
		}
		
		// tester for setBeholdning til 1, 0 og -1
		spiller.setBeholdning(1);
		assertEquals(1, spiller.getBeholdning());
		spiller.setBeholdning(0);
		assertEquals(0, spiller.getBeholdning());
		spiller.setBeholdning(-1);
		assertEquals(0, spiller.getBeholdning());
		
		// tester med integer max værdi minus lidt til
		spiller.setBeholdning(-2147483648);
		spiller.opdaterBeholdning(-1000);
		assertEquals(0, spiller.getBeholdning());
	}
}
