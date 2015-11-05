package test;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Spiller;

public class TestBrik {

	@Test
	public void test() {
		Spiller s1 = new Spiller();
		Spiller s2 = new Spiller();
		Spiller s3 = new Spiller();
		Spiller s4 = new Spiller();
		Spiller s5 = new Spiller();
		
		assertEquals(1, s1.getBrik().getSpillerNummer());
		assertEquals(2, s2.getBrik().getSpillerNummer());
		assertEquals(3, s3.getBrik().getSpillerNummer());
		assertEquals(4, s4.getBrik().getSpillerNummer());
		assertEquals(5, s5.getBrik().getSpillerNummer());
		
		assertEquals("Spiller 1", s1.getBrik().getSpillerNavn());
		assertEquals("Spiller 2", s2.getBrik().getSpillerNavn());
		assertEquals("Spiller 3", s3.getBrik().getSpillerNavn());
		assertEquals("Spiller 4", s4.getBrik().getSpillerNavn());
		assertEquals("Spiller 5", s5.getBrik().getSpillerNavn());
		
		int testAntal = (int) (Math.random()*10000);
		Spiller[] spillerAntal = new Spiller[testAntal];
		for(int i = 0;i < testAntal;i++){
			spillerAntal[i] = new Spiller();
		}
		Spiller sAntalTest = new Spiller();
		testAntal += 6;
		String testSpiller = "Spiller " + testAntal;
		assertEquals(testSpiller, sAntalTest.getBrik().getSpillerNavn());
		}

}
