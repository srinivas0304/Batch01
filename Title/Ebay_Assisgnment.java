package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_Assisgnment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("gh-ac")).sendKeys("Iphone");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		String s=driver.findElement(By.xpath("//h3[text()='Apple iPhone 7 32GB - Black Factory Unlocked Smartphone']")).getText();
		System.out.println(s);
		String s1=driver.findElement(By.xpath("//h3[text()='Apple iPhone 7 32GB - Black Factory Unlocked Smartphone']/../../div/div/span")).getText();
		System.out.println(s1);
		String s2=driver.findElement(By.xpath("//h3[text()='Apple iPhone 7 32GB - Black Factory Unlocked Smartphone']/../../div/div/../div[3]/span")).getText();
		System.out.println(s2);
	}

}
