package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator1 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class$='6luy']")).sendKeys("qspider");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='e']")).sendKeys("qspider");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("qspider");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='_51sy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name]")).click();
	
		driver.get("https://www.instagram.com/");
		driver.findElement(By.cssSelector("")).sendKeys("qspider");
		Thread.sleep(2000);
		
		

	}

}
