package comPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//�û��������
	@FindBy(id = "TxtUserName")
	private WebElement username;
	
	//���������
	@FindBy(id = "TxtPassword")
	private WebElement password;
	
	//��¼��ť
	@FindBy(id = "BtnLogOn")
	private WebElement loginButton;
	
	//����һ���µĵ�ѡ��
	@FindBy(id = "ChkCookieMonth")
	private WebElement checkbox;
	
	
	/*
	 * ʵ���û���¼
	 */
	
	public void login(String username , String password) {
		
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		this.loginButton.click();
	}
	
	
	
	
	
	
}
