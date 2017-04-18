package tech.geofusion.desafio.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(String browserName) {
        if (Browsers.CHROME.name().equals(browserName.toUpperCase())) {
            createChromeDriver();
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

    private static void createChromeDriver() {
        if (driver instanceof ChromeDriver) {
            return;
        }
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

}
