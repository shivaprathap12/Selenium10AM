package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageobj {
	
	@FindBy(id="txtUsername") 
	WebElement un;
	
	@FindBy(id="txtPassword")
	WebElement psd;
	
	@FindBy(id="btnLogin")
	WebElement logbtn;
	
	
	public void login()
	{
		un.sendKeys("Admin");
		psd.sendKeys("admin");
		logbtn.click();
	}

}
