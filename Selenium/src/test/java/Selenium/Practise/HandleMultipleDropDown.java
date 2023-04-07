package Selenium.Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		//approach 1
		
		/*Select noOfEmpsdrp = new Select(driver.findElement(By.name("NoOfEmployees")));
		noOfEmpsdrp.selectByVisibleText("16 - 20");
		
		Select industryDrp = new Select(driver.findElement(By.name("Industry")));
		industryDrp.selectByVisibleText("Travel");
		
		
		Select countryDrp = new Select (driver.findElement(By.name("Country")));
		countryDrp.selectByVisibleText("Aruba"); */
		
		//approach 2
		
		WebElement noOfEmpsEle = driver.findElement(By.name("NoOfEmployees"));
		selectOptionFromDropDown(noOfEmpsEle, "16 - 20");
		
		
		WebElement industryEle = driver.findElement(By.name("Industry"));
		selectOptionFromDropDown(industryEle, "Healthcare");
		
	
	}

	public static void selectOptionFromDropDown(WebElement ele, String value) {
		// TODO Auto-generated method stub
		{
			Select drp = new Select(ele);
			
			List<WebElement> alloptions = drp.getOptions();
			
			for(WebElement option :alloptions )
			{
				if(option.getText().equals(value))
				{
					option.click();
					break;
				}
					
			}
		}
	}

}
