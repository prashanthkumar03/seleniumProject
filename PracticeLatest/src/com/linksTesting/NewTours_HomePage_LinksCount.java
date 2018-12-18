package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_LinksCount {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		// <a href="mercurysignon.php?osCsid=f285e441d922233d349b6baac9202596">SIGN-ON</a>
		// <a href="mercuryregister.php?osCsid=f285e441d922233d349b6baac9202596">REGISTER</a>
		// <a href="mercuryunderconst.php?osCsid=f285e441d922233d349b6baac9202596">SUPPORT</a>
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		
		System.out.println(" Total links on NewTours Home Page are : "+linksCount);
		
		driver.quit();
		

	}

}
