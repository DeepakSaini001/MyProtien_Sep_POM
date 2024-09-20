package dxc.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager extends DriverManager {

	@Override
	public WebDriver createDriver() {
		if (driver == null) {
			WebDriverManager.chromedriver().cachePath("Drivers").setup();
			driver = new ChromeDriver(); // local driver object
			driver.manage().window().maximize();

		}
		return driver;
	}

}
