package stepDefinition;


import static org.junit.Assert.assertTrue;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import commonFunctions.FunctionLibrary;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class BookingSteps {
	WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
		driver = FunctionLibrary.startBrowser();
	}
	
	@When("^Open Application url\"([^\"]*)\"$")
	public void open_Application_url(String url) throws Throwable {
		FunctionLibrary.openUrl(url);
	}
	@When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_username_and_password(String username, String password) throws Throwable {
		 WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
	        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
	        
	        usernameField.sendKeys(username);
	        passwordField.sendKeys(password);
	        
	        // Click login button
	        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	        loginButton.click();
	}

	@Then("^I should be logged in or see an error message$")
	public void i_should_be_logged_in_or_see_an_error_message() throws Throwable {
		 try {
	            // Assuming there's some element indicating successful login, for example, a logout button
	            WebElement logoutButton = driver.findElement(By.xpath("//button[normalize-space()='Logout']"));
	            assertTrue(logoutButton.isDisplayed());
	        } catch (org.openqa.selenium.NoSuchElementException e) {
	            // Error message element not found, login failed
	            WebElement errorMessage = driver.findElement(By.xpath("//p[@class='error-message']"));
	            assertTrue(errorMessage.isDisplayed());
	        }
	        
	        // Quit WebDriver
	        driver.quit();
	    }
	
		@When("^wait for ShopNow with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_ShopNow_with_and(String Locator_Type, String Locator_Value) throws Throwable {
	   FunctionLibrary.waitForElement(Locator_Type, Locator_Value,"5000");
	}

	@When("^Click On ShopNow with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_ShopNow_with_and(String Locator_Type, String Locator_Value) throws Throwable {
	   FunctionLibrary.clickAction(Locator_Type, Locator_Value);
	}

	@When("^I scroll the scrollbar to the center of the page$")
	public void i_scroll_the_scrollbar_to_the_center_of_the_page() throws Throwable {
		long windowHeight = (Long) ((JavascriptExecutor) driver).executeScript("return window.innerHeight;");
        long windowWidth = (Long) ((JavascriptExecutor) driver).executeScript("return window.innerWidth;");

        // Calculate the position to scroll to the center of the page
        long scrollX = windowWidth / 2;
        long scrollY = windowHeight / 2;

        // Scroll to the center of the page
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(" + scrollX + "," + scrollY + ");");
	}

	@Then("^I should see the page scrolled to the center$")
	public void i_should_see_the_page_scrolled_to_the_center() throws Throwable {
	   
	}
	@When("^wait for Clothing with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_Clothing_with_and(String Locator_Type, String Locator_Value) throws Throwable {
	    FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "5000");
	}

	@When("^click on Clothing with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_on_Clothing_with_and(String Locator_Type, String Locator_Value) throws Throwable {
	   FunctionLibrary.clickAction(Locator_Type, Locator_Value);
	}

	@When("^wait for Searchtextbox with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_Searchtextbox_with_and(String Locator_Type, String Locator_Value) throws Throwable {

	    FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "5000");
	
	}

	@When("^Enter Searchtextbox with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Searchtextbox_with_and_and(String Locator_Type, String Locator_Value, String Test_Data) throws Throwable {
		 FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
	}
	@When("^I press the Enter key$")
	public void i_press_the_Enter_key() throws Throwable {
		 WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search']")); 
	        element.sendKeys(Keys.ENTER);
	}

	@Then("^I should see the expected result$")
	public void i_should_see_the_expected_result() throws Throwable {


	}
	
	@When("^wait for sorting dropdown list with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_sorting_dropdown_list_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		 FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "5000");
	}

	@When("^I select lowest price with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_select_lowest_price_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(Locator_Type, Locator_Value);
	}
	@When("^wait for Lowest Price item with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_Lowest_Price_item_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10000");
	}

	@When("^I click the Lowest Price item with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_click_the_Lowest_Price_item_with_and(String Locator_Type, String Locator_Value) throws Throwable {

		FunctionLibrary.clickAction(Locator_Type, Locator_Value);
	}	
	
	@When("^wait for plus icon button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_plus_icon_button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "5000");
	}

	@When("^click the plus icon button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_the_plus_icon_button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(Locator_Type, Locator_Value);
	}

	@When("^wait for minus icon button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_minus_icon_button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "5000");
	}

	@When("^click the minus icon button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_the_minus_icon_button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(Locator_Type, Locator_Value);
	}

	@When("^wait for Add to cart button with\"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_Add_to_cart_button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "5000");
	}

	@When("^click the Add to cart button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_the_Add_to_cart_button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(Locator_Type, Locator_Value);
	}
	@When("^I scroll the scrollbar to the top of the page$")
	public void i_scroll_the_scrollbar_to_the_top_of_the_page() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the top of the page
        js.executeScript("window.scrollTo(0, 0);");

	}
	
	@When("^wait for Cart button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_Cart_button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "100");
	}

	@When("^click the Cart button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_the_Cart_button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		WebElement element = driver.findElement(By.xpath(Locator_Value)); 
        element.click();
	}
	
	@When("^i click the Remove all item button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_click_the_Remove_all_item_button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(Locator_Type, Locator_Value);

	}
	@When("^i get the message with \"([^\"]*)\" and \"([^\"]*)\"$")
	public String i_get_the_message_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		 WebElement messageElement = driver.findElement(By.xpath(Locator_Value)); 

	        // Get the text of the message
	        String message = messageElement.getText();

	        return message;
	}


	





	



}
       







