package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;



public class datadriventesting {
  @Test
  public void f() throws  IOException {
	  System.setProperty("webdriver.chrome.driver","E:\\WorkSpace12\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
	  dr.navigate().to("http://newtours.demoaut.com/");
	  dr.manage().window().maximize();
	  Sleeper.sleepTightInSeconds(3);
	  dr.findElement(By.linkText("REGISTER")).click();
	 
	  FileInputStream f1 = new FileInputStream("D:\\10Am\\Datadriventesting.xlsx");
	
	@SuppressWarnings("resource")
	XSSFWorkbook wd = new XSSFWorkbook(f1);
	  XSSFSheet ws = wd.getSheetAt(0);
	      Row r = null;
	     
	Iterator<Row> rr =  ws.iterator();
	         rr.next();
	while (rr.hasNext()) {
		r = rr.next();
		dr.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		dr.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		dr.findElement(By.name("phone")).sendKeys(r.getCell(2).getStringCellValue());
		dr.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
		dr.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		dr.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		dr.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		dr.findElement(By.name("postalCode")).sendKeys(r.getCell(7).getStringCellValue());
		dr.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
		dr.findElement(By.id("email")).sendKeys(r.getCell(9).getStringCellValue());
		dr.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		dr.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
		dr.findElement(By.name("register")).click();
		Sleeper.sleepTightInSeconds(2);
		dr.navigate().back();
	}
	  }
}

