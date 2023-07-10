package popuphandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/ConfirmationPopup.html");
		
		//to generate confirmation popup click on submit button
		driver.findElement(By.tagName("input")).click();
		// handle confirmation popup by using switcTo()
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		//al.accept(); //to accept confirmation popup
		//al.dismiss(); //to dissmiss the confirmation popup
		System.out.println(al.getText());
		//al.accept();
		al.dismiss();
		al.sendKeys("getText");
		
		
	}

}
