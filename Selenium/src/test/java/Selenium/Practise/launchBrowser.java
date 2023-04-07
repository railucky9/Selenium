package Selenium.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchBrowser {

	public static void main(String[] args) {

		/*System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        
		driver.get("https://www.google.com/");*/
		
		// using driver manager
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
        
		driver.get("https://www.nopcommerce.com/en");
		
		System.out.println("Title of the web page is "+driver.getTitle());
		System.out.println("Current URL the web page is "+driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		
		
	}

}
