package io.railflow.blazetest.samples.testng.webdriver.shoppingcart.standard;

import io.railflow.blazetest.samples.testng.webdriver.shoppingcart.TestShoppingCartBoltTShirt;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestShoppingCartStandardUserBoltTShirt extends TestShoppingCartBoltTShirt {
    
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
