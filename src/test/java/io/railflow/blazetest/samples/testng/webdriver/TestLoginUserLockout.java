package io.railflow.blazetest.samples.testng.webdriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLoginUserLockout extends TestLoginBase {

    @BeforeTest
    @Override
    public void beforeEach() {
        super.beforeEach();
    }

    @AfterTest
    @Override
    public void afterEach() {
        super.afterEach();
    }

    private void loginFailure(final String username, final String password) {
        loginFailure(username, password, LOGIN_ERROR_LOCKED_OUT);
    }

    @Test
    void missingPassword() {
        loginFailure("locked_out_user", null);
    }

    @Test
    void emptyPassword() {
        loginFailure("locked_out_user", "");
    }

    @Test
    void userLockedOut() {
        loginFailure("locked_out_user", "secret_sauce");
    }
}
