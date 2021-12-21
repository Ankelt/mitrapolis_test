package pages;


import org.openqa.selenium.*;


public class BasePage {
        protected WebDriver driver;
        private final String url;

        protected BasePage(WebDriver driver, String url) {
            this.driver = driver;
            this.url = url;
        }

        public void open() {
            driver.get(url);
        }
}
