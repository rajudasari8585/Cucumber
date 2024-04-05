package commonFunctions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FunctionLibrary {
	public static WebDriver driver;
	//method for launch browser
	public static WebDriver startBrowser() throws Throwable
	{
		driver = new ChromeDriver() ;
		return driver;
	}
	//method for launch url
	public static void openUrl(String url)throws Throwable
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	//method for wait for all webelement waitForElement
	public static void waitForElement(String Locator_Type,String Locator_Value,String Test_Data)
	{
		WebDriverWait mywait = new WebDriverWait(driver, Integer.parseInt(Test_Data));
		if(Locator_Type.equalsIgnoreCase("xpath"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator_Value)));
		}
		else if(Locator_Type.equalsIgnoreCase("id"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Locator_Value)));
		}
		else if(Locator_Type.equalsIgnoreCase("name"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Locator_Value)));

		}
	}
	//method for textboxes
	public static void typeAction(String Locator_Type,String Locator_Value,String Test_Data)
	{
		if(Locator_Type.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(Locator_Value)).clear();
			driver.findElement(By.xpath(Locator_Value)).sendKeys(Test_Data);
		}
		else if(Locator_Type.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(Locator_Value)).clear();
			driver.findElement(By.id(Locator_Value)).sendKeys(Test_Data);
		}
		else if(Locator_Type.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(Locator_Value)).clear();
			driver.findElement(By.name(Locator_Value)).sendKeys(Test_Data);
		}
	}
	//method for buttons,links,radiobuttons,checkboxes images
	public static void clickAction(String Locator_Type,String Locator_Value)
	{
		if(Locator_Type.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(Locator_Value)).click();
		}
		else if(Locator_Type.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(Locator_Value)).click();
		}
		else if(Locator_Type.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(Locator_Value)).sendKeys(Keys.ENTER);
		}
	}
	public void login(String username, String password) {
        try {
            // Find and interact with the username and password fields
            WebElement usernameField = driver.findElement(By.id("//input[@id='username']")); 
            usernameField.sendKeys(username);

            WebElement passwordField = driver.findElement(By.id("//input[@id='password']")); 
            passwordField.sendKeys(password);

            // Find and click the login button
            WebElement loginButton = driver.findElement(By.id("//button[normalize-space()='Login']")); 
            loginButton.click();
        } catch (Exception e) {
            // Handle the exception when login fails
            System.out.println("Login failed. Error message: " + e.getMessage());

            // Retry the login process or take appropriate action
            login(username, password);
        }
    }
	//method for closing browser
	public static void closeBrowser()
	{
		driver.quit();
	}
	//method for date generation
	public static String generateDate()
	{
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("YYYY_MM_dd hh_mm_ss");
		return df.format(date);
	}
	//method for Listboxes
	public static void dropDownAction(String Locator_Type,String Locator_Value,String Test_Data)
	{
		if(Locator_Type.equalsIgnoreCase("id"))
		{
			int value = Integer.parseInt(Test_Data);
			WebElement element = driver.findElement(By.id(Locator_Value));
			Select select = new Select(element);
			select.selectByIndex(value);
		}
		else if(Locator_Type.equalsIgnoreCase("xpath"))
		{
			int value = Integer.parseInt(Test_Data);
			WebElement element = driver.findElement(By.xpath(Locator_Value));
			Select select = new Select(element);
			select.selectByIndex(value);
		}
		else if(Locator_Type.equalsIgnoreCase("name"))
		{
			int value = Integer.parseInt(Test_Data);
			WebElement element = driver.findElement(By.name(Locator_Value));
			Select select = new Select(element);
			select.selectByIndex(value);
		}

	}																				
	
}