package Title;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReLocation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		/*Options opt=driver.manage();
		Window win=opt.window();
		Point p=new Point(200,250);
		win.setPosition(p);*/
		driver.manage().window().setPosition(new Point(200,250));//shortcut
	}

}
