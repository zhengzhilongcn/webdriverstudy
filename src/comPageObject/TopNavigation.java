package comPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavigation {
	
	private WebDriver driver = null;
	
	public TopNavigation(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//��¼
	@FindBy(className = "login")
	private WebElement login;
	
	//���ע��
	@FindBy(className = "reg")
	private WebElement reg;
	
	//��¼����ʾ��Ա���ĵ�����
	@FindBy(linkText = "��Ա����")
	private WebElement vipCentre;
	
	//�˳���¼
	@FindBy(className = "logOut")
	private WebElement logOut;
	
	//�ҵĶ���
	@FindBy(linkText = "�ҵĶ���")
	private WebElement myOrder;
	
	//�ҵ��ղ�
	@FindBy(linkText = "�ҵ��ղ�")
	private WebElement myCollection;
	
	//�ҵ��̳�
	@FindBy(linkText = "�ҵ��̳�")
	private WebElement myShop;
	
	@FindBy(linkText = "��������")
	private WebElement helpCentre;
	
	@FindBy(linkText = "������ҳ")
	private WebElement backIndexPage;
	
	
	
	
	/*
	 * ʵ�ֵ�¼����,����һ����¼ҳ��
	 */
	public LoginPage login(WebDriver driver){
		
		login.click();
		return new LoginPage(driver);
	}
	
	/*
	 * ʵ��ע�Ṧ�ܣ�����ע��ҳ�棬��RegPage����ʵ�ֵ�¼
	 */
	public RegPage regUser (WebDriver driver){
		
		reg.click();
		
		return new RegPage(driver);
	}
	
	
	
	
	
}




