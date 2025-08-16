package Fragrance;



	import java.time.Duration;
	import org.openqa.selenium.*;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.edge.EdgeOptions;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Fragrance2 {

	    public static void main(String[] args) throws InterruptedException {

	        // Disable notifications before creating driver
	        EdgeOptions opt = new EdgeOptions();
	        opt.addArguments("--disable-notifications");
	        WebDriver driver = new EdgeDriver(opt);

	        driver.manage().window().maximize();
	        driver.get("https://maegenhomeware.co.uk/");

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Close popup if visible
	        try {
	            WebElement closeBtn = wait.until(
	                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Close']"))
	            );
	            closeBtn.click();
	        } catch (TimeoutException e) {
	            System.out.println("Popup not found, continuing...");
	        }

	        // Go to Fragrance page
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Fragrance']"))).click();
	        Thread.sleep(3000);

	        // Click Price filter
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Price']"))).click();
	        Thread.sleep(2000);

	        // Locate slider and scroll into view
	        WebElement toSlider = wait.until(ExpectedConditions.presenceOfElementLocated(
	                By.xpath("//div[@class='price-range__range-group range-group']//input[@aria-label='From price']")
	        ));
	        js.executeScript("arguments[0].value = 25;", toSlider);
	       
	    }
	}


