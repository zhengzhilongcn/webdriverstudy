/**
 * BasePage.java
 * comBasePage
 *
 * ������ TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2013-1-29 		֣֥��
 *
 * Copyright (c) 2013, TNT All Rights Reserved.
*/

package comBaseAction;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * ����: BasePage
 * ��������: TODO ADD FUNCTION
 * ԭ��:	 TODO ADD REASON
 * ����     Diason  
 * ʱ��	2013-1-29		����2:24:51 
 * ����    ҳ��Ļ����࣬���е�ǰ̨ҳ��Ҫ�������ҳ�棬���ҳ������˷�װ��һЩ���õķ�����һЩweddriver ����û�еķ���
 * ����������ֱ�ӵ��ã�
 */
public class BaseAction {
	
	
	/*
	 * �жϸ�ҳ�����Ƿ��д��ڵ�Ԫ��
	 */
	public static boolean isWebElementExsit(WebDriver driver ,By locator){
		
		if( locator == null )
			throw new IllegalArgumentException("locator ��������Ϊ�գ�����isWebElementExsit��ʱ��");
		
		boolean flag = false ;
		WebElement element;
		
		try {
			
			element = driver.findElement(locator);
			
			flag = null!=element;
			
		} catch (NoSuchElementException  e) {
			
			flag = false;   //�е���� fuck
		}

		return flag;
	}
	
	
	
}

