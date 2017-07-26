package POCS;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test2 {

  WebDriver driver;	
  ExtentReports extent ;
  ExtentTest test;
	
  @BeforeClass
  public void beforeCalss() throws InterruptedException{
	  /*System.setProperty("webdriver.chrome.driver", "/home/pradeep/AutoTestingSoftwares/browser drivers/chromedriver");
      driver = new ChromeDriver();*/
	  System.setProperty("webdriver.firefox.marionette","/home/pradeep/AutoTestingSoftwares/browser drivers/geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.get("https://sureifylife.com/");
	  extent = ExtentManager.getExtentInstance();	
  }
  
  @SuppressWarnings("unused")
  @Test
  public void checkUrl() throws InterruptedException {
	  Thread.sleep(3000);
	  test = extent.startTest("Check Url Start");
	  test.log(LogStatus.INFO, "Url : https://sureifylife.com/");
	  Assert.assertEquals("https://sureifylife.com/", driver.getCurrentUrl());
	  test.log(LogStatus.PASS, "Url matched");
	  extent.endTest(test);
	 
  }
  
  @SuppressWarnings("unused")
  @Test
  public void clickQuote() throws InterruptedException{
	  test = extent.startTest("Click quote button");
	  test.log(LogStatus.INFO, "Quote button");
	  driver.findElement(By.id("header_get a quote4")).click();
	  Thread.sleep(5000);
	  WebElement ele = driver.findElement(By.xpath("//a[text() = 'Basic Info']"));
	  if(ele.isDisplayed()){
		  test.log(LogStatus.PASS, "Moved to getquote page");
	  }else{
		  test.log(LogStatus.FAIL, "Not Moved to getquote page");
	  }
	  
	  test.log(LogStatus.INFO, "Check boolean value");
	  boolean val = false;
	  if(val == true){
		  test.log(LogStatus.PASS, "Pass");
	  }else{
		  test.log(LogStatus.FAIL, "Fail");
	  }
	  
	  extent.endTest(test);
  }
  
  @Test
  public void failTest(){
	  test = extent.startTest("Fail test");
	  boolean val = false;
	  if(val == true){
		  test.log(LogStatus.PASS, "Fail test passed");
	  }else{
		  test.log(LogStatus.FAIL, "Fail test failed");
	  }
	  
	  extent.endTest(test);
  }
 
  @AfterClass
  public void tearDown(){
	  extent.flush();
	  
  }
  
}
