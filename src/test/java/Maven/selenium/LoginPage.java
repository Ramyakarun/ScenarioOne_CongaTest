package Maven.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Maven.selenium.testNG;

public class LoginPage {
static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"header\"]//a[@title='Log in to your customer account']")
	static
	WebElement signInButton;
	
	@FindBy(id="email")
	static
	WebElement userID_txtBox;
	
	@FindBy(id="passwd")
	static
	WebElement password_txtBox;
	
	@FindBy(xpath="//*[@id='SubmitLogin']")
	static
	WebElement loginButton;
	
	public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	public static void LoginTest() {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(signInButton));
		signInButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(userID_txtBox));
		userID_txtBox.sendKeys("jetblue@grr.la");
		password_txtBox.sendKeys("jetblue");
		loginButton.click();
		
	}

}
