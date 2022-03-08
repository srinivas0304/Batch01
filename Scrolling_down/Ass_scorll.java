package Scrolling_down;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass_scorll {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\addla\\GES9\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https:\\www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebDriverWait wait=	new WebDriverWait(driver, 10);
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.findElement(By.xpath("//section['_2aDURW']//div//div[3]/..//div//div[1]/../.."));
		
	}

}
