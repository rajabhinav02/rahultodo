package apphooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import initdriver.GetDriverIn;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.getProperty;

public class applihooks {

	private Properties pro;
	private getProperty gp;
	private GetDriverIn gd;
	WebDriver driver;
	
	@Before(order=0)
	public void getpro() throws IOException {
		gp = new getProperty();
		pro= gp.getPropertyn();
	}
	
	@Before(order=1)
	public void initialisedriver() {
		gd = new GetDriverIn();
		String url = pro.getProperty("url");
		String browser = pro.getProperty("browser");
		driver = gd.initialiseDriver(browser);
		driver.get(url);
	}
	
	@After(order=1)
	public void takess(Scenario sc) {
		if (sc.isFailed()) {
			String name = sc.getName().replace("", "_");
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshot, "img/png", name);
		}
	}
	
	@After(order=0)
	public void teardown() throws InterruptedException {
		Thread.sleep(6000);
		driver.quit();
	}
	
}
