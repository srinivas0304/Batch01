package Title;

import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String s=driver.getCurrentUrl();
		driver.get("https://www.facebook.com");
		
		System.out.println(s);
		}
}
