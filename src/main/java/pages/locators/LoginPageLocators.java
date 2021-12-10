package pages.locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
    public static final By LOGIN_FORM = By.cssSelector("[name=\"user\"]");
    public static final By PASSWORD_FORM = By.cssSelector("[name=\"password\"]");
    public static final By LOGIN_BUTTON = By.id("button_submit_login_form");
    public static final By EYE = By.id("show_password");
    public static final By FORGOT_PASSWORD_LINK = By.cssSelector("a.mira-default-login-page-link");
    public static final By FORGOT_PASSWORD_FORM = By.cssSelector(".mira-forgot-password-form");
    public static final By AUTHORISE_FORM = By.cssSelector(".mira-page-login-one-form");
}
