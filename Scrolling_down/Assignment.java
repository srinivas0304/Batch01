package Scrolling_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\addla\\GES9\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize();
		driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("https://www.flipkart.com");
		driver.findElement(By.id("Form_submitForm_Name")).sendKeys("A Srinivas");
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("a.srinivas459@gmail.com");
		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("9902510068");
		driver.findElement(By.id("Form_submitForm_Country")).click();
		WebElement w=driver.findElementById("Form_submitForm_Country");
		Select s=new Select(w);
		s.selectByVisibleText("United Kingdom");
		
		
	}
	

}
