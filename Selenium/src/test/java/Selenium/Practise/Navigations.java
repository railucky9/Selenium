package Selenium.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.snapdeal.com/");
		
		driver.navigate().back();  //amazon
		driver.navigate().forward();  //snapdeal
		driver.navigate().refresh();

		
// get() accepts only one string parameter, and wait till page load
// navigate().to() accepts string parameter and URL instance as parameter, and doesn't wait to page load , maintain browser history or cookie to navigate back or forward 
	}

}
