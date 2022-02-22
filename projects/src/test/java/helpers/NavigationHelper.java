package helpers;

import managers.ApplicationManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(ApplicationManager applicationManager)  {
        super(applicationManager);
    }

    public void OpenLoginPage() {
        driver.findElement(By.xpath("//div[@id='header']/nav/div[3]/div[2]/div/div/a")).click();
    }

    public void OpenTestableSite() {
        driver.get("https://strawpoll.com/en/");
    }

    public void openPollCreatePage() {
        driver.get("https://strawpoll.com/account/dashboard");
        driver.findElement(By.xpath("//div[@id='header']/nav/div[3]/div/a")).click();
    }
}
