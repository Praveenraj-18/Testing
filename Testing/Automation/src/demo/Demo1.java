package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.get("https://ess.changepond.com/#/login");
		Thread.sleep(2000);
		wd.get("https://www.changepond.com/");
		wd.navigate().back();
		Thread.sleep(2000);
		wd.navigate().forward();
		wd.navigate().to("https://www.atlassian.com/try/cloud/signup?bundle=jira-software&edition=free&skipBundles=true");
		wd.navigate().refresh();
		System.out.println(wd.manage().window().getSize());
	}

}
