package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_attr {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		By usenam=By.id("txtUsername");
		WebElement u=driver.findElement(usenam);
		u.sendKeys("Admin");
		By pass=By.id("txtPassword");
		WebElement p=driver.findElement(pass);
		p.sendKeys("admin123");
		By login=By.id("btnLogin");
		WebElement l=driver.findElement(login);
		l.click();
		
		
	}


}
