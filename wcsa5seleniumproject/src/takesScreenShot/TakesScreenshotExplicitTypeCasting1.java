package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenshotExplicitTypeCasting1 {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/"); //to launch the application
		
		// TypeCasting to WebDriver to TakesScreen
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//to create object of file class to store object in class
		File dest = new File("./screenshots/google.png");// store three things in arg i.e 1)path 2)Name 3)Extension
		// Take the help of Files Class to copy from src and paste it in dest
		Files.copy(src, dest);
	}

}
