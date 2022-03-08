package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Surrounding_Class2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Iphone");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		/*String s=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (White, 128 GB)']/../../div[2]/div/div/div")).getText();
		System.out.println(s);*/
		String s=driver.findElement(By.xpath("//span[text()='APPLE iPhone 12 (White, 128 GB)']/../../../div[4]/div/div/div")).getText();
		System.out.println(s);
	}

}
