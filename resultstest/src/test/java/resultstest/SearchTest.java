package resultstest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest {
	@Test
	public void noresults() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("Tennis");
		driver.findElement(By.name("submit_search")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.xpath("//*[@class='heading-counter']")).getText(), "0 results have been found.");
		driver.close();
		driver.quit();
	}
}
