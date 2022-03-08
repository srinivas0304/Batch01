package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Attribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement w=driver.findElement(By.id("username"));
		String s=w.getAttribute("class");
		System.out.println(s);
		String s1=w.getAttribute("placeholder");
		System.out.println(s1);
	}

}
