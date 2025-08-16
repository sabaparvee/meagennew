package Fragrance;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FragranceScritTesting {

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
        WebElement closeBtn = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Close']"))
        );
        closeBtn.click();

        // Go to Fragrance page
        driver.findElement(By.xpath("//a[text()='Fragrance']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Price']")).click();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);

        WebElement toSlider = driver.findElement(By.xpath("//div[@class='price-range__range-group range-group']//input[@aria-label='To price']"));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", toSlider);
        Thread.sleep(500); // Small pause for smooth scroll

        actions.clickAndHold(toSlider).moveByOffset(-30,0).release().build().perform();

//        js.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0,8);", ele);

/*
        // Scroll to sort-by element and click
        WebElement sortBy = driver.findElement(By.xpath("//span[@id='sort-by-selected-value']"));
        js.executeScript("arguments[0].scrollIntoView(true);", sortBy);

        wait.until(ExpectedConditions.elementToBeClickable(sortBy));
        js.executeScript("arguments[0].click();", sortBy);

        // Click "Price, high to low"
        By priceHighToLow = By.xpath("//span[contains(@class,'popover__choice-label') and text()='Price, high to low']");
        wait.until(ExpectedConditions.elementToBeClickable(priceHighToLow)).click();

        // 🔹 Re-locate element after sorting (prevents stale element)
        By productLocator = By.xpath("//div[contains(@class,'product-item__info  ')]//a[contains(@class,'product-item-meta__title') and contains(text(),'Alchemist Diffuser | Sweet Basil & Cucumber')]");
        WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(productLocator));

        js.executeScript("arguments[0].scrollIntoView(true);", ele);
        wait.until(ExpectedConditions.elementToBeClickable(productLocator)).click();

        // Add more actions here...*/
    }
}
