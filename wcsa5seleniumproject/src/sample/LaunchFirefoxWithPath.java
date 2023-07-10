package sample;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxWithPath 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		new FirefoxDriver();
		
	}

}
