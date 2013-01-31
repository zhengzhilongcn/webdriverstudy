package comPageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * ��Ӧһ��/user/Register.jsp
 */
public class RegPage {
    
	WebDriver driver = null;
	
	public RegPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//�û��������
	@FindBy(id = "TxtRegUserName")
	private WebElement regUserName ;
	
	//���������
	@FindBy(id = "TxtRegPassword")
	private WebElement regPassword;
	
	//ȷ�����������
	@FindBy(id = "TxtPwdConfirm")
	private WebElement pwdConfirm;
	
	//Email��ַ
	@FindBy(id = "TxtEmail")
	private WebElement txtEmail;
	
	//�ύ��ť
	@FindBy(id = "BtnRegStep2")
	private WebElement submitButton;
	
	//��������
	@FindBy(id = "Reset")
	private WebElement resetButton;
	
	//������һҳ
	@FindBy(id = "LnkReturnUrl")
	private WebElement returnUrl;
	
	
    /*  ʵ�ֻ�Աע�Ṧ�ܣ�
     *  �÷�������ʵ�ֲ�����
     */
	
	public void regUser(String userName,String pwd,String pwdConfirm,String email){
		
		this.regUserName.sendKeys(userName);
		this.regPassword.sendKeys(pwd);	
		this.pwdConfirm.sendKeys(pwdConfirm);
		this.txtEmail.sendKeys(email);
		this.submitButton.click();
	}
	
	
}
