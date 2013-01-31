package comPageObject;

import org.openqa.selenium.By;
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
 * 描述 :对应Index.jsp 最上面的一个导航
 */


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
	
	//成功登录后在顶部显示的会员名字
	@FindBy(className = "name")
	private WebElement vipName;
	
	
	/*
	 * 实现登录功能,返回一个登录页面
	 */
	public LoginPage clickLogin(WebDriver driver){
		
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
	
	/*
	 * 是否能登录成功
	 */
	public boolean isLoginSusseccful(){
		
		boolean hasDisplay = vipName.isDisplayed();  //判断成功登录后，用户名有没有显示出来
		
		hasDisplay = logOut.isDisplayed();  //判断是否有退出按钮；
		
		return hasDisplay ;
	}
}




