package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailPage {
	
	public WebDriver driver;
	public EmailPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	

	By emailid= By.xpath("//input[@id='email']");
	By submit = By.xpath("//button[@type='submit']");
	
	
	
	public WebElement emailidfield()
	{
		return driver.findElement(emailid);
	}
	
	public WebElement continueshipping()
	{
		return driver.findElement(submit);
	}
	
	
	
	}





