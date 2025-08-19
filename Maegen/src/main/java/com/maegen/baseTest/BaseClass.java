package com.maegen.baseTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.maegen.generic.WebDriverUtility.JavaUtility;
import com.maegen.generic.WebDriverUtility.UtilityClassObject;
import com.maegen.generic.WebDriverUtility.WebDriverUtility;
import com.maegen.generic.databaseUtility.DatabaseUtility;
import com.maegen.generic.fileUtility.ExcelUtility;
import com.maegen.generic.fileUtility.FileUtility;

@Listeners(com.maegen.listeners.ListImp.class)
public class BaseClass {
	public FileUtility flib=new FileUtility();
	public ExcelUtility elib	=new ExcelUtility();
	public JavaUtility jlib=new JavaUtility();
	public WebDriverUtility wlib=new WebDriverUtility();
	public DatabaseUtility dlib=new DatabaseUtility();
	public WebDriver driver=null;
	public static WebDriver sdriver=null;
	@BeforeSuite
	public void configBS() {
		System.out.println("===connect to DB,Report config===");
		dlib.getConn();
	}
	
	@BeforeMethod
	public void configBM() throws IOException {
		System.out.println("=============login===================");
		System.out.println("=============Launch the browser======================");
		String	BROWSER=flib.getDataFromPropertiesFile("browser");
			//String BROWSER=brow;
		String URL=flib.getDataFromPropertiesFile("url");
		System.out.println("B:"+BROWSER);
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new EdgeDriver();
		}
		sdriver=driver;
		UtilityClassObject.setDriver(driver);
		driver.get(URL);
		driver.manage().window().maximize();
		wlib.ImplicitwaitForPageToLoad(driver);
	}
	@AfterMethod
	public void configAM() {
		System.out.println("============================logout===================");
		driver.quit();

		
	}
	
	@AfterSuite
	public void configAS() {
		System.out.println("===connect to DB,Report config===");
		dlib.closedbConnection();
	}
}
