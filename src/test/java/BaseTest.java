import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import utils.DriverManager;

import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseTest {

	protected static final Logger LOGGER = Logger.getLogger(BookingTestForNotLogged.class.getName());
	protected Level level = Level.INFO;

	@BeforeTest
	public void setUpTest() throws MalformedURLException {
		DriverManager.setDriver();
		LOGGER.log(level, "test started");
	}



	@AfterTest
	public void dropDownTest() {
		DriverManager.getDriver().quit();
		LOGGER.log(level, "test finished");

	}

	@BeforeSuite
	public void suiteStart() throws MalformedURLException {
		LOGGER.log(level, "suite started");
	}

	@AfterSuite
	public void suiteFinish() {
		LOGGER.log(level, "suite started");
	}

}
