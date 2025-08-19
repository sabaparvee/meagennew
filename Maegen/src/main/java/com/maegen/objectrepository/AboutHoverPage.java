package com.maegen.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutHoverPage {
	WebDriver driver=null;
	public AboutHoverPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Our Story']")
	private WebElement StoryLnk;
	@FindBy(xpath="//p[text()='Contact Us']")
	private WebElement ContactUsLnk;
	@FindBy(xpath="//p[text()='Become A Stockist']")
	private WebElement StockistLnk;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getStoryLnk() {
		return StoryLnk;
	}
	public WebElement getContactUsLnk() {
		return ContactUsLnk;
	}
	public WebElement getStockistLnk() {
		return StockistLnk;
	}
	
	public String title() {
		String ti = driver.getTitle();
		return ti;
	}
}
