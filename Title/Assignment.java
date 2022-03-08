package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\addla\\GES9\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https:\\www.google.com");
	driver.manage().window().maximize();
	WebElement e=driver.findElement(By.name("q"));
	e.sendKeys("Rohit");
	e.submit();
	String s=driver.getCurrentUrl();
	System.out.println(s);
}
}
