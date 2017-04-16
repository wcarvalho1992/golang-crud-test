package tech.geofusion.desafio.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(String browserName) {
        if (Browsers.FIREFOX.name().equals(browserName.toUpperCase())) {
            createFirefoxDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }

    private static void createFirefoxDriver() {
        if (driver instanceof FirefoxDriver) {
            return;
        }
        System.setProperty("webdriver.gecko.driver", "gecko\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

}
