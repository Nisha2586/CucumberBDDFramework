package steps;

import org.junit.After;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.AddNewAccountPage;
import pages.DashboardPage;
import pages.DataBasePage;
import pages.LoginPage;
import pages.TestBase;
import testcontext.TestContextUI;

public class BankAndCashNewAccountStepDefenition extends TestBase {
	
TestContextUI testContextUI;
	
	public BankAndCashNewAccountStepDefenition(TestContextUI testContextUI) {
		this.testContextUI = testContextUI;
	}
	//AddNewAccountPage addNewAccountPage;
	
//	public void pageSetUp() {
//		addNewAccountPage = PageFactory.initElements(driver, AddNewAccountPage.class);
//	}
	
	@And("^User enters account title as \"([^\"]*)\" in accounts page$")
	public void user_enters_account_title_as_in_accounts_page(String account_title) throws Throwable {
		//pageSetUp();
		testContextUI.getAddNewAccountPage().insertAccountTitle(account_title);
		//addNewAccountPage.insertAccountTitle(accountTitle);
	
	}

	@And("^User enters description as \"([^\"]*)\" in accounts page$")
	public void user_enters_description_as_in_accounts_page(String description) throws Throwable {
		testContextUI.getAddNewAccountPage().insertDescription(description);
		//addNewAccountPage.insertDescription(description); 
	}

	@And("^user enters initial balance as \"([^\"]*)\" in accounts page$")
	public void user_enters_initial_balance_as_in_accounts_page(String initialBalance) throws Throwable {
		testContextUI.getAddNewAccountPage().insertInitialBalance(initialBalance);
		//addNewAccountPage.insertInitialBalance(initialBalance);
	}

	@And("^User enters account number as \"([^\"]*)\" in accounts page$")
	public void user_enters_account_number_as_in_accounts_page(String accountNumber) throws Throwable {
		testContextUI.getAddNewAccountPage().insertAccountNumber(accountNumber);
		//addNewAccountPage.insertAccountNumber(accountNumber);  
	}

	@And("^User enters contact person as \"([^\"]*)\" in accounts page$")
	public void user_enters_contact_person_as_in_accounts_page(String contactPerson) throws Throwable {
		testContextUI.getAddNewAccountPage().insertContactPerson(contactPerson);
		//addNewAccountPage.insertContactPerson(contactPerson);
	}

	@And("^User enters phone \"([^\"]*)\" in accounts page$")
	public void user_enters_phone_in_accounts_page(String phone) throws Throwable {
		testContextUI.getAddNewAccountPage().insertPhone(phone);
		//addNewAccountPage.insertPhone(phone);			
	
	}

	@And("^User enters internet banking url \"([^\"]*)\" in accounts page$")
	public void user_enters_internet_banking_url_in_accounts_page(String internetBankUrl) throws Throwable {
		testContextUI.getAddNewAccountPage().insertInternetBankUrl(internetBankUrl);
		//addNewAccountPage.insertInternetBankUrl(internetBankUrl);
	}

	@Then("^User should be able to validate accounts created successfully$")
	public void user_should_be_able_to_validate_accounts_created_successfully() throws Throwable {
		testContextUI.getAddNewAccountPage().verifyAccountCreation();
		//addNewAccountPage.verifyAccountCreation();
		takeScreenShot(testContextUI.getDriver());
	}
	
}
