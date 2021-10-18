package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By email = By.xpath("//input[@type='email']");
	private By pwd = By.xpath("//input[@type='password']");
	private By login = By.cssSelector("[type='submit']");
	
	
	public void enteremailpwd(String id, String paswd) {
		driver.findElement(email).sendKeys(id);
		driver.findElement(pwd).sendKeys(paswd);
	}
	
	public void clicklogin() {
		driver.findElement(login).click();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
}
