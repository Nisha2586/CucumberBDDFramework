package runners;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",//"src\\test\\java\\features\\Techfios.feature",
		glue = "steps",
		tags = "@TF_bank&cash_newAccount",
		monochrome = true,
		dryRun = false,//this is for initialization error,always false or it wont be there
		plugin = { 
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json"
				}
		
		
		)
public class LoginRunner {

}
