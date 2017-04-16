package tech.geofusion.desafio.support;

import org.openqa.selenium.WebDriver;

public abstract class Page {

    private static final String URL_BASE = "http://desafio.geofusion.tech";
    private WebDriver driver;
    private String pageUrl;

    protected Page(WebDriver driver) {
        this.driver = driver;
    }

    public void load() {
        driver.get(pageUrl);
    }

    protected void setUrl(String pageUrl) {
        this.pageUrl = URL_BASE.concat(pageUrl);
    }

}
