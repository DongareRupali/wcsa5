package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/MultiSelectDropdownMoreThanTwenty.html");
		// identify dropdown
		WebElement dropdownElement = driver.findElement(By.id("colour"));
		//handle the dropdown
		Select sel=new Select(dropdownElement);
		//select multiple option from dropdown
		for(int i=2;i<=5;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
			
		}
		//to read all selected option from dropdown
		List<WebElement> allOpts = sel.getAllSelectedOptions();
//		//to read the list of webelement we use loop
//		for(WebElement op:allOpts)
//		{
//			Thread.sleep(2000);
//			System.out.println(op.getText());
//		}
		for(int i=0;i<allOpts.size();i++)
		{
			Thread.sleep(2000);
		  System.out.println(allOpts.get(i).getText());
			
		}
		

	}

}
