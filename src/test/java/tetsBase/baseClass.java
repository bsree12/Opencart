package tetsBase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseClass {
	public static WebDriver driver;
	public Logger logger;
	//public Logger logger;//declaring the loggiging variable
	public ResourceBundle rb;
	@BeforeClass(groups= {"Regrssion,Sanity,Master"})
	@Parameters("browser")
	public void setup(String br)
	{
		logger=LogManager.getLogger(this.getClass());
		rb=ResourceBundle.getBundle("config");//load the config.file
//ChromeOptions options= new ChromeOptions();
		//	options.setExperimentalOption("excludeSwitches",new String[] {"enable-autoamtion"});
		if(br.equals("Chrome"))
				{
			driver=new ChromeDriver();
				}
		else if(br.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		else if(br.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(rb.getString("appURL"));
		//driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
				
	}
	@AfterClass(groups= {"Regrssion,Sanity,Master"})
	public void teardown()
	{
	driver.quit();	
	}
	public String randaomString()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
				return (generatedstring);
	}
	public String randaomNumber()
	{
	String generatedString2=RandomStringUtils.randomNumeric(10);
	return (generatedString2);
	}
	public String randomAlphaNumaric()
	{
		String genatratedString3=RandomStringUtils.randomAlphanumeric(10);
		return(genatratedString3);
	}
	public String captureScreen(String name)
	{
		String timestamp=new SimpleDateFormat("yyyymmddhhss").format(new Date());
		TakesScreenshot takescreenshot=(TakesScreenshot)driver;
		File source=takescreenshot.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\Screenshots\\"+name+"_"+timestamp+".png";
		try
		{
			FileUtils.copyFile(source,new File(destination));
		}
		catch (Exception e)
		{
			e.getMessage();
		}
	
	return destination;
	}
		
	}



