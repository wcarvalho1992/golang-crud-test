package tech.geofusion.desafio.pages;

import org.openqa.selenium.WebDriver;

import tech.geofusion.desafio.pages.sections.LoginSection;
import tech.geofusion.desafio.pages.sections.MainSection;
import tech.geofusion.desafio.pages.sections.ProductRegistrationSection;
import tech.geofusion.desafio.support.Page;
import tech.geofusion.desafio.support.domain.Product;

public class CrudPage extends Page {

    private static final String url = "/";
    private LoginSection loginSection;
    private MainSection mainSection;
    private ProductRegistrationSection productRegistrationSection;

    public CrudPage(WebDriver driver) {
        super(driver);
        this.loginSection = new LoginSection(driver);
        this.mainSection = new MainSection(driver);
        this.productRegistrationSection = new ProductRegistrationSection(driver);
        setUrl(url);
    }

    public void login(String userName) {
        loginSection.login(userName);
    }

    public void openProductRegistrationForm() {
this.mainSection.openProductRegistrationForm();
    }

    public void fillProductRegistrationForm(Product product) {
        this.productRegistrationSection.fillNameField(product.getName());
        this.productRegistrationSection.fillPriceField(product.getPrice());
        this.productRegistrationSection.fillExpirationDateField(product.getExpirationDate());
    }

    public void submitProductRegistrationForm() {
        this.productRegistrationSection.submitProductRegistrationForm();
    }

    public boolean isRegisteredProductAlertPresent() {
            return this.productRegistrationSection.isRegisteredProductAlertPresent();
    }

    public boolean getFieldValidationMessage(String expectedMessage) {
        return this.productRegistrationSection.getFieldValidationMessage(expectedMessage);
    }

    public String getPriceFieldValue() {
        return this.productRegistrationSection.getPriceFieldValue();
    }

}
