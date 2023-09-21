package io.railflow.blazetest.samples.testng.webdriver;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    protected static final String URL = "https://www.saucedemo.com/";

    protected WebDriver driver;

    public void beforeEach() {
        driver = new ChromeDriver();
        assertNotNull(driver);
        try {
            driver.get(URL);
        } catch (final Exception e) {
            fail("Unexpected exception (" + e.getClass().getName() + "): " + e.getMessage());
        }
    }

    public void afterEach() {
        if (driver != null) {
            driver.quit();
        }
    }
}
