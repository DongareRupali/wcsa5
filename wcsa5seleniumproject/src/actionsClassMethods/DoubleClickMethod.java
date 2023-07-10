package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//To launch the Actitime
		driver.get("http://127.0.0.1/login.do;jsessionid=14d98xa1rehno");
		
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		// perform login Operation
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//Home page
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		//Click on Setting Module
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		
		// Click on Logo and Colour
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		// click on use custom logo
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		
		// Click on button to select the title
		//driver.findElement(By.name("formCustomInterfaceLogo.logo")).click();
		
		//perform double click
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act = new Actions(driver);

		act.doubleClick(target).perform();
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
