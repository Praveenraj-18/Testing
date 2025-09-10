package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class CrossBrowserTestingDemo {
  @Test
  @Parameters({"browser","un","pwd"})
  public void input(String browser,String un, String pwd) throws Exception {
	  if (browser.equalsIgnoreCase("chrome")) 
	  {
		  WebDriver wd = new ChromeDriver();
		  wd.get("https://testtrack.org/login-demo");
		  wd.manage().window().maximize();
		  
		  Thread.sleep(4000);
		  WebElement username = wd.findElement(By.id("username"));
		  username.sendKeys(un);
		  
		  Thread.sleep(4000);
		  WebElement password = wd.findElement(By.id("password"));
		  password.sendKeys(pwd);
		  
		  Thread.sleep(4000);
		  WebElement login = wd.findElement(By.id("login-submit"));
		  login.click();
	  }
	  else if (browser.equalsIgnoreCase("firefox")) 
	  {
		  WebDriver wd = new FirefoxDriver(); 
		  wd.get("https://testtrack.org/login-demo");
		  wd.manage().window().maximize();
		  
		  Thread.sleep(4000);
		  WebElement username = wd.findElement(By.id("username"));
		  username.sendKeys(un);
		  
		  Thread.sleep(4000);
		  WebElement password = wd.findElement(By.id("password"));
		  password.sendKeys(pwd);
		  
		  Thread.sleep(4000);
		  WebElement login = wd.findElement(By.id("login-submit"));
		  login.click();
		  }
	  else
	  {	
		  throw new Exception("Browser not found");
	  }
}
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
