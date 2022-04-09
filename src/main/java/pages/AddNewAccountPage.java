package pages;

import org.junit.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewAccountPage extends TestBase {
	WebDriver driver;

	public AddNewAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	// WEbElements
	// WebElement ADD_CONTACT_PAGETITLE_ELEMENT = "Accounts- iBilling";
	@FindBy(id = "account")
	WebElement ACCOUNT_TITLE_ELEMENT;
	@FindBy(name = "description")
	WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.ID_OR_NAME, using = "balance")
	WebElement INITIAL_BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement INTERNET_BANKING_URL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@class=\"btn btn-primary\"]")
	WebElement SUBMIT_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]")
	WebElement ACCOUNT_CREATED_SUCCESSFULLY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[1]/h5")
	WebElement MANAGE_ACCOUNTS_HEADER_ELEMENT;

	// Intractable Methods
	public void insertAccountTitle(String accountTitle) {
		String genAccountTitle = accountTitle + randomNumGen(999);
		ACCOUNT_TITLE_ELEMENT.sendKeys(genAccountTitle);
	}

	public void insertDescription(String description) {
		DESCRIPTION_ELEMENT.sendKeys(description);
	}

	public void insertInitialBalance(String initialBalance) {
		// INITIAL_BALANCE_ELEMENT.sendKeys(String.valueOf(initialBalance));
		INITIAL_BALANCE_ELEMENT.sendKeys(initialBalance);
	}

	public void insertAccountNumber(String accountNumber) {
		ACCOUNT_NUMBER_ELEMENT.sendKeys(accountNumber);
	}

	public void insertContactPerson(String contactPerson) {
		CONTACT_PERSON_ELEMENT.sendKeys(contactPerson);
	}

	public void insertPhone(String phone) {
		String generatedPhone = phone + randomNumGen(999);
		PHONE_ELEMENT.sendKeys(generatedPhone);
	}

	public void insertInternetBankUrl(String internetbankUrl) {
		INTERNET_BANKING_URL_ELEMENT.sendKeys(internetbankUrl);
	}

	public void clickSubmitButton() {
		SUBMIT_BUTTON_ELEMENT.click();
		;
	}

	public void verifyAccountCreation() {
		Assert.assertEquals("wrong page", MANAGE_ACCOUNTS_HEADER_ELEMENT.getText(), "Manage Accounts");
		// Assert.assertEquals("wrong
		// page",ACCOUNT_CREATED_SUCCESSFULLY_ELEMENT.getText(),"× Account Created
		// Successfully");
	}
}
