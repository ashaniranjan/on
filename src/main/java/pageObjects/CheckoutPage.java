package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	
public WebDriver driver;
	
	
	
	public CheckoutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	By checkout= By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]");
	
	

	public WebElement checkoutbutton() {
		// TODO Auto-generated method stub
		return driver.findElement(checkout);
	}
	

	}
	


