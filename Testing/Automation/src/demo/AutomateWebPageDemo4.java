package demo;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
 
public class AutomateWebPageDemo4 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demo.automationtesting.in/Register.html");
		wd.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Deva");
		wd.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Super Star");
		wd.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Chennai - 600097");
		wd.findElement(By.xpath("//input[@type='email']")).sendKeys("Shivajirao12@gmail.com");
		wd.findElement(By.xpath("//input[@type='tel']")).sendKeys("63808132677");
		wd.findElement(By.xpath("//input[@value='Male']")).click();
		wd.findElement(By.xpath("//input[@value='Cricket']")).click();
		wd.findElement(By.xpath("//input[@value='Movies']")).click();
		
		wd.findElement(By.xpath("//div[@id='msdd']")).click();
		wd.findElement(By.xpath("//a[contains(text() , 'Arabic')]")).click();
		
		Select s = new Select(wd.findElement(By.id("Skills")));
		s.selectByVisibleText("C");
		
		Select year = new Select(wd.findElement(By.id("yearbox")));
		year.selectByValue("1956");
		Select month = new Select(wd.findElement(By.xpath("//select[@ng-model='monthbox']")));
		month.selectByVisibleText("December");
		Select date = new Select(wd.findElement(By.id("daybox")));
		date.selectByValue("12");
		
		
		
	}
 
}