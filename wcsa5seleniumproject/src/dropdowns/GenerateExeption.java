package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateExeption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/Singleselectdropdown.html");
		//identify dropdown on webpage
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		//handle the dropdown by creating object
		Select sel = new Select(dropDownElement);
		Thread.sleep(2000);
		//select the option from dropdown
		sel.selectByIndex(2);
		Thread.sleep(2000);
		//try to deselect the option from dropdown
		sel.deselectByIndex(2);
		

	}

}
