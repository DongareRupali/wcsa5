package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiselectDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/MultiSelectDropdownMoreThanTwenty.html");
		
		//to identify dropdown
		 WebElement MultiSelectDD = driver.findElement(By.id("colour"));
		 
		//to handle the dropdown
		 Select sel = new Select(MultiSelectDD);
		 
		 Thread.sleep(2000);
		 //to select By using index
		 sel.selectByIndex(1);
		 
		 Thread.sleep(2000);
		 //to select by using value 
		 sel.selectByValue("v1");
		 
		 Thread.sleep(2000);
		 //to select by using visible text
		 sel.selectByVisibleText("Pink");
		 
		 Thread.sleep(2000);
		 //to deselect by using index
		 sel.deselectByIndex(1);
		 
		 Thread.sleep(2000);
		 //to deselect by using value
		 sel.deselectByValue("v1");
		 
		 Thread.sleep(2000);
		 //to deselect by using visible text
		 sel.deselectByVisibleText("Black");
		 
		 //to select multiple options by using for loop
		 for(int i=0;i<5;i++)
		 {
			 sel.selectByIndex(i);
			 Thread.sleep(2000);
			 
		 }
		 Thread.sleep(2000);
		 
		 //to select multiple options by using for loop
		 for(int i=0;i<5;i++)
		 {
			 sel.deselectByIndex(i);
			 Thread.sleep(2000);
			 
		 }
		 //to deselct all options using deselectAll()
		 sel.deselectAll();
		 
		
		
		
	}

}
