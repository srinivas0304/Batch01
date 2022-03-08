package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Surrounding_class {
	public static void main(String[] args) throws InterruptedException {
		String s1="Nokia 105 SS 2021";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Nokia");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		String s=driver.findElement(By.xpath("//div[text()='"+s1+"']/../../div[2]/div/div/div[1]")).getText();
		System.out.println(s);
	}
}
