package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import automation.page.LoginPage;

public class LoginTest extends CommonBase {
	@BeforeMethod
	public void openChrome() throws InterruptedException{
		driver=initChromeDriver(CT_Common.URL_RISE);
		
	}
	@Test
	public void loginSuccessfull() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin@demo.com","riseDemo");
	assertTrue(driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed());
	}
	@Test
	public void loginFailIncorrectEmail1() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("adminIncorrect@demo.com","riseDemo");
	 assertTrue(driver.findElement(By.xpath("//div[normalize-space()='Authentication failed!']")).isDisplayed());
	}
	@Test
	public void loginFailIncorrectEmail2() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin@demo.com","rise");
	 assertTrue(driver.findElement(By.xpath("//div[normalize-space()='Authentication failed!']")).isDisplayed());
	}
	@Test
	public void loginFailIncorrectEmail3() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("adminIncorrect@demo.com","rise");
	 assertTrue(driver.findElement(By.xpath("//div[normalize-space()='Authentication failed!']")).isDisplayed());
	}
	
}