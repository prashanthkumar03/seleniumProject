package com.OurProject;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrderCreation {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.11street.my/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("primary-search").sendKeys("Do not buy"); //keyword in search bar
		driver.findElementByXPath(".//*[@id='AKCFrm']/button").click(); //Click on search
		driver.findElementByXPath(".//*[@id='productlist']/li[6]/dlv/div[2]/h3/a").click();//click on product from total search
	//	driver.findElementByXPath(".//*[@id='product-detail-options']/div/div/div/span[1]").click();//increase qty
		driver.findElementByXPath(".//*[@id='product-detail-main-content']/div[2]/div[2]/div[1]/section[2]/section/div").click();//add to cart
		driver.findElementByXPath(".//*[@id='cart-popup']/div/div[2]/div/div[3]/div[2]").click(); // check out button
		driver.findElementByLinkText("Log in").click(); // click on login button
		driver.findElementById("loginName").sendKeys("quality.assurance@11street.my"); //login name
		driver.findElementById("passWord").sendKeys("QAonly11"); // password
		driver.findElementByXPath("html/body/form/section/div/article/div[1]/fieldset/div[2]/button").click();//click on login
		
		
		
		
		

	}

}