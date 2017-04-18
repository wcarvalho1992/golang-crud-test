package tech.geofusion.desafio.pages.sections;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tech.geofusion.desafio.support.Section;

public class ProductRegistrationSection extends Section {

    private static final String REGISTRATION_FORM_NAME = "formAdd";
    private static final String SUBMIT_BUTTON_CLASS = "btn";
    private static final String EXPIRATION_DATE_FIELD_ID = "campo3";
    private static final String PRICE_FIELD_NAME = "price";
    private static final String NAME_FIELD_ID = "campo1";

    public ProductRegistrationSection(WebDriver driver) {
        super(driver);
    }

    public void fillNameField(String name) {
        WebElement nameField = getElementById(NAME_FIELD_ID);
        fillTextField(nameField, name);
    }

    public void fillPriceField(String price) {
        WebElement priceField = getElementByName(PRICE_FIELD_NAME);
        fillTextField(priceField, price);
    }

    public void fillExpirationDateField(String expirationDate) {
        WebElement expirationDateField = getElementById(EXPIRATION_DATE_FIELD_ID);
        fillDateField(expirationDateField, expirationDate);
    }

    public void submitProductRegistrationForm() {
        WebElement submitButton = getElementByClass(SUBMIT_BUTTON_CLASS);
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
        boolean validationMessageIsPresent = getElementByName(REGISTRATION_FORM_NAME).findElements(By.tagName("span")).stream().filter(element -> element.getText().equals(expectedMessage)).collect(Collectors.toList()).size() > 0;
        return validationMessageIsPresent;
    }

}
