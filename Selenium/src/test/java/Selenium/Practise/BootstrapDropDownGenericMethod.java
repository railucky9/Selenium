package Selenium.Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDownGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		
		//quota
	driver.findElement(By.xpath("//div[@class=\"ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all\"]")).click();
	List<WebElement> quotas = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//span"));
	
	//selectOptionFromDropDown(quotas, "PREMIUM TATKAL");
	selectOptionFromDropDown(quotas, "TATKAL");

	}
	
	public static void selectOptionFromDropDown(List<WebElement> quotas, String value) {
		
		for(WebElement qtas : quotas)
		{
			if(qtas.getText().equals(value))
			{
				qtas.click();
			     break;
			}
		}
	}
	

}
