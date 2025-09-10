package demo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class TestTrackDemo {
  @Test(dataProvider = "dp")
  public void login(String un, String pwd) throws Exception {
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

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "testuser", "password123" },
      new Object[] { "testuser", "password12" },
    };
  }
}
