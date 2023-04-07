package Selenium.Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestiDropDown_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("javascript");
		
		Thread.sleep(3000);
		List<WebElement>list=driver.findElements(By.xpath("//li[@class=\"sbct\"]//div[@role=\"option\"]//div[1]//span"));
		
		System.out.println("Size of Auto suggestions:"+list.size());

	
	   for(WebElement listitem :list) {
		
		if(listitem.getText().contains("tutorial"))
		{
			listitem.click();
			break;
		}
	}


	}

}
