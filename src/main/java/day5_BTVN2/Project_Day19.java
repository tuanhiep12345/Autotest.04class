 package automation.testsuite;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import automation.page.ClientPage_Factory;
import automation.page.LoginPageFactory;
import automation.page.Projects_Factory;

public class Project_Day19 extends CommonBase {
	@BeforeMethod
	@Parameters("browerParaName")
	public void openBrowser(@Optional("edge")String browserValue ) throws InterruptedException {
	
		setupDriver(browserValue);
		driver.get(CT_Common.URL_RISE);
	}
	@Test
	public void  client() throws InterruptedException
	{
		LoginPageFactory login = new LoginPageFactory(driver);
		login.loginFunction("admin@demo.com", "riseDemo");
		Projects_Factory project = new Projects_Factory(driver);
		project.AddProjects("Abshire-Swaniawski");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//a[text()='Abshire-Swaniawski']")).isDisplayed());
	}
	
	@Test
	public void  Price () throws InterruptedException
	{
		LoginPageFactory login = new LoginPageFactory(driver);
		login.loginFunction("admin@demo.com", "riseDemo");
		Projects_Factory project = new Projects_Factory(driver);
		project.AddProjects("$4,000.00");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//a[text()='Koch PLC']")).isDisplayed());
	}
	
	@Test
	public void  Startdate () throws InterruptedException
	{
		LoginPageFactory login = new LoginPageFactory(driver);
		login.loginFunction("admin@demo.com", "riseDemo");
		Projects_Factory project = new Projects_Factory(driver);
		project.AddProjects("01-04-2024");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//a[text()='Alta Cassin']")).isDisplayed());
	}
	
	@Test
	public void  Status () throws InterruptedException
	{
		LoginPageFactory login = new LoginPageFactory(driver);
		login.loginFunction("admin@demo.com", "riseDemo");
		Projects_Factory project = new Projects_Factory(driver);
		project.AddProjects("Open");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//span[text()='02-09-2023']")).isDisplayed());
	}
	@Test
	public void  fail() throws InterruptedException
	{
		LoginPageFactory login = new LoginPageFactory(driver);
		login.loginFunction("admin@demo.com", "riseDemo");
		Projects_Factory project = new Projects_Factory(driver);
		project.AddProjects("Title");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//td[text()='No record found.']")).isDisplayed());
		

	}
	
}
