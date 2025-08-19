package com.maegen.listeners;


import java.util.Date;

//       import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maegen.baseTest.BaseClass;
import com.maegen.generic.WebDriverUtility.UtilityClassObject;

//import sun.util.calendar.BaseCalendar.Date;

public class ListImp implements ITestListener,ISuiteListener{
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	@Override
	public void onStart(ISuite suite) {
		System.out.println("Report Config");
		spark=new ExtentSparkReporter("./AdvancedReporter/report.html");
		spark.config().setDocumentTitle("Maegen Report");
		spark.config().setReportName("New Report");
		spark.config().setTheme(Theme.DARK);
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Os", "window");
		report.setSystemInfo("Browser", "chrome");
		
		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Report backup");
		report.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("================"+result.getMethod().getMethodName()+"============================");
		test=report.createTest(result.getMethod().getMethodName());
		//test.log(Status.INFO, result.getMethod().getMethodName()+"==>started==");
		UtilityClassObject.setTest(test);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("================"+result.getMethod().getMethodName()+"============================");
		test.log(Status.PASS,result.getMethod().getMethodName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName=result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot)UtilityClassObject.getDriver();
		String srcfile = ts.getScreenshotAs(OutputType.BASE64);
		String time=new Date().toString().replace("","_").replace(":","_");
		test.addScreenCaptureFromBase64String(srcfile,testName+"_"+time);
		test.log(Status.FAIL, result.getMethod().getMethodName());
		/*File destfile =new File("./Screenshot/"+testName+new Date().toString().replace(" ","_").replace(":", "_")+".png");
		try {
			FileHandler.copy(srcfile, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	
}
