package Title;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_w1 {
	public static void main(String[] args) {
		int count=0;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//a"));
		for(WebElement i:ele ) {
			String s=i.getText();
			System.out.println(s);
			count++;
		}
		System.out.println(count);
		
	}

}
