package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver wd = new ChromeDriver();//to open chrome browser.
		String s = "https://www.selenium.dev/downloads/";
		WebDriver wd = new FirefoxDriver();
		WebDriver wd1 = new FirefoxDriver();
		wd.get(s);
		wd1.get("https://www.youtube.com/");
//		wd.manage().window().maximize();
//		Thread.sleep(3000);
		//wd.manage().window().minimize();
		//wd.close();
//		System.out.println(wd.getTitle());
//		System.out.println(wd.getCurrentUrl());
//		System.out.println(wd.getPageSource());
	}

}
