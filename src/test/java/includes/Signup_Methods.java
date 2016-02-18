package includes;

import java.util.List;
import cucumber.api.DataTable;
import page_objects.SignUpPage;

public class Signup_Methods extends FeatureHelpMod {
	
	public void createNewAccount(DataTable table) {
		List<List<String>> data = table.raw();
		
		SignUpPage.pom_username_txt(driver).sendKeys(data.get(1).get(1));
		SignUpPage.pom_email_txt(driver).sendKeys(data.get(2).get(1));
		SignUpPage.pom_password_txt(driver).sendKeys(data.get(3).get(1));
		SignUpPage.pom_password_confirmation_txt(driver).sendKeys(data.get(4).get(1));
		
		SignUpPage.pom_terms_policy_chkbox(driver).click();
		
		SignUpPage.pom_create_account_btn(driver).click();
		
		} 
	
    
}





