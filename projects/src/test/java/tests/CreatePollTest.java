package tests;

import dtos.AccountData;
import dtos.ThreeElementalPollData;
import org.junit.*;


public class CreatePollTest extends TestBase {

    @Test
    public void testLogin() throws Exception {
        AccountData user = new AccountData("vagoyed168@otozuz.com", "Marek228");
        am.getNavigation().OpenTestableSite();
        am.getNavigation().OpenLoginPage();
        am.getLogin().LogIn(user);
    }


    @Test
    public void testPollCreation() throws Exception {
        AccountData user = new AccountData("vagoyed168@otozuz.com", "Marek228");
        am.getNavigation().OpenTestableSite();
        am.getNavigation().OpenLoginPage();
        am.getLogin().LogIn(user);
        ThreeElementalPollData poll = new ThreeElementalPollData("new poll", "rly new poll", "Primo opcion", "Segundo opcion", "Trente opcion");
        am.getNavigation().openPollCreatePage();
        am.getPoll().createThreeElementsPoll(poll);
    }
}