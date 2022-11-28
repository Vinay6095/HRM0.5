package OrangeHRM.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import OrangeHRM.base.TestBase;



public class HomePage extends TestBase {
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")

	WebElement Admin;
	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")

	WebElement ClickonAdd;
	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")

	WebElement Pass;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")

	WebElement Name;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")

	WebElement EPName;

	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")

	WebElement Compirmpass;
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void admin() throws InterruptedException {
		Thread.sleep(2000);
		Admin.click();
	}
	
	public void ClickonAdd() throws InterruptedException {
		ClickonAdd.click();
		Thread.sleep(2000);
	}
	
	public void Ename() throws InterruptedException {
		Name.sendKeys("Kevin  Mathews");
		Thread.sleep(1000);
		
	}
	
	public void username() throws InterruptedException {
		EPName.sendKeys("Vinay6095");
		Thread.sleep(2000);
		
	}
	
	public void Realpass() throws InterruptedException {
		Pass.sendKeys("Vinay@123");
		Thread.sleep(2000);
		Compirmpass.sendKeys("Vinay@123");
		
	}
	

}
