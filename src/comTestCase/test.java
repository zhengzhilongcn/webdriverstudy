/**
 * main.java
 * comTestCase
 *
 * 函数： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2013-1-29 		郑芝龙
 *
 * Copyright (c) 2013, TNT All Rights Reserved.
*/

package comTestCase;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 类名: main
 * 函数功能: TODO ADD FUNCTION
 * 原因:	 TODO ADD REASON
 * 作者     Diason  
 * 时间	2013-1-29		下午5:05:06 
 * 描述
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

