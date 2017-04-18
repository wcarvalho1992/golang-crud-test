package tech.geofusion.desafio.steps;

import cucumber.api.java.After;
import tech.geofusion.desafio.support.Driver;

public class TestPreparation {

    @After
    public void tearDown() {
        Driver.closeDriver();
    }

}
