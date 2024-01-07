package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccuotntRegistationPage extends BasePage {
	
	public AccuotntRegistationPage(WebDriver driver)
	{
	super(driver);	
	}
	//Elements
	@FindBy(name="firstname")
	WebElement txtfirstname;
	@FindBy(name="lastname")
	WebElement txtlastname;
	@FindBy(name="email")
	WebElement txtemail;
@FindBy(name="password")
WebElement txtpwd;
@FindBy(name="agree")
WebElement chkdPolocy;
@FindBy(xpath="//button[normalize-space()='Continue']")
WebElement conbutton;
@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement confirmmsg;
//action method
public void setFirtstname(String fname)
{
	txtfirstname.sendKeys(fname);
	
}
public void setLastname(String lname)
{
	txtlastname.sendKeys(lname);
	
	}
public void setEmail(String email)
{
	txtemail.sendKeys(email);
}
public void setPassword( String  pwd)
{
	txtpwd.sendKeys(pwd);
}
public void ckecekPlocy()
{
	chkdPolocy.click();
	
	
}
public void buttonclick()
{
	conbutton.click();
}
public String getreturnmsg()
{
	try {
		return(confirmmsg.getText());
		
	}
	catch(Exception e)
	{
		return(e.getMessage());
	}
}
}
