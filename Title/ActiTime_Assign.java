package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Assign {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains (text(),'Login ')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Add New')]")).click();
	}
}
