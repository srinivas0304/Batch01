package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_parent_xpath {
	ChromeDriver driver;
	String s1="Nokia 105 SS 2021";
	
	public void driver_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public void get_url() {
		driver.get("https:\\\\www.flipkart.com");
		driver.manage().window().maximize();
	}
	public void flipkart_parent() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Nokia");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		String s=driver.findElement(By.xpath("//div[text()='"+s1+"']/../../div[2]/div/div/div[1]")).getText();
		System.out.println(s);
	}
	public static void main(String[] args) throws InterruptedException {
		Flipkart_parent_xpath f=new Flipkart_parent_xpath();
		f.driver_open();
		f.get_url();
		f.flipkart_parent();
	}
	

}
