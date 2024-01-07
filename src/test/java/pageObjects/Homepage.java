package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {
	public Homepage(WebDriver driver)
	{
		super(driver);
		
	}
	//find elements
	@FindBy(xpath= "//span[normalize-space()='My Account']")
	WebElement linkmyaccount;
	@FindBy(linkText="Register")
	WebElement linkregister;
	@FindBy(xpath= "//a[normalize-space()='Login']")
	WebElement loginbtn;
	//Action methods
	public void clickMyaccount()
	{
		linkmyaccount.click();
	}
	public void ClickRegister()
	{
		linkregister.click();
	}
	public void clickLogin()
	{
		loginbtn.click();
	}

}
