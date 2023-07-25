package stepdefentions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageobjects.Loginpage;

public class nopsteps {
	public WebDriver driver;
	public Loginpage lp;
	@Given("User Launch chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	  lp=new Loginpage(driver);
	}

	@When("user open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	 lp.setuserName(email);
	 lp.setpassword(password);
	}

	@When("click on login")
	public void click_on_login() {
		lp.clickLogin();
	   
	}

	@Then("page Tite should be {string}")
	public void page_tite_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsucessful")) {
			driver.close();
			Assert.assertTrue(false);
		}
			else {
				Assert.assertEquals(title, driver.getTitle());
				
			}
	}
	@When("User click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(3000);
	   
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	
	}


}
