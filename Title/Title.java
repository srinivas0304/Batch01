package Title;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	    String s=driver.getTitle();
		System.out.println(s);
		
		}
}