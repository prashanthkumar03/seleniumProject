package com.GetAttribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_GetAttribute_linkURL {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String expected_url=driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		System.out.println(" The Expected URL is : "+expected_url);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println(" The actual URL is : "+actual_Url);
		
		if(actual_Url.equals(expected_url))
		{
			System.out.println(" URL matched - PASS");
		}
		else
		{
			System.out.println(" URL not matched - FAIL");
		}
		
		
		driver.quit();

	}

}
