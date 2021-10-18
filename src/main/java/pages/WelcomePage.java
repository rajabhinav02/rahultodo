package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {

	WebDriver driver;
	
	public WelcomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	
	private By textfield = By.xpath("(//input[contains(@placeholder,'Enter')])[position()=1]");
	private By submitbutton = By.xpath("(//button[@type='submit' and (contains(@class,'btn-primary'))])[position()=1]");
	
	public void enternote(String note) {
		driver.findElement(textfield).sendKeys(note);
	}
	
	public void clicksubmit() {
		driver.findElement(submitbutton).click();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
}
