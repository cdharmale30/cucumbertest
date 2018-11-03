package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {
	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.gecko.driver", "C:\\selelib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service",title);
	}
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@123");
	
		
	}
	
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	WebElement	loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title=driver.getTitle();
		System.out.println("The Title IS"+title);
		Assert.assertEquals(title,"CRMPRO");
	}
}
