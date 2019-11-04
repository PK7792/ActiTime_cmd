package pom;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_libraries.Generic_Actions;

public class Home_Page {
	// Declaration

	@FindBy(xpath = "//button[.='✕']")
	private WebElement closepopup;

	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement email;

	@FindBy(xpath = "//span[.='Men']")
	private WebElement men;

	@FindBy(xpath = "//a[.='T-Shirts']")
	private WebElement tshirt;

	// Initialization
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization

	public void closelogin() {
		closepopup.click();
	}

	public void email() {
		email.sendKeys();
	}

	public void clickMen(WebDriver driver) throws AWTException {
		Generic_Actions action = new Generic_Actions(driver);
		action.mouse_hover(men);

	}

	public void clicktshirt() {
		tshirt.click();
	}

}
