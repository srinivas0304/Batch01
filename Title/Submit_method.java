package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Submit_method {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\addla\\GES9\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		WebElement w=driver.findElement(By.name("q"));
		w.sendKeys("rohit");
		w.submit();
		//driver.findElement(By.name("q")).sendKeys("Rohit");
		
	}

}
