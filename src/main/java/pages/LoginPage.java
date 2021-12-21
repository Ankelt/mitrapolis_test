package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pages.locators.LoginPageLocators.*;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver, String url) {
        super(driver, url);
    }

    public void login(String login, String password) {
        dataEnter(login, password);
        WebElement loginButton = driver.findElement(LOGIN_BUTTON);
        loginButton.click();
    }

    public void passwordIsVisible(String login, String password) {
        dataEnter(login, password);
        WebElement eye = driver.findElement(EYE);
        eye.click();
    }

    public void forgotPassword() {
        WebElement forgotPasswordLink = driver.findElement(FORGOT_PASSWORD_LINK);
        forgotPasswordLink.click();
    }

    public void dataEnter(String login, String password) {
        WebElement loginForm = driver.findElement(LOGIN_FORM);
        loginForm.sendKeys(login);
        WebElement passwordForm = driver.findElement(PASSWORD_FORM);
        passwordForm.sendKeys(password);
    }
}
