package includes;

import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

// Page Objects
import page_objects.*;


public class FeatureHelpMod {
	
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;

	public static String baseURL = "http://openweathermap.org/current";

	public void createDriver() throws MalformedURLException,
	InterruptedException {

	driver = new FirefoxDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	driver.get(baseURL);

	waitVar = new WebDriverWait(driver, 15);
	}

	public void teardown() {
	driver.quit();
	}
	
	public void navigateToLink(String link) {
		driver.findElement(By.linkText(link)).click();
		}
	
	public void checkPageTitle(String title) {
		assertTrue(driver.getTitle().contains(title));
		}

	public void assertTextinPage(String text){
		String bodyText = driver.findElement(By.tagName("body")).getText();
		assertTrue("Text not found!", bodyText.contains(text));
	}		

	public void isCurrentPageDisplayed() {
	waitVar.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Call current weather data for one location")));
	waitVar.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Call current weather data for several cities")));
	waitVar.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Bulk downloading")));
	waitVar.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Parameters of API respond")));
	waitVar.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Other features")));	
	}
	
	
	
}


