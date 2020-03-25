package helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Waiter {
	WebDriver driver;
	public void implicit(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
}
