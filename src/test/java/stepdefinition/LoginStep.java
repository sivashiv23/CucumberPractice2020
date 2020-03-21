package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import implementation.LoginImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends LoginImpl {

	@Given("The user should load the facebook URL")
	public void the_user_should_load_the_facebook_URL() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sivas\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(" 1 user_should_load_the_facebook_URL is done");

	}

	@When("The user should give the valid username")
	public void the_user_should_give_the_valid_username() {

		driver.findElement(By.id("email")).sendKeys("bethewolf");

		System.out.println(" 2 user_should_give_the_valid_username is done");
	}

	@When("The user should give the valid password")
	public void the_user_should_give_the_valid_password() {

		driver.findElement(By.id("pass")).sendKeys("bethewolf");

		System.out.println("3 user_should_give_the_valid_password");

	}

	@When("The user should click on the  login button")
	public void the_user_should_click_on_the_login_button() {

		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		System.out.println("4 user should click on the  login button");

	}

	@Then("Successfully logged in page")
	public void successfully_logged_in_page() {
		System.out.println(" All steps done  chill ");
	}

}
