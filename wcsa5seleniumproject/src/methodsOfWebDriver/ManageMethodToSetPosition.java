package methodsOfWebDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ManageMethodToSetPosition
{
	public static Point Point;

	public class ManageMethodToMaximize 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().window().setPosition(Point);
			Thread.sleep(2000);
			driver.close();
		
		}

	}

}
