package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathCase2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign in with Apple']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign in to Twitter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		
	}

}
