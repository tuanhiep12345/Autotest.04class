package automation.testsuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;
public class Day7_Practice extends CommonBase {
@BeforeMethod
public void openChrome() throws InterruptedException
{
	initChromeDriver(CT_Common.URL_BepAnToan);
	
}
@Test
public void testBepAnToan()
{
	System.out.println("Test web bep an toan ");
}
}
