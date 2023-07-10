package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator3 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.driver.chrome","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();
		
	}

}
