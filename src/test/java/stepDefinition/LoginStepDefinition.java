package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_on_loginPage() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://ui.cogmento.com/");
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_page() {
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals("Cogmento CRM", title);
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$") //expressions used to get data from feature file. 
	public void user_enters_username_and_password(String username, String password) {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	    WebElement email = driver.findElement(By.name("email"));
	    WebElement pass = driver.findElement(By.name("password"));
	    email.sendKeys(username);
	    pass.sendKeys(password);
	}
	
	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() {
		WebElement button = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		button.click();
	}
	
	@Then("^user gets error$")
	public void user_is_on_home_page() {
	  WebElement err = driver.findElement(By.xpath("//div[@class='header']"));
	  System.out.println(err.getText());
	  Assert.assertEquals("Something went wrong...", err.getText());
	}
	
	@Then("^close the browser$")
	public void close_browser(){
		driver.quit();
	}
	
}
