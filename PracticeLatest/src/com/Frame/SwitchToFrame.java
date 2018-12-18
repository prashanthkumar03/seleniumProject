package com.Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToFrame {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// <iframe class="demo-frame" src="/resources/demos/droppable/default.html">
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		// <div id="draggable" 
		WebElement drag_Element=driver.findElementById("draggable");
		
		// div id="droppable"
		WebElement drop_Element=driver.findElementById("droppable");
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag_Element, drop_Element).build().perform();


	}

}
