package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
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
        $(".popup-closed-b").shouldBe(visible).click();
    }

}
