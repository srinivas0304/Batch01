package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Mock_interview {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\addla\\GES9\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("menu_time_viewTimeModule")).click();
		driver.findElement(By.id("employee")).clear();
		driver.findElement(By.id("employee")).sendKeys("Srinivas");
	}

}
