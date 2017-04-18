package tech.geofusion.desafio.support.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {
    private String name;
    private String price;
    private String expirationDate;
}
