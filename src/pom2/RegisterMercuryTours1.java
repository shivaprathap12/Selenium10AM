package pom2;


import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterMercuryTours1 {
	
	/*Menu menu=null;
	public RegisterMercuryTours1(WebDriver driver)
	{
		if(menu==null)
		{
			menu=PageFactory.initElements(driver,Menu.class);
		}
	}*/
	
	
	
	
	
	@FindBy(name="firstName")  
	WebElement firstname;
	
	
	@FindBy(name="lastName")
	WebElement lastname;
	@FindBy(name="phone")
	WebElement phone;
	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="address1")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="postalCode")
	WebElement postalcode;
	@FindBy(name="country")
	WebElement country;
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirmPassword")
	WebElement cpassword;
	
	@FindBy(name="register")
	WebElement register;
	
	
	
	public void contactRegistration(Row r)
	{
		
		
		firstname.sendKeys(r.getCell(0).getStringCellValue());
		lastname.sendKeys(r.getCell(1).getStringCellValue());
		phone.sendKeys(r.getCell(2).getStringCellValue());
		username.sendKeys(r.getCell(3).getStringCellValue());
		address.sendKeys(r.getCell(4).getStringCellValue());
		city.sendKeys(r.getCell(5).getStringCellValue());
		state.sendKeys(r.getCell(6).getStringCellValue());
		postalcode.sendKeys(r.getCell(7).getStringCellValue());
		country.sendKeys(r.getCell(8).getStringCellValue());
		email.sendKeys(r.getCell(9).getStringCellValue());
		password.sendKeys(r.getCell(10).getStringCellValue());
		cpassword.sendKeys(r.getCell(11).getStringCellValue());
		register.click();
		
		
		
	}

}
