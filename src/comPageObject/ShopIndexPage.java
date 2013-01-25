/**
 * ShopIndexPage.java
 * comPageObject
 *
 * 函数： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2013-1-25 		郑芝龙
 *
 * Copyright (c) 2013, TNT All Rights Reserved.
*/

package comPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 类名: ShopIndexPage
 * 函数: TODO ADD FUNCTION
 * 原因:	 TODO ADD REASON
 * 作者    Diason  
 * 时间	 2013-1-25		下午2:02:22 
 * 描述 :对应一个网站一个默认的Index.jsp
 */
public class ShopIndexPage {
	
	private final static String url = "http://gzrdc.powereasy.net:8003/Index.aspx"; 
	
	WebDriver driver  = null;
	
	public ShopIndexPage(WebDriver driver) {
		this.driver = driver;
		driver.get(url);   //打开主页
		PageFactory.initElements(driver, this);
	}
	
	// 导航的div 区域
	@FindBy(xpath = ".//*[@id='globalTopBar']")
	private WebElement topT;
	
	
	
	
	
	/*
	 * 判断下是否成功打开index.jsp,就判断是否导航显示出来
	 */
	public boolean hastopT(){
		
		boolean hasDisplay  =  topT.isDisplayed();
		
		return hasDisplay;
	}
	
}

