package Selenium.Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestDropDown_BingSearch {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement>list=driver.findElements(By.xpath("//li[@role=\"option\"]"));
		
		System.out.println("Size of Auto suggestions:"+list.size());

	
	   for(WebElement listitem :list) {
		
		if(listitem.getText().contains("download"))
		{
			listitem.click();
			break;
		}
	}

}
}