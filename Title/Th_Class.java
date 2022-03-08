package Title;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;


public class Th_Class {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://demo.actitime.com/login.do");
				driver.manage().window().maximize();
				Thread.sleep(300);
				driver.manage().window().setSize(new Dimension(200, 300));
				Thread.sleep(2000);
				driver.manage().window().setPosition(new Point(2000, 2000));

	}
}
