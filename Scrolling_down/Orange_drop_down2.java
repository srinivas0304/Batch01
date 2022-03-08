package Scrolling_down;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Orange_drop_down2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\addla\\GES9\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin")
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.xpath("//option[contains(text(),'TechOps')]")).click();
	}

}
