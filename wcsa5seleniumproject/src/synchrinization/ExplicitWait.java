package synchrinization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebDriverWait explicitWait= new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='men']")).click();
		driver.findElement(By.xpath("//img[@alt='HOODIES']")).click();
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("411033");
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']"))).click();
		
		

	}

}

