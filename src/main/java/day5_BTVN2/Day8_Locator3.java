package automation.testsuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_Common;
public class Day8_Locator3 extends CommonBase {
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_alada);	
	}
	@Test
	public void practiceLocator() throws InterruptedException{
		  Thread.sleep(3000);

		WebElement hovaten = driver.findElement(By.name(" txtFirstname"));
		System.out.println(" hovaten:"+ hovaten);

		WebElement email = driver.findElement(By.name(" txtEmail"));
		System.out.println(" email la :"+ email);

		WebElement nhaplaiemail = driver.findElement(By.name(" txtCEmail"));
		System.out.println(" email nhap lai:"+ nhaplaiemail);

		WebElement pass = driver.findElement(By.name(" txtPassword"));
		System.out.println(" password:"+ pass);

		WebElement passB = driver.findElement(By.name(" txtCPassword"));
		System.out.println(" passB :"+ passB);
		
		
}
}