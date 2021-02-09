package Maven.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a[@title='T-shirts']")
	static WebElement tshirt_tab;
	
	@FindBy(xpath="//*[@id='center_column']//h5/a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")
	static WebElement product;
	
	@FindBy(xpath="//p[@id='add_to_cart']/button[@name='Submit']/span[contains(text(),'Add to cart')]")
	static WebElement addToCart_Btn;
	
	public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	
	public static void HomepageTest() {
		tshirt_tab.click();
		product.click();
		addToCart_Btn.click();
		 
	}
}
