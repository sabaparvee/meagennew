package com.maegen.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TablewareHoverPage {
	WebDriver driver=null;
	public TablewareHoverPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Incense Holders']")
	private WebElement IncenseLnk;
	@FindBy(xpath="//a[text()='Glassware']")
	private WebElement GlasswareLnk;
	@FindBy(xpath="//a[text()='Napkins']")
	private WebElement NapkinsLnk;
	@FindBy(xpath="//a[text()='Plates']")
	private WebElement PlatesLnk;
	@FindBy(xpath="//a[text()='Salt & Pepper Grinder']")
	private WebElement SaltpepperLnk;
	@FindBy(xpath="//a[text()='Salad Servers']")
	private WebElement SaladserverLnk;
	@FindBy(xpath="//a[text()='Shop All']")
	private WebElement ShopAllLnk;
	@FindBy(xpath="//p[text()='Atina Glassware']")
	private WebElement AtinaGlasswareLnk;
	@FindBy(xpath="//p[text()='Salt & Pepper Grinders']")
	private WebElement SaltPepperLnk;
	@FindBy(xpath="//p[text()='Embroided']")
	private WebElement EmbroidedLnk;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCoastersLnk() {
		return IncenseLnk;
	}
	public WebElement getGlasswareLnk() {
		return GlasswareLnk;
	}
	public WebElement getNapkinsLnk() {
		return NapkinsLnk;
	}
	public WebElement getPlatesLnk() {
		return PlatesLnk;
	}
	public WebElement getSaltpepperLnk() {
		return SaltpepperLnk;
	}
	public WebElement getSaladserverLnk() {
		return SaladserverLnk;
	}
	public WebElement getShopAllLnk() {
		return ShopAllLnk;
	}
	public WebElement getAtinaGlasswareLnk() {
		return AtinaGlasswareLnk;
	}
	public WebElement getSaltPepperLnk() {
		return SaltPepperLnk;
	}
	public WebElement getEmbroidedLnk() {
		return EmbroidedLnk;
	}
	

}
