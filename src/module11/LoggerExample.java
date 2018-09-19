package module11;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LoggerExample {

	//get a logger instance
	public static Logger log =  Logger.getLogger(LoggerExample.class);
	
	public void testLoggerDebug() {
		log.debug("It is into Debug method");
		
	}
	
	public void testLoggerInfo() {
		log.info("It is into Info method");
	}
	public void testLoggerWarn() {
		log.warn("It is into Warn method");
	}
	public void testLoggerError() {
		log.error("It is into Error method");
	}
	public void testLoggerFatal() {
		log.fatal("It is into Fatal method");
	}
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		LoggerExample example = new LoggerExample();
		example.testLoggerDebug();
		example.testLoggerInfo();
		example.testLoggerWarn();
		example.testLoggerError();
		example.testLoggerFatal();
	}
}