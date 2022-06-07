package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class payment {
	
	public WebDriver driver;
	
	
	
	public payment(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By option= By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/span[1]");
	By cardnumber= By.id("encryptedCardNumber");
	By expirydate= By.xpath("encryptedExpiryDate");
	By cvv= By.xpath("encryptedSecurityCode");
	By cardholdername= By.xpath("//input[@id='nameoncard']");
	By button=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/div[2]/button[1]");
	
	public WebElement optionfield()
	{
		return driver.findElement(option);
	}
	
	public WebElement cardnumberfield()
	{
		return driver.findElement(cardnumber);
	}
	
	public WebElement expirydatefield()
	{
		return driver.findElement(expirydate);
	}
	
	public WebElement cvvfield()
	{
		return driver.findElement(cvv);
	}
	public WebElement cardholdernamefield()
	{
		return driver.findElement(cardholdername);
	}
	public WebElement button1()
	{
		return driver.findElement(button);
	}
		
}
