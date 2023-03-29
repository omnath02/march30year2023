package demoLog;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;




public class Log4jDemo {
	private static Logger demologger = LogManager.getLogger(Log4jDemo.class.getName());
	
	
	
	
	
	public static void main(String[] args) {
		
		
		demologger.info(" This is info  log message");
		
		demologger.error(" This is info  log message");
		
		demologger.fatal(" This is info  log message");
		
		
		demologger.warn(" This is info  log message");
	}
}
