package io.railflow.blazetest.samples.testng.webdriver.shoppingcart.problem;

import io.railflow.blazetest.samples.testng.webdriver.shoppingcart.TestShoppingCartBoltTShirt;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestShoppingCartProblemUserBoltTShirt extends TestShoppingCartBoltTShirt {
    
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
