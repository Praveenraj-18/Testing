package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
 
public class parameterazationExampl {
	WebDriver wd;
  @Test
  @Parameters({"us","pwd"})
  public void login(String us,String pwd) throws InterruptedException {
	  
	  WebElement user = wd.findElement(By.id("idToken1"));
	  Thread.sleep(2000);
	  user.sendKeys(us);
	  WebElement pass = wd.findElement(By.id("idToken2"));
	  Thread.sleep(2000);
	  pass.sendKeys(pwd);
	  WebElement login = wd.findElement(By.id("loginButton_0"));
	  Thread.sleep(2000);
	  login.click();
  }
  @BeforeTest
  public void beforeTest() {
	  wd = new ChromeDriver();
	  wd.get("https://accounts.saucelabs.com/am/XUI/#login/");
	  wd.manage().window().maximize();
  }
 
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  wd.close();
  }
 
}