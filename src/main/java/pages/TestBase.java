package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;

	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static void takeScreenShot(WebDriver driver) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		try {
			// FileUtils.copyFile(source, new File(System.getProperty("user.dir") +
			// "/screenshot/" + label + ".png"));
			FileUtils.copyFile(source, new File("./" + "/screenshot/" + label + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int randomNumGen(int outBound) {
		Random ran = new Random();
		int generatedNum = ran.nextInt(outBound);
		return generatedNum;

	}

	public static String getPageTitle() {
		return driver.getTitle();
	}

//	@After
//	public static void tearDown() {
//		driver.close();
//		driver.quit();
//	}

}
