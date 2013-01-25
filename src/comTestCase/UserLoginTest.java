package comTestCase;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import comPageObject.LoginPage;
import comPageObject.ShopIndexPage;
import comPageObject.TopNavigation;

/**
 * 类名: ShopIndexPage
 * 函数功能: 对用户登录的测试
 * 原因:	 检查是否能登录，检查登录后，首页元素的变化来确定用户是否登录成功
 * 作者    Diason  
 * 时间	 2013-1-25		下午2:02:22 
 * 描述 : 对用户登录的测试
 */



public class UserLoginTest {

	WebDriver driver = null;
	
	@Before
	public void setUp(){
		
		//System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");在测试服务器run,才需要写该值
		
		 driver = new FirefoxDriver();  //打开火狐浏览器
		
	}
	
	
	@After
	public void tearDown(){
		
		//quit方法可以结束FirefoxDriver.exe进程
		driver.quit();
		driver.close(); 
	}
	
	@Test
	public void loginTest(){
		
		ShopIndexPage indexPage = new ShopIndexPage(driver);  //打开index.jsp
		
        TopNavigation topT = new TopNavigation(driver); //	初始化导航上面的控件
        
        
        
        LoginPage loginPage = topT.clickLogin(driver);  //点击导航上面的登录连接
		
        loginPage.login("admin", "admin888");
        
		
		
	}

}
