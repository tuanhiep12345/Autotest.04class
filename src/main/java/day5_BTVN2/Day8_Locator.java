package automation.testsuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_Common;

public class Day8_Locator extends CommonBase{
@BeforeMethod
public void openChrome() throws InterruptedException
{
	driver = initChromeDriver(CT_Common.URL_SeLectorHub);	
}
@Test
public void practiceLocator() throws InterruptedException{
	driver.findElement(By.xpath("//img[@title='Close']")).click();
	  Thread.sleep(3000);

	WebElement useEmail = driver.findElement(By.name("email"));
	System.out.println(" userEmail:"+ useEmail);
	WebElement pass = driver.findElement(By.id("pass"));
	System.out.println(" password :"+ pass);
	WebElement company = driver.findElement(By.name("company"));
	System.out.println(" company :"+ company);
	WebElement MobileNumber= driver.findElement(By.name("Mobile Number"));
	System.out.println(" Mobile Number :"+ MobileNumber);
	WebElement submid= driver.findElement(By.xpath("Submit"));
	System.out.println(" Submit :"+ submid);
	WebElement Inp = driver.findElement(By.id("inp_val"));
	System.out.println(" Inp :"+ Inp);
	
}
}
