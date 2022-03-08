package Title;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navig {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(300);
		Navigation nav=driver.navigate();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		nav.refresh();
	}
		
}
