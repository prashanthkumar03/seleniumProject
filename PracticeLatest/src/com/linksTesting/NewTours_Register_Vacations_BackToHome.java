package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class NewTours_Register_Vacations_BackToHome {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElementByLinkText("REGISTER").click();
		
		// <a href="mercuryunderconst.php">Vacations</a>
		
		driver.findElement(By.linkText("Vacations")).click();
		
		// <img width="118" border="0" height="23" src="/images/forms/home.gif">
		
		// xpath of "Back to Home" - html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
		
		WebElement backToHome=driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img");
		backToHome.click();
		

	}

}
