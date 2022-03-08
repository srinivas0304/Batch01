package Own_Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Rohit_sharma {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\addla\\GES9\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.cricbuzz.com\r\n");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("cb-search-menubar-clear")).click();
		driver.findElement(By.id("search_bar_menu")).sendKeys("Rohit Sharma");
	}

}
