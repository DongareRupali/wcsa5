package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/"); //to launch the Bluestone application
		driver.findElement(By.id("denyBtn")).click(); //handle Pop up
		WebElement target = driver.findElement(By.xpath("a[@title='Watch Jewellery']"));
		//To perform mouse actions on webelement
		Actions act = new Actions(driver);
		//to perform mouse over action
		act.moveToElement(target).perform();  
		
		////a[@title='Coins']
		
		
	}

}
