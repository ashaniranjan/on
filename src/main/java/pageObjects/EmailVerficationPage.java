package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailVerficationPage {
	
	public WebDriver driver;
	
	public EmailVerficationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By title= By.xpath("//h1[contains(text(),'Check your email')]");
	
	
	public WebElement getTtile()
	{
		return driver.findElement(title);
	}
	

}
