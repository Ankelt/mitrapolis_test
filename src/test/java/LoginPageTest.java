import org.junit.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

import static constants.Constants.Urls.*;
import static constants.Constants.LoginData.*;
import static pages.locators.LoginPageLocators.AUTHORISE_FORM;
import static pages.locators.LoginPageLocators.FORGOT_PASSWORD_FORM;
import static pages.locators.MainPageLocators.MAIN_PAGE;

public class LoginPageTest extends BaseTest{

    @Test
    public void linkOpen() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
        Assert.assertTrue("Authorise form is not presented", isElementPresent(AUTHORISE_FORM));
    }

    @Test (priority=7)
    public void correctAuthorise() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
        loginPage.login(INCORRECT_LOGIN, CORRECT_PASSWORD);
        MainPage mainPage = new MainPage(driver, driver.getCurrentUrl());
        Assert.assertTrue("Not a main page", isElementPresent(MAIN_PAGE));
    }


    @Test
    public void IncorrectAuthoriseIncorrectLogin() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
        loginPage.login(INCORRECT_LOGIN, CORRECT_PASSWORD);
        Assert.assertTrue("Alert message is not presented", isAlertPresent());
    }

    @Test
    public void IncorrectAuthoriseIncorrectPassword() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
        loginPage.login(INCORRECT_LOGIN, CORRECT_PASSWORD);
        Assert.assertTrue("Alert message is not presented", isAlertPresent());
    }

    @Test
    public void IncorrectAuthoriseIncorrectLoginAndIncorrectPassword() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
        loginPage.login(INCORRECT_LOGIN, CORRECT_PASSWORD);
        Assert.assertTrue("Alert message is not presented", isAlertPresent());
    }

    @Test
    public void forgotPassword() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
        loginPage.forgotPassword();
        Assert.assertTrue("Forgot password form is not presented",
                isElementPresent(FORGOT_PASSWORD_FORM));
    }

    @Test
    public void passwordIsVisible() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
        loginPage.passwordIsVisible(CORRECT_LOGIN, CORRECT_PASSWORD);
    }
}
