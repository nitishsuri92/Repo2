//package stepDefinition;
//
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealsMapStepDefinition {
//
//WebDriver driver;
//	
//	@Given("^user is already on login page$")
//	public void user_on_loginPage() {
//		
//		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("https://ui.cogmento.com/");
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_page() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		Assert.assertEquals("Cogmento CRM", title);
//	}
//	
//	@Then("^user enters username and password$") //expressions used to get data from feature file. 
//	public void user_enters_username_and_password(DataTable credentials) { //we use DataTables to achieve data driven dev. in BDd without examples keyword.
//		
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		
//		for(Map<String, String> data : credentials.asMaps(String.class, String.class)){ //DataTable data is stored in maps using .asMaps.
//	   
//		WebElement email = driver.findElement(By.name("email"));
//	    WebElement pass = driver.findElement(By.name("password"));
//	    email.sendKeys();
//	    pass.sendKeys();
//		}
//	}
//	
//	@Then("^user clicks on Login button$")
//	public void user_clicks_on_Login_button() {
//		WebElement button = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
//		button.click();
//	}
//	
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() {
//	  String title = driver.getTitle();
//	  System.out.println(title);
//	  Assert.assertEquals("RMPRO", title);
//}
//	@Then("^user moves to new deals page$")
//	public void user_moves_to_new_deal() {
//		driver.switchTo().frame("mainpanel");
//	  Actions a = new Actions(driver);
//	  a.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Deals')]"))).build().perform();
//	  driver.findElement(By.xpath("//a[contains(text(), 'New Deals')]")).click(); 
//	}
//	 
//	@Then("^user enters deals details$")
//		public void user_enters_details(DataTable dealdata) {
//		for(Map<String, String> data : dealdata.asMaps(String.class, String.class)) {
//		
//			driver.findElement(By.id("title")).sendKeys(data.get("title"));
//		driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
//		driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
//		driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
//		
//		}
//	}
//	
//	@Then("^close browser$")
//	public void close_browser(){
//		driver.quit();
//	}
//	
//	
//	
//}
