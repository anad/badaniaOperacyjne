package pl.edu.agh.bo;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import junit.framework.TestCase;

public class Test extends TestCase {
	private static final Logger logger = Logger.getLogger(Test.class);
	
	public void test () {
		PropertyConfigurator.configure("lib/log4j.properties");
		logger.trace("Running test");
		assertEquals(1,1);
	}
}
