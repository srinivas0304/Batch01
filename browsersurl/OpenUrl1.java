package browsersurl;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenUrl1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\addla\\GES9\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://wynk.in/music");
	}

}
