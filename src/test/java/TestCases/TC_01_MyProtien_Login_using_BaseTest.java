package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import dxc.Base.BaseTest;
import dxc.Pages.HomePage;
import dxc.Pages.HomePagePopUp;
import dxc.Pages.ProtienPage;
import dxc.Pages.SignUpPage;
import dxc.utils.FakerUtils;



public class TC_01_MyProtien_Login_using_BaseTest extends BaseTest {

	@Test(priority = 2, description = "Login with Exisitng User in Application")
	public void loginIntoApplication_using_Credintails() {
		test = extent.createTest("Login Test", "Verify login functionality using valid credentials");
		

		HomePage homePage = new HomePagePopUp(getDriver()).navigateToURL().verifyCookiesAndPopUp().clickOnAccount()
				.enterEmailId("deepaksn987@gmail.com").enterPassword("Flipkart.com@21").clickOnSignIn()
				.enterTextSearchField("Protien").clickSearchButton();
		ProtienPage proteinPage = homePage.navigatetoProtien();
		Assert.assertEquals(proteinPage.verifyProtienPageTitle(), "High Protein Powders & Protein Shakes");
		List<WebElement> items = proteinPage.getItemList();
		// Print the text of each product item for debugging/logging purposes
		for (WebElement item : items) {
			System.out.println(item.getText());
		}
		Assert.assertTrue(proteinPage.verifyCartProducts("Impact Whey Protein"), "Product not found in the cart!");

	}

	@Test(priority = 1, description = "Create New User in Application")
	public void signUPIntoApplication_using_Registration() {
		test = extent.createTest("SignUp Test", "Verify signUp functionality using newly created credentials");

		String username = "user" + new FakerUtils().generateRandomNumber();

		SignUpPage signUp = new HomePagePopUp(getDriver()).navigateToURL().verifyCookiesAndPopUp().mouseHoverOnAccount()
				.clickOnRegisterButton().enterFullName(username).enterEmail(username + "@gmail.com")
				.enterConfirmEmail(username + "@gmail.com").enterpassword(username).enterConfirmpassword(username);
		HomePage homePage = signUp.clickOnContinueButton();

	}

	@Test(priority = 0, description = "Direct_Search")
	public void Direct_Search() {
		test = extent.createTest("Direct Search Test", "Direct_Search extent report description");

		HomePage signUp = new HomePagePopUp(getDriver()).navigateToURL().verifyCookiesAndPopUp()
				.enterTextSearchField("Protien").clickSearchButton();

	}

}
