package commonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface WebDriver {

	void get(String url);

	Object manage();

	String getTitle();

	WebElement findElement(By xpath);

	void quit();

}
