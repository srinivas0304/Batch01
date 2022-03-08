package browsersurl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\addla\\GES9\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_a0B42F449C33AFC68CBCFE5EA3");
	}

}
