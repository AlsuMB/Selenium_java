package tests;

import dtos.AccountData;
import org.junit.*;


public class LoginTestCase extends TestBase {

    @Test
    public void testLogin() throws Exception {
        AccountData user = new AccountData("vagoyed168@otozuz.com", "Marek228");
        am.getNavigation().OpenTestableSite();
        am.getNavigation().OpenLoginPage();
        am.getLogin().LogIn(user);
    }
}

