package SignUpProcess;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.RegistrationPage;
import resources.base;

public class signUpFlowWithInvalidUser extends base{
	public static WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();

	}


	 

	@Test(dataProvider = "getDataInValidUser")

	public void signupNavigationWithInvalidUser(String name, String email, String password, String text)
			throws InterruptedException, IOException {

		driver.get(prop.getProperty("url"));
		LandingPage lpage = new LandingPage(driver);
		lpage.getSignUp().click();
		RegistrationPage register = new RegistrationPage(driver);

		register.getName().sendKeys(name);
		register.getEmail().sendKeys(email);
		if(!email.endsWith(".com"))
		{
			System.out.println("Invalid emaid id");
		}
	register.getPassword().sendKeys(password);
		
		if (password.length() < 8) {
			System.out.println("invalid password");
		} else

			register.checkboxe1().click();
		register.checkboxe2().click();
		register.signupbutton().click();
		System.out.println(text);
		// EmailVerfication e= new EmailVerfication(driver);
		// Assert.assertEquals(e.getTtile().getText(),"Check your email");
		Assert.fail();
		if (!register.checkboxe1().isSelected())
		{
			System.out.println("Please select the checkbox");
		}

	}
	

	@DataProvider
	public Object[][] getDataInValidUser() {
		Object[][] data = new Object[1][4];

		data[0][0] = "abc";
		data[0][1] = "aakhdhjddxgfpmla@gmailm";
		data[0][2] = "dsdd";
		//data[0][3] = "Valid User";
		/*
		 * data[1][0]="efg"; data[1][1]="abdgffcsc@gmail.com"; data[1][2]="ashgjjasd";
		 * data[1][3]="Invalid User";
		 */
		return data;
	}

	@AfterTest
	public void exit() {
		driver.close();
	}


}



