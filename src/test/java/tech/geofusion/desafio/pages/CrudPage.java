package tech.geofusion.desafio.pages;

import org.openqa.selenium.WebDriver;

import tech.geofusion.desafio.pages.sections.LoginSection;
import tech.geofusion.desafio.pages.sections.MainSection;
import tech.geofusion.desafio.support.Page;

public class CrudPage extends Page {

    private static final String url = "/";
    private LoginSection loginSection;
    private MainSection mainSection;

    public CrudPage(WebDriver driver) {
        super(driver);
        this.loginSection = new LoginSection(driver);
        this.mainSection = new MainSection(driver);
        setUrl(url);
    }

    public void login(String userName) {
        loginSection.login(userName);
    }

    public void openProductRegistrationForm() {
this.mainSection.openProductRegistrationForm();
    }

}
