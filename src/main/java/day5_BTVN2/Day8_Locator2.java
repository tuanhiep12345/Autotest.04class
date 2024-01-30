package automation.testsuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_Common;
public class Day8_Locator2 extends CommonBase{
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_BepAnToan);	
	}
	@Test
	public void practiceLocator() throws InterruptedException{
		  Thread.sleep(3000);

		WebElement beptu = driver.findElement(By.linkText(" Bếp Từ "));
		System.out.println(" link bep tu:"+ beptu);
		WebElement mayhutmui = driver.findElement(By.linkText("  Máy Hút Mùi  "));
		System.out.println(" link may hut mui:"+ mayhutmui);
		WebElement mayruachen = driver.findElement(By.linkText("  Máy Rửa Chén Bát  "));
		System.out.println(" link may rua chen:"+ mayruachen);
		WebElement bepgas = driver.findElement(By.linkText("   Bếp Gas  "));
		System.out.println(" link bep gas:"+ bepgas);
		WebElement chauvoiruabat = driver.findElement(By.linkText("   Chậu Vòi Rửa Bát   "));
		System.out.println(" link chau voi rua bat:"+ chauvoiruabat);
		WebElement thietbinhabepkhac = driver.findElement(By.linkText("    Thiết Bị Nhà Bếp Khác    "));
		System.out.println(" link thiet bi nha bep khac :"+thietbinhabepkhac);
		WebElement  boncau  = driver.findElement(By.linkText("    Bồn Cầu   "));
		System.out.println(" link bon cau:"+ boncau );
		WebElement  sentam  = driver.findElement(By.linkText("    Sen Tắm   "));
		System.out.println(" link sen tam:"+ sentam );
		
		
}
}
