package com.FacebookLogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://facebook.com");
		
		driver.manage().window().maximize();
		
		// <input id="email" class="inputtext" type="email" data-testid="royal_email" tabindex="1" name="email">
		
		//locator  - id
		//Selector - email
		
		driver.findElement(By.id("email")).sendKeys("Prashanth");
		
		// <input id="pass" class="inputtext" type="password" data-testid="royal_pass" tabindex="2" name="pass">
		
		driver.findElement(By.id("pass")).sendKeys("HEllo");

		// <label id="loginbutton" class="uiButton uiButtonConfirm" for="u_0_2">
		
		driver.findElement(By.id("loginbutton")).click();
	}

}
