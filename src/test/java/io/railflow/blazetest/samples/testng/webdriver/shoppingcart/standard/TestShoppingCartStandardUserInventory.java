package io.railflow.blazetest.samples.testng.webdriver.shoppingcart.standard;

import io.railflow.blazetest.samples.testng.webdriver.shoppingcart.TestShoppingCartInventory;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestShoppingCartStandardUserInventory extends TestShoppingCartInventory {
    
    @BeforeTest
    @Override
    public void beforeEach() {
        super.beforeEach();

        loginSuccess("standard_user", "secret_sauce");
    }

    @AfterTest
    @Override
    public void afterEach() {
        super.afterEach();
    }
}
