package com.maegen.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver=null;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),  '+Never Count Years Or Glasses Of Wine+')]/ancestor::div[@class='line-item__info']//*[name()='svg' and @class='icon icon--minus   ']")
	private WebElement minusLnk;
	@FindBy(xpath="//a[contains(text(),  '+Never Count Years Or Glasses Of Wine+')]/ancestor::div[@class='line-item__info']//*[name()='svg' and @class='icon icon--plus   ']")
	private WebElement plusLnk;
	@FindBy(xpath="//a[contains(text(),  '+Never Count Years Or Glasses Of Wine+')]/ancestor::div[@class='line-item__info']//*[name()='svg' and @class='icon icon--plus   ']")
	private WebElement pluLnk;
	
}
