/**
 * main.java
 * comTestCase
 *
 * ������ TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2013-1-29 		֣֥��
 *
 * Copyright (c) 2013, TNT All Rights Reserved.
*/

package comTestCase;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * ����: main
 * ��������: TODO ADD FUNCTION
 * ԭ��:	 TODO ADD REASON
 * ����     Diason  
 * ʱ��	2013-1-29		����5:05:06 
 * ����
 */
public class test {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gzrdc.powereasy.net:8002/user/Register.aspx");
		
		
		driver.findElement(By.id("BtnRegStep2")).click();
		
		String i = driver.switchTo().alert().getText();
		System.out.println(i);
				
		}
		
		
		
	
	
	
}

