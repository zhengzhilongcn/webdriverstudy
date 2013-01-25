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
 * 描述 : 登录页面：/Shop/FastRegister.jsp
 */

public class LoginPage {
	
	WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//用户名输入框
	@FindBy(id = "TxtUserName")
	private WebElement username;
	
	//密码输入框
	@FindBy(id = "TxtPassword")
	private WebElement password;
	
	//登录按钮
	@FindBy(id = "BtnLogOn")
	private WebElement loginButton;
	
	//保留一个月的单选框
	@FindBy(id = "ChkCookieMonth")
	private WebElement checkbox;
	
	
	/*
	 * 实现用户登录
	 */
	
	public void login(String username , String password) {
		
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		this.loginButton.click();
	}
	
	
	
	
	
	
}
