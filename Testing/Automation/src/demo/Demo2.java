package demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver w = new ChromeDriver();
		w.get("https://accounts.saucelabs.com/am/XUI/?region=us-west-1&next=/api-testing/#login");
		Dimension d = new Dimension(1080, 720);
		w.manage().window().setSize(d);
	}

}
