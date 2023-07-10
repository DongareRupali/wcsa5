package taskToPerform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//To launch the bluestone
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement targrt = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions act = new Actions(driver);
		
		act.moveToElement(targrt).perform();
		driver.findElement(By.xpath("//span[text()='2 gram'][1]")).click();
		WebElement gram = driver.findElement(By.xpath("//h1[text()='2 gram 24 KT Gold Coin']"));
		if(gram.isDisplayed())
		{
			Thread.sleep(2000);
			driver.quit();
		}
		

	}

}
