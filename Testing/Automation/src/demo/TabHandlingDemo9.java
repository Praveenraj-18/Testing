package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandlingDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wb = new ChromeDriver();
		wb.get("https://www.apple.com/in/");
		wb.manage().window().maximize();
		String Fw= wb.getWindowHandle();
		
		wb.switchTo().newWindow(WindowType.TAB);
		String Sw= wb.getWindowHandle();
		wb.get("https://www.samsung.com/in/?srsltid=AfmBOoo2UH_eGCb_DZAq8pJgUIZyghff-r-1zkUZ6EfXKgJtesZjnq2F");
		//navigate.back()- this wont work here because we have created separate tabs.
		wb.switchTo().window(Fw);
	}

}
