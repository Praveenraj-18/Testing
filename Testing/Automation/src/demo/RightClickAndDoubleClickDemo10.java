package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAndDoubleClickDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		WebElement user = wd.findElement(By.id("email"));
		Actions act = new Actions(wd);
		act.moveToElement(user).click().build().perform();
		
		act.contextClick(user).build().perform(); // it is right click
		user.sendKeys("ksnvknv");
		act.doubleClick(user).build().perform(); // double click the element
		}

}
