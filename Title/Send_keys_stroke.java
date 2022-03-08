package Title;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Send_keys_stroke {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\addla\\GES9\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}

}
