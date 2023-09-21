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

public class TestHomePagePasswordInput extends TestBase {

    private WebElement element;

    @BeforeTest
    @Override
    public void beforeEach() {
        super.beforeEach();

        element = driver.findElement(By.id("password"));
        assertNotNull(element);
    }

    @AfterTest
    @Override
    public void afterEach() {
        super.afterEach();
    }

    @DataProvider(name = "attributesArguments")
    private static String[][] attributesArguments() {
        return new String[][]{
                {"autocorrect", "off"},
                {"autocapitalize", "none"},
                {"name", "password"},
                {"placeholder", "Password"},
                {"type", "password"}};
    }

    @Test(dataProvider = "attributesArguments")
    void attribute(final String name, final String value) {
        assertEquals(value, element.getAttribute(name));
    }

    @Test
    void text() {
        assertEquals("", element.getText());
    }
}
