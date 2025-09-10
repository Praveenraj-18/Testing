package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		WebElement user = wd.findElement(By.id("email"));
		
	//	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		user.sendKeys("kabsb");
		WebDriverWait w = new WebDriverWait(wd, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOf(user));
		user.sendKeys(" nnhfhd");
	}

}
