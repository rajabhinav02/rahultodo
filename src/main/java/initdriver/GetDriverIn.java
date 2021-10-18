package initdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDriverIn {

	static ThreadLocal<WebDriver> tldriver = new ThreadLocal();
	
	
	public  WebDriver initialiseDriver(String browsername) {
		
		if (browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		}else {
			WebDriverManager.edgedriver().setup();
			tldriver.set(new EdgeDriver());
		}
		
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		
		return getDriver();
		
	}
	
	
	public static WebDriver getDriver() {
		return tldriver.get();
	}
}
