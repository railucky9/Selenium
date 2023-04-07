package Selenium.Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//div[@class=\"ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all\"]")).click();
		List<WebElement> allClasses = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("Number of options: "+allClasses.size());
		
		for(WebElement aclasses :allClasses )
		{
			if(aclasses.getText().equals("AC 2 Tier (2A)"))
			{
				aclasses.click();
				break;
			}
		}
		
		//quota
	driver.findElement(By.xpath("//div[@class=\"ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all\"]")).click();
	List<WebElement> quotas = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//span"));
	
	for(WebElement qtas : quotas)
	{
		if(qtas.getText().equals("PREMIUM TATKAL"))
		{
			qtas.click();
		     break;
		}
	}

	}

}
