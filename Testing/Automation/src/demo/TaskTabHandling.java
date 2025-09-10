package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTabHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver wb = new ChromeDriver();
		String ap= wb.getWindowHandle();
		wb.get("https://www.apple.com/in/");
		wb.manage().window().maximize();
		
		
		wb.switchTo().newWindow(WindowType.TAB);
		
		String sam= wb.getWindowHandle();
		wb.get("https://www.samsung.com/in/?srsltid=AfmBOoo2UH_eGCb_DZAq8pJgUIZyghff-r-1zkUZ6EfXKgJtesZjnq2F");
		
		wb.switchTo().newWindow(WindowType.TAB);
		
		String mi= wb.getWindowHandle();
		wb.get("https://www.mi.com/in/?srsltid=AfmBOorabhK0OnwskAI0pLpeWz1VcqlmgJ44T-ZIiNS61DFVnph6s81A");
		
		wb.switchTo().window(ap);
		Thread.sleep(2000);
		wb.switchTo().window(sam);
		Thread.sleep(2000);
		wb.switchTo().window(mi);
		Thread.sleep(2000);
		wb.switchTo().window(sam);
		Thread.sleep(2000);
		wb.switchTo().window(ap);
		Thread.sleep(2000);
		wb.switchTo().window(mi);
		Thread.sleep(2000);
		
		wb.close();
		wb.quit();
		
		
	}

}
