package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
;
public class SpicejetLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.Chrome.driver","./driver/Chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rupali@123");
		driver.findElement(By.xpath("//div[@data-testid='login-cta']")).click();
		

	}

}
