package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class DemoTests extends BaseTest {
    MainPage mainPage = new MainPage();

    @Test
    public void logIn() {
        mainPage.logIn();
        Assert.assertEquals(mainPage.getUserName(), "DAVIT.VARDANYAN@BETCONSTRUCT.COM");

    }

    @Test
    public void changeAppLanguageToEnglish() {
        mainPage.selectAppLanguage("eng");
        Assert.assertEquals(mainPage.getEnglishTest(), "LOGIN");

    }

    @Test
    public void changeUserPassword() {
        mainPage.logIn();
        mainPage.changeUserPassword();
        Assert.assertEquals(mainPage.getSuccessMessage(), "Գաղտնաբառը հաջողությամբ փոխվել է։");

    }
}
