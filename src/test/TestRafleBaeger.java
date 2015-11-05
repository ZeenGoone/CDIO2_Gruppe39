package test;

import static org.junit.Assert.*;

import org.junit.Test;

import controller.Raflebaeger;

public class TestRafleBaeger {

	@Test
	public void test() {
		Raflebaeger rb = new Raflebaeger();
		
		for(int i = 0;i < 10000;i++){
			rb.slaaTerninger();
			assertTrue(rb.getTerning(1) >= 1 && rb.getTerning(1) <= 6);
			assertTrue(rb.getTerning(2) >= 1 && rb.getTerning(2) <= 6);
			assertTrue(rb.getSum()>=2 && rb.getSum() <=12);
		}
	}

}
