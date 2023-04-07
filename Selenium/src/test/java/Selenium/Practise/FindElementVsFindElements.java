package Selenium.Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
      
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
	// findelement() -------> single webelement
		
		//1
		
	/*WebElement	search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
	search.sendKeys("xyz");
		
     //2
	
	WebElement ele = driver.findElement(By.xpath("//div[@class='middleTop row']//a"));
	System.out.println(ele.getText());
	
	//3
	
	WebElement ele1 = driver.findElement(By.xpath("//div[@class='middleTop ro']//a"));  // NoSuchElementException */
	
	//findselements------------> Returns multiple web elements
	 
		
		//1
	List<WebElement> links = driver.findElements(By.xpath("//div[@class='middleTop row']//a"));
	System.out.println("no. of captured element is "+links.size());
	
	for(WebElement ele :links) {
	 
		System.out.println(ele.getText());
	}
	
	//2
	List<WebElement> links1 = driver.findElements(By.xpath("//div[@class='middleTop ro']//a"));
	System.out.println(links1.size()); // return 0 if webelement is not found
}
}
