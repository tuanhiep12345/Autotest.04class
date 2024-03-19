package automation.testsuite;

import java.time.Duration;
import java.util.Set;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_Common;

public class BTVN2_Day18 extends CommonBase {
	@BeforeMethod
	@Parameters("browerParaName")
	public void openBrowser(@Optional("chrome")String browserValue ) throws InterruptedException {
	
		setupDriver(browserValue);
		driver.get(CT_Common.URL_BepAnToan);
	}

	@Test
	public void lienheZalo() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Chat với chúng tôi']")));
		WebElement ChatNgayBtn = driver.findElement(By.xpath("//span[text()='Chat với chúng tôi']"));
		wait.until(ExpectedConditions.elementToBeClickable(ChatNgayBtn));
		ChatNgayBtn.click();

		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Bepantoanvn']")).isDisplayed());

	}
}
