/**
 * ShopIndexPage.java
 * comPageObject
 *
 * ������ TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2013-1-25 		֣֥��
 *
 * Copyright (c) 2013, TNT All Rights Reserved.
*/

package comPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * ����: ShopIndexPage
 * ����: TODO ADD FUNCTION
 * ԭ��:	 TODO ADD REASON
 * ����    Diason  
 * ʱ��	 2013-1-25		����2:02:22 
 * ���� :��Ӧһ����վһ��Ĭ�ϵ�Index.jsp
 */
public class ShopIndexPage {
	
	private final static String url = "http://gzrdc.powereasy.net:8003/Index.aspx"; 
	
	WebDriver driver  = null;
	
	public ShopIndexPage(WebDriver driver) {
		this.driver = driver;
		driver.get(url);   //����ҳ
		PageFactory.initElements(driver, this);
	}
	
	// ������div ����
	@FindBy(xpath = ".//*[@id='globalTopBar']")
	private WebElement topT;
	
	
	
	
	
	/*
	 * �ж����Ƿ�ɹ���index.jsp,���ж��Ƿ񵼺���ʾ����
	 */
	public boolean hastopT(){
		
		boolean hasDisplay  =  topT.isDisplayed();
		
		return hasDisplay;
	}
	
}

