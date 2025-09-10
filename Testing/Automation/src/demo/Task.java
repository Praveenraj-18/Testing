package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		String s = "https://mail.google.com";
		wd.get(s);
		wd.manage().window().minimize();
		String title = wd.getTitle();
		if(title.equals("Welcome")) {
			System.out.println("Title passed");
		}
		else {
			System.out.println("Title Failed");
		}
		System.out.println(wd.getCurrentUrl());
		Thread.sleep(3000);
		wd.close();
	}

}
