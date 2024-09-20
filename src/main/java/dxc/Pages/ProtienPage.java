package dxc.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import dxc.Base.BasePage;

public class ProtienPage extends BasePage {

	public ProtienPage(WebDriver driver) {
		super(driver);
	}

	private final By Title = By.xpath("//h1[@id='responsive-product-list-title']");

	private final By listofItems = By.xpath("//ul[@class='productListProducts_products']");

	public ProtienPage verifyProtienPageTitle() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Title)).getText();
		return this;
	}

	public List<WebElement> getItemList() {

		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(listofItems));

	}
	public Boolean verifyCartProducts(String ProductName) {
		Boolean CartMatch = getItemList().stream()
				.anyMatch(productElement -> productElement.getText().equalsIgnoreCase(ProductName));
		return CartMatch;
	}

}
