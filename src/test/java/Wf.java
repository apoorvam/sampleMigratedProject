// JUnit Assert framework can be used for verification

import static junit.framework.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class Wf {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public Wf(WebDriver browser) {
		this.browser = browser;
	}

	@com.thoughtworks.gauge.Step("Open google homepage")
	public void openGoogleHomepage() throws Exception {
		browser.get("http://google.com");
		assertEquals(browser.getTitle(), "Google");
	}

}