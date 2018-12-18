package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		// a - tag -- link
		// href - attribute -- reference URL
		
		// locotar - linkText
		// Selector - REGISTER
		
		//driver.findElement(By.linkText("REGISTER")).click();
		         // or
		//driver.findElementByLinkText("REGISTER").click();
		        // or
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
