package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathCase1 {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://twitter.com/i/flow/login");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb oXtfBe-l4eHX']")).click();
      Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-16y2uox r-1wbh5a2 r-1wzrnnt r-1udh08x r-xd6kpl r-1pn2ns4 r-ttdzmv']"));
	  Thread.sleep(2000);
	  driver.get("https://github.com/");
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='login_field']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='form-control input-block js-login-field']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='password']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='password']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='password']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='form-control form-control input-block js-password-field']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@class='label-link position-absolute top-0 right-0']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='commit']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='btn btn-primary btn-block js-sign-in-button']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@data-ga-click='Sign in, switch to sign up']")).click();
	  Thread.sleep(2000);
	  driver.get("https://www.airindia.com/");
	  driver.findElement(By.xpath("//input[@type='text']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='signInName']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='Email Address']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='password']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@id='next']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@id='createAccount']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@form='localAccountForm']")).click();
	}

}
