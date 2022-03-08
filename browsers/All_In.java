package browsers;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_In {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://wynk.in/music");
		String s=driver.getTitle();
		System.out.println(s);
		driver.manage().window().maximize();//maximize
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(20, 30));//dimension
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(100, 200));//relocation
		Thread.sleep(5000);
		Navigation nav=driver.navigate();//navigation class
		nav.refresh();
		Thread.sleep(5000);
		nav.back();
		Thread.sleep(5000);
		nav.forward();
		Thread.sleep(3000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.quit();//quit
		
		
		
	}

}
