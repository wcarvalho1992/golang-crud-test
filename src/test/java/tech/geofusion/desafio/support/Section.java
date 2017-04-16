package tech.geofusion.desafio.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Section {

    private WebDriver driver;

    public Section(WebDriver driver) {
        this.driver = driver;
    }

    protected String getTitle() {
        return driver.getTitle();
    }

    protected WebElement getElementById(String elementId) {
        return driver.findElement(By.id(elementId));
    }

    protected WebElement getElementByClass(String elementClass) {
        return driver.findElement(By.className(elementClass));
    }

    protected WebElement getElementByLinkText(String linkText) {
        return (new WebDriverWait(this.driver, 10))
        .until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText)));
    }

    protected void fillTextField(WebElement textField, String value) {
        textField.sendKeys(value);
    }

}
