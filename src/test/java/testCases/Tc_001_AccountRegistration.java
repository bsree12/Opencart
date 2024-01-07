package testCases;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccuotntRegistationPage;
import pageObjects.Homepage;
import tetsBase.baseClass;


public class Tc_001_AccountRegistration extends baseClass 
{
	@Test(groups= {"Regression","Master"})
	public void test_account_Registration()
	{
		
		logger.info("*** satarting account registratiion");
		logger.debug("Application detais");
		
		try
		
		{
		Homepage hp=new Homepage(driver);	
		hp.clickMyaccount();
		hp.ClickRegister();
		AccuotntRegistationPage regpage=new AccuotntRegistationPage(driver);
		logger.info("providing customer data");
		//logger.info("providing customer data");
		regpage.setFirtstname(randaomString().toUpperCase());
		regpage.setLastname(randaomString().toLowerCase());
		//regpage.setEmail(randaomString()+"@gmail.com");
		//regpage.setPassword(randomAlphaNumaric());
		//regpage.ckecekPlocy();
		logger.info("click on continue button");
		//regpage.buttonclick();
		String conmsg=regpage.getreturnmsg();
		logger.info("validating confirm message");
	Assert.assertEquals(conmsg,"Your Account Has Been Created!");
		}
		catch(Exception e) {
			logger.error("validating Excepted message");
		}
		logger.info("finsished Tc_001");
	
	
	}
	
}
