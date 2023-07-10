package sample;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowserWithPath 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.driver.exe","./drivers/msedgedriver.exe");
		new EdgeDriver();
		
	}

}
