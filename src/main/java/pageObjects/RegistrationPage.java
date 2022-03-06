package pageObjects;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
	public WebDriver driver;
	
	By name= By.xpath("//input[@id='name']");
	By email= By.xpath("//input[@id='email']");
	By password= By.xpath("//input[@id='password']");
	By checkbox1= By.xpath("//label[@class=\"mr-checkbox-1__check \"]");
	By checkbox2 =By.xpath("//label[@class=\"mr-checkbox-1__check\"]");
	By signup= By.xpath("//button[contains(text(),'Get started now')]");
	By existingUserEmail=By.xpath("//label[@id=\"emailError\"]");
	By signIn=By.xpath("//span[contains(text(),'Sign in')]");
	public RegistrationPage(WebDriver driver) 
	{
		
		this.driver=driver;

	}

	

	public WebElement getName() 
	{
		
	   return driver.findElement(name);
		
	}
	
	public WebElement getEmail()
	
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	
	{
		return driver.findElement(password);
		
	}
	
	public WebElement checkboxe1()
	{
		return driver.findElement(checkbox1);
		
		
	}

	public WebElement checkboxe2()
	{
		
		return driver.findElement(checkbox2);
		
	}
	
	public WebElement signupbutton()
	{
		
		return driver.findElement(signup);
		
	}
	
	public WebElement existingUser()
	{
	return driver.findElement(existingUserEmail);
	}
	
	public WebElement SignIn()
	{
		return driver.findElement(signIn);
	}
	
	public String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
