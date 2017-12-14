import com.codeborne.selenide.Configuration;
import core.Constants;
import org.testng.annotations.BeforeTest;

import java.io.File;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    StartPage startPage;
    ResultsPage resultsPage;
    PolicyDetailsPage detailsPage;
    BonusPage bonusPage;
    PaymentPage paymentPage;
    static String env = Constants.Environments.DEV;
    private static File chromeDriver = new File("src/main/resources/chromedriver.exe");
    private static File ffDriver = new File("src/main/resources/webDrivers/geckodriver.exe");
    static String userName = Constants.Users.TestUser.getEmail();
    static String userPwd = Constants.Users.TestUser.getPassword();

    @BeforeTest
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
        System.setProperty("webdriver.gecko.driver", ffDriver.getAbsolutePath());
        Configuration.browser = Constants.Browsers.CHROME;
        Configuration.startMaximized = true;
        Configuration.timeout = 30000;
        Configuration.collectionsTimeout = 30000;
        Configuration.closeBrowserTimeoutMs = 1;
        startPage = open(env, StartPage.class);
    }
}
