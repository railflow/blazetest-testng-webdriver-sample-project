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

public class TestHomePageUsernameInput extends TestBase {

    private WebElement element;

    @BeforeTest
    @Override
    public void beforeEach() {
        super.beforeEach();

        element = driver.findElement(By.id("user-name"));
        assertNotNull(element);
    }

    @AfterTest
    @Override
    public void afterEach() {
        super.afterEach();
    }

    @Test
    void autoCorrect() {
        assertEquals("off", element.getAttribute("autocorrect"));
    }

    @Test
    void autoCapitalize() {
        assertEquals("none", element.getAttribute("autocapitalize"));
    }

    @Test
    void name() {
        assertEquals("user-name", element.getAttribute("name"));
    }

    @Test
    void placeholder() {
        assertEquals("Username", element.getAttribute("placeholder"));
    }

    @Test
    void type() {
        assertEquals("text", element.getAttribute("type"));
    }

    @Test
    void text() {
        assertEquals("", element.getText());
    }
}
