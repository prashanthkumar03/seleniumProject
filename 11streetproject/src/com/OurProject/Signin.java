package com.OurProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signin {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.11street.my/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByClassName("header-utility-item").click(); //click on login link
		driver.findElementById("loginName").sendKeys("quality.assurance@11street.my"); //userName
		driver.findElementById("passWord").sendKeys("QAonly11"); //Password
		driver.findElementById("keepLOGIN").click(); //Check box
		driver.findElementByXPath(".//*[@id='container']/article/div[1]/fieldset/div[2]/button").click(); //Login button
		driver.findElementByClassName("header-utility-item").click(); // Logout
		
		//driver.quit();
		
	}

}
