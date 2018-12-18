package com.RadioButtonTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EchoEcho_RadioButtonTesting {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		// <input type="radio" value="Milk" name="group1"/>
		List<WebElement>radioButtons=block.findElements(By.name("group1"));
		
		System.out.println(" The total number of Elements in the Group1 are : "+radioButtons.size());
		
		for(int i=0;i<radioButtons.size();i++) // to click on every RadioButton
		{
			radioButtons.get(i).click();
			
			Thread.sleep(7000);
			
			for(int j=0;j<radioButtons.size();j++) // This will identify the status of the RadioButtons - whether they got clicked or Not
			{
				System.out.println(radioButtons.get(j).getAttribute("value")+" "+radioButtons.get(j).getAttribute("checked"));
				
			}
			
			
		}
		
		driver.quit();
		

	}

}
