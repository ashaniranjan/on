package SignUpProcess;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.EmailVerficationPage;
import pageObjects.LandingPage;
import pageObjects.RegistrationPage;
import resources.base;

public class signUpFlowWithNewUser extends base{

	public static WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();

	}

	@Test(dataProvider="getData")
	
	public void signupNavigationWithNewUser(String name, String password, String text)  throws InterruptedException, IOException
	{
		
		
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getSignUp().click();
		RegistrationPage register=new RegistrationPage(driver);
		
		register.getName().sendKeys(name);
	
	
		register.getEmail().sendKeys(register.getSaltString()+"@gmail.com");
		register.getPassword().sendKeys(password);
		register.checkboxe1().click();
		register.checkboxe2().click();
		register.signupbutton().click();
		System.out.println(text);
		EmailVerficationPage email= new EmailVerficationPage(driver);
	Assert.assertEquals(email.getTtile().getText(),"Check your email");
		
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][3];
		
		data[0][0]="abc";
		data[0][1]="djhsdjdd";
		data[0][2]="Valid User";
		/*
		 * data[1][0]="efg"; data[1][1]="abdgffcsc@gmail.com"; data[1][2]="ashgjjasd";
		 * data[1][3]="Invalid User";
		 */
		return data;
	}
}