package runners;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",//"src\\test\\java\\features\\Techfios.feature",
		glue = {"steps","hooks"},
		tags = {"~@TF_login1","@TF_bank&cash_newAccount"},//"@all",//"@TF_login1 and @TF_login2","not @smoke","@TF_login1 or @TF_login2",{"@smoke","@tag"}--and both will executed
		monochrome = true,//to make output more readable in the console
		dryRun = false,//this is for initialization error,always false or test wont be there
		plugin = {//for different reporting purposes 
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json",
				"junit:target/cucumbr.xml",
				"rerun:taget/failedrerun.txt"
				
				}
		
		
		)
public class LoginRunner{ // extends AbstractTestNGCucumberTests {
//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios(){
//		return super.scenarios();
//}
}
