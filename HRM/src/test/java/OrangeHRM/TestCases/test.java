package OrangeHRM.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import OrangeHRM.Pages.HomePage;
import OrangeHRM.Pages.LoginPage;
import OrangeHRM.base.TestBase;




public class test extends TestBase {
	LoginPage login;
	HomePage Home;
	

	public test() throws IOException {
		super();
		
	}

	
	
     @Test
	public void Orangehrmtest() throws InterruptedException, IOException {
    	 initialisation();
    	 login=new LoginPage();
    	 login.Login(prop.getProperty("username"), prop.getProperty("pass"));
    	 Thread.sleep(3000);
    	 System.out.println("Loging in");
    	 Home=new HomePage();
    	 Home.admin();
    	 System.out.println("Clicked on admin");
    	 Home.ClickonAdd();
    	 System.out.println("Clicked on Add btn");
    	 Home.Ename();
    	 Home.username();
    	 Home.Realpass();
    	System.out.println("Finished execution");
		
	}
     
     @AfterMethod
 	public void close() {
 	driver.quit();
 	}

}
