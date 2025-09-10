package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomateWebPage {
  @Test
  public void login() throws Exception {
	  WebDriver wd = new ChromeDriver();
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wd.manage().window().maximize();
	  
	  Thread.sleep(4000);
	  WebElement un = wd.findElement(By.name("username"));
	  un.sendKeys("Admin");
	  
	  Thread.sleep(4000);
	  WebElement pwd = wd.findElement(By.name("password"));
	  pwd.sendKeys("admin123");
	  
	  Thread.sleep(4000);
	  WebElement login = wd.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
	  
	  
	  
	  wd.close();
  }
}
