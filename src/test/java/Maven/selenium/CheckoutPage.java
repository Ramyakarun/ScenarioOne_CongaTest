package Maven.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CheckoutPage {
	 static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	static WebElement success_msg;
	
	@FindBy(xpath="//*[@id='layer_cart_product_title']")
	static WebElement product_title;
	
	@FindBy(xpath="//*[@id='layer_cart_product_attributes']")
	static WebElement Product_attribute;
	
	@FindBy(xpath="//*[@id='layer_cart_product_quantity']")
	static WebElement Product_quantity;
	
	@FindBy(xpath="//*[@id='layer_cart_product_price']")
	static WebElement Product_price;
	
	public CheckoutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	
	public static void CheckoutTest() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(product_title));
			Assert.assertEquals(success_msg.getText().trim(),"Product successfully added to your shopping cart");
			 String Product_Name_str=product_title.getText();
			 String Product_Attribute_str=Product_attribute.getText();
			 String Product_quantity_str=Product_quantity.getText();
			 String product_price_str=Product_price.getText();
			 Assert.assertEquals(Product_Name_str, "Faded Short Sleeve T-shirts");
			 Assert.assertEquals(Product_Attribute_str, "Orange, S");
			 Assert.assertEquals(Product_quantity_str, "1");
			 Assert.assertEquals(product_price_str, "$16.51");

		 driver.findElement(By.xpath("//*[@id=\"layer_cart\"]//span[contains(text(),'Proceed to checkout')]")).click();
		 

	}

}
