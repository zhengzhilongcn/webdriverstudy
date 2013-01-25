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
	
	//登录
	@FindBy(className = "login")
	private WebElement login;
	
	//免费注册
	@FindBy(className = "reg")
	private WebElement reg;
	
	//登录后显示会员中心的连接
	@FindBy(linkText = "会员中心")
	private WebElement vipCentre;
	
	//退出登录
	@FindBy(className = "logOut")
	private WebElement logOut;
	
	//我的订单
	@FindBy(linkText = "我的订单")
	private WebElement myOrder;
	
	//我的收藏
	@FindBy(linkText = "我的收藏")
	private WebElement myCollection;
	
	//我的商城
	@FindBy(linkText = "我的商城")
	private WebElement myShop;
	
	@FindBy(linkText = "帮助中心")
	private WebElement helpCentre;
	
	@FindBy(linkText = "返回首页")
	private WebElement backIndexPage;
	
	
	
	
	/*
	 * 实现登录功能,返回一个登录页面
	 */
	public LoginPage login(WebDriver driver){
		
		login.click();
		return new LoginPage(driver);
	}
	
	/*
	 * 实现注册功能，返回注册页面，在RegPage自行实现登录
	 */
	public RegPage regUser (WebDriver driver){
		
		reg.click();
		
		return new RegPage(driver);
	}
	
	
	
	
	
}




