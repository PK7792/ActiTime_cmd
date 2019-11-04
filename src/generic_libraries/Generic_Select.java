package generic_libraries;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_Select {
	Select s;

	public Generic_Select(WebElement ele) {
		s = new Select(ele);
	}

	public void select_Index(int i) {

		s.selectByIndex(i);
	}

	public void select_Value(String value) {
		s.selectByValue(value);
	}

	public void select_Text(String text) {
		s.selectByVisibleText(text);
	}

	public void deselect_Index(int i) {
		s.deselectByIndex(i);
	}

	public void deselect_Value(String value) {
		s.deselectByValue(value);
	}

	public void deselect_Text(String text) {
		s.deselectByVisibleText(text);
	}

	public void deselect_all() {
		s.deselectAll();
	}

	public boolean multiple() {
		boolean bool = s.isMultiple();
		return bool;
	}

	public int options_size() {
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		return count;
	}

	public ArrayList<String> options_text() {
		List<WebElement> opt = s.getOptions();
		ArrayList<String> l = new ArrayList<String>();
		for (WebElement we : opt) {
			String text = we.getText();
			l.add(text);
		}
		return l;
	}

	public String first_selectedOption() {
		WebElement firstOpt = s.getFirstSelectedOption();
		String text = firstOpt.getText();
		return text;
	}

	public ArrayList<String> all_selectedOptions() {
		List<WebElement> allOpt = s.getAllSelectedOptions();
		ArrayList<String> l = new ArrayList<String>();
		for (WebElement we : allOpt) {
			String text = we.getText();
			l.add(text);
		}
		return l;
	}

}
