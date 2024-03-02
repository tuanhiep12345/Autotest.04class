package automation.testsuite;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_Common;
public class Day12_Dropdownlist extends CommonBase {
@BeforeMethod
public void openChrome() throws InterruptedException{
	driver=initChromeDriver(CT_Common.dropdownListSeleniumEasy);
	Thread.sleep(3000);
}
@Test
public void testDropdownList()
{
	Select dropDlDay=new Select(driver.findElement(By.id("select.demo")));
	System.out.println("size is:"+dropDlDay.getOptions().size());
	//cach1:selectByVisible
	dropDlDay.selectByVisibleText("Monday");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	Assert.assertEquals(dropDlDay.getFirstSelectedOption().getText(),"Monday");
	//cach2:selectByValue
	dropDlDay.selectByValue("Tuesday");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	Assert.assertEquals(dropDlDay.getFirstSelectedOption().getText(),"Tuesday");
	//cach3:selectByIndex
	dropDlDay.selectByIndex(1);
	Assert.assertEquals(dropDlDay.getFirstSelectedOption().getText(),"Sunday");
	
	
		
	}
}
