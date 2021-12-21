import org.openqa.selenium.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import static common.CommonActions.createDriver;
import static common.Config.CLEAR_COOKIES_AND_LOCAL_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = createDriver();

    @AfterTest
    private void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_LOCAL_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite (alwaysRun = true)
    private void clear() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }

    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    protected boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            driver.switchTo().alert().accept();
            return true;
        } catch (NoAlertPresentException Ex) {
            return false;
        }
    }
}
