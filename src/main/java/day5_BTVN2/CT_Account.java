package automation.constant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CT_Account {
	public static By TEXTBOX_EMAIL = By.id("email");
	public static By TEXTBOX_PASS = By.id("password");
	public static By BUTTON_SIGIN = By.xpath("//button[text()='Sign in']");
public static By TEXT_DASHBOARD = By.xpath("//span[text()='Dashboard' and @class='menu-text']");
public static By AUTHEN_ERROR = By.xpath("//div[normalize-space()='Authentication failed!']");
public static By EMAIL_FORMAT_ERROR = By.xpath("//span[text()='Please enter a valid email address.']");

public static By TEXT_EMAIL = By.id("email");
public static By TEXT_PASS = By.id("password");
public static By  BUTTON_DANGNHAP = By.xpath("//a[text()='Đăng Nhập']");
public static By BUTTON_DN = By.xpath("//button[text()='ĐĂNG NHẬP']");
public static By TEXT_KHOAHOCNOIBAT = By.xpath("//span[text()='NỔI BẬT' and @style='display:inline-block;']");
public static By DK_ERROR = By.xpath("//p[text()='Email này chưa được đăng ký.']");
public static By FORMAT_ERROR = By.xpath("//label[text()='Vui lòng nhập email hợp lệ']");
}
