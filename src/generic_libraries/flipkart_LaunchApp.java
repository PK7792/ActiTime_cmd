package generic_libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class flipkart_LaunchApp {
	public WebDriver driver;

	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	//@Parameters({ "browser" })

	@BeforeMethod
	public void launch() throws InterruptedException {
	//	if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
//		} else {
//			driver = new ChromeDriver();
//			driver.get("https://www.flipkart.com/");
//			Thread.sleep(2000);
//		}
	}

	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		Thread.sleep(5000);
	}

}
