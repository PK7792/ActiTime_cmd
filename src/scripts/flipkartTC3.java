package scripts;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import generic_libraries.flipkart_LaunchApp;
import pom.Cart_Page_7;
import pom.Home_Page;
import pom.Tshirt_Page;

public class flipkartTC3 extends flipkart_LaunchApp
{
	@Test
	public void addProduct() throws InterruptedException, AWTException
	{
		Home_Page hp=new Home_Page(driver);
		hp.closelogin();
			Thread.sleep(1000);
		hp.clickMen(driver);	
			Thread.sleep(1000);
		hp.clicktshirt();
			Thread.sleep(2000);
		
		Tshirt_Page tp=new Tshirt_Page(driver);
		tp.shirt3();
		
		Set<String> allwh = driver.getWindowHandles();
		List<String> l=new ArrayList<String>(allwh);
			Thread.sleep(3000);
		String page=l.get(1);
		driver.switchTo().window(page);

			Thread.sleep(1000);
		tp.size();
			Thread.sleep(1000);
		tp.addcart();
			Thread.sleep(1000);
		
		Cart_Page_7 cp=new Cart_Page_7(driver);
		cp.plus_button();
			Thread.sleep(2000);
		
		//cp.get_price();	
		cp.place_order();
	}
}
