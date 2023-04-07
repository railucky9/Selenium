package Selenium.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class statusOfWebelement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/register");
	
		// isDisplayed() isEnabled()
		
	WebElement	firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
	WebElement	firstName1 = driver.findElement(By.cssSelector("label[for=\"FirstName\"]"));
	
	
	System.out.println("Enabled status:"+firstName.isEnabled());   //true
	System.out.println("Enabled status:"+firstName1.isDisplayed());  //true

	
     /*// isSelected()

	WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
	 
	male.click();
	
	System.out.println(male.isSelected());  //true
	System.out.println(female.isSelected());//false */ 
		
	}

}
