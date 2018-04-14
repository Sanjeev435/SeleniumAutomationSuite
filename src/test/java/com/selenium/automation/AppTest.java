package com.selenium.automation;

import org.apache.log4j.Logger;

/*import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;*/

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	 // get a logger instance
	public static Logger logger = Logger.getLogger(AppTest.class);

	public void testLoggerDebug() {
		logger.debug("Hello.. im in Debug method");
	}

	public void testLoggerInfo() {
		logger.info("Hello.. im in Info method");
	}

	public void testLoggerWarn() {
		logger.warn("Hello.. im in Warn method");
	}

	public void testLoggerError() {
		logger.error("Hello.. im in Error method");
	}

	public void testLoggerFatal() {
		logger.fatal("Hello.. im in Fatal method");
	}

	public static void main(String[] args) {
		AppTest example = new AppTest();
		example.testLoggerDebug();
		example.testLoggerInfo();
		example.testLoggerWarn();
		example.testLoggerError();
		example.testLoggerFatal();
	}
}
