package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cSSlogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		  driver.manage().window().maximize();
		  driver.findElement(By.cssSelector("input[class='textField']")).sendKeys(
		  "admin");
		  driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		  driver.findElement(By.id("loginButton")).click();
		 
}
}
