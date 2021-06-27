package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

/**
 * Created by pAmbekar on 27-06-2021
 * 
 */

public class TrainingAction {

	WebDriver driver;

	public TrainingAction() {

	}

	@Given("^Open the Chrome and launch the application$")
	public void open_the_chrome_and_launch_the_applications() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4");
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
		driver.findElement(By.name("uid")).sendKeys("username12");
		driver.findElement(By.name("password")).sendKeys("password12");
	}

	@Then("^Reset the credential$")
	public void Reset_the_credential() throws Throwable {
		driver.findElement(By.name("btnReset")).click();
	}

	@When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")
	public void enter_the_Username_User_and_Password_password(String username, String password) throws Throwable {
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Given("^Navigate To Google Search Page$")
	public void navigate_To_Google_Search_Page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		boolean isGoogle = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertEquals("Google Search Page Rendered ", true, isGoogle);
	}

	@When("^Enter Search String$")
	public void enter_Search_String(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		String searchStr = data.get(1).get(0);
		driver.findElement(By.name("q")).sendKeys(searchStr);
		driver.findElement(By.name("q")).sendKeys(Keys.TAB);

	}

	@When("^Click on Search Button$")
	public void click_on_Search_Button() throws Throwable {
		driver.findElement(By.xpath("//div[3]/center/input")).click();
	}

	@Then("^Validate Search String$")
	public void validate_Search_String() throws Throwable {

		String str = driver.findElement(By.xpath("//h3")).getText();
		System.out.println("  " + str);
	}

}
