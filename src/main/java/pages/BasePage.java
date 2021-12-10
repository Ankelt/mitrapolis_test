package pages;


import org.openqa.selenium.*;


public class BasePage {
        protected WebDriver driver;
        protected String url;

        public BasePage(WebDriver driver, String url) {
            this.driver = driver;
            this.url = url;
        }

        public void open() {
            driver.get(url);

        }

        public boolean isElementPresent(By locator) {
            try {
                driver.findElement(locator);
            } catch (NoSuchElementException e) {
                return false;
            }
            return true;
        }

        public boolean isAlertPresent()
        {
            try
            {
                driver.switchTo().alert();
                driver.switchTo().alert().accept();
                return true;
            }
            catch (NoAlertPresentException Ex)
            {
                return false;
            }
        }

}
