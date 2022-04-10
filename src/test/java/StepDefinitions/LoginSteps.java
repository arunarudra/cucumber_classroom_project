package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps  {
	WebDriver driver=BaseClass.driver;
	
	@Given("I have opened the application in browser")
	public void i_have_opened_the_application_in_browser() {
		
		driver.get("https://www.simplilearn.com");
	    
	}

	@When("I click on the Login link")
	public void i_click_on_the_login_link() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement loginLink = driver.findElement(By.xpath("//a[@title='Log in']"));
		loginLink.click();
	}

	@When("I enter username {string}")
	public void i_enter_username(String uname) {
		WebElement username = driver.findElement(By.xpath("//input[@name='user_login']"));
		username.sendKeys(uname);
	    
	}

	@When("I enter password {string}")
	public void i_enter_password(String pass) {
		WebElement password = driver.findElement(By.xpath("//input[@name='user_pwd']"));
		password.sendKeys(pass);
	}

	@When("I click on the login Button")
	public void i_click_on_the_login_button() {
		WebElement loginbtn = driver.findElement(By.xpath("//input[@name='btn_login']"));
		loginbtn.click();
	}

	@Then("I should be Landed on the home page")
	public void i_sould_be_landed_on_the_home_page() {
		String msg =driver.getTitle();
		System.out.println("inside homepage");
		Assert.assertEquals(msg, "Learning on Simplilearn");
		
	    
	}
	
	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String msg) {
	    String errormsg = driver.findElement(By.id("msg_box")).getText();
	    Assert.assertEquals(errormsg, msg);
	}
	
}
