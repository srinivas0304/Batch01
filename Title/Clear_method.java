package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear_method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\addla\\GES9\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement w=driver.findElement(By.id("username"));
		w.sendKeys("Rohit");
		Thread.sleep(1000);
		w.clear();
		String s=w.getTagName();
		System.out.println(s);
		String s1=driver.getPageSource();
		System.out.println(s1);
	}
	

}
