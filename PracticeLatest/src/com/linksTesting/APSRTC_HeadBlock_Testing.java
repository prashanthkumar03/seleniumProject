package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class APSRTC_HeadBlock_Testing {

	public static void main(String[] args) throws InterruptedException
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://apsrtconline.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		// <div class="menu-wrap"> - identifying the block of the page
		
		WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		
		int headerLinksCount=headerBlockLinks.size();
		
		System.out.println("Total number of Elements(links) in the headerBlock are : "+headerLinksCount);
		
		for(int i=0;i<headerLinksCount;i++)
		{
			String headerBlockLinkName=headerBlockLinks.get(i).getText();
			System.out.println(i+" "+headerBlockLinkName);
			
			headerBlockLinks.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			Thread.sleep(7000);
			
			// since the info in the arrayList is cleared -- we are re-creating the arrayList again ( to store the elements, which under test)
			headerBlock=driver.findElement(By.className("menu-wrap"));
			headerBlockLinks=headerBlock.findElements(By.tagName("a"));
			
			
		}
		
		driver.quit();

	}

}
