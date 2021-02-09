package Maven.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInit {
	private static DriverInit instanceDriver=null;
	public static WebDriver driver;
	
	private DriverInit() {
		
	}
	public static WebDriver openBrowser() {
		ChromeOptions chromeOptions = new ChromeOptions();
		 WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver(chromeOptions);
		return driver;
	}
	
	public static DriverInit getInstance() {
		if(instanceDriver==null) {
			instanceDriver=new DriverInit();
			
		}
		return instanceDriver;
	}

}
