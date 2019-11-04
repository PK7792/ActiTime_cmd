package generic_libraries;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebDriver_generic
{
	public String title(WebDriver driver)
	{
		String title = driver.getTitle();
		return title;
	}
	
	public String url(WebDriver driver)
	{
		String url = driver.getCurrentUrl();
		return url;
	}	
	
	public String source(WebDriver driver)
	{
		String src=driver.getPageSource();
		return src;
	}
	
	public String window_title(WebDriver driver,int i)
	{
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> list=new ArrayList<String>(allwh);
		String win = list.get(i);
		WebDriver tab = driver.switchTo().window(win);
		String title = tab.getTitle();
		return title;		
			
	}
	

}
