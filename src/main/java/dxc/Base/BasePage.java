package dxc.Base;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import dxc.Listeners.Test_Listener;
import dxc.utils.LogUtils;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected SoftAssert softAssert;
	protected static Logger log = LogUtils.getLogger();

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		softAssert = new SoftAssert();
		
	}

	public void navigateToURL(String endPoint) {
		 log.info("Navigating to URL: " + endPoint);
		driver.get("https://www.myprotein.co.in/" + endPoint);
	}
	
	
	
	

}
