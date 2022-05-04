package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	

	By login= By.linkText("Anmelden");
	By emailid= By.id("login_email");
	By password=By.id("login_password");
	By loginbutton = By.xpath("//div/button[@type='submit']");
	
	
	public WebElement loginpage1()
	{
		return driver.findElement(login);
	}
	public WebElement emailidfield()
	{
		return driver.findElement(emailid);
	}
	public WebElement passwordfield()
	{
		return driver.findElement(password);
	}
	public WebElement loginbutton()
	{
		return driver.findElement(loginbutton);
	}
	
	
	
	}





