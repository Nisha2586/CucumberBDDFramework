package hooks;

import org.junit.Assume;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class AppHooks {
	
	
	@Before(value = "@Smoke",order=0)
	public void skipScenario(Scenario scenario) {
		System.out.println("Skipped Scenario : " + scenario.getName());
		Assume.assumeTrue(false);
		scenario.write("");
	}
//	@BeforeSteps()
//	@After(order=1)
	//@After(order=0)

}
