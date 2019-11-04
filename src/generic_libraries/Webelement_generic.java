package generic_libraries;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Webelement_generic 
{
	public String get_text(WebElement ele)
	{
		String text=ele.getText();
		return text;
	}
	
	public Point get_location(WebElement ele)
	{
		Point loc = ele.getLocation();
		return loc;
	}
	
	public int get_locationX(WebElement ele)
	{
		int x=ele.getLocation().getX();
		return x;
	}
	
	public int get_locationY(WebElement ele)
	{
		int y=ele.getLocation().getY();
		return y;
	}
	
	public Dimension get_size(WebElement ele)
	{
		Dimension size = ele.getSize();
		return size;
	}
	
	public int get_height(WebElement ele)
	{
		int height = ele.getSize().getHeight();
		return height;
	}
	
	public int get_width(WebElement ele)
	{
		int width=ele.getSize().getWidth();
		return width;
	}

	public String attribute(WebElement ele,String name)
	{
		String value = ele.getAttribute(name);
		return value;
	}
	
	public static void perform_click(WebElement ele)
	{
		ele.click();
	}
	
	public static void perform_sendkeys(WebElement ele,String data)
	{
		ele.sendKeys(data);
	}
	
	
	
	

}
