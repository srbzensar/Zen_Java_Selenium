package loggingdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogClass {

	private static Logger log = LogManager.getLogger(LogClass.class);

	static
	{
		log.warn("Warn Msg: static block!");  
	}
	
	public static void testLogs()
	{
		log.debug("Debug Msg!: test function");  
		log.info("Info Msg!: test function");
	}
	
	public static void main(String[] args) 
	{

		log.trace("Trace Message!");
		log.debug("Debug Message!");  
		log.info("Info Message!");  
		log.warn("Warn Message!");  
		log.error("Error Message!");  
		log.fatal("Fatal Message!");
		testLogs();
	}

}
