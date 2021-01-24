package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    public final String userEmail = "davit.vardanyan@betconstruct.com";
    public final String userPassword = "Test12345";

    public SelenideElement loginTitle = $(".right-top-nav-new-h:nth-child(2)");
    public SelenideElement emailField = $("#login-name");
    public SelenideElement passwordField = $("#password");
    public SelenideElement logInButton = $(".button-view-normal-m:not(.trans-m)");
    public SelenideElement userName = $(".home-wrapper-login:nth-child(1)");
    public SelenideElement selectLanguage = $("div:nth-child(4) > div > ul > li:nth-child(2) > div > select");
    public SelenideElement myAccountIcon = $(" div.profile > div.title-row-u-m > p > span");
    public SelenideElement changePasswordTitle = $("div.profile > div.open-view-single-u-m > ul > li:nth-child(2) > a > p > span");
    public SelenideElement newPasswordField = $(".password1");
    public SelenideElement newPasswordField2 = $(".password2");
    public SelenideElement oldPasswordField = $("input[name=oldpassword]");
    public SelenideElement changePasswordButton = $(".button-view-normal-m");
    public SelenideElement successMessage = $(".success");


    public MainPage clickOnLoginTitle() {
        loginTitle.click();
        return this;
    }

    public MainPage typeInEmailField(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public MainPage typeInPasswordField(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public MainPage clickOnLoginButton() {
        logInButton.click();
        return this;
    }

    public String getUserName() {
        String name = userName.getText();
        return name;
    }

    public MainPage logIn() {
        clickOnLoginTitle();
        typeInEmailField(userEmail);
        typeInPasswordField(userPassword);
        Selenide.sleep(2000);
        clickOnLoginButton();
        return this;
    }

    public void selectAppLanguage(String text) {
        selectLanguage.selectOptionByValue(text);
    }

    public String getEnglishTest() {
        String text = loginTitle.getText();
        return text;
    }

    public MainPage changeUserPassword() {
        userName.click();
        myAccountIcon.click();
        changePasswordTitle.click();
        newPasswordField.sendKeys(userPassword);
        newPasswordField2.sendKeys(userPassword);
        oldPasswordField.sendKeys(userPassword);
        changePasswordButton.click();
        return this;
    }
    public String getSuccessMessage() {
        String text = successMessage.getText();
        return text;
    }


}
