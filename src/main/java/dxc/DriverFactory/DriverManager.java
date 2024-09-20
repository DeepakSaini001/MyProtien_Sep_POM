package dxc.DriverFactory;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	protected WebDriver driver;

	protected abstract WebDriver createDriver();

	public WebDriver InitilizeDriver() {
		if (driver == null) { // Ensure Singleton behavior for WebDriver
			createDriver();
		}
		return driver;
	}

	public void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null; // Ensure the driver is properly cleaned up
		}
	}

}
