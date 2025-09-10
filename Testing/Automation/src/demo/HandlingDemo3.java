package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver w = new ChromeDriver();
		w.get("https://www.saucedemo.com/v1/");
		w.findElement(By.id("user-name")).sendKeys("standard_user");
		w.findElement(By.name("password")).sendKeys("secret_sauce");
		w.findElement(By.id("login-button")).click();
		
	}

}
