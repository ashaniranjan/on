package SignInProcess;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.base;
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
		driver.findElement(By.id("popin_tc_privacy_button")).click();
		
		LoginPage lp=new LoginPage(driver);
		Thread.sleep(5000);
		lp.loginpage1().click();
		lp.emailidfield().sendKeys(prop.getProperty("email"));
		lp.passwordfield().sendKeys(prop.getProperty("password"));
		lp.loginbutton().click();
		Thread.sleep(5000);
		String actualMsg = driver.findElement(By.xpath("//div[contains(text(),'Du bist nun bei Contorion angemeldet.')]")).getText();
		 Assert.assertEquals(actualMsg,"Du bist nun bei Contorion angemeldet.");
		
		HomePage fp=new HomePage(driver);
		fp.searchtextbox().sendKeys(prop.getProperty("searchtext"));
		fp.search().click();
	
		
		//WebDriverWait wait = new WebDriverWait(driver, 50);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Log in')]"))).click();
		//Thread.sleep(3000);
		// to open the desired link
		//fp.openthelink().click();
		
	}
	@AfterTest
	public void exit() {
		driver.close();
		;
	}

}