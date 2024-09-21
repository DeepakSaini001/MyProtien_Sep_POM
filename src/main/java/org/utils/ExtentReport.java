package org.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import dxc.*;

public class ExtentReport {
	private static ExtentReports extent;

	public static ExtentReports createInstance(String fileName) {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);

		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle("Automation Test Report");
		htmlReporter.config().setReportName("Test Report");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "TestMachine");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", "Deepak");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("OS", System.getProperty("os.name"));

		return extent;
	}

	public static ExtentReports getInstance() {
		if (extent == null) {
			extent = createInstance(
					"//Users//deepaksaini//eclipse-workspace//2024_myProtien_9_Sep//Reports//extent.html");

		}
		return extent;
	}

}
