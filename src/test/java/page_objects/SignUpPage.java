package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	
private static WebElement element = null;
	
	// TOP of the Page:
	public static WebElement pom_username_txt(WebDriver driver){
        element = driver.findElement(By.id("user_username"));
        return element;
        }
	
	public static WebElement pom_email_txt(WebDriver driver){
        element = driver.findElement(By.id("user_email"));
        return element;
        }
	
	public static WebElement pom_password_txt(WebDriver driver){
        element = driver.findElement(By.id("user_password"));
        return element;
        }
	
	public static WebElement pom_password_confirmation_txt(WebDriver driver){
        element = driver.findElement(By.id("user_password_confirmation"));
        return element;
        }
	
	public static WebElement pom_terms_policy_chkbox(WebDriver driver){
        element = driver.findElement(By.id("user_agreement"));
        return element;
        }
	
	public static WebElement pom_create_account_btn(WebDriver driver){
        element = driver.findElement(By.name("commit"));
        return element;
        }

}
