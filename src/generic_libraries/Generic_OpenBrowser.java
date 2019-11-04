package generic_libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_OpenBrowser {
	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	WebDriver driver = new FirefoxDriver();

	@BeforeMethod
	public void launch() throws InterruptedException {
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(2000);

	}

	@AfterMethod
	public void close() {
		driver.close();
	}

}
