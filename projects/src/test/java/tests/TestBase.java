package tests;

import dtos.AccountData;
import dtos.ThreeElementalPollData;
import managers.ApplicationManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class TestBase {
    protected ApplicationManager am;
    @Before
    public void setUp() throws Exception {
        am = new ApplicationManager();
    }

    @After
    public void tearDown() throws Exception {
        am.stop();
    }

}
