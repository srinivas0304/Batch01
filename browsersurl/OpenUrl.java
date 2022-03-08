package browsersurl;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/hyderabad/restaurants?utm_source=google&utm_medium=cpc&utm_campaign=Gsearch_P-MWeb_O-NA_C-Brand_A-NewUser_SC-Generic_L-PanIndia&utm_term=zomato&gclid=EAIaIQobChMInPO-gIX-8gIVDJ1LBR3OMAZSEAAYASAAEgLGZfD_BwE");
	}

}
