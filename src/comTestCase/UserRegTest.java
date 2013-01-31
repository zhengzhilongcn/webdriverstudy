/**
 * UserRegTest.java
 * comTestCase
 *
 * ������ TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2013-1-28 		֣֥��
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
 * ����: UserRegTest
 * ��������: TODO ADD FUNCTION
 * ԭ��:	 TODO ADD REASON
 * ����     Diason  
 * ʱ��	2013-1-28		����4:17:00 
 * ����
 */
public class UserRegTest {
	
	WebDriver driver = null;
	
	@Before
	public void setUp(){
		
		//System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");�ڲ��Է�����run,����Ҫд��ֵ
		
		 driver = new FirefoxDriver();  //�򿪻�������
	}
	
	@After
	public void tearDown(){
		
		//quit�������Խ���FirefoxDriver.exe����
		
		//driver.close(); 
	}
	
	/* ������������ע��ҳ��ֱ�ӵ��[�ύ]��ť
	 * Ԥ�ڽ��: �������ڣ���ʾ�û���������Ȳ���Ϊ��
	 */
	@Test
	public void RegBlankname(){
		
		ShopIndexPage indexPage = new ShopIndexPage(driver);  //��index.jsp
		
		if(!indexPage.hastopT()) fail("ҳ�浼��û�м��أ�����ʧ��");
        TopNavigation topT = new TopNavigation(driver); //	��ʼ����������Ŀؼ�
        
        RegPage rePage = topT.regUser(driver);     //������������ע�ᣬ��һ��ע��ҳ��
        
        rePage.regUser("admin","123", "123", "zhengzhilongcn@163.com");
        
	}
	
}

