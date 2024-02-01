package automation.testsuite;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_Common;
public class TS_PracticeLocateElement extends CommonBase  {
@BeforeMethod
public void openChrome() throws InterruptedException
{
	driver = initChromeDriver(CT_Common.URL_Automation);	
}
@Test
public void practiceLocator() throws InterruptedException{
	  Thread.sleep(3000);

	  WebElement linktextQN = driver.findElement(By.linkText(" Quảng Nam"));
      System.out.println(" Quảng Nam :"+linktextQN);
      WebElement linktextQT= driver.findElement(By.linkText(" Quảng Trị"));
      System.out.println(" Quảng Trị :"+linktextQT);
      WebElement linktextQB = driver.findElement(By.linkText("Quảng Bình"));
      System.out.println(" Quảng Bình :"+linktextQB);
      WebElement linktextNG = driver.findElement(By.linkText("Quảng Ngãi"));
      System.out.println(" Quảng Ngãi  :"+linktextNG);
      
      
      
	  
	WebElement email = driver.findElement(By.id(" mail"));
	System.out.println(" mail :"+email);
	WebElement pass = driver.findElement(By.id(" disable_password"));
	System.out.println(" Password :"+ pass);
	WebElement Number = driver.findElement(By.id(" number"));
	System.out.println(" number  :"+ Number);
	
	WebElement Education = driver.findElement(By.id(" edu"));
	System.out.println(" edu  :"+ Education);
	
	WebElement Display  = driver.findElement(By.linkText("Element is display"));
	System.out.println(" Element is display  :"+ Display);
	WebElement disable = driver.findElement(By.linkText(" Element is disable"));
	System.out.println(" Element is disable  :"+ disable);
	WebElement select = driver.findElement(By.id(" Element is select "));
	System.out.println(" Element is select  :"+ select);
	
	
	WebElement linkGoogle = driver.findElement(By.linkText(" GOOGLE "));
	System.out.println(" GOOGLE   :"+ linkGoogle);
	WebElement linkTiki = driver.findElement(By.linkText(" TIKI "));
	System.out.println(" TIKI  :"+ linkTiki);
	WebElement linkFB = driver.findElement(By.linkText(" FACEBOOK "));
	System.out.println(" FACEBOOK  :"+ linkFB);
	WebElement linkLazada = driver.findElement(By.linkText(" LAZADA "));
	System.out.println(" LAZADA :"+ linkLazada);
	
	WebElement linkDownload = driver.findElement(By.linkText(" download.txt "));
	System.out.println(" download.txt :"+ linkDownload);
	
	WebElement linkTooltips = driver.findElement(By.linkText(" Hover over me "));
	System.out.println(" Hover over me :"+ linkTooltips);
	
	WebElement linkDouble = driver.findElement(By.linkText(" Double click me "));
	System.out.println(" Double click me :"+ linkDouble);
	
	WebElement Alert = driver.findElement(By.linkText(" Click for JS Alert "));
	System.out.println(" Click for JS Alert :"+ Alert);
	WebElement Confirm = driver.findElement(By.linkText(" Click for JS Confirm "));
	System.out.println(" Click for JS Confirm :"+ Confirm);
	WebElement Prompt = driver.findElement(By.linkText(" Click for JS Prompt "));
	System.out.println(" Click for JS Prompt :"+ Prompt);
	
	
	WebElement Name = driver.findElement(By.id(" name "));
	System.out.println(" name :"+ Name);
	WebElement Address = driver.findElement(By.id(" address "));
	System.out.println(" address :"+ Address);
	WebElement Email = driver.findElement(By.id(" email "));
	System.out.println(" email :"+ Email);
	WebElement Pass = driver.findElement(By.id(" password "));
	System.out.println(" password :"+ Pass);
	
	
}
}
