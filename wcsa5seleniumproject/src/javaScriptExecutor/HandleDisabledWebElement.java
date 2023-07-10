package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/usename%20and%20password%20disabled%20Element.html");
		driver.findElement(By.id("i1")).sendKeys("admin");
		//driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(2000);
		//typecasting of javascriptexecutor into driver ref variable to access d methods
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//generate alert popup
		
		//jse.executeScript("alert('Hello There!!');");
		Thread.sleep(2000);
		
		//to handle disabled webelement arguments are java script code
		jse.executeScript("document.getElementById('i2').value='manager'");
		
	}

}
