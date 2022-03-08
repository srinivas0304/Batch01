package Own_Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\addla\\GES9\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("addlasrinivas459@gmail.com");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("Sri@99025");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.cssSelector("input[logout]")).click();
	}

}
