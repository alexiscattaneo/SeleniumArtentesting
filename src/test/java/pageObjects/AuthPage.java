package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage {
	WebDriver driver;
	private By email;
	private By password;
	private By submit;
	private By alert;
	
	public AuthPage(WebDriver driver) {
		this.driver = driver;
		email = By.id("email");
		password = By.id("passwd");
		alert = By.xpath("//div[@class='alert alert-danger']/ol/li");
		submit = By.id("SubmitLogin");
	}
	
	public void escribirEmail(String myemail) {
		driver.findElement(email).sendKeys(myemail);
	}
	
	public void escribirPassword(String mypass) {
		driver.findElement(password).sendKeys(mypass);
	}
	
	public void loguearse() {
		driver.findElement(submit).click();
	}
	
	public String getMessage() {
		return driver.findElement(alert).getText();
	}
}
