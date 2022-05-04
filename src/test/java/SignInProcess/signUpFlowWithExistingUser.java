package SignUpProcess;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.EmailVerficationPage;
import pageObjects.LandingPage;
import pageObjects.RegistrationPage;
import resources.base;

public class signUpFlowWithExistingUser extends base {

	public static WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();

	}

	
	@Test(dataProvider = "getDataofExistingUser")

	public void signupNavigationWithExistingUser(String name, String email, String password, String text)
			throws InterruptedException, IOException {

		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getSignUp().click();
	RegistrationPage register = new RegistrationPage(driver);

	register.getName().sendKeys(name);
	register.getEmail().sendKeys(email);
	register.getPassword().sendKeys(password);
	register.checkboxe1().click();
	register.checkboxe2().click();
	register.signupbutton().click();
	if (register.existingUser().getText().contains("Sorry, this email is already registered")) {
		register.SignIn().click();
		}
		System.out.println(text);
		// EmailVerfication e= new EmailVerfication(driver);
		// Assert.assertEquals(e.getTtile().getText(),"Check your email");
	}
	
	  @DataProvider public Object[][] getDataofExistingUser() { Object[][] data=new
	  Object[2][4];
	  
	  data[0][0]="abc"; data[0][1]="afjfskJjlgfssj@gmail.com";
	  data[0][2]="djhsdjdd"; data[0][3]="Valid User";
	  
	  data[1][0]="efg"; data[1][1]="abdgffcsc@gmail.com"; data[1][2]="ashgjjasd";
	  //data[1][3]="Invalid User";
	  
	  return data; }
	 

	

}

