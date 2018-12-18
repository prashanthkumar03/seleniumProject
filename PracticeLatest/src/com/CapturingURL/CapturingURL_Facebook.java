package com.CapturingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingURL_Facebook {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String title=driver.getTitle();
		System.out.println(" The title of facebook is: "+title);
		
		String url=driver.getCurrentUrl();
		System.out.println(" The URL of facebook is :"+url);
		
		driver.close();

	}

}
