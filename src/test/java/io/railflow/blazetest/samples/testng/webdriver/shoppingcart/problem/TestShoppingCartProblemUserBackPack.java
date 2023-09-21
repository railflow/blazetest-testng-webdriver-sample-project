package io.railflow.blazetest.samples.testng.webdriver.shoppingcart.problem;

import io.railflow.blazetest.samples.testng.webdriver.shoppingcart.TestShoppingCartBackPack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestShoppingCartProblemUserBackPack extends TestShoppingCartBackPack {
    
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
