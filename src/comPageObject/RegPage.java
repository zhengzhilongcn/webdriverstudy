package comPageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * 对应一个/user/Register.jsp
 */
public class RegPage {
    
	WebDriver driver = null;
	
	public RegPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//用户名输入框
	@FindBy(id = "TxtRegUserName")
	private WebElement regUserName ;
	
	//密码输入框
	@FindBy(id = "TxtRegPassword")
	private WebElement regPassword;
	
	//确认密码输入框
	@FindBy(id = "TxtPwdConfirm")
	private WebElement pwdConfirm;
	
	//Email地址
	@FindBy(id = "TxtEmail")
	private WebElement txtEmail;
	
	//提交按钮
	@FindBy(id = "BtnRegStep2")
	private WebElement submitButton;
	
	//重新设置
	@FindBy(id = "Reset")
	private WebElement resetButton;
	
	//返回上一页
	@FindBy(id = "LnkReturnUrl")
	private WebElement returnUrl;
	
	
    /*  实现会员注册功能；
     *  该方法可以实现参数化
     */
	
	public void regUser(String userName,String pwd,String pwdConfirm,String email){
		
		this.regUserName.sendKeys(userName);
		this.regPassword.sendKeys(pwd);	
		this.pwdConfirm.sendKeys(pwdConfirm);
		this.txtEmail.sendKeys(email);
		this.submitButton.click();
	}
	
	
}
