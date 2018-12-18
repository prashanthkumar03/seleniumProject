package com.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_Register_Country_Select {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		// Sleeper.sleepTightInSeconds(5);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElementByLinkText("REGISTER").click();
		
		// <select size="1" name="country">

		WebElement country=driver.findElement(By.name("country"));
		
		Select selection = new Select(country);
		//selection.selectByIndex(6);
		// selection.selectByVisibleText("INDIA");
		selection.selectByValue("251");
		
		


	}

}
