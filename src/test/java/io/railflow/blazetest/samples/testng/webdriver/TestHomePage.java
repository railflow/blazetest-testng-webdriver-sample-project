package io.railflow.blazetest.samples.testng.webdriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.fail;

import java.util.concurrent.Callable;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestHomePage extends TestBase {

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
    void title() {
        assertEquals("Swag Labs", driver.getTitle());
    }

    @Test
    void description() {
        assertEquals("Sauce Labs Swag Labs app",
                driver.findElement(By.xpath("//meta[@name='description']"))
                    .getAttribute("content"));
    }

    @Test
    void robots() {
        assertEquals("noindex",
                driver.findElement(By.xpath("//meta[@name='robots']"))
                    .getAttribute("content"));
    }

    @Test
    void manifestLink() {
        assertEquals(URL + "manifest.json",
                driver.findElement(By.xpath("//link[@rel='manifest']"))
                    .getAttribute("href"));
    }

    @Test
    void stylesheetLink() {
        assertEquals("https://fonts.googleapis.com/css2?family=DM+Mono:wght@400;500&family=DM+Sans:wght@400;500",
                driver.findElement(By.xpath("//link[@rel='stylesheet']"))
                    .getAttribute("href"));
    }

    @Test
    void errorElementAtStart() {
        try {
            driver.findElement(By.xpath("//h3[@data-test='error']"));
        } catch (final Exception e) {
            fail("Unexpected exception (" + e.getClass().getName() + "): " + e.getMessage());
        }
    }

    @Test
    void noErrorElementAtStart() {
        assertThrows(NoSuchElementException.class,
                () -> driver.findElement(By.xpath("//h3[@data-test='error']")));
    }
}
