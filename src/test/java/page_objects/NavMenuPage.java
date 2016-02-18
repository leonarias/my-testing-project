package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavMenuPage {

	private static WebElement element = null;
	
	// Single elements:
	
	public static WebElement pom_Home(WebDriver driver){
        element = driver.findElement(By.linkText("Home"));
        return element;
        }
	
	public static WebElement pom_Weather(WebDriver driver){
        element = driver.findElement(By.linkText("Weather"));
        return element;
        }
	
	public static WebElement pom_API(WebDriver driver){
        element = driver.findElement(By.linkText("API"));
        return element;
        }
	
	public static WebElement pom_Price(WebDriver driver){
        element = driver.findElement(By.linkText("Price"));
        return element;
        }
	
	public static WebElement pom_Stations(WebDriver driver){
        element = driver.findElement(By.linkText("Stations"));
        return element;
        }
	
	public static WebElement pom_News(WebDriver driver){
        element = driver.findElement(By.linkText("News"));
        return element;
        }
	
	public static WebElement pom_Maps(WebDriver driver){
        element = driver.findElement(By.linkText("Maps"));
        return element;
        }
	
	public static WebElement pom_About(WebDriver driver){
        element = driver.findElement(By.linkText("About"));
        return element;
        }
	
	// Sub-menus:
	
	public static WebElement pom_Maps_WeatherMaps(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[3]/ul/li[1]/a"));
        return element;
        }
	
	public static WebElement pom_Maps_SatelliteMaps(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[3]/ul/li[2]/a"));
        return element;
        }
	
	public static WebElement pom_Maps_BeautifulMaps(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[3]/ul/li[3]/a"));
        return element;
        }
	
	public static WebElement pom_About_AboutCompany(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[8]/ul/li[1]/a"));
        return element;
        }
	
	public static WebElement pom_About_OwmPlatform(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[8]/ul/li[2]/a"));
        return element;
        }
	
	public static WebElement pom_About_BDTech(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[8]/ul/li[3]/a"));
        return element;
        }
	
	public static WebElement pom_About_MetModels(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[8]/ul/li[4]/a"));
        return element;
        }
	
	public static WebElement pom_About_DataSources(WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[8]/ul/li[5]/a"));
        return element;
        }	
	
	// Logo
	
	public static WebElement pom_Logo(WebDriver driver){
        element = driver.findElement(By.linkText("OpenWeatherMap"));
        return element;
        }
	
	

}
