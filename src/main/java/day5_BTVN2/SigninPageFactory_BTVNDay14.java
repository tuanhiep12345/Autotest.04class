
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.page.Signin_BTVN14;

public class SigninPageFactory_BTVNDay14 {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Khởi tạo WebDriver (ở đây là ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void signUpTest() {
        // Mở trang web đăng ký
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");

        // Khởi tạo đối tượng SignUpPage
        Signin_BTVN14 signUpPage = new Signin_BTVN14();

        // Thực hiện đăng ký
        signUpPage.signUp("newuser", "password123");

        // Kiểm tra kết quả, ví dụ: kiểm tra xem có hiển thị thông báo thành công không
        Assert.assertTrue(driver.getPageSource().contains("Đăng ký thành công!"));
    }

    @AfterTest
    public void tearDown() {
        // Đóng trình duyệt
        driver.quit();
    }
}