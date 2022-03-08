package browsersurl;

import org.openqa.selenium.opera.OperaDriver;

public class OperaUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver","C:\\Users\\addla\\GES9\\operadriver_win64\\operadriver.exe");
		OperaDriver driver=new OperaDriver();
		driver.get("https://www.facebook.com");
	}
}
