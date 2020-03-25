package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SectionPage {
	WebDriver driver;
	private By summerDresses;
	private By womenTop;
	private By catName;
	
	public SectionPage(WebDriver driver) {
		this.driver = driver;
		summerDresses = By.linkText("Summer Dresses");
		womenTop = By.linkText("Tops");
		catName = By.xpath("//span[@class='cat-name']");
	}
	
	public String getCatName() {
		return driver.findElement(catName).getText();
	}
	
	public void goToSummerDresses() {
		driver.findElement(summerDresses).click();
	}
	
	public void goToTop() {
		driver.findElement(womenTop).click();
	}
	
	public void clickProductColor(String color) {
		String camino = "//*[contains(@style,'"+color+"') and @class='color_pick']";
		driver.findElement(By.xpath(camino)).click();
	}
}
