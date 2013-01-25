package adminTestCase;


import org.openqa.selenium.firefox.FirefoxDriver;

import comPageObject.LoginPage;
import comPageObject.TopNavigation;

public class LoginTest {

	/**
	 * @param args
	 */
	
	private final static String url = " " ;
	
	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(url);
		
		TopNavigation topN = new TopNavigation(driver);
		
		LoginPage loginpage = topN.login(driver);
		
		loginpage.login("admin", "admin888");
		
	}

}
