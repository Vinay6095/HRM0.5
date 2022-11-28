package OrangeHRM.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import OrangeHRM.base.TestBase;



public class LoginPage extends TestBase {
	
	
	//page factory - OR
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement loginbtn;
	 
	//Initializing page objects:
	public LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	//Actions:
public String validateLoginPageTitle() {
	
	return driver.getTitle();
	
}

public HomePage Login(String un, String pwd) throws InterruptedException, IOException {
	
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginbtn.click();
	
	Thread.sleep(3000);
	
	return new HomePage();
}


}