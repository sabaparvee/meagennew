package com.maegen.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maegen.generic.WebDriverUtility.WebDriverUtility;

public class GiftPage extends WebDriverUtility {
	WebDriver driver=null;
	public GiftPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement AddcartBtn;
	@FindBy(xpath = "//button[@class='quantity-selector__button' and .//*[name()='svg' and contains(@class,'icon--plus-big')]]")
	private WebElement plusBtn;
	@FindBy(xpath = "//button[@class='quantity-selector__button' and .//*[name()='svg' and contains(@class,'icon icon--minus-big   ')]]")
	private WebElement minuBtn;	
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getPlusBtn() {
		return plusBtn;
	}
	public WebElement getMinuBtn() {
		return minuBtn;
	}
	
	
	public WebElement getAddcartBtn() {
		return AddcartBtn;
	}
	public WebElement SelectGift(String price) {
		String dynamicXpath="//label[text()='"+price+"']";
        return driver.findElement(By.xpath(dynamicXpath));
        
	}
	public void addtoCart() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//button[@id='AddToCart']"));
		JavaScriptExecutorScrollBY(driver,element);
		Thread.sleep(500); // small wait for UI adjustment
		element.click();

	}
}
