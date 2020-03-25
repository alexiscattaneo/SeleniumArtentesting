package testCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.AuthPage;
import pageObjects.IndexPage;
import pageObjects.SectionPage;
import pageObjects.ProductPage;

public class tests {
	protected WebDriver driver;
	protected IndexPage indexPage;
	protected SectionPage sectionPage;
	protected ProductPage productPage;
	protected AuthPage authPage;
	
	@BeforeMethod
	public void start() {
		String driverOS;
		if(System.getProperty("os.name").contains("Windows")) {
			driverOS = "Driver/Chrome 80.0.3987.106/chromedriver.exe";
		}else if (System.getProperty("os.name").contains("Linux")){
			driverOS = "Driver/Chrome 80.0.3987.106/chromedriverLinux";
		} else {
			driverOS = "Driver/Chrome 80.0.3987.106/chromedriverMac";
		}
		System.setProperty("webdriver.chrome.driver", driverOS);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.navigate().to("http://automationpractice.com/index.php");
		indexPage = new IndexPage(driver);
		sectionPage = new SectionPage(driver);
		productPage = new ProductPage(driver);
		authPage = new AuthPage(driver);
	}
	
	@AfterMethod
	public void finish() {
		driver.close();
		driver.quit();
	}
	
	@Test(enabled=true)
	public void BuscarExistente() {
		indexPage.search("Faded Short Sleeve T-shirts");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(productPage.getResult().contains("1 result has been found."));
	}
	
	@Test(enabled=true)
	public void BuscarNoExistente() {
		indexPage.search("asdasd");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(productPage.getResult().contains("0 results have been found."));
	}
	
	@Test(enabled=true)
	public void Dress() {
		indexPage.goToDressSection();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sectionPage.goToSummerDresses();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(sectionPage.getCatName(), "SUMMER DRESSES ");
		sectionPage.clickProductColor("#5D9CEC");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?id_product=5&controller=product#/size-s/color-blue");
	}
	
	@Test(enabled=true)
	public void Women() {
		indexPage.goToWomenSection();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sectionPage.goToTop();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(sectionPage.getCatName(), "TOPS ");
		sectionPage.clickProductColor("#ffffff");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?id_product=2&controller=product#/size-s/color-white");
	}
	
	@Test(enabled=true)
	public void loguearse() {
		indexPage.goToSignIn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		authPage.escribirEmail("asdfgh@gmail.com");
		authPage.escribirPassword("123456789");
		authPage.loguearse();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(authPage.getMessage(), "Authentication failed.");
	}
}
