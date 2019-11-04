package generic_libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Excel_RowData 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	}
	 public WebDriver driver= new FirefoxDriver();

	@BeforeMethod
	public void launch() throws InterruptedException
	{
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
	}

	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
