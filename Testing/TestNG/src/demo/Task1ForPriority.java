package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Task1ForPriority {
	WebDriver wd;
  @Test(priority = 1)
  public void valid() throws Exception {
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  WebElement un = wd.findElement(By.name("username"));
	  un.sendKeys("Admin");
	  
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  WebElement pwd = wd.findElement(By.name("password"));
	  pwd.sendKeys("admin123");
	  
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  WebElement login = wd.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
	  Thread.sleep(4000);  }
  @Test
  public void invalid() {
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  WebElement un = wd.findElement(By.name("username"));
	  un.sendKeys("admin");
	  
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  WebElement pwd = wd.findElement(By.name("password"));
	  pwd.sendKeys("Admin123");
	  
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  WebElement login = wd.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  wd = new ChromeDriver();
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wd.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
		  wd.close();
  }

}
