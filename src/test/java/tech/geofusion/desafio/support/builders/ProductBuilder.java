package tech.geofusion.desafio.support.builders;

import tech.geofusion.desafio.support.domain.Product;

public class ProductBuilder {

    private String name;
    private String price;
    private String expirationDate;

    public ProductBuilder() {
        this.name = "teste1";
        this.price = "10.00";
        this.expirationDate = "today";
    }

    public ProductBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder withPrice(String price) {
        this.price = price;
        return this;
    }

    public ProductBuilder withExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public Product build() {
        return new Product(this.name, this.price, this.expirationDate);
    }

}
