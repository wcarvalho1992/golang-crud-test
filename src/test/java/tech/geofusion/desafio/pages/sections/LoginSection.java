package tech.geofusion.desafio.pages.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tech.geofusion.desafio.support.Section;

public class LoginSection extends Section {

    private static final String OWNER_FIELD_ID = "owner";
    private static final String SUBMIT_BUTTON_CLASS = "btn";

    public LoginSection(WebDriver driver) {
        super(driver);
    }

    public void login(String userName) {
        WebElement ownerField = getElementById(OWNER_FIELD_ID);
        WebElement submitButton = getElementByClass(SUBMIT_BUTTON_CLASS);
        fillTextField(ownerField, userName);
        submitButton.click();
    }

}
