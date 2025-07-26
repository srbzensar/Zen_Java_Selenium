package m.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogClass {
	
	 private static Logger log = LogManager.getLogger(LogClass.class);  
	  
	   public static void main(String[] args) {  
	  
	      log.trace("Trace Message!");  
	      log.debug("Debug Message!");  
	      log.info("Info Message!");  
	      log.warn("Warn Message!");  
	      log.error("Error Message!");  
	      log.fatal("Fatal Message!");  
	   }  
}
