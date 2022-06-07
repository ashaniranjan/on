package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingPage {

	public WebDriver driver;
	public ShippingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	

	




	By firstname= By.xpath("//input[@id='firstname']");
	By lastname = By.xpath("//input[@id='lastname']");
	By streetAddress= By.xpath("//input[@id='address1']");
	By streetAddress2=By.xpath("//input[@id='address2']");
	By city= By.xpath("//input[@id='city']");
	
	By postalcode= By.xpath("//input[@id='zipcode']");
	By phonenumber=By.xpath("//input[@id='phone']");
	By button= By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/form[1]/div[12]/button[1]");
	By paymentbutton=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[3]/button[1]");
	
	
	public WebElement firstnamefield()
	{
		return driver.findElement(firstname);
	}
	
	public WebElement lastnamefield()
	{
		return driver.findElement(lastname);
	}
	

	
	public WebElement streetaddrfield()
	{
		return driver.findElement(streetAddress);
	}
	
	public WebElement streetaddr2field()
	{
		return driver.findElement(streetAddress2);
	}

	public WebElement cityfield()
	{
		return driver.findElement(city);
	}
	
	public WebElement postalcodefield()
	{
		return driver.findElement(postalcode);
	}
	public WebElement phonenumberfield()
	{
		return driver.findElement(phonenumber);
	}
	public WebElement button1()
	{
		return driver.findElement(button);
	}
	
	public WebElement paymentbutton1()
	{
		return driver.findElement(paymentbutton);
	}
	
}
