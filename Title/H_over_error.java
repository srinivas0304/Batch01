package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_over_error {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("loginButto")).click();
		Thread.sleep(1000);
		String s=driver.findElement(By.className("errormsg")).getText();
		System.out.println(s);
		if(s.equals("Username or Password is invalid. Please try again.")){
			System.out.println("is selected");
		}
		else {
			System.out.println("not");
		}

}
}
