package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo
{
			public static void main(String[] args) 
			{
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/Username%20Textbox.html");
				WebElement usn = driver.findElement(By.tagName("input"));
				usn.sendKeys("qspiders");
				
			}


	}

