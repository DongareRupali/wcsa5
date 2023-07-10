package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) throws InterruptedException 
	{	
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.spicejet.com/");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar']")).click();
       //Thread.sleep(2000);
       driver.findElement(By.xpath("//div[text()='Email']")).click();
       driver.findElement(By.xpath("//input[@spellcheck='false'and @type='number'and @value]"));

	}

}
