package xeroLogin.xeroLogin;

/** Test case to login to xero and add ANZ NZ in the orgnization
 * @param author = Anupama
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pages.AddAccount;
import com.pages.AlternateLoginPage;
import com.pages.AnswersPage;
import com.pages.DashBoard;
import com.pages.LoginPage;
import com.pages.SecurityQuestionPage;

public class LoginTest {
	private WebDriver driver;
	private String baseUrl;
	LoginPage loginPage;
	AlternateLoginPage alternateloging;
	SecurityQuestionPage securityquestions;
	AnswersPage answerspage;
	AddAccount addaccount;
	DashBoard dashboard;

	@BeforeSuite
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/anupamasingh/Desktop/xeroCodingExcercise/xeroLogin/driver/chromedriver 2");
		driver = new ChromeDriver();
		baseUrl = "https://login.xero.com/";
		loginPage = new LoginPage(driver);
		alternateloging = new AlternateLoginPage(driver);
		securityquestions = new SecurityQuestionPage(driver);
		answerspage = new AnswersPage(driver);
		dashboard = new DashBoard(driver);
		addaccount = new AddAccount(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Test
	@Parameters({ "emailiD", "password", "accountName", "ccNumber" })
	public void loginMainPage(String emailiD, String password, String acountName, String CCNumber) {
		driver.get(baseUrl);
		loginPage.enterEmail(emailiD);
		loginPage.enterPassword(password);
		loginPage.clickonLoing();
		alternateloging.clickonAlternateMethod();
		securityquestions.clickonsecurityQuestions();
		answerspage.securityAnswers();
		dashboard.clickonAddAccount();
		addaccount.searchAccount(acountName);
		addaccount.addAccountAnyway();
		addaccount.selectANZ();
		addaccount.selectAccountName(acountName);
		addaccount.selectAccountType();
		addaccount.selectCCNumber(CCNumber);
		// addaccount.saveAccount();
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}

}
