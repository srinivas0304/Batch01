package Title;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		/*Options opt=driver.manage();
		Window win=opt.window();
		win.maximize();*/
		driver.manage().window().maximize();//shortcut
		}
}
