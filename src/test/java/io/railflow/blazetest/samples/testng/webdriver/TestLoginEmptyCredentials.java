package io.railflow.blazetest.samples.testng.webdriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLoginEmptyCredentials extends TestLoginBase {
    
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

    @Test
    void missingUsernameMissingPassword() {
        loginFailure(null, null, LOGIN_ERROR_USERNAME_REQUIRED);
    }

    @Test
    void missingUsernameEmptyPassword() {
        loginFailure(null, "", LOGIN_ERROR_USERNAME_REQUIRED);
    }

    @Test
    void invalidUsernameMissingPassword() {
        loginFailure("invalid", null, LOGIN_ERROR_PASSWORD_REQUIRED);
    }

    @Test
    void missingUsernameInvalidPassword() {
        loginFailure(null, "invalid", LOGIN_ERROR_USERNAME_REQUIRED);
    }

    @Test
    void emptyUsernameEmptyPassword() {
        loginFailure("", "", LOGIN_ERROR_USERNAME_REQUIRED);
    }

    @Test
    void emptyUsernameMissingPassword() {
        loginFailure("", null, LOGIN_ERROR_USERNAME_REQUIRED);
    }

    @Test
    void invalidUsernameEmptyPassword() {
        loginFailure("invalid", "", LOGIN_ERROR_PASSWORD_REQUIRED);
    }

    @Test
    void emptyUsernameInvalidPassword() {
        loginFailure("", "invalid", LOGIN_ERROR_USERNAME_REQUIRED);
    }

}
