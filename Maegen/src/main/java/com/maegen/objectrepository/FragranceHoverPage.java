package com.maegen.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FragranceHoverPage {
	WebDriver driver=null;
	public FragranceHoverPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Diffusers']")
	private WebElement DiffusersLnk;
	@FindBy(xpath="//a[text()='Incense Sticks']")
	private WebElement IncenseLnk;
	@FindBy(xpath="//a[text()='Room Sprays']")
	private WebElement RoomSpraysLnk;
	@FindBy(xpath="//a[text()='Scented Candles']")
	private WebElement ScentedCandlesLnk;
	@FindBy(xpath="//a[text()='Shop All']")
	private WebElement ShopAllLnk;
	@FindBy(xpath="//p[text()='Milk']")
	private WebElement MilkLnk;
	@FindBy(xpath="//p[text()='Atina Candles']")
	private WebElement AtinaCandlesLnk;
	@FindBy(xpath="//p[text()='Pablo Pot']")
	private WebElement PabloPotLnk;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getDiffusersLnk() {
		return DiffusersLnk;
	}
	public WebElement getIncenseLnk() {
		return IncenseLnk;
	}
	public WebElement getRoomSpraysLnk() {
		return RoomSpraysLnk;
	}
	public WebElement getScentedCandlesLnk() {
		return ScentedCandlesLnk;
	}
	public WebElement getShopAllLnk() {
		return ShopAllLnk;
	}
	public WebElement getMilkLnk() {
		return MilkLnk;
	}
	public WebElement getAtinaCandlesLnk() {
		return AtinaCandlesLnk;
	}
	public WebElement getPabloPotLnk() {
		return PabloPotLnk;
	}
	
}
