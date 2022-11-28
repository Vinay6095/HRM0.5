package OrangeHRM.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	//public static ChromeOptions options;
	
	
	public TestBase() throws IOException {
		
	    prop=new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Vinay\\Desktop\\Selenium\\HRM\\src\\main\\java\\OrangeHRM\\config\\Config.properties");
		
		prop.load(ip);
		
		//System.out.println(prop.getProperty("browser "));
	}


public static void initialisation() throws InterruptedException {
	
	String browsername = prop.getProperty("browser");
	
	if(browsername.equals("chrome")) {
		//WebDriverManager.chromedriver.setup();
		ChromeOptions options=new ChromeOptions();
		String downloadpath=System.getProperty("user.dir");
		HashMap<String, Object> chromePref = new HashMap<String, Object>();

		chromePref.put("download.default_directory_content_settings.popup", 0);
		chromePref.put("download.default_directory", downloadpath);
		options.setExperimentalOption("prefs", chromePref);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinay\\Desktop\\Selenium\\HRM\\Driver\\chromedriver.exe");
		driver=new ChromeDriver(options);
	}
	else if(browsername.equals("FF")) {
		
		System.out.println("webdriver is not there");
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	
	System.out.println(prop.getProperty("url"));
	//Thread.sleep(30000);
	}
}
