package pom2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POMControl1 {
	ChromeDriver driver;
	
	@Test
	public void pomTest() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		FileInputStream f=new FileInputStream("C:\\Users\\loadrunner\\Downloads\\Datadriventesting.xlsx");
	    @SuppressWarnings("resource")
		
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet ws=wb.getSheet("Sheet1");
	    
	    Iterator<Row> row=ws.iterator();
	   row.next();
	    
	   driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		
	    
	   WelcomeMercuryTours wm=PageFactory.initElements(driver,WelcomeMercuryTours.class);
	    RegisterMercuryTours1 rm1=PageFactory.initElements(driver,RegisterMercuryTours1.class);
	    RegisterMercuryTours2 rm2=PageFactory.initElements(driver,RegisterMercuryTours2.class);
	    
	   wm.registerTest();
	   
	   while(row.hasNext())
	    {
	    	Row r=row.next();
	    	rm1.contactRegistration(r);
	    	boolean b=rm2.validateRegistration(r.getCell(9).getStringCellValue());
	    	
	    	Cell c=r.createCell(12);
	    	
	    	if(b==true)
	       {
	    	   
	    	    c.setCellValue("passs");
	       }
	       else
	       {
	    	   c.setCellValue("fail");
	       }
	    	driver.navigate().back();
	    }
	    
	   Sleeper.sleepTightInSeconds(3);
	   
	   FileOutputStream f1=new FileOutputStream("C:\\Users\\loadrunner\\Downloads\\testing.xlsx");
	    wb.write(f1);
	    f1.close();
	    
	}

}
