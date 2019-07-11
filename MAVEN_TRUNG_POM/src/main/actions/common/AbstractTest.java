package common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.gson.Gson;

import ObjectPageJson.AbstractJson;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

public class AbstractTest {
	WebDriver driver;
	private String userPath = System.getProperty("user.dir");
	protected final Log log;

	protected AbstractTest() {
		log = LogFactory.getLog(getClass());
	}

	public WebDriver openMultiBrowser(String browserName, String version, String url) {
		WebDriver driver;
		if (browserName.equals("chrome")) {
			ChromeDriverManager.getInstance().version(version).setup();
			driver = new ChromeDriver();
			// DesiredCapabilities capabilities = new DesiredCapabilities();
			// ChromeOptions options = new ChromeOptions();
			// options.addArguments("--incognito");
			// capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		} else if (browserName.equals("firefox")) {
			// FirefoxProfile firefoxProfile = new FirefoxProfile();
			// firefoxProfile.setPreference("browser.private.browsing.autostart", true);
			driver = new FirefoxDriver();
		} else if (browserName.equals("ie")) {
			// System.setProperty("webdriver.ie.driver",
			// ".\\Resources\\IEDriverServer.exe");
			InternetExplorerDriverManager.getInstance().version(version).setup();
			driver = new InternetExplorerDriver();
		} else {
			String chromePath = userPath.concat("/Resources/").concat("chromedriver.exe");
			// System.setProperty("webdriver.chrome.driver",
			// ".\\Resources\\chromedriver.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("headless");
			options.addArguments("window-size=1366x768");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(options);
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;
	}

	public void closeBroswer(WebDriver driver) {
		try {
			// String osName = System.getProperty("os.name").toLowerCase();
			String cmd = "";
			driver.quit();
			if (driver.toString().toLowerCase().contains("chrome")) {
				cmd = "taskkill /F /FI \"IMAGENAME eq chromedriver*\"";
			} else if (driver.toString().toLowerCase().contains("firefox")) {
				cmd = "taskkill /F /FI \"IMAGENAME eq geckodriver*\"";
			}
			Process process = Runtime.getRuntime().exec(cmd);
			process.waitFor();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private boolean checkPassed(boolean condition) {
		boolean pass = true;
		try {
			if (condition == true)
				log.info("===PASSED===");
			else
				log.info("===FAILED===");

			Assert.assertTrue(condition);
		} catch (Throwable e) {
			pass = false;
			log.info(e);
			// Add status (true/ false) to Report (ReportNG)
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyTrue(boolean condition) {
		return checkPassed(condition);
	}

	private boolean checkFailed(boolean condition) {
		boolean pass = true;
		try {
			if (condition == true)
				log.info("===PASSED===");
			else
				log.info("===FAILED===");
			Assert.assertFalse(condition);
		} catch (Throwable e) {
			pass = false;
			log.info(e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyFalse(boolean condition) {
		return checkFailed(condition);
	}

	private boolean checkEquals(Object actual, Object expected) {
		boolean pass = true;
		try {
			Assert.assertEquals(actual, expected);
		} catch (Throwable e) {
			pass = false;
			log.info(e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyEquals(Object actual, Object expected) {
		return checkEquals(actual, expected);
	}

	public AbstractJson getDataJson(String JsonFile) {
		String json = readFile(JsonFile);
		return new Gson().fromJson(json, AbstractJson.class);
	}

	public String readFile(String filename) {
		String result = "";
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(filename));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
			result = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int randomNumber() {
		Random rand = new Random();
		int n = rand.nextInt(999999) + 1;
		return n;
	}

}
