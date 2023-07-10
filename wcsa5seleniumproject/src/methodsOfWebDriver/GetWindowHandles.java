package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		// get the handle or address of current or parent window it will return thr address of thr current window
		String prentHandle = driver.getWindowHandle();
		System.out.println("Address of parent window: "+prentHandle);
		//launch the child window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		//get the handle or address of child window only
		Set<String> allHandles = driver.getWindowHandles();
		//Read addresess by using looping statement
		for(String wh:allHandles)
		{
			System.out.println(wh);
		}
	}

}
