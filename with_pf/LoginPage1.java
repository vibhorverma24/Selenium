package pom.with_pf;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	
	WebDriver driver; 
	
	LoginPage1(WebDriver driver){ 
		this.driver = driver;
		PageFactory.initElements(driver, this); // mandatory
	}
	
	// locators 
	
//	By txt_username_loc = By.xpath("//input[@placeholder='Username']");
//	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
//	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement txt_username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_login;
	@FindBy(tagName = "a") List<WebElement> links;
	
	// action methods  
	public void setUserName(String username) {
		txt_username.sendKeys(username);
	}
	
	public void setPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}
	public void clickLogin() {
		btn_login.click();
	}
	
}
