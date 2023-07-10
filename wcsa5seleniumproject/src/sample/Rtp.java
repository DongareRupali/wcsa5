package sample;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp 
{
	public static void main(String[] args) throws InterruptedException 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Which Browser yoy want to open!");
	String browserValue=sc.next();
	if(browserValue.equalsIgnoreCase("Chrome"))
	{ //to launch chrome
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	//to launch Firefox browser
	else if(browserValue.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	//to launch Edge browser
	else if(browserValue.equalsIgnoreCase("Edge"))
	{
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	else
	{
		System.out.println("Enter valid browser name");
	}

    }
}
