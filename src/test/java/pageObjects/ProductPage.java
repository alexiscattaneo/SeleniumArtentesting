package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	WebDriver driver;
	private By result;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		result = By.className("heading-counter");
	}
	
	public String getResult() {
		return driver.findElement(result).getText();
	}
	
}
