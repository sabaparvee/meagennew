package com.maegen.objectrepository;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maegen.generic.WebDriverUtility.WebDriverUtility;
public class FragrancePage1 extends WebDriverUtility {
	

	    private WebDriver driver;

	    // Constructor
	    public FragrancePage1(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    

	    @FindBy(xpath = "//div[@class='price-range__range-group range-group']//input[@aria-label='From price']")
	    private WebElement priceFilter;

	    @FindBy(xpath = "//button[text()='Category']")
	    private WebElement categoryFilter;
	    @FindBy(xpath = "//button[text()='Price']")
	    private WebElement priceBtn;

	    @FindBy(xpath = "//span[@id='sort-by-selected-value']")
	    private WebElement sortDropdown;

	    @FindBy(xpath = "//div[contains(@class,'product-item__info  ')]//a[contains(@class,'product-item-meta__title')]")
	    private List<WebElement> productNames;

	    public WebDriver getDriver() {
			return driver;
		}

		public WebElement getPriceFilter() {
			return priceFilter;
		}
		public WebElement getpriceBtn() {
			return priceBtn;
		}

		public WebElement getCategoryFilter() {
			return categoryFilter;
		}

		public WebElement getSortDropdown() {
			return sortDropdown;
		}

		public List<WebElement> getProductNames() {
			return productNames;
		}

		

		// --- Dynamic element handling ---
	    public WebElement getProductByName(String productName) {
	        String dynamicXpath="//div[contains(@class,'product-item__info  ')]//a[contains(@class,'product-item-meta__title')and contains(text(),'"+productName+"')]";
	        return driver.findElement(By.xpath(dynamicXpath));
	    }

	    public void clickProduct(String productName) {
	        getProductByName(productName).click();
	    }
	    
	    public WebElement SelectCategory(String categoryName) {
	    	JavaScriptExecutorScrollIntoView(driver,getSortDropdown());
	    	//JavaScriptExecutorClick(driver,getSortDropdown());
	    	getCategoryFilter().click();
	        String dynamicXpath="//input[@value='"+categoryName+"']";
	        return driver.findElement(By.xpath(dynamicXpath));
	    	
	    }
	    public void clickCategory(String categoryName) {
	    	SelectCategory(categoryName).click();
	    }
	    public void SortBy(String sortData,String productName) {
	    	JavaScriptExecutorScrollIntoView(driver,getSortDropdown());
	    	ExplicitWaitForElementClickable(driver,getSortDropdown());
	    	JavaScriptExecutorClick(driver,getSortDropdown());
	    	 By priceHighToLow = By.xpath("//span[contains(@class,'popover__choice-label') and text()='"+sortData+"']");
		    	ExplicitWaitForElementClickableBY(driver,priceHighToLow);
		    	   By productLocator = By.xpath("//div[contains(@class,'product-item__info  ')]//a[contains(@class,'product-item-meta__title') and contains(text(),'"+productName+"')]");
		    	   WebElement ele = ExplicitWaitpresenceOfElementLocated(driver,productLocator);
		    	   JavaScriptExecutorScrollIntoView(driver,ele);
			    ExplicitWaitForElementClickableBY(driver,productLocator);


	    	
	    }
	    public void SortBy2(String sortData, String productName) {
	        // Scroll to sort dropdown
	        JavaScriptExecutorScrollIntoView(driver, getSortDropdown());

	        // Wait and click sort dropdown
	        ExplicitWaitForElementClickable(driver, getSortDropdown());
	        JavaScriptExecutorClick(driver, getSortDropdown());

	        // Wait and click the sorting option
	        By sortOption = By.xpath("//span[contains(@class,'popover__choice-label') and text()='" + sortData + "']");
	        WebElement sortElement = ExplicitWaitForElementClickableBY(driver, sortOption);
	        JavaScriptExecutorClick(driver, sortElement); // safer than normal click

	        // Re-locate and wait for the product after sorting
	        By productLocator = By.xpath("//div[contains(@class,'product-item__info  ')]//a[contains(@class,'product-item-meta__title') and contains(text(),'" + productName + "')]");
	        WebElement productElement = ExplicitWaitpresenceOfElementLocated(driver, productLocator);
	        JavaScriptExecutorScrollBY(driver,productElement);
	        // Scroll into view and adjust for sticky header
	        

	        // Click using JS to avoid interception
	        try {
	            ExplicitWaitForElementClickableBY(driver, productLocator).click();
	        } catch (ElementClickInterceptedException e) {
	            JavaScriptExecutorClick(driver, productElement);
	        }
	    }
	    public void scrollPrice(String price1) throws InterruptedException {
	    	WebElement ele = ExplicitWaitForElementClickableReturn(driver,getpriceBtn());
	    	ele.click();
	        Thread.sleep(2000);
	     By  ele1= By.xpath("//div[@class='price-range__range-group range-group']//input[@aria-label='From price']");
	        WebElement ele2=  ExplicitWaitpresenceOfElementLocated(driver,ele1);
	        JavaScriptExecutorValue(driver,ele2,price1);
	       // js.executeScript("arguments[0].value = 25;", toSlider);
	    }

        
        
	}


