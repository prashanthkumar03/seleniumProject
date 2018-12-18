package com.KeyboardOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_LogIntest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// <input id="email"
		driver.findElementById("email").sendKeys("Rajesh");
		
		// Keyboard Operation -- Actions class
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		
		act.sendKeys("Hello").build().perform();
		
		act.sendKeys(Keys.ENTER).build().perform();
		

	}

}
