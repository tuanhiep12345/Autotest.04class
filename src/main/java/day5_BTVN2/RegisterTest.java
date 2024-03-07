package automation.testsuite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import automation.page.RegisterPage;

public class RegisterTest extends CommonBase {
    private WebDriver driver;
    private RegisterPage registerPage;

    @BeforeMethod
	public void openChrome() throws InterruptedException {
		driver = initChromeDriver(CT_Common.URL_alada);
    }

    @Test
    public void testValidRegistration() {
        registerPage.enterUsername("hoangtuanhiep");
        registerPage.entertxtEmail("hiep123@gmail.com");
        registerPage.entertxtCEmail("hiep123@gmail.com");
        registerPage.enterPassword("hiep@222");
        registerPage.confirmPasword("hiep@222");
        registerPage.clickRegisterButton();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
