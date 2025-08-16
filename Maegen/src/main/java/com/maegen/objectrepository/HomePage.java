package com.maegen.objectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.maegen.generic.WebDriverUtility.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	WebDriver driver=null;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='q']")
	private WebElement SearchLnk;
	@FindBy(xpath="//a[text()='Shop']")
	private WebElement ShopLnk;
	@FindBy(xpath="//a[text()='Fragrance']")
	private WebElement FragranceLnk;
	@FindBy(xpath="//a[text()='Accessories']")
	private WebElement AccessoriesLnk;
	@FindBy(xpath="//a[text()='Tableware']")
	private WebElement TablewareLnk;
	@FindBy(xpath="//a[text()='About']")
	private WebElement AboutLnk;
	@FindBy(xpath="//a[text()='Newsletter']")
	private WebElement NewsletterLnk;
	@FindBy(xpath="//a[@aria-label='Cart']")
	private WebElement CartLnk;
	@FindBy(xpath="//a[text()='Gift Card']")
	private WebElement GiftCardLnk;
	@FindBy(xpath="//a[text()='Journal']")
	private WebElement JournalLnk;
	@FindBy(xpath="//p[text()='Atina Glassware']")
	private WebElement AtinaGlasswareLnk;
	@FindBy(xpath="//a[text()='Salt & Pepper Grinders']")
	private WebElement SaltPepperGrindersLnk;
	@FindBy(xpath="//a[text()='Pablo Candles']")
	private WebElement PabloCandlesLnk;
	@FindBy(xpath="//a[text()='Shipping & Returns']']")
	private WebElement ShippingReturnLnk;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSearchLnk() {
		return SearchLnk;
	}
	public WebElement getShopLnk() {
		return ShopLnk;
	}
	public WebElement getFragranceLnk() {
		return FragranceLnk;
	}
	public WebElement getAccessoriesLnk() {
		return AccessoriesLnk;
	}
	public WebElement getTablewareLnk() {
		return TablewareLnk;
	}
	public WebElement getAboutLnk() {
		return AboutLnk;
	}
	public WebElement getNewsletterLnk() {
		return NewsletterLnk;
	}
	public WebElement getCartLnk() {
		return CartLnk;
	}
	public WebElement getGiftCardLnk() {
		return GiftCardLnk;
	}
	public WebElement getJournalLnk() {
		return JournalLnk;
	}
	public WebElement getAtinaGlasswareLnk() {
		return AtinaGlasswareLnk;
	}
	public WebElement getSaltPepperGrindersLnk() {
		return SaltPepperGrindersLnk;
	}
	public WebElement getPabloCandlesLnk() {
		return PabloCandlesLnk;
	}
	public WebElement getShippingReturnLnk() {
		return ShippingReturnLnk;
	} 
	public void closePopUp() {
		String xpath="//button[@title='Close']";
		ExplicitWaitForElementByLocator(driver,xpath);
	}
	
}
