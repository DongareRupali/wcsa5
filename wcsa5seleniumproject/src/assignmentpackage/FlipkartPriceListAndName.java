package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartPriceListAndName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp Laptop");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='Core i5']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='Brand']")).click();
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='HP']")).click();	
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Operating System']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'HP Intel Core i5 11th Gen ')]/../..//[text()='₹52,490']"));
        
	}

}
