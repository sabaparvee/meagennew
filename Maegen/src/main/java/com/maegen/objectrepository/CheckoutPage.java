package com.maegen.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maegen.generic.WebDriverUtility.WebDriverUtility;

public class CheckoutPage  extends WebDriverUtility{
	WebDriver driver=null;
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@class='checkout-button__lock']")
	private WebElement CheckoutBtn;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCheckoutBtn() {
		return CheckoutBtn;
	} 
	// --- Dynamic element handling ---
    public WebElement getIncreaseProductQuantity(String productName) {
        String dynamicXpath="//a[text()='"+productName+"']/ancestor::div[@class='line-item__info']//a[@aria-label='Increase quantity']";
        return driver.findElement(By.xpath(dynamicXpath));
    }
    public WebElement getDecreaseProductQuantity(String productName) {
         String dynamicXpath="//a[text()='"+productName+"']/ancestor::div[@class='line-item__info']//a[@aria-label='Decrease quantity']";
         return driver.findElement(By.xpath(dynamicXpath));
     }
    public WebElement getIncreaseProductQuantityTableware(String productName) {
         String dynamicXpath="//a[text()=\"" + productName + "\"]/ancestor::div[@class='line-item__info']//a[@aria-label='Increase quantity']";
         return driver.findElement(By.xpath(dynamicXpath));

     }
     public WebElement getDecreaseProductQuantityTableware(String productName) {
          String dynamicXpath="//a[text()=\""+productName+"\"]/ancestor::div[@class='line-item__info']//a[@aria-label='Decrease quantity']";
          WebElement freshElement=driver.findElement(By.xpath(dynamicXpath));
         WebElement ele= ExplicitWaitrefreshed(driver,freshElement);
          return ele;

      }
     public WebElement getRemoveProductTableware(String productName) {
          String dynamicXpath="//a[text()=\""+productName+"\"]/ancestor::div[@class='line-item__info']/descendant::a[text()='Remove']";
          return driver.findElement(By.xpath(dynamicXpath));
          
      }
     public WebElement getRemoveProduct(String productName) {
          String dynamicXpath="//a[text()='"+productName+"']/ancestor::div[@class='line-item__info']/descendant::a[text()='Remove']";
          return driver.findElement(By.xpath(dynamicXpath));
      }

    public void clickProduct(String productName) {
    	getIncreaseProductQuantity(productName).click();
    }
    public String productName() {
    String	productName=driver.findElement(By.xpath("//div[@class='line-item__info']//a[@class='product-item-meta__title text--small']")).getText();
    	return productName;
    }
    public String emptyCart() {
        String	info=driver.findElement(By.xpath("//div[@class='drawer__content drawer__content--center']/p")).getText();
        	return info;
        }
}
