package com.maegen.objectrepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maegen.generic.WebDriverUtility.WebDriverUtility;

public class PayPage extends WebDriverUtility {
	WebDriver driver = null;

	public PayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailEdt;
	@FindBy(xpath = "//select[@name='countryCode']")
	private WebElement countryEdt;
	@FindBy(xpath = "//input[@placeholder='First name']")
	private WebElement FirstNameEdt;
	@FindBy(xpath = "//input[@placeholder='Last name']")
	private WebElement LastnameEdt;
	@FindBy(xpath = "//input[@placeholder='Address']")
	private WebElement AddressEdt;
	@FindBy(xpath = "//input[@placeholder='Apartment, suite, etc. (optional)']")
	private WebElement ApartmentEdt;
	@FindBy(xpath = "//input[@placeholder='City']")
	private WebElement CityEdt;
	@FindBy(xpath = "//select[@id='Select1']")
	private WebElement StateEdt;
	@FindBy(xpath = "//input[@name='postalCode']")
	private WebElement PostcodeEdt;
	@FindBy(xpath = "//input[@placeholder='Phone']")
	private WebElement PhoneEdt;

	// card Details
	@FindBy(xpath = "//iframe[@title='Field container for: Card number']")
	private WebElement frameid;
	@FindBy(xpath = "//input[@placeholder='Card number']")
	private WebElement CardnumberEdt;
	@FindBy(xpath = "(//input[@id='expiry'])[2]")
	private WebElement expiryEdt;
	@FindBy(xpath = "//input[@placeholder='Security code']")
	private WebElement securityEdt;
	@FindBy(xpath = "//input[@placeholder='Name on card']")
	private WebElement NameoncardEdt;
	@FindBy(xpath = "//input[@placeholder='Mobile phone number']")
	private WebElement MobileNumberEdt;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailEdt() {
		return emailEdt;
	}

	public void setEmailEdt(WebElement emailEdt) {
		this.emailEdt = emailEdt;
	}

	public WebElement getCountryEdt() {
		return countryEdt;
	}

	public WebElement getFirstNameEdt() {
		return FirstNameEdt;
	}

	public WebElement getLastnameEdt() {
		return LastnameEdt;
	}

	public WebElement getAddressEdt() {
		return AddressEdt;
	}

	public WebElement getApartmentEdt() {
		return ApartmentEdt;
	}

	public WebElement getCityEdt() {
		return CityEdt;
	}

	public WebElement getStateEdt() {
		return StateEdt;
	}

	public WebElement getPostcodeEdt() {
		return PostcodeEdt;
	}

	public WebElement getPhoneEdt() {
		return PhoneEdt;
	}

	public WebElement getFrameid() {
		return frameid;
	}

	public WebElement getCardNumberEdt() {
		return CardnumberEdt;
	}

	public WebElement getExpiryEdt() {
		return expiryEdt;
	}

	public WebElement getSecurityEdt() {
		return securityEdt;
	}

	public WebElement getNameoncardEdt() {
		return NameoncardEdt;
	}

	public WebElement getMobileNumberEdt() {
		return MobileNumberEdt;
	}
	
	public void Address(String email, String country, String first, String last, String address, String apartment,
			String city, String state, String pincode, String phone) {
		getEmailEdt().sendKeys(email);
		getCountryEdt().sendKeys(country);
		getFirstNameEdt().sendKeys(first);
		getLastnameEdt().sendKeys(last);
		getAddressEdt().sendKeys(address);
		JavaScriptExecutorClick(driver, getApartmentEdt());
		getApartmentEdt().sendKeys(apartment);
		JavaScriptExecutorClick(driver, getCityEdt());
		getCityEdt().sendKeys(city);
		JavaScriptExecutorClick(driver, getStateEdt());
		getStateEdt().sendKeys(state);
		getPostcodeEdt().sendKeys(pincode);
		getPhoneEdt().sendKeys(phone);
		//WebElement shadow_host = driver.findElement(By.xpath("//div[@data-nametag='shop-portal-provider']"));
		//SearchContext shadow_root = shadow_host.getShadowRoot();
		//shadow_root.findElement(By.cssSelector("button[@aria-label='Close']")).click();
	}

	public void CardDetail(String CardNumber, String expireDate, String security, String NameonCard,
			String phonenumber) {
		switchToFrame(driver, getFrameid());
		getCardNumberEdt().sendKeys(CardNumber);
		//WebElement ele = driver.findElement(RelativeLocator.with(By.xpath("//input[@id='number']")).above(driver.findElement(By.xpath("//input[@name='expiry']"))));
		JavaScriptExecutorClick(driver, getExpiryEdt());
		//ele.sendKeys(expireDate);
		getExpiryEdt().clear();
		getExpiryEdt().sendKeys(expireDate);
		JavaScriptExecutorClick(driver, getSecurityEdt());
		getSecurityEdt().sendKeys(security);
		JavaScriptExecutorClick(driver, getNameoncardEdt());
		getNameoncardEdt().sendKeys(NameonCard);
		JavaScriptExecutorClick(driver, getMobileNumberEdt());
		getMobileNumberEdt().sendKeys(phonenumber);

	}
	public void CardDetail2(String CardNumber, String expireDate, String security, String NameonCard,
			String phonenumber) {
		switchToFrame(driver, getFrameid());
		moveToElement(driver,getCardNumberEdt());
		getCardNumberEdt().sendKeys(CardNumber);
		getCardNumberEdt().sendKeys(Keys.TAB);
		getExpiryEdt().sendKeys(expireDate);
		getExpiryEdt().sendKeys(Keys.TAB);
		getSecurityEdt().sendKeys(security);
		getSecurityEdt().sendKeys(Keys.TAB);
		getNameoncardEdt().sendKeys(NameonCard);
		getNameoncardEdt().sendKeys(Keys.TAB);
		getMobileNumberEdt().sendKeys(phonenumber);
		getMobileNumberEdt().sendKeys(Keys.TAB);


	}
}
