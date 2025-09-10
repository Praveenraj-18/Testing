package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParellelTesting {
	WebDriver wd;
  @Test
  public void loginchrome() {
	  wd = new ChromeDriver();
	  wd.get("https://testtrack.org/login-demo");
	  wd.manage().window().maximize();
	  
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  WebElement username = wd.findElement(By.id("username"));
	  username.sendKeys("testuser");
	  
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  WebElement password = wd.findElement(By.id("password"));
	  password.sendKeys("password123");
	  
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  WebElement login = wd.findElement(By.id("login-submit"));
	  login.click();
  }
  @Test
  public void loginfirefox() {
	  wd = new FirefoxDriver();
	  wd.get("https://testtrack.org/login-demo");
	  wd.manage().window().maximize();
	  
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  WebElement username = wd.findElement(By.id("username"));
	  username.sendKeys("testuser");
	  
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  WebElement password = wd.findElement(By.id("password"));
	  password.sendKeys("password123");
	  
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  WebElement login = wd.findElement(By.id("login-submit"));
	  login.click();
  }
}
