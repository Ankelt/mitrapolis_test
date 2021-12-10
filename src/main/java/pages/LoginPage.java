package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pages.locators.LoginPageLocators.*;
import static pages.locators.MainPageLocators.MAIN_PAGE;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver, String url) {
        super(driver, url);
    }

    @Override
    public void open() {
        driver.get(url);
        Assert.assertTrue("Authorise form is not presented", isElementPresent(AUTHORISE_FORM));
    }

    public void login(String login, String password, boolean correct) {
        WebElement loginForm = driver.findElement(LOGIN_FORM);
        loginForm.sendKeys(login);
        WebElement passwordForm = driver.findElement(PASSWORD_FORM);
        passwordForm.sendKeys(password);
        WebElement loginButton = driver.findElement(LOGIN_BUTTON);
        loginButton.click();
        if (correct) {
            Assert.assertTrue("Not a main page", isElementPresent(MAIN_PAGE));
        }
        else {
            Assert.assertTrue("Alert message is not presented", isAlertPresent());
        }
    }

    public void passwordIsVisible(String login, String password) {
        WebElement loginForm = driver.findElement(LOGIN_FORM);
        loginForm.sendKeys(login);
        WebElement passwordForm = driver.findElement(PASSWORD_FORM);
        passwordForm.sendKeys(password);
        WebElement eye = driver.findElement(EYE);
        eye.click();
    }

    public void forgotPassword() {
        WebElement forgotPasswordLink = driver.findElement(FORGOT_PASSWORD_LINK);
        forgotPasswordLink.click();
        Assert.assertTrue("Forgot password form is not presented", isElementPresent(FORGOT_PASSWORD_FORM));
    }
}
