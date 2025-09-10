package com.projectOrangehrm.utility;


import org.apache.commons.logging.LogFactory;


import org.apache.commons.logging.LogFactory;

public class Log {
	
	// Initialize Log4j logs
	//public static Logger Log = Logger.getLogger(Log.class.getName());
	public static org.apache.commons.logging.Log log = LogFactory.getLog(Log.class.getName());
	//public static org.apache.commons.logging.Log log = LogFactory.getLog(Log.class.getName());
//	public static Logger Log = Logger.getLogger(Log.class.getName());

	public static void startTestCase(String sTestCaseName){		  
		//log.info("====================================="+sTestCaseName+" TEST START=========================================");
		 log.info("====================================="+sTestCaseName+" TEST START=========================================");
		 }
	
	public static void endTestCase(String sTestCaseName){
		log.info("====================================="+sTestCaseName+" TEST END=========================================");
		 }
	
	// Need to create below methods, so that they can be called  

	 public static void info(String message) {

		 log.info(message);
			log.info(message);

			}

	 public static void warn(String message) {

		 log.warn(message);
	    log.warn(message);

		}

	 public static void error(String message) {

		 log.error(message);
	    log.error(message);

		}

	 public static void fatal(String message) {

		 log.fatal(message);
	    log.fatal(message);

		}

	 public static void debug(String message) {

		 log.debug(message);
	    log.debug(message);

		}
	
}
