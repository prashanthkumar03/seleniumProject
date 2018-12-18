package com.NewToursLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		// <input type="text" size="10" name="userName">
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		// <input type="password" size="10" name="password">
		driver.findElementByName("password").sendKeys("tutorial");
		
		// <input width="58" type="image" border="0" height="17" alt="Sign-In" src="/images/btn_signin.gif?osCsid=5e46ebaf71c4e520b7048a1ed44d45bb" 
		// value="Login" name="login">
		
		driver.findElementByName("login").click();
		
		String expected_Title="Find";
		System.out.println(" The expected Title is :"+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println(" The actual title is :"+ actual_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println(" User LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" User Failed to logIn - FAIL");
		}

		driver.close();
	}

}
