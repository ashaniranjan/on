package SignInProcess;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CheckoutPage;
import pageObjects.EmailPage;

import pageObjects.ShippingPage;
import pageObjects.homepage;
import pageObjects.payment;
import resources.base;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginandSearchFunctionality extends base
{
	public static WebDriver driver;
	
	@BeforeTest
	
	public void initialize() throws IOException {
		driver = initializeDriver();
}

	@Test
	public void searchengine() throws InterruptedException 
	{
		
		driver.get(prop.getProperty("url"));
		//driver.findElement(By.id("popin_tc_privacy_button")).click();
		//Thread.sleep(1000);
		 driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		homepage h=new homepage(driver);
		h.mendropdown().click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  driver.manage().window().maximize();
		  js.executeScript("window.scrollBy(0,800)");
		  Thread.sleep(4000);
		h.productlistfield().click();
		Thread.sleep(3000);
		//h.quckaddfield().click();
		h.sizefield().click();
		h.selectbutton().click();
		h.checkout1().click();
		//CheckoutPage fp=new CheckoutPage(driver);
		//fp.checkoutbutton().click();
		Thread.sleep(3000);
		EmailPage lp=new EmailPage(driver);
		lp.emailidfield().sendKeys(prop.getProperty("email"));
		lp.continueshipping().click();
        ShippingPage sp= new ShippingPage(driver);
        sp.firstnamefield().sendKeys(prop.getProperty("firstname"));
		sp.lastnamefield().sendKeys(prop.getProperty("lastname"));
		sp.streetaddrfield().sendKeys(prop.getProperty("streetaddress1"));
		sp.streetaddr2field().sendKeys(prop.getProperty("streetaddress2"));
		sp.postalcodefield().sendKeys(prop.getProperty("postalcode"));
		sp.cityfield().sendKeys(prop.getProperty("cityname"));
		//Select stateId = new Select(driver.findElement(By.xpath("//select[@id='state_id']")));
		//stateId.deselectByVisibleText("Berlin");
		sp.phonenumberfield().sendKeys(prop.getProperty("phonenumber"));
		sp.button1().click();
		sp.paymentbutton1().click();
		payment p=new payment(driver);
		p.optionfield().click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='js-iframe']")));
				//driver.findElement(By.id("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[2]/span[1]\"))"))).sendKeys(prop.getProperty("cardnumber"));
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("arguments[0].value='3700 0000 0000 002';", driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[2]/span[1]")));
		//jse.executeScript("arguments[0].value='3700 0000 0000 002';", driver.findElement(By.id("encryptedCardNumber")));
		//jse.executeScript("arguments[0].value='03/30';", driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[2]/span[1]")));
	    p.cardnumberfield().sendKeys(prop.getProperty("cardnumber"));
	    p.expirydatefield().sendKeys(prop.getProperty("expiredate"));
	    p.cvvfield().sendKeys(prop.getProperty("cvv"));
	    p.cardholdernamefield().sendKeys(prop.getProperty("cardname"));
		//jse.executeScript("arguments[0].value='7373';", driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[2]/span[1]")));
		//jse.executeScript("arguments[0].value='John';", driver.findElement(By.xpath("//input[@id='nameoncard']")));
		driver.switchTo().defaultContent();
	    p.button1().click();
	    //assert.assertEquals(null, null)
	}
	@AfterTest
	public void exit() {
		driver.close();
		;
	}

}  