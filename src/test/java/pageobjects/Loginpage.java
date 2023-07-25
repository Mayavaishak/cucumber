package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver kdriver;
	public Loginpage(WebDriver rdriver) {
		kdriver = rdriver;
		PageFactory.initElements(rdriver, this);	
		}
	@FindBy(id = "Email")
	WebElement txtEmail;
	@FindBy(id ="Password")
	WebElement txtpassword;
	@FindBy(xpath ="//div[@class='buttons']")
	WebElement loginbutton;
	@FindBy (linkText ="Logout")
	WebElement logout;
public void setuserName(String uname) {
	txtEmail.clear();
	txtEmail.sendKeys(uname);	
}
public void setpassword(String pwd) {
	txtpassword.clear();
	txtpassword.sendKeys(pwd);
}
public void clickLogin() {
	loginbutton.click();
}
public void clickLogout() {
	logout.click(); 
}
}
