package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
			}

	// WebElement
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BANK_CASH_SIDEMENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NEWACCOUNT_SIDEMENU_ELEMENT;

	// Intractable methods
	public void clickBankAndCashSideMenu() {
		BANK_CASH_SIDEMENU_ELEMENT.click();
	}

	public void clickNewAccountSideMenu() {
		NEWACCOUNT_SIDEMENU_ELEMENT.click();
	}
}
