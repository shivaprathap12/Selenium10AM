package sample_pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejet {

	public static void main(String[] args) throws Exception{
		
		//Launch spicejet
		WebDriver d=new FirefoxDriver();
		d.get("http://spicejet.com");
		d.manage().window().maximize();

		//Book a flight
		d.findElement(By.xpath("html/body/form/div[4]/div[2]/div/div[3]/table/tbody/tr[1]/td[1]/a/span[1]")).click();
		d.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).click();
	
		//select flight from 
		new Select(d.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1")))
		.selectByVisibleText("Hyderabad (HYD)");
		
		//select flight to
		
		new Select(d.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1")))
		.selectByVisibleText("Bengaluru (BLR)");
		
		//select Date()
		
		d.findElement(By.xpath("html/body/div[2]/form/div[2]/div[3]/div[2]/div[2]/div/div[3]/button")).click();
		Thread.sleep(4000);
		d.findElement(By.xpath("html/body/div[4]/table/tbody/tr[2]/td[6]/a")).click();
		
		//select Adults
		new Select(d.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")))
		.selectByVisibleText("2 Adults");
		
		//select Child
		new Select(d.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")))
		.selectByVisibleText("1 Child");
		
		//select Infants
		new Select(d.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT"))).selectByVisibleText("1 Infant");

		d.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Student")).click();
		//click find flights
		d.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
