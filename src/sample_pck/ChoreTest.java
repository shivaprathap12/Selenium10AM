package sample_pck;

import org.openqa.selenium.chrome.ChromeDriver;



public class ChoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\WorkSpace12\\chromedriver.exe");
		
		ChromeDriver d=new ChromeDriver();
		d.get("http://bing.com");
		d.close();

	}

}