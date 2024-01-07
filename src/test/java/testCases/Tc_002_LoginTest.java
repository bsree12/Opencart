package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import tetsBase.baseClass;

public class Tc_002_LoginTest extends baseClass {

	@Test(groups= {"Sanity","Master"})
	public void Login_test()
	
	
	{
try
		{
			
				
		logger.info("**** StartingTc_002_LoginTest***");
	Homepage hp=new Homepage(driver);
		hp.clickMyaccount();
		logger.info("clicked on my account");
		hp.clickLogin();
		logger.info("Clicked on login link");
		LoginPage lp=new LoginPage(driver);
		lp.SetEmail(rb.getString("username"));
		lp.SetPwd(rb.getString("password"));
		
	lp.clicklogin1();	
			logger.info("clicked on login button");
			/*MyAccountPage map=new MyAccountPage(driver);
				boolean targetpage=	map.Myaccdispalyed();
				Assert.assertEquals(targetpage, true);*/
	}
	catch(Exception e)
	{
		//Assert.fail();
	System.out.println("test is failed");	
	}
	
}
}