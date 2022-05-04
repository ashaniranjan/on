package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
public WebDriver driver;
	
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	By searchtext= By.id("search-input");
	By search= By.xpath("//button[@id='search-button']");
	
	public WebElement searchtextbox()
	{
		return driver.findElement(searchtext);
	}
	public WebElement search()
	{
		return driver.findElement(search);
	}
	

	}
	


