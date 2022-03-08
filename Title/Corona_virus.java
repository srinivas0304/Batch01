package Title;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corona_virus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		String s=driver.findElement(By.xpath("//div[text()='COVID-19 Coronavirus Pandemic']/../div[4]/div/span")).getText();
		System.out.println(s);
		String s1=driver.findElement(By.xpath("//div[text()='COVID-19 Coronavirus Pandemic']/../div[4]/div[1]/../../div[6]/div")).getText();
		System.out.println(s1);
		String s2=driver.findElement(By.xpath("//div[text()='COVID-19 Coronavirus Pandemic']/../div[4]/div[1]/../../div[7]/div")).getText();
		System.out.println(s2);
	}

}
