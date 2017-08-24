package web.com.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void logTest(){
		logger.trace("-----trace-----");
		logger.debug("-----debug-----");
		logger.info("-----info-----");
		logger.warn("-----warn-----");
		logger.error("-----error-----");
		
	}
}
