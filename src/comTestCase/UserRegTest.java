/**
 * UserRegTest.java
 * comTestCase
 *
 * 函数： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2013-1-28 		郑芝龙
 *
 * Copyright (c) 2013, TNT All Rights Reserved.
*/

package comTestCase;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import comPageObject.LoginPage;
import comPageObject.RegPage;
import comPageObject.ShopIndexPage;
import comPageObject.TopNavigation;

/**
 * 类名: UserRegTest
 * 函数功能: TODO ADD FUNCTION
 * 原因:	 TODO ADD REASON
 * 作者     Diason  
 * 时间	2013-1-28		下午4:17:00 
 * 描述
 */
public class UserRegTest {
	
	WebDriver driver = null;
	
	@Before
	public void setUp(){
		
		//System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");在测试服务器run,才需要写该值
		
		 driver = new FirefoxDriver();  //打开火狐浏览器
	}
	
	@After
	public void tearDown(){
		
		//quit方法可以结束FirefoxDriver.exe进程
		
		//driver.close(); 
	}
	
	/* 测试用例：在注册页面直接点击[提交]按钮
	 * 预期结果: 弹出窗口，提示用户名，密码等不能为空
	 */
	@Test
	public void RegBlankname(){
		
		ShopIndexPage indexPage = new ShopIndexPage(driver);  //打开index.jsp
		
		if(!indexPage.hastopT()) fail("页面导航没有加载，测试失败");
        TopNavigation topT = new TopNavigation(driver); //	初始化导航上面的控件
        
        RegPage rePage = topT.regUser(driver);     //点击导航上面的注册，打开一个注册页面
        
        rePage.regUser("admin","123", "123", "zhengzhilongcn@163.com");
        
	}
	
}

