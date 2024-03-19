package automation.testsuite;

import java.time.Duration;
import java.util.Set;

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

public class BTVN1_Day18 extends CommonBase {
	@BeforeMethod
	@Parameters("browerParaName")
	public void openBrowser(@Optional("edge")String browserValue ) throws InterruptedException {
	
		setupDriver(browserValue);
		driver.get(CT_Common.URL_DIENMAYGIARE);
	}

	@Test
	public void lienheZalo() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='phone-vr'])[2]")));
		WebElement zaloBtn = driver.findElement(By.xpath("(//div[@class='phone-vr'])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(zaloBtn));
		zaloBtn.click();
		
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Giới thiệu bản thân']")).isDisplayed());

			}
		}
	}
}
