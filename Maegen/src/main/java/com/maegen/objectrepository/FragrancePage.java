package com.maegen.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FragrancePage {
	WebDriver driver=null;
	public FragrancePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Category']")
	private WebElement CategoryDrop;
	@FindBy(xpath="(//span[text()='Best selling'])[1]")
	private WebElement SortBy;
	@FindBy(xpath="//span[text()='+ Add to cart']")
	private WebElement AddTocartBtn;
	@FindBy(xpath="//a[text()='Alchemist Candle | Black Coffee & Bergamot']")
	private WebElement AlchemistBlackCoffeeBtn;
	@FindBy(xpath="//a[text()='Alchemist Candle | Sweet  Basil & Cucumber']")
	private WebElement AlchemistSweetBasilBtn;
	@FindBy(xpath="//a[text()='Alchemist Candle | Sweet Pea & Honeysuckle']")
	private WebElement AlchemistSweetPeaBtn;
	@FindBy(xpath="//a[text()='Alchemist Diffuser | Embers & Musk']")
	private WebElement AlchemistBtn;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCategoryDrop() {
		return CategoryDrop;
	}
	public WebElement getAddTocartBtn() {
		return AddTocartBtn;
	}
	public WebElement getAlchemistBlackCoffeeBtn() {
		return AlchemistBlackCoffeeBtn;
	}
	public WebElement getAlchemistSweetBasilBtn() {
		return AlchemistSweetBasilBtn;
	}
	public WebElement getAlchemistSweetPeaBtn() {
		return AlchemistSweetPeaBtn;
	}
	public WebElement getAlchemistBtn() {
		return AlchemistBtn;
	}
	
}
