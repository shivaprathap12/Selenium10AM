package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginusingProperties {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\WorkSpace12\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
	@Test
	public void loginTest() throws IOException
	{
		
		
		FileInputStream f=new FileInputStream("E:\\WorkSpace12\\Selenium_Proj\\prop.properties");
		
		
		
		Properties pr=new Properties();
		pr.load(f);
		
		
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys("Admin");
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys("admin");
		driver.findElement(By.xpath(pr.getProperty("login"))).click();
		
		
			
		
		
	}

}

