package Selenium.Practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {

     WebDriverManager.chromedriver().setup();
     
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://opensource-demo.orangehrmlive.com/");
     
     //getWindowHandle()
     
     //String windowID = driver.getWindowHandle(); // return ID of the single browser window
     
     //System.out.println(windowID);
     
     Thread.sleep(3000);
     
     
     driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click(); //open another browser window child window
   //getWindowHandles
     
     Set<String> windowID = driver.getWindowHandles(); // return ID's of multiple browser windows
     
     //First method - iterator()
     
     /*Iterator<String> it = windowID.iterator();
     
     String parentWindowID = it.next();
     String childWindowID = it.next();
     
     System.out.println("Parent window ID:"+parentWindowID);
     System.out.println("Child window ID"+childWindowID);*/
     
     //Second Method - using List/ArrayList
     
     List <String> windowIDsList = new ArrayList(windowID);
     
     /*String parentWindowID = windowIDsList.get(0);
     String childWindowID = windowIDsList.get(1);
     
     System.out.println("Parent window ID"+parentWindowID);
     System.out.println("Child window ID"+childWindowID);
    
     
     driver.switchTo().window(parentWindowID);
     System.out.println("Parent window title is "+driver.getTitle()); 
     
     driver.switchTo().window(childWindowID);
     System.out.println("Child window title is "+driver.getTitle()); */
     
     //For each loop
     
     for(String winind : windowID)
     {
    	 //System.out.println(winind);
    	 String title = driver.switchTo().window(winind).getTitle();
    	 System.out.println(title);
     }
     
     //driver.close(); //close single browser window driver which pining
     //driver.quit(); // close all the browser windows
     
     for(String winind : windowIDsList) {
    	 
    	 String title = driver.switchTo().window(winind).getTitle();
    	 if(title.equals("OrangeHRM" )|| title.equals("another title"))
    	 {
    		 driver.close();
    	 }
    	 
     }

	}

}
