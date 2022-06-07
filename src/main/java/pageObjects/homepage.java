package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	
	public WebDriver driver;
	public homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

   By men = By.xpath("//header/nav[1]/div[3]/div[1]/a[1]/div[1]");
	By productlist = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/span[1]/div[1]/a[1]/div[1]/div[1]/a[1]/div[2]/div[1]");
	//By quickadd = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/span[1]/div[1]/a[1]/div[1]/div[1]/a[1]/div[2]/div[1]");
	By size =By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/section[2]/div[1]/div[5]/div[2]/div[7]");
	By select =By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/section[2]/div[1]/div[7]/button[1]/span[1]/div[1]/div[1]");
	By checkout =By.xpath("//header/nav[1]/div[5]/div[3]/div[6]/div[1]/a[1]");
	public WebElement mendropdown()
	{
		return driver.findElement(men);
	}
	public WebElement productlistfield()
	{
		return driver.findElement(productlist);
	}
	
	
	public WebElement sizefield()
	{
		return driver.findElement(size);
	}
	public WebElement selectbutton()
	{
		return driver.findElement(select);
	}
	
	public WebElement checkout1()
	{
		return driver.findElement(checkout);
	}

}
