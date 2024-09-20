package dxc.utils;

import org.apache.log4j.Logger;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

import dxc.Listeners.Test_Listener;


public class customUtility {
	protected Logger logger = LogUtils.getLogger();

	
	protected void publishMessageInReports(String message) {
		// System.out.println(message);
		log.info(message);
		Test_Listener.extentTest.get().log(Status.INFO, message);
		Reporter.log(message);

	}

	protected void publishMessageInReports_PASS(String message) {
		// System.out.println(message);
		log.info(message);
		Test_Listener.extentTest.get().log(Status.PASS, message);
		Reporter.log(message);

	}
}
