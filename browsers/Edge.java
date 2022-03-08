package browsers;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\addla\\GES9\\msedgedriver.exe");
	EdgeDriver driver=new EdgeDriver();
}
}
