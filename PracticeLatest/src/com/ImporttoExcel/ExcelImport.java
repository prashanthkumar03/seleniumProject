package com.ImporttoExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelImport {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		// Sleeper.sleepTightInSeconds(5);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElementByLinkText("REGISTER").click();
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\ExcelOperations\\RegisterTest.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount= sheet.getLastRowNum();
		for(int i = 1; i<=rowCount; i++)
		{
			Row r = sheet.getRow(i);
			
		
		driver.findElementByName("firstName").sendKeys(r.getCell(0).getStringCellValue());//FirstName
		driver.findElementByName("lastName").sendKeys(r.getCell(1).getStringCellValue());; //Last Name
		driver.findElementByName("phone").sendKeys(r.getCell(2).getStringCellValue());// Phone number
		driver.findElementById("userName").sendKeys(r.getCell(3).getStringCellValue());//Email
		driver.findElementByName("address1").sendKeys(r.getCell(4).getStringCellValue());//Address
		driver.findElementByName("address2").sendKeys(r.getCell(5).getStringCellValue());//Address2
		driver.findElementByName("city").sendKeys(r.getCell(6).getStringCellValue());//city
		driver.findElementByName("state").sendKeys(r.getCell(7).getStringCellValue());//state
		driver.findElementByName("postalCode").sendKeys(r.getCell(8).getStringCellValue());//postalCode
		
		//Country Selection from dropdown list
		
		WebElement country=driver.findElementByName("country");
		Select selection = new Select(country);
		selection.selectByValue("92");
		driver.findElementById("email").sendKeys(r.getCell(9).getStringCellValue());//User Name
		driver.findElementByName("password").sendKeys(r.getCell(10).getStringCellValue()); //Password1
		driver.findElementByName("confirmPassword").sendKeys(r.getCell(11).getStringCellValue()); // confirm password
		driver.findElementByName("register").click();
			
		
		String expected_UserName = r.getCell(9).getStringCellValue();
		System.out.println(" The Expected UserName is : "+expected_UserName);
		
		String actual_RegistedUserText=driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b").getText();
		System.out.println(" The actual Registered userName is :"+actual_RegistedUserText);
		
		if(actual_RegistedUserText.contains(expected_UserName))
		{
			System.out.println(" User Registered Successfully - PASS");
			r.createCell(12).setCellValue("User Registered Successfully - PASS");
		}
		else
		{
			System.out.println(" User Registration Failed - FAIL");
			r.createCell(12).setCellValue("User Registration Failed - FAIL");
		}

		}

}
