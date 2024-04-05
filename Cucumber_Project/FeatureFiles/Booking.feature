Feature: validating Booking steps
@Supplierdata
Scenario Outline: AS Admin user validating the Booking steps
When Open Browser
When Open Application url"https://trinadhtrendz.ccbp.tech/login"
When I enter username "<username>" and password "<password>"
When wait for ShopNow with "xpath" and "//button[normalize-space()='Shop Now']"
When Click On ShopNow with "xpath" and "//button[normalize-space()='Shop Now']"
When I scroll the scrollbar to the center of the page
Then I should see the page scrolled to the center
When wait for Clothing with "xpath" and "//p[normalize-space()='Clothing']"
When click on Clothing with "xpath" and "//p[normalize-space()='Clothing']"
When wait for Searchtextbox with "xpath" and "//input[@placeholder='Search']"
When Enter Searchtextbox with "xpath" and "//input[@placeholder='Search']" and "dress"
When I press the Enter key
Then I should see the expected result
When wait for sorting dropdown list with "xpath" and "//select[@class='sort-by-select']"
When I select lowest price with "xpath" and "//option[@value='PRICE_LOW']"
When wait for Lowest Price item with "xpath" and "//div[@class='all-products-container']//ul[@class='products-list']"
When I click the Lowest Price item with "xpath" and "//div[@class='all-products-container']//ul[@class='products-list']"
When wait for plus icon button with "xpath" and "//button[@testid='plus']//*[name()='svg']"
When click the plus icon button with "xpath" and "//button[@testid='plus']//*[name()='svg']"
When wait for minus icon button with "xpath" and "//button[@testid='minus']//*[name()='svg']"
When click the minus icon button with "xpath" and "//button[@testid='minus']//*[name()='svg']"
When wait for Add to cart button with"xpath" and "//button[normalize-space()='ADD TO CART']"
When click the Add to cart button with "xpath" and "//button[normalize-space()='ADD TO CART']"
When I scroll the scrollbar to the top of the page
When wait for Cart button with "xpath" and "(//li[@class='nav-menu-item'])[3]"
When click the Cart button with "xpath" and "(//li[@class='nav-menu-item'])[3]"
When i click the Remove all item button with "xpath" and "//button[normalize-space()='Remove All']"
When i get the message with "xpath" and "//h1[normalize-space()='Your Cart Is Empty']"
Examples:
|username|password|
|rahul|rahul@2021|
|rahul1|rahul@2021|
|rahul|rahul@2021|
