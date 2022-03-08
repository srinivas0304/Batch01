package Scrolling_down;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		/*Options opt=driver.manage();
		Timeouts out=opt.timeouts();
		out.implicitlyWait(10,TimeUnit.SECONDS);*/
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

}
