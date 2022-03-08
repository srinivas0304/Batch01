package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partil_Link {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/addla/GES9/html/Links.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		Navigation nav=driver.navigate();
		nav.back();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Goo")).click();
	}
		

}
