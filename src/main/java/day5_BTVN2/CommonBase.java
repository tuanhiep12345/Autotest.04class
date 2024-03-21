package automation.common;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.CaseFormat;

public class CommonBase {
public static WebDriver driver;

public static WebDriver initChromeDriver(String URL) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	return driver;
}
public WebElement getElementPresentDOM(By locator) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	return driver.findElement(locator);
}
public void click(By locator) {
	
	WebElement element = getElementPresentDOM(locator);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	element.click();
}
public void scrollToElement(WebElement element)
{
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true);",element);
}
private WebDriver initChromeDriver()
{
	System.out.println("Launching chrome browser...");
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	return driver;
}
private WebDriver initFirefoxDriver()
{
	System.out.println("Launching firefox browser...");
	System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
	FirefoxOptions options = new FirefoxOptions();
	driver = new FirefoxDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	return driver;
}

private WebDriver initMsEdgeDriver()
{
	System.out.println("Launching MSEdge browser...");
	System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\driver\\msedgedriver.exe");
	EdgeOptions options = new EdgeOptions();
	driver = new EdgeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	return driver;
}

public WebDriver setupDriver(String browserName)
{
	switch(browserName.trim().toLowerCase()) {
	case "chrome": 
		driver = initChromeDriver();
		break;
	case "firefox": 
		driver = initFirefoxDriver();
		break;
	case "edge": 
		driver = initMsEdgeDriver();
		break;
	default:
		System.out.println("Browser "+ browserName + "was incorrect, run default chrome browser");
		driver = initChromeDriver();
	}
	return driver;
}
}