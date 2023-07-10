package synchrinization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramInvalidLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.cssSelector("input[name*='er']")).sendKeys("admin@123");
		driver.findElement(By.className("input[name*='word']")).sendKeys("idontknow");
		driver.findElement(By.cssSelector("button[class*='ap']")).click();
		
		

	}

}
