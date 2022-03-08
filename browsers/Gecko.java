package browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\addla\\GES9\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
	}
}
