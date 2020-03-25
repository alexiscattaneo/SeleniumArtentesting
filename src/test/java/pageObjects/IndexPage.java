package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage {
	private By searchBox;
	private By submitButton;
	private By womenLinkText;
	private By dressXpath;
	private By signIn;
	WebDriver driver;
	
	public IndexPage(WebDriver driver) {
		this.driver = driver;
		searchBox = By.id("search_query_top");
		submitButton = By.name("submit_search");
		womenLinkText = By.linkText("Women");
		signIn = By.className("login");
		dressXpath = By.xpath("//*[@id='block_top_menu']/ul/li[2]/a");
	}
	
	public void search(String item) {
		driver.findElement(searchBox).sendKeys(item);
		driver.findElement(submitButton).click();
	}
	
	public void goToWomenSection() {
		driver.findElement(womenLinkText).click();
	}
	
	public void goToDressSection() {
		driver.findElement(dressXpath).click();
	}
	
	public void goToSignIn() {
		driver.findElement(signIn).click();
	}
	
	
}
