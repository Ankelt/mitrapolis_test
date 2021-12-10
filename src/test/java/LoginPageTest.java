import org.testng.annotations.Test;
import pages.LoginPage;

import static constants.Constants.Urls.*;
import static constants.Constants.LoginData.*;

public class LoginPageTest extends BaseTest{

    @Test
    public void linkOpen() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
    }

    @Test (priority=7)
    public void correctAuthorise() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
        loginPage.login(CORRECT_LOGIN, CORRECT_PASSWORD, true);
    }


    @Test
    public void IncorrectAuthoriseIncorrectLogin() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
        loginPage.login(INCORRECT_LOGIN, CORRECT_PASSWORD, false);
    }

    @Test
    public void IncorrectAuthoriseIncorrectPassword() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
        loginPage.login(CORRECT_LOGIN, INCORRECT_PASSWORD, false);
    }

    @Test
    public void IncorrectAuthoriseIncorrectLoginAndIncorrectPassword() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
        loginPage.login(INCORRECT_LOGIN, INCORRECT_PASSWORD, false);
    }

    @Test
    public void forgotPassword() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
        loginPage.forgotPassword();
    }

    @Test
    public void passwordIsVisible() {
        LoginPage loginPage = new LoginPage(driver, MITRAPOLIS_LOGIN_PAGE);
        loginPage.open();
        loginPage.passwordIsVisible(CORRECT_LOGIN, CORRECT_PASSWORD);
    }
}
