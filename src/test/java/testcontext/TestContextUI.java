package testcontext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.*;

public class TestContextUI {
	
	
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AddNewAccountPage addNewAccountPage;
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebDriver getDriver() {
		return driver;
	}
	
	public LoginPage getLoginPage() {
		return loginPage;
	}
	public DashboardPage getDashboardPage() {
		return dashboardPage;
	}
	public AddNewAccountPage getAddNewAccountPage() {
		return addNewAccountPage;
	}
	
	public void initializePageInstance(WebDriver driver) {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		addNewAccountPage = PageFactory.initElements(driver, AddNewAccountPage.class);
	}
}
