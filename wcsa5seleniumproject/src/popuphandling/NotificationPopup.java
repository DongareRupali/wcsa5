package popuphandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter BrowserValue!!");
        String browserValue = sc.next();
        
        if(browserValue.equalsIgnoreCase("Chrome"))
        {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        
        //handle Notification popup
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.easemytrip.com/");
        
	    }
        
        else if (browserValue.equalsIgnoreCase("Firefox"))
        {
        	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
            //handle Notification popup
            FirefoxOptions fo = new FirefoxOptions();
            fo.addArguments("--disable-notifications");
            FirefoxDriver driver = new FirefoxDriver(fo);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://www.easemytrip.com/");
        	
        }
        else if(browserValue.equalsIgnoreCase("edge"))
        {
        	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
            //handle Notification popup
            EdgeOptions eo = new EdgeOptions();
            eo.addArguments("--disable-notifications");
            EdgeDriver driver = new EdgeDriver(eo);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://www.easemytrip.com/");
        	
        }
        else
        {
        	System.out.println("Enter valid browserValue!!");
        }
        
	}
}

