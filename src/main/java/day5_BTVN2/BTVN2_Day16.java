package automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;

public class BTVN2_Day16 extends CommonBase{
	@BeforeMethod
	public void AlertDemo() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_AlertDEMO);
	}
	@Test
	public void Tryit() throws InterruptedException
	{
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Try it']")));
		WebElement buttonclick = driver.findElement(By.xpath("//button[text()='Try it']"));
		wait.until(ExpectedConditions.elementToBeClickable(buttonclick));
		buttonclick.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().getText();
		
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		assertEquals("Welcome to Selenium WebDriver Tutorials", text);
	}

}
