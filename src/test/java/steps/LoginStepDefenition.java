package steps;

import org.openqa.selenium.WebDriver;
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
import testcontext.TestContextUI;

public class LoginStepDefenition extends TestBase {
	
	TestContextUI testContextUI;
	
	public LoginStepDefenition(TestContextUI testContextUI) {
		this.testContextUI = testContextUI;
	}

//	LoginPage loginPage;
	DataBasePage dataBasePage;
//	DashboardPage dashboardPage;
//	AddNewAccountPage addNewAccountPage;

	@Before
	public void beforeRun() {
		WebDriver driver =initDriver();
		testContextUI.setDriver(driver);
		testContextUI.initializePageInstance(driver);
//		loginPage = PageFactory.initElements(driver, LoginPage.class);
//		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
//		addNewAccountPage = PageFactory.initElements(driver, AddNewAccountPage.class);
	}

	@Given("^User is on Techfios login page$")
	public void user_is_on_Techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=login/");

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		testContextUI.getLoginPage().enterUserName(username);
		//loginPage.enterUserName(username);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		testContextUI.getLoginPage().enterPassword(password);
		//loginPage.enterPassword(password);

	}

	@When("^User clicks signin button$")
	public void user_clicks_signin_button() throws Throwable {
		testContextUI.getLoginPage().clickSignInButton();
		//loginPage.clickSignInButton();
	}

	@When("^User clicks \"([^\"]*)\" button$")
	public void user_clicks_button(String button) throws Throwable {
		switch (button) {
		case "Signin":
			testContextUI.getLoginPage().clickSignInButton();
			//loginPage.clickSignInButton();
			break;
		case "BankCash":
			testContextUI.getDashboardPage().clickBankAndCashSideMenu();
			//dashboardPage.clickBankAndCashSideMenu();
			break;
		case "NewAccount":
			testContextUI.getDashboardPage().clickNewAccountSideMenu();
			//addNewAccountPage=dashboardPage.clickNewAccountSideMenu();
			break;
		case "Submit":
			testContextUI.getAddNewAccountPage().clickSubmitButton();
			//addNewAccountPage.clickSubmitButton();
			break;
		default:
			System.out.println(button + ": Button is not responding");
		}
	}

	@Then("^User should land on dashboard page$")
	public void  user_should_land_on_dashboard_page() {
		Assert.assertEquals(getPageTitle(), "Dashboard- iBilling");
		takeScreenShot(driver);
		
	}

	@Then("^User should land on add new accounts page$")
	public void user_should_land_on_add_new_accounts_page() throws Throwable {
		Assert.assertEquals("wrong Page", "Accounts- iBilling", getPageTitle());
		takeScreenShot(driver);
		
	}
//
//	@When("^User enters \"([^\"]*)\" from database$")
//	public void user_enters_from_database(String loginData) {
//
//		switch (loginData) {
//		case "username":
//			loginPage.enterUserName(dataBasePage.getData("username"));
//			System.out.println("Username from DB: " + dataBasePage.getData("username"));
//			break;
//		case "password":
//			loginPage.enterPassword(dataBasePage.getData("password"));
//			System.out.println("Password from DB: " + dataBasePage.getData("password"));
//			break;
//
//		default:
//			System.out.println("Unable to extract login data " + loginData + "from DB");
//
//		}
//	}

	@After
	public void tearDown() {
		testContextUI.getDriver().close();
		testContextUI.getDriver().quit();
		//driver.close();
		//driver.quit();
	}

}
