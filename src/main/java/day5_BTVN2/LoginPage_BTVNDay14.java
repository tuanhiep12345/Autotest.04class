package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.constant.CT_Account;

public class LoginPage_BTVNDay14 {
	private WebDriver driver;
public LoginPage_BTVNDay14(WebDriver commonDriver)
	{
		this.driver=commonDriver;
		
	}
	public void LoginFunction(String email,String pass)
	{
		WebElement textEmail=driver.findElement(CT_Account.TEXT_EMAIL);
	if(textEmail.isDisplayed())
	{
		textEmail.clear();
		textEmail.sendKeys(email);
		
	}
	WebElement textPass=driver.findElement(CT_Account.TEXT_PASS);
	if(textPass.isDisplayed())
	{
		textPass.clear();
		textPass.sendKeys(pass);
	}
	WebElement btnDangnhap=driver.findElement(CT_Account.BUTTON_SIGIN);
	if(btnDangnhap.isDisplayed())
	{
	}
	}
}
