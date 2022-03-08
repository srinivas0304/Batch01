package Scrolling_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange_drop_down3 {
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
		//WebElement w=driver.findElement(By.id("leaveList_cmbSubunit"));
		//Select s=new Select(w);
		//s.selectByIndex(2);
		//s.selectByValue("3");
		//s.selectByVisibleText("Administration");
	}

}
