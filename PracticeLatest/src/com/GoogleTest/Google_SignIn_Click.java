package com.GoogleTest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_SignIn_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		
		// id="gb_70" -- signIn
		
		driver.findElementById("gb_70").click();
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
