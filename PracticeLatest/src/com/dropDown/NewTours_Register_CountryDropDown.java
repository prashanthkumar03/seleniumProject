package com.dropDown;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class NewTours_Register_CountryDropDown {

	public static void main(String[] args) throws IOException
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
		
		List<WebElement>countryNames=country.findElements(By.tagName("option"));
		
		
		
		int countriesCount=countryNames.size();
		String countryName=countryNames.get(countriesCount).getText();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\ExcelOperations\\importdata.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowcount = sheet.createRow();
		
		for(int i=0; i<=rowcount ; i++)
		{
			Row r=sheet.createRow(i);
			
			int cellcount=r.createCell(j);
			for(int j=0; j<=cellcount; j++)
			{
				Cell c=r.createCell(j);
				c.setCellValue(+countryName);
				FileOutputStream file1 = new FileOutputStream(System.getProperty("user.dir")+"\\\\src\\\\com\\\\ExcelOperations\\\\importdata.xlsx");
				workBook.write(file1);
				
			}
		}
		//System.out.println(" Total number of countries in the dropDown are : "+countriesCount);
		
		/*for(int i=0;i<countriesCount;i++)
		{
			String countryName=countryNames.get(i).getText();
			System.out.println(i+" "+countryName);
		}
		*/
		driver.quit();

	}

}
