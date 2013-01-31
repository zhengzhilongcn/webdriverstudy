package comTestCase;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import comPageObject.LoginPage;
import comPageObject.ShopIndexPage;
import comPageObject.TopNavigation;

/**
 * ����: ShopIndexPage
 * ��������: ���û���¼�Ĳ���
 * ԭ��:	 ����Ƿ��ܵ�¼������¼����ҳԪ�صı仯��ȷ���û��Ƿ��¼�ɹ�
 * ����    Diason  
 * ʱ��	 2013-1-25		����2:02:22 
 * ���� : ���û���¼�Ĳ���
 */



public class UserLoginTest {

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
	
	@Test
	public void loginTest(){
		
		ShopIndexPage indexPage = new ShopIndexPage(driver);  //��index.jsp
		
		if(!indexPage.hastopT()) fail("ҳ�浼��û�м��أ�����ʧ��");
        TopNavigation topT = new TopNavigation(driver); //	��ʼ����������Ŀؼ�
        LoginPage loginPage = topT.clickLogin(driver);  //�����������ĵ�¼����
        loginPage.login(" ", " ");
		boolean isSuccessful = topT.isLoginSusseccful();
		
		assertTrue(isSuccessful); //����ɹ����͸ò�������ͨ��
		
	}

}
