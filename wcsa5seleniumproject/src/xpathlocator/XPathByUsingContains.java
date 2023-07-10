package xpathlocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByUsingContains {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.Chrome.driver","./driver/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		
	
      
	}

}
