package test;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Terning;

public class TestTerning {

	@Test
	public void test() {
		Terning t1 = new Terning();
		Terning t2 = new Terning();
		Terning t3 = new Terning();
		
		for(int i = 0;i < 10000;i++){
			t1.slaaTerning();
			t2.slaaTerning();
			t3.slaaTerning();
			assertTrue(t1.getAntalOejne() >=1 && t1.getAntalOejne()<=6);
			assertTrue(t2.getAntalOejne() >=1 && t2.getAntalOejne()<=6);
			assertTrue(t3.getAntalOejne() >=1 && t3.getAntalOejne()<=6);
		}
	}

}
