package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Static.html");
		wd.manage().window().maximize();
		
		Actions action = new Actions(wd);
		
		WebElement drag = wd.findElement(By.id("angular"));
		WebElement drop = wd.findElement(By.id("droparea"));
		action.dragAndDrop(drag, drop).build().perform();
			
		WebElement drag1 = wd.findElement(By.id("mongo"));
		WebElement drop1 = wd.findElement(By.id("droparea"));
		action.dragAndDrop(drag1, drop1).build().perform();
		action.dragAndDrop(drag, drop).build().perform();
		
	}

}
