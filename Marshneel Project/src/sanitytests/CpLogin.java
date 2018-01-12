package sanitytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CpLogin {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","C://Program Files//Java//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();  //Launches Firefox Browser with blank Url
		
		//driver.get("http://test01-web01:9080/SN");
		
		//driver.close(); //Closes the browser
		

	}

}
