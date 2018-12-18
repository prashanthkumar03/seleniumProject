package com.MouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_HelloSignIn {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://amazon.in");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//  id="nav-link-yourAccount"
		
		WebElement helloSignIn=driver.findElementById("nav-link-yourAccount");
		
		// Actions Class is used to perform both Mouse and  Keyboard Operation
		// MouserHover operation on HelloSignIn Element using Actions Class
		Actions act = new Actions(driver);
		act.moveToElement(helloSignIn).build().perform();
		
		// .//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span - Your Wish List
		
		driver.findElementByXPath(".//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span").click();

	}

}
