import com.thoughtworks.gauge.*;
import org.openqa.selenium.WebDriver;

public class ScenarioExecutionHooks {

	private WebDriver browser;

	public ScenarioExecutionHooks(WebDriver browser) {
		this.browser = browser;
	}

	@BeforeSpec(tags = {"adminLogin"})
	public void loginAsAdmin() {
		login("ADMIN");
	}

	@BeforeSpec(tags = {"memberLogin"})
	public void loginAsMember() {
		login("MEMBER");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In before suite hook");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("In after suite hook");
	}
	@BeforeSpec
	public void beforeSpec() {
		System.out.println("In before spec hook");
	}
	@AfterSpec
	public void afterSpec() {
		System.out.println("In after spec hook");
	}
	@BeforeScenario
	public void beforeScenario() {
		System.out.println("In before scenario hook");
	}
	@AfterScenario
	public void afterScenario() {
		System.out.println("In after scenario hook");
	}


	public void login(String user){
		System.out.println("Logging in as : "+ user);
	}

	@AfterSpec(tags = {"adminLogin", "memberLogin"}, tagAggregation = Operator.OR)
	public void logout() {
		System.out.println("Logged out.");
	}

}