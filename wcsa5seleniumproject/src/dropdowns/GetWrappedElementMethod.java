package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/MultiSelectDropdownMoreThanTwenty.html");
	    
	    //to identify dropdown
	    WebElement dropElement = driver.findElement(By.id("colour"));
	    
	    //To handle the dropdown
	    Select sel = new Select(dropElement);
	    
	    //To read all options from dropdown
	    WebElement allOpts = sel.getWrappedElement();
	   System.out.println(allOpts.getText());
	    
	
		
	}
	
	
}
