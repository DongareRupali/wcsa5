package taskToPerform;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//To launch the bluestone
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//span[text()='Offers ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Robot robot = new Robot();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Up To 20% Off Making Charges']")).click();
		if(driver.findElement(By.xpath("//span[text()='UPTO 20 PERCENT OFF ON MAKING CHARGES JEWELLERY']")).isDisplayed())
		{
			driver.quit();
		}
			
	}

}
