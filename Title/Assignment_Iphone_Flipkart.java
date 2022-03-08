package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Iphone_Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Iphone");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 12 (Green, 128 GB)')]")).click();
		String s=driver.findElement(By.xpath("//span[contains(text(),'11,528 Ratings')]")).getText();
		System.out.println(s);
		}
}
