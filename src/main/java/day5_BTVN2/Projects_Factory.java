package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Projects_Factory {
	private WebDriver driver;
	@FindBy(xpath = "//span[text()='Projects']")
	WebElement Projects;
	@FindBy(xpath = "//div[@id='project-table_filter']//input[@placeholder='Search']")
	WebElement textboxSearch;

	public Projects_Factory(WebDriver commonDriver) {
		this.driver = commonDriver;
		PageFactory.initElements(driver, this);

	}

	public void AddClients(String company) throws InterruptedException {
		Projects.click();
		Thread.sleep(3000);
		textboxSearch.sendKeys(company);
	}
}
