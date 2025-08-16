package com.maegen.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
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
       // String dynamicXpath = "//p[contains(@class,'product-title') and contains(text(),'" + productName + "')]";
        String dynamicXpath="//a[text()='"+productName+"']/ancestor::div[@class='line-item__info']//a[@aria-label='Increase quantity']";
        return driver.findElement(By.xpath(dynamicXpath));
    }
    public WebElement getDecreaseProductQuantity(String productName) {
        // String dynamicXpath = "//p[contains(@class,'product-title') and contains(text(),'" + productName + "')]";
         String dynamicXpath="//a[text()='"+productName+"']/ancestor::div[@class='line-item__info']//a[@aria-label='Decrease quantity']";
         return driver.findElement(By.xpath(dynamicXpath));
     }

    public void clickProduct(String productName) {
    	getIncreaseProductQuantity(productName).click();
    }
	
}
