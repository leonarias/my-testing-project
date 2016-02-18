package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasePage {
	
	private static WebElement element = null;
	
	// TOP of the Page:
	public static WebElement pom_email_us_link(WebDriver driver){
        element = driver.findElement(By.linkText("Email Us"));
        return element;
        }
	
	public static WebElement pom_weather_in_your_city_link(WebDriver driver){
        element = driver.findElement(By.linkText("Weather in your city"));
        return element;
        }
	
	public static WebElement pom_sign_in_link(WebDriver driver){
        element = driver.findElement(By.linkText("Sign In"));
        return element;
        }
	
	public static WebElement pom_sign_up_link(WebDriver driver){
        element = driver.findElement(By.linkText("Sign Up"));
        return element;
        }
	public static WebElement pom_C(WebDriver driver){
        element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/label/p/span[1]"));
        return element;
        }
	
	public static WebElement pom_F(WebDriver driver){
        element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/label/p/span[2]"));
        return element;
        }

	// BOTTOM of the Page:
	/* Weather in your city*/
	public static WebElement pom_find_your_city_link(WebDriver driver){
        element = driver.findElement(By.linkText("Find your city"));
        return element;
        }
	
	public static WebElement pom_weather_maps_link(WebDriver driver){
        element = driver.findElement(By.linkText("Interactive weather maps"));
        return element;
        }
	
	public static WebElement pom_satellite_maps_link(WebDriver driver){
        element = driver.findElement(By.linkText("Interactive satellite image maps"));
        return element;
        }
	
	// Etc... I could expose all page objects here to use them in any test that is required.
}
