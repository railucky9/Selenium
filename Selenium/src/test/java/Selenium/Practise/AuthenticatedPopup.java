package Selenium.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatedPopup {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//https://the-internet.herokuapp.com/basic_auth
		
		//syntax
		// https://admin:admin@the-internet.herokuapp.com/basic_auth
		//   http://user:password@URL
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		

	}

}
