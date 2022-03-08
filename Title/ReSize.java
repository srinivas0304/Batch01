package Title;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		/*Options opt=driver.manage();
		Window win=opt.window();
		Dimension d=new Dimension(200,300);//default
		win.setSize(d);*/
		driver.manage().window().setSize(new Dimension(500,600));//shortcut
	}

}
