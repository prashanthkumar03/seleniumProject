package com.ValidatingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingUrl_Facebook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.manage().window().maximize();
		
		String expected_Url="facebook.com";
		System.out.println(" Expected Url is :"+expected_Url);
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println(" Actual url is :"+actual_Url);
		
		if(actual_Url.contains(expected_Url))
		{
			System.out.println(" URL matched - PASS");
		}
		else
		{
			System.out.println(" URL not Matched - FAIL");
		}
		
		driver.close();
	}

}
