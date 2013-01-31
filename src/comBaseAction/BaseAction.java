/**
 * BasePage.java
 * comBasePage
 *
 * 函数： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2013-1-29 		郑芝龙
 *
 * Copyright (c) 2013, TNT All Rights Reserved.
*/

package comBaseAction;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 类名: BasePage
 * 函数功能: TODO ADD FUNCTION
 * 原因:	 TODO ADD REASON
 * 作者     Diason  
 * 时间	2013-1-29		下午2:24:51 
 * 描述    页面的基本类，所有的前台页面要基础这个页面，这个页面包含了封装了一些常用的方法，一些weddriver 本身没有的方法
 * 可以在子类直接调用；
 */
public class BaseAction {
	
	
	/*
	 * 判断改页面上是否有存在的元素
	 */
	public static boolean isWebElementExsit(WebDriver driver ,By locator){
		
		if( locator == null )
			throw new IllegalArgumentException("locator 参数不能为空，调用isWebElementExsit的时候");
		
		boolean flag = false ;
		WebElement element;
		
		try {
			
			element = driver.findElement(locator);
			
			flag = null!=element;
			
		} catch (NoSuchElementException  e) {
			
			flag = false;   //有点多余 fuck
		}

		return flag;
	}
	
	
	
}

