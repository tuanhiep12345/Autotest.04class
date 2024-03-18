package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;

public class BTVN2_Day17 extends CommonBase{
	@BeforeMethod
	public void openGURU99() throws InterruptedException {
		driver = initChromeDriver(CT_Common.URL_MEDIA);

	}


	@Test
	public void findIFrame_Index() throws InterruptedException {
		Thread.sleep(10000);
		int totalIframe = driver.findElements(By.tagName("iframe")).size();
		for (int i = 0; i < totalIframe; i++) {

			driver.switchTo().frame(i);
			int soLuongPhanTuDaiDien = driver.findElements(By.xpath("//div[@class='logo']")).size();
			if (soLuongPhanTuDaiDien > 0) {
				System.out.println("iFrame cần tìm ở vị trí thứ " + (i+1));
			}
			driver.switchTo().defaultContent();
		}
	}
	@Test
	public void IframeZalochat() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='logo']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Chat nhanh']")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Xin chào! Siêu thị điện máy MediaMart rất vui được hỗ trợ bạn.']")).isDisplayed());
}
}


