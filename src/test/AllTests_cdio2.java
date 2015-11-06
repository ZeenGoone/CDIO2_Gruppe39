package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestBrik.class, testNegativBeholdning.class, TestRafleBaeger.class, TestSpiller.class,
		TestTerning.class })
public class AllTests_cdio2 {

}
