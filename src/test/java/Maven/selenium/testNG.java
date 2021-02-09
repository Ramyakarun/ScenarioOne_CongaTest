package Maven.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG {
	 WebDriver driver;
	

	@BeforeMethod
	public void setUp() {
		driver = DriverInit.openBrowser();
			 driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			 driver.get("http://Automationpractice.com");
			 }
	
	@Test
	public void testmethod() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		HomePage hp=new HomePage(driver);
		CheckoutPage cp=new CheckoutPage(driver);
		
		 LoginPage.LoginTest();
		 HomePage.HomepageTest();
		 CheckoutPage.CheckoutTest();		 
		 
		 
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
		

}
