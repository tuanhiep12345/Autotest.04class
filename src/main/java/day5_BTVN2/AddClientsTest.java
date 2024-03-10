 package automation.testsuite;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import automation.page.ClientPage_Factory;
import automation.page.LoginPageFactory;

public class AddClientsTest extends CommonBase {
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_RISE);
		
	}
	@Test
	public void addClientSuccessfully() throws InterruptedException {
		LoginPageFactory login= new LoginPageFactory(driver);
		login.loginFunction("admin@demo.com", "riseDemo");
		ClientPage_Factory client = new ClientPage_Factory(driver);
		client.AddClients("TuanHiep666");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//td/child::a[text()='TuanHiep666']")).isDisplayed());
		
	}

	@Test
	public void  addClientFail() throws InterruptedException
	{
		LoginPageFactory login = new LoginPageFactory(driver);
		login.loginFunction("admin@demo.com", "riseDemo");
		ClientPage_Factory client = new ClientPage_Factory(driver);
		client.AddClients("");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//td/child::a[text()='TuanHiep666']")).isDisplayed());
		

	}
}
