package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    @FindBy(id = "txtFirstname")
    private WebElement usernameInput;

    @FindBy(id = "txtEmail")
    private WebElement txtEmailInput;
    
    @FindBy(id = "txtCEmail")
    private WebElement txtCEmailInput;

    @FindBy(id = "txtPassword")
    private WebElement txtPasswordInput;

    @FindBy(id = "txtCPassword")
    private WebElement txtCPasswordInput;

    @FindBy(xpath = "//button[text()='ĐĂNG KÝ']")
    private WebElement registerButton;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String Firstname) {
        usernameInput.sendKeys(Firstname);
    }

    public void entertxtEmail(String Email) {
    	txtEmailInput.sendKeys(Email);
    	
    }
    public void entertxtCEmail(String txtCEmail) {
    	txtEmailInput.sendKeys(txtCEmail);
    	
    }

    public void enterPassword(String password) {
        txtPasswordInput.sendKeys(password);
    }

    public void confirmPasword(String txtCPassword) {
        txtCPasswordInput.sendKeys(txtCPassword);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }
}