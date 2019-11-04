package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page_3 
{
	//Declaration	
			@FindBy(xpath="(//input[@type='text'])[3]")
			private WebElement count;
			
			@FindBy (xpath="(//button)[3]")
			private WebElement plus;
			
			@FindBy (xpath="(//span)[4]")
			private WebElement price;
			
			@FindBy (xpath="//button[.='Place Order']")
			private WebElement order;
			
				
		//Initialization
			public Cart_Page_3(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
		//Utilization
			public void prod_count()
			{
				count.click();
			}
			
			public void plus_button() throws InterruptedException
			{
				for(int i=1;i<3;i++)
				{
					plus.click();
					Thread.sleep(1000);
				}
			}
			
			public void place_order()
			{
				order.click();
			}
			
			public void get_price()
			{
				price.click();
			}
			

}
