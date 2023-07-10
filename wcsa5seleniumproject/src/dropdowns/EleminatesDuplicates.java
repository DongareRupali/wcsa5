package dropdowns;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EleminatesDuplicates {

	public static void main(String[] args) {
		//By using Hashset
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/MultiSelectDropdownMoreThanTwenty.html");
		//identify dropdown
		 WebElement dropDownElement = driver.findElement(By.id("colour"));
		 //handle dropDown
		 Select sel = new Select(dropDownElement);	
		 
		HashSet<String> hs = new HashSet<String>();
		
		// to get options from dropdown
		List<WebElement> allOpts = sel.getOptions();
		
		// to read options from dropdown
		for(int i=0; i<allOpts.size(); i++)
		{
			WebElement op = allOpts.get(i);
			// get text of webelement and ad into set 
			String value = op.getText();
			
			
		}
		

	}

}
