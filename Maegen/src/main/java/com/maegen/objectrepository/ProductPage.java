package com.maegen.objectrepository;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductPage {
	WebDriver driver=null;
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@class='quantity-selector__button' and .//*[name()='svg' and contains(@class,'icon--plus-big')]]")
	private WebElement plusBtn;
	@FindBy(xpath = "//button[@class='quantity-selector__button' and .//*[name()='svg' and contains(@class,'icon icon--minus-big   ')]]")
	private WebElement minuBtn;	
	@FindBy(xpath="//button[@id='AddToCart']")
	private WebElement AddCartBtn;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getPlusBtn() {
		return plusBtn;
	}
	public WebElement getMinuBtn() {
		return minuBtn;
	}
	public WebElement getAddCartBtn() {
		return AddCartBtn;
	}
	public void clickPlusIcon() {
	    new WebDriverWait(driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.elementToBeClickable(plusBtn));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", plusBtn);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", plusBtn);
	}
	public void clickAddToCart() {
	    new WebDriverWait(driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.elementToBeClickable(AddCartBtn));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddCartBtn);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", AddCartBtn);
	}
}
