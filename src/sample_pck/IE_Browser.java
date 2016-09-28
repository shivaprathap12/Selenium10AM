package sample_pck;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IE_Browser {
	//public static WebDriver driver;
	
	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "E:\\WorkSpace12\\IEDriverServer.exe");
	
	InternetExplorerDriver driver=new InternetExplorerDriver();
	//driver=new InternetExplorerDriver();
	driver.get("http://fb.com");
	driver.manage().window().maximize();
	}

}
