package io.railflow.blazetest.samples.testng.webdriver.shoppingcart.problem;

import io.railflow.blazetest.samples.testng.webdriver.shoppingcart.TestShoppingCartInventory;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestShoppingCartProblemUserInventory extends TestShoppingCartInventory {
    
    @BeforeTest
    @Override
    public void beforeEach() {
        super.beforeEach();

        loginSuccess("problem_user", "secret_sauce");
    }

    @AfterTest
    @Override
    public void afterEach() {
        super.afterEach();
    }
}
