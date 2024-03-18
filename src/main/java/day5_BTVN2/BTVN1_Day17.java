package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;

public class BTVN1_Day17 extends CommonBase {
	@BeforeMethod
	public void openGURU99() throws InterruptedException {
		driver = initChromeDriver(CT_Common.URL_DIENMAYGIARE);

	}

	@Test
	public void findIFrame_Index() throws InterruptedException {
		Thread.sleep(10000);
		int totalIframe = driver.findElements(By.tagName("iframe")).size();
		for (int i = 0; i < totalIframe; i++) {

			driver.switchTo().frame(i);
			int soLuongPhanTuDaiDien = driver.findElements(By.xpath("//span[text()='Bắt đầu chat']")).size();
			if (soLuongPhanTuDaiDien > 0) {
				System.out.println("iFrame cần tìm ở vị trí thứ " + (i+1));
			}
			driver.switchTo().defaultContent();
		}
	}
	@Test
	public void VerifyDangNhap() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//span[text()='Bắt đầu chat']")).click();
		Thread.sleep(10000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Đăng nhập']")).isDisplayed());
	}
	
}
