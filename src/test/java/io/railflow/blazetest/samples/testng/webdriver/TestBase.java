package io.railflow.blazetest.samples.testng.webdriver;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

class TestBase {

    protected static final String URL = "https://www.saucedemo.com/";

    protected int delay;
    protected WebDriver driver;

    protected TestBase() {
        try {
            delay = Integer.parseInt(System.getProperty("delay", "0"));
        } catch (final Exception e) {
            delay = 0;
        }
    }

    public void beforeEach() {
        switch (System.getProperty("driver", "chrome").toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
        }

        assertNotNull(driver, "Failed to initialize driver");
        try {
            driver.get(URL);
        } catch (final Exception e) {
            fail("Unexpected exception (" + e.getClass().getName() + "): " + e.getMessage());
        }
    }

    public void afterEach() {
        if (delay != 0) {
            final Random random = new Random();
            try {
                Thread.sleep(random.nextInt(500, delay * 1000));
            } catch (final InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        if (driver != null) {
            driver.quit();
        }
    }
}
