package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/Username%20and%20Password%20by%20Tanmay%20Sir%20Method.html");
	    Thread.sleep(2000);
	    // 1.tagName
	    //driver.findElement(By.tagName("input")).sendKeys("Admin");
	    Thread.sleep(2000);
	    //driver.findElement(By.tagName("input")).sendKeys("Manager");
	    //2.Id
	    //driver.findElement(By.id("n1")).sendKeys("Admin");
	    //driver.findElement(By.id("n2")).sendKeys("Manager");
	    //3.name
	    //driver.findElement(By.name("n1")).sendKeys("Admin");
	    //driver.findElement(By.name("n2")).sendKeys("Manager");
	    //4.className
	    driver.findElement(By.className("cla1")).sendKeys("Admin");
	    driver.findElement(By.className("cla1")).sendKeys("Manager");
	}
}