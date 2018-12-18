package com.OurProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SignUp {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.11street.my/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Mouse over on My page
		WebElement mypage = driver.findElementByClassName("my-page-text");
		Actions act = new Actions(driver);
		act.moveToElement(mypage).build().perform();
		//Click on Shopping History
		driver.findElementByXPath("html/body/header/div[3]/div/div[1]/ul/li[3]/div/ul/li[1]/span[1]/a").click();
		
		
		
		
		//Sign up
		
		//driver.findElementByLinkText("Sign Up").click(); //sign up button from home page
			
	    //member sign up
		//driver.findElementByXPath("/html/body/main/div/div[1]/a[2]").click();
			
			//create buyer account
			
			//driver.findElementById("memNM").sendKeys(""); //Name
			//driver.findElementById("memIDView").sendKeys("");//Email
			//driver.findElementById("mem_pwd").sendKeys("273521745");//Password
			//driver.findElementById("mem_re_pwd").sendKeys("2634623489"); //Confirm Password
			//driver.findElementById("submit-signup").click(); //signUp
		    //driver.findElementByLinkText("Continue Shopping").click(); //Continue Shopping
			
			
			
			//driver.close();

	}

}
