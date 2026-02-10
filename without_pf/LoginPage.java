package pom.without_pf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver; // driver - here it is class variable
	// constructor -> to initiate the web driver
	LoginPage(WebDriver driver){ // driver - here it is local variable
		this.driver = driver;
	}
	
	// locators 
	// earlier approach
    // WebElement usertxt = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	
	// New approach
    //	By loc = By.xpath("//input[@placeholder='Username']"); // this locator "//input[@placeholder='Username']" will return a By type
    //	driver.findElement(loc).sendKeys("xyz");
	
	By txt_username_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	
	// action methods 
	public void setUserName(String username) {
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	
	public void setPassword(String pwd) {
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	public void clickLogin() {
		driver.findElement(btn_login_loc).click();
	}
	
}
