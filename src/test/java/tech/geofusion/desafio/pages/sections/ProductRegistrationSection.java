package tech.geofusion.desafio.pages.sections;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tech.geofusion.desafio.support.Section;

public class ProductRegistrationSection extends Section {

    public ProductRegistrationSection(WebDriver driver) {
        super(driver);
    }

    public void fillNameField(String name) {
        WebElement nameField = getElementById("campo1");
        fillTextField(nameField, name);
    }

    public void fillPriceField(String price) {
        WebElement priceField = getElementByName("price");
        fillTextField(priceField, price);
    }

    public void fillExpirationDateField(String expirationDate) {
        if (expirationDate.isEmpty()) {
            return;
        }
        WebElement expirationDateField = getElementById("campo3");
        fillDateField(expirationDateField, expirationDate);
    }

    public void submitProductRegistrationForm() {
        WebElement submitButton = getElementByClass("btn");
        submitButton.click();
    }

    public boolean isRegisteredProductAlertPresent() {
        try {
            acceptAlert();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean getFieldValidationMessage(String expectedMessage) {
        boolean validationMessageIsPresent = getElementByName("formAdd").findElements(By.tagName("span")).stream().filter(element -> element.getText().equals(expectedMessage)).collect(Collectors.toList()).size() > 0;
        return validationMessageIsPresent;
    }

    public String getPriceFieldValue() {
        List<WebElement> products = getElementByClass("table").findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        return products.get(products.size() - 1).findElements(By.tagName("td")).get(2).getText();
    }

}
