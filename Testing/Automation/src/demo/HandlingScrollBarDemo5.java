package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarDemo5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Register.html");
		wd.manage().window().maximize();
		
		WebElement submit = wd.findElement(By.id("submitbtn"));
		
		JavascriptExecutor je = (JavascriptExecutor)wd;
		je.executeScript("arguments[0].scrollIntoView();",submit);
//		je.executeScript("scroll(0,450)"); // it goes down page
//		Thread.sleep(2000);
//		je.executeScript("scroll(0,-150)");// it goes up page
		
	}

}
