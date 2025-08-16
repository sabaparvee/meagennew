package com.maegen.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesHoverPage {
	WebDriver driver=null;
	public AccessoriesHoverPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Incense Holders']")
	private WebElement IncenseHoldersLnk;
	@FindBy(xpath="//a[text()='Matches']")
	private WebElement MatchesLnk;
	@FindBy(xpath="//a[text()='Taper Candles']")
	private WebElement TaperCandlesLnk;
	@FindBy(xpath="//a[text()='Taper Holders']")
	private WebElement TaperHoldersLnk;
	@FindBy(xpath="//a[text()='Shop All']")
	private WebElement ShopAllLnk;
	@FindBy(xpath="//p[text()='Bubble Matches']")
	private WebElement BubbleMatchesLnk;
	@FindBy(xpath="//p[text()='Stacks']")
	private WebElement StacksLnk;
	@FindBy(xpath="//p[text()='Lilo']")
	private WebElement LiloLnk;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getIncenseHoldersLnk() {
		return IncenseHoldersLnk;
	}
	public WebElement getMatchesLnk() {
		return MatchesLnk;
	}
	public WebElement getTaperCandlesLnk() {
		return TaperCandlesLnk;
	}
	public WebElement getTaperHoldersLnk() {
		return TaperHoldersLnk;
	}
	public WebElement getShopAllLnk() {
		return ShopAllLnk;
	}
	public WebElement getBubbleMatchesLnk() {
		return BubbleMatchesLnk;
	}
	public WebElement getStacksLnk() {
		return StacksLnk;
	}
	public WebElement getLiloLnk() {
		return LiloLnk;
	}
	
	

}
