package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public  LoginPage(WebDriver driver)
	{
		super(driver);
	}
@FindBy(xpath="//input[@id='input-email']")
WebElement txtmail;
@FindBy( xpath="//input[@id='input-password']")
WebElement txtpwd;
@FindBy(xpath="//button[normalize-space()='Login']")
WebElement loginbut1;

public void SetEmail(String mail)
{
	txtmail.sendKeys(mail);
}
public void SetPwd(String pwd)
{
	 txtpwd.sendKeys(pwd);	
}
public void clicklogin1()
{
	loginbut1.click();
}
}