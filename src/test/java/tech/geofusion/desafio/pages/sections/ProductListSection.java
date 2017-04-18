package tech.geofusion.desafio.pages.sections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tech.geofusion.desafio.support.Section;

public class ProductListSection extends Section {

    public ProductListSection(WebDriver driver) {
        super(driver);
    }

    public String getPriceFieldValue() {
        List<WebElement> products = getElementByClass("table").findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        return products.get(products.size() - 1).findElements(By.tagName("td")).get(2).getText();
    }

}
