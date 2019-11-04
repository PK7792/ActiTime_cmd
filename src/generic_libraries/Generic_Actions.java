package generic_libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_Actions {

	Actions act;
	Robot r;

	// Constructor
	public Generic_Actions(WebDriver driver) throws AWTException {
		act = new Actions(driver);
		r = new Robot();

	}

	public void mouse_hover(WebElement ele) {
		act.moveToElement(ele).perform();
	}

	public void drag_drop(WebElement src, WebElement tgt) {
		act.dragAndDrop(src, tgt);
	}

	public void double_click(WebElement ele) {
		act.doubleClick(ele).perform();
	}

	public void right_click(WebElement ele) {
		act.contextClick(ele).perform();
	}

	public void new_tab(WebElement ele) {
		right_click(ele);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}

	public void new_window(WebElement ele) {
		right_click(ele);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
	}

	public void new_private_window(WebElement ele) {
		right_click(ele);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
	}

	public void minimize_window() {
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
	}

}
