package Selenium.Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckbox {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//1) select specific checkbox
		
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//2) select all the checkboxes
		
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("Total no of check boxes:"+checkboxes.size());
		
		/*using for loop
		
		for(int i=0; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}*/
		
		/*using for each loop
		
		for(WebElement chbox: checkboxes) {
			chbox.click();
		}*/
		
		//3) select multiple check boxes by choice like - Monday & Sunday
		
		/*for(WebElement chbox: checkboxes) {
			String checkboxname = chbox.getAttribute("id");
			
			if(checkboxname.equals("monday") || checkboxname.equals("sunday")) {
				chbox.click();
			}
		}*/
		
		//4) select last 2 check boxes
		
	// starting index = total no. of check boxes - no. of check boxes want to select
		
		/*int totalCheckBoxes = checkboxes.size();
		
		for(int i = totalCheckBoxes-2; i<totalCheckBoxes; i++) {
			
			checkboxes.get(i).click();
		}*/
		
	//5) select first 3 check boxes
		
		int totalCheckBoxes = checkboxes.size();
		
		for(int i =0; i<totalCheckBoxes; i++) {
			
			if(i<3)
			{
				checkboxes.get(i).click();
			}
		}
		
	}

}
