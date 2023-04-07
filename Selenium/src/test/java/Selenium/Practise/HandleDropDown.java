package Selenium.Practise;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id=\"input-country\"]"));
         Select drpCountry = new Select(drpCountryEle);
         
         /*drpCountry.selectByVisibleText("Denmark");
         drpCountry.selectByValue("10"); // Argentina
         drpCountry.selectByIndex(13);  // Australia */
         
         //selecting option from dropdown without using methods
         
         List<WebElement> alloptions = drpCountry.getOptions();
         
         for(WebElement option: alloptions) {
        	 
        	 if(option.getText().equals("Cuba"))
        	 {
        		 option.click();
        		 break;
        	 }
         }
         
         
	}

}
