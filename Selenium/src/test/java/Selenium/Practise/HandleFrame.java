package Selenium.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
         
		driver.manage().window().maximize();
		
		//1st iframe
		driver.switchTo().frame("packageListFrame"); //name of the frame		
		driver.findElement(By.xpath("//a[normalize-space()=\"org.openqa.selenium\"]")).click();
		driver.switchTo().defaultContent(); // go back to the main page
		
		Thread.sleep(3000);
		
		//2nd iframe
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[normalize-space()=\"WebDriver\"]")).click();
		driver.switchTo().defaultContent(); // go back to the main page
		
		Thread.sleep(5000);
		
		//3rd iframe
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//div[@class=\"topNav\"]//a[normalize-space()=\"Help\"]")).click();
		
		
		
	}

}
