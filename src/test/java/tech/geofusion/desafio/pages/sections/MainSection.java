package tech.geofusion.desafio.pages.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tech.geofusion.desafio.support.Section;

public class MainSection extends Section {

    private static final String PRODUCT_REGISTRATION_LINK_TEXT = "Novo Produto";

    public MainSection(WebDriver driver) {
        super(driver);
    }

    public void openProductRegistrationForm() {
        WebElement productRegistrationLink = getElementByLinkText(PRODUCT_REGISTRATION_LINK_TEXT);
        productRegistrationLink.click();
    }

}
