package automation.testsuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.constant.CT_Common;
import automation.page.Factory_BTVNDAY16;
import automation.page.LoginPageFactory_BTVNDay14;

public class BTVN1_Day16 extends CommonBase{
	@BeforeMethod
	public void openChinhsua() throws InterruptedException 
	{
		driver = initChromeDriver(CT_Common.ULR_aladaa);
	}
	@Test
public void acceptchinhsua() throws InterruptedException
{
		LoginPageFactory_BTVNDay14 loginPageFactory_BTVNDay14 = new LoginPageFactory_BTVNDay14(driver);
        loginPageFactory_BTVNDay14.loginFunction("tuanhiep0616@gmail.com","hiep@0666");
        Assert.assertTrue(driver.findElement(CT_Account.TEXT_HOPTACGIANGDAY).isDisplayed());
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='avatar2']")));
		WebElement buttonAvantar2 =  driver.findElement(By.xpath("//div[@class='avatar2']"));
		wait.until(ExpectedConditions.elementToBeClickable(buttonAvantar2));
		buttonAvantar2.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Chỉnh sửa thông tin']")));
		WebElement buttonclick =  driver.findElement(By.xpath("//a[text()='Chỉnh sửa thông tin']"));
		wait.until(ExpectedConditions.elementToBeClickable(buttonclick));
		buttonclick.click();
		
		WebElement textCanScrollDen = driver.findElement(By.xpath("//div[text()='Thông tin đăng nhập']"));
		scrollToElement(textCanScrollDen);
		
		Factory_BTVNDAY16 factory_BTVNDAY16 = new Factory_BTVNDAY16(driver);
		factory_BTVNDAY16.ReplaceFunction("hiep@0666", "hiep@0066", "hiep@0066");
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
        Assert.assertTrue(driver.findElement(CT_Account.TEXT_THONGTIN).isDisplayed());


}
}
