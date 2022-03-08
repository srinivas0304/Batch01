package Title;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close_quit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		//driver.close();
		driver.quit();
		}

}
