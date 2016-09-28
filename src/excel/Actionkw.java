package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Actionkw {
	
	ChromeDriver driver;
	
	
	public void launchBrowser()
	{
       System.setProperty("webdriver.chrome.driver","E:\\WorkSpace12\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
	}
	public void navigate()
	{
		driver.get("http://opensource.demo.orangehrmlive.com");
	}
	public void enterUsername()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	public void enterPassword()
	{
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}
	public void clickLogin()
	{
		driver.findElement(By.id("btnLogin")).click();
	}



}

