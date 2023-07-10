package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSignUp {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.Chrome.driver","./driver/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		//to click on signup link
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("abc");
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("zyz");
		
	
	}

}
