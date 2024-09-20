package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dxc.Base.BaseTest;
import dxc.Pages.HomePage;
import dxc.Pages.LoginPage;

public class dummy {
	
	
	@Test
	public void startDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/deepaksaini/Downloads/Selenium/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myprotein.co.in/login.jsp?returnTo=https%3A%2F%2Fwww.myprotein.co.in%2FaccountHome.account");
		driver.findElement(By.xpath("//input[@label='Email address']")).sendKeys("deepaksn987@gmail.com");
		driver.findElement(By.xpath("//input[@label='Password']")).sendKeys("Flipkart.com@21");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
		
		
		
		
	}

}
