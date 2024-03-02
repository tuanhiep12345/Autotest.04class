package automation.testsuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_Common;
public class day11_radiobutton extends CommonBase {
	@BeforeMethod
	public void openChrome() throws InterruptedException{
		driver = initChromeDriver(CT_Common.CT_PageURL);
	}
	@Test
	public void clickradio()
	{
		WebElement radioMale=driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
		if(radioMale.isEnabled()==true&&radioMale.isSelected()==false)
		{
			radioMale.click();
		}
				
		else
	{
		WebElement radioFeMale = driver.findElement(By.xpath("//input[@value='Female'])[1])"));
		if(radioFeMale.isSelected()==false);
			radioFeMale.click();
		
			
		}
	}
	
	}
