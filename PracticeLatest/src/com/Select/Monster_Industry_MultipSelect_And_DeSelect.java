package com.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_Industry_MultipSelect_And_DeSelect {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://my.monsterindia.com/sponsered_popup.html");
		
		driver.manage().window().maximize();
		// Sleeper.sleepTightInSeconds(5);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Current location Element - select class="border_grey1"
		
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		
		Select selection = new Select(currentLocation);
		selection.selectByVisibleText("Chennai");
		
		
		// industry Element - <select id="id_industry" 
		
		WebElement industry=driver.findElement(By.id("id_industry"));
		Select sel = new Select(industry);
		sel.selectByIndex(1);
		sel.selectByVisibleText("Automotive/ Ancillaries");
		sel.selectByValue("5");
		
		//sel.deselectAll();
		sel.deselectByVisibleText("Banking/ Financial Services");
		
		
	}

}
