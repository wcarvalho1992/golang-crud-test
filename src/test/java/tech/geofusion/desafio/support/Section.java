package tech.geofusion.desafio.support;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
        return (new WebDriverWait(driver, 10))
        .until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }

    protected WebElement getElementByName(String elementName) {
        return (new WebDriverWait(driver, 10))
        .until(ExpectedConditions.presenceOfElementLocated(By.name(elementName)));
    }

    protected WebElement getElementByClass(String elementClass) {
        return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className(elementClass)));
    }

    protected WebElement getElementByLinkText(String linkText) {
        return (new WebDriverWait(this.driver, 10))
        .until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText)));
    }

    protected WebElement getElementByText(String text) {
        String xpathToLocateElementByText = String.format("//span[text()=%s]", text);
        return (new WebDriverWait(this.driver, 10))
        .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathToLocateElementByText)));
    }

    protected void fillTextField(WebElement textField, String value) {
        Actions actions = focusAnElement(textField);
        actions.sendKeys(value);
        actions.build().perform();
    }

    protected void fillDateField(WebElement dateField, String value) {
        if (value.isEmpty()) {
            return;
        }
        Actions actions = focusAnElement(dateField);
        if (value.equals("before today")) {
            actions.sendKeys(Keys.ARROW_UP);
        }
        actions.sendKeys(Keys.ENTER);
        actions.build().perform();
    }

    protected void acceptAlert() {
        Alert alert = new WebDriverWait(this.driver, 10)
        .until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
    
    private Actions focusAnElement(WebElement dateField) {
        Actions actions = new Actions(this.driver);
        actions.moveToElement(dateField);
        actions.click();
        return actions;
    }

}
