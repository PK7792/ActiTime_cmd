package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Page 
{

//Declaration	
	@FindBy(xpath="(//div[@class='_3O0U0u']/div[3]/div)[1]")
	private WebElement selectshirt;
	
	@FindBy (xpath="//a[.='L']")
	private WebElement selectsize;
	
	@FindBy (xpath="(//button)[2]")
	private WebElement addtocart;
	
	
	
//Initialization
	public Tshirt_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//Utilization
	public void shirt3()
	{
		selectshirt.click();
	}
	
	public void size()
	{
		selectsize.click();
	}
	
	public void addcart()
	{
		addtocart.click();
	}

	
	
}
