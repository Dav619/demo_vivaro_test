package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest extends MainPage {
    public static final String BASE_URL = "https://m.vivarobet.am/";


    @BeforeMethod
    public void beforeMethodSignIn() {
        Configuration.browserSize = "375x812";
        open(BASE_URL);
        sleep(5000);
        closeNewVersionPopup();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        closeWebDriver();
    }


    protected void closeNewVersionPopup() {
        if (popupCloseButton.isDisplayed()) {
            popupCloseButton.click();
        }

    }

}
