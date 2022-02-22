package managers;

import helpers.LoginHelper;
import helpers.NavigationHelper;
import helpers.PollHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class ApplicationManager {

    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();
    JavascriptExecutor js;

    private PollHelper poll;
    private NavigationHelper navigation;
    private LoginHelper login;



    public ApplicationManager() {
        System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
        poll = new PollHelper(this);
        navigation = new NavigationHelper(this);
        login = new LoginHelper(this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public PollHelper getPoll() {
        return poll;
    }

    public void setPoll(PollHelper poll) {
        this.poll = poll;
    }

    public NavigationHelper getNavigation() {
        return navigation;
    }

    public void setNavigation(NavigationHelper navigation) {
        this.navigation = navigation;
    }

    public LoginHelper getLogin() {
        return login;
    }

    public void setLogin(LoginHelper login) {
        this.login = login;
    }

    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
