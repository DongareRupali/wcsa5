package assignmentpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotstarLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.crome.driver","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(null);
	}

}
