package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.AddNewAccountPage;
import pages.DashboardPage;
import pages.DataBasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefenition extends TestBase {

	LoginPage loginPage;
	DataBasePage dataBasePage;
	DashboardPage dashboardPage;
	
	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}

	@Given("^User is on Techfios login page$")
	public void user_is_on_Techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=login/");

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		loginPage.enterUserName(username);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);

	}

	@When("^User clicks signin button$")
	public void user_clicks_signin_button() {
		loginPage.clickSignInButton();

	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() {
		Assert.assertEquals(getPageTitle(), "Dashboard- iBilling");
		takeScreenShot(driver);
	}

	
	@And("^User clicks bank and cash side menu$")
	public void user_clicks_bank_cash_side_menu() throws Throwable {
		dashboardPage.clickBankAndCashSideMenu();
	}

	@And("^User clicks bank & cash \"([^\"]*)\" side menu$")
	public void user_clicks_bank_cash_side_menu(String arg1) throws Throwable {
		dashboardPage.clickBankAndCashSideMenu();
	}

	@And("^User clicks new account$")
	public void user_clicks_new_account() throws Throwable {
		dashboardPage.clickNewAccountSideMenu();	  
	}

	@Then("^User should land on add new accounts page$")
	public void user_should_land_on_add_new_accounts_page() throws Throwable {
		Assert.assertEquals("wrong Page","Accounts- iBilling",getPageTitle());
		takeScreenShot(driver);
	}



	@When("^User enters \"([^\"]*)\" from database$")
	public void user_enters_from_database(String loginData) {

		switch (loginData) {
		case "username":
			loginPage.enterUserName(dataBasePage.getData("username"));
			System.out.println("Username from DB: " + dataBasePage.getData("username"));
			break;
		case "password":
			loginPage.enterPassword(dataBasePage.getData("password"));
			System.out.println("Password from DB: " + dataBasePage.getData("password"));
			break;

		default:
			System.out.println("Unable to extract login data " + loginData + "from DB");

		}
	}

	
}
