package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/ ");
		// to perform scroll right
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		// to perform scroll right
		jse.executeScript("window.scrollBy(5000,0)");
		Thread.sleep(2000);
		// to perform scroll in left
		jse.executeScript("window.scrollBy(-5000,0)");
	}

}
