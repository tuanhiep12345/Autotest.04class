package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage_Factory {
	 private WebDriver driver;
	@FindBy(xpath="//span[text()='Clients']") WebElement clientMenu;	
	@FindBy(xpath = "//a[text()=' Add client']") WebElement btnAddClient;
	@FindBy(id = "type_person") WebElement radioPerson;
	@FindBy(id = "company_name") WebElement textBoxCompany;
	@FindBy(id = "disable_online_payment") WebElement checkboxOnlinePayment;
	@FindBy(xpath = "//button[text()=' Save']") WebElement buttonSave;
	@FindBy(xpath = "//a[text()='Clients']") WebElement clientTab;
	@FindBy(xpath = "//div[@id='client-table_filter']//input[@placeholder='Search']")WebElement textboxSearch;
	
 public ClientPage_Factory(WebDriver commonDriver)
 {
 this.driver =commonDriver;
	 PageFactory.initElements(driver,this);
	 
 }
 public void AddClients (String company) throws InterruptedException
 {
 clientMenu.click();
 btnAddClient.click();
 Thread.sleep(3000);
 radioPerson.click();
 textBoxCompany.sendKeys(company);
 if(checkboxOnlinePayment.isDisplayed()==true && checkboxOnlinePayment.isSelected()==false)
 {
	 checkboxOnlinePayment.click();
 }
 buttonSave.click();
 Thread.sleep(3000);
 clientTab.click();
 Thread.sleep(3000);
 textboxSearch.sendKeys(company);
}
}
