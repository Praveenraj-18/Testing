package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingDemo6 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Alerts.html");
		wd.manage().window().maximize();
		
//		WebElement button= wd.findElement(By.xpath("//button[@onclick='alertbox()']"));
//		button.click();
//		
//		Alert alert = wd.switchTo().alert();
//		Thread.sleep(2000);
//		System.out.println(alert.getText());
//		alert.accept();
		
		
		WebElement button= wd.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		button.click();
		
		WebElement button1= wd.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		button1.click();
		
		Alert alert = wd.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();		
	}

}
