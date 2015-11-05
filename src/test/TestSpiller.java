package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.JUnit4;

import entity.Spiller;

public class TestSpiller {

	@Test
	public void test() {
		Spiller s1 = new Spiller();
		Spiller s2 = new Spiller();
		Spiller s3 = new Spiller();
		s1.opdaterBeholdning(1000);
		s2.opdaterBeholdning(-400);
		s3.opdaterBeholdning(200);
		
		assertEquals(2000, s1.getBeholdning());
		assertEquals(600, s2.getBeholdning());
		assertEquals(1200, s3.getBeholdning());
	}

}
