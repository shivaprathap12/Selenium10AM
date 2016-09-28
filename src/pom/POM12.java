package pom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POM12 {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\WorkSpace12\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
	  dr.navigate().to("http://opensource.demo.orangehrmlive.com/");
	  dr.manage().window().maximize();
	  
	  
	  Pageobj obj=PageFactory.initElements(dr, Pageobj.class);
	  obj.login();
	  
	  
	  
  }
}
