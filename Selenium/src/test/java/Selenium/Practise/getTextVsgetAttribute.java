package Selenium.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextVsgetAttribute {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/login");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='Username']"));
		
		username.clear();
		username.sendKeys("admin123@gmail.com");
		
		//capturing text from inputbox
		
		System.out.println(username.getAttribute("class"));
		System.out.println(username.getText());
		
		//login button
		
		WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
		System.out.println(login.getAttribute("value"));
		
		String title = driver.findElement(By.xpath("//h1[normalize-space()=\"Welcome, Please Sign In!\"]")).getText();
		System.out.println("page title is "+title);
		
	}

}
