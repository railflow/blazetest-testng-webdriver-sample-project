package io.railflow.blazetest.samples.testng.webdriver.shoppingcart.problem;

import io.railflow.blazetest.samples.testng.webdriver.shoppingcart.TestShoppingCartBikeLight;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestShoppingCartProblemUserBikeLight extends TestShoppingCartBikeLight {
    
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
