package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException

	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\niri\\eclipse-workspace\\E2EOn\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);		
		String browsername = prop.getProperty("browser");
		String url=prop.getProperty("url");
		String name=prop.getProperty("name");
		String email= prop.getProperty("email");
		String password=prop.getProperty("password");
	
		
		

		if (browsername.equals("chrome") )
		{

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();

		} 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	
	public void getScreenshotPath(String testcaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile= System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
		org.apache.commons.io.FileUtils.copyFile(source,new File(destinationFile));
	}

}
