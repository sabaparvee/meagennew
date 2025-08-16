package com.maegen.generic.WebDriverUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void ImplicitwaitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void Maximizewindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void Minimizewindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	public void FullScreenwindow(WebDriver driver) {
		driver.manage().window().fullscreen();
	}
	public void ExplicitWaitForElementPresent(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void ExplicitWaitForElementClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	public WebElement ExplicitWaitForElementClickableReturn(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		 WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(element));
		 return ele;

	}
	public WebElement ExplicitWaitForElementClickableBY(WebDriver driver,By sortOption) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(sortOption));
		return ele;

	}
	public WebElement ExplicitWaitpresenceOfElementLocated(WebDriver driver,By element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(element));
		return ele;

	}
	
	public void ExplicitWaitForElementByLocator(WebDriver driver,String path) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 WebElement closeBtn = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath(path))
	        );
	        closeBtn.click();
	}
	public void FluentWaitForElementPresent(WebDriver driver,WebElement element) {
		FluentWait<WebDriver> wait =new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));	
	}
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String nameID) {
		driver.switchTo().frame(nameID);
	}
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchtoAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void switchtoAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public void switchtoAlertAndSendKeys(WebDriver driver,String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	public void switchtoAlertAndgetText(WebDriver driver) {
		driver.switchTo().alert().getText();
	}	
	public void select(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void select(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void select(String value,WebElement element) {
		Select s=new Select(element);
		s.selectByVisibleText(value);
	}
	public List<WebElement> selectOption(WebElement element) {
		Select s=new Select(element);
		List<WebElement> option = s.getOptions();
		return option;
	}
	public WebElement selectFirst(WebElement element) {
		Select s=new Select(element);
		WebElement option = s.getFirstSelectedOption();
		return option;
	}
	public void deselect(WebElement element,int index) {
		Select s=new Select(element);
		s.deselectByIndex(index);
	}
	public void deselect(WebElement element,String value) {
		Select s=new Select(element);
		s.deselectByValue(value);
	}
	public void deselect(String value,WebElement element) {
		Select s=new Select(element);
		s.deselectByVisibleText(value);
	}

	public void deselectALL(WebElement element) {
		Select s=new Select(element);
		s.deselectAll();
	}
	public void moveToElement(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();
	}
	public void rightClick(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}
	public void clickAndHold(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.clickAndHold(element).perform();
	}
	public void clickAndHold(WebDriver driver,WebElement source,WebElement target) {
		Actions action=new Actions(driver);
		action.dragAndDrop(source,target).perform();
	}
	public void switchTowindowWithUrl(WebDriver driver,String partialUrl) {
		Set<String> ALLID = driver.getWindowHandles();
		for(String var:ALLID) {
			driver.switchTo().window(var);
			String actUrl=driver.getCurrentUrl();
			if(actUrl.contains(partialUrl)) {
				break;
			}
		}
	}
	public void switchTowindowWithTitle(WebDriver driver,String Title) {
		Set<String> ALLID = driver.getWindowHandles();
		for(String var:ALLID) {
			driver.switchTo().window(var);
			String actUrl=driver.getTitle();
			if(actUrl.contains(Title)) {
				break;
			}
		}
	}
	public void TakeScreenShot(WebDriver driver,String screenshotname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\sabap\\eclipse-workspace\\AdvanceProject\\Screenshot"+screenshotname+".png");
		FileHandler.copy(src, dest);
	}
	public void closeWindow(WebDriver driver) {
		driver.close();
	}
	public void quitWindow(WebDriver driver) {
		driver.quit();
	}
	public void JavaScriptExecutorClick(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	public void JavaScriptExecutorValue(WebDriver driver,WebElement element,String text) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value="+text+";", element);
	}
	public void JavaScriptExecutorScrollIntoView(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void JavaScriptExecutorScrollBY(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0,-200);", element);

	}
}
