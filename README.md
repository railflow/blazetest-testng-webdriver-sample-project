# BlazeTest TestNG WebDriver Sample Project #

This project contains a sample set of tests written using TestNG, Selenium and WebDriver that tests the web application at https://www.saucedemo.com/.

## Build ##

You can build this project and run tests using the following command line.

    mvn clean package

## Setting up WebDriver ##

Since this is a set of tests for a web application using Selenium and WebDriver, you must have a browser and a compatible version of WebDriver for that browser installed.

By default the tests uses Chrome. This means you must have a compatible version of `chromedriver` installed on your system. You can find the latest available versions at https://googlechromelabs.github.io/chrome-for-testing/.

## Running Tests ##

Tests can be executed using the following command.

    mvn test <options>

The following system parameters can be used to configure the test execution.

| Parameter      | Description                                                               |
|----------------|---------------------------------------------------------------------------|
| delay=N        | Add a random delay between 0.5s to N seconds between each test execution. |
| driver=chrome  | Use the Chrome browser and driver (default).                              |
| driver=firefox | Use the FireFox browser and driver.                                       |

For example, tests can be run using the FireFox browser with a maximum random delay of 5 seconds between tests as follows.

    mvn test -Ddelay=5 -Ddriver=firefox

## Extracting Tests ##

You can use the TestExtractor utility to extract tests from this project as follows.

    java -jar <test-extractor-jar-path>/TestExtractor-jar-with-dependencies.jar -input <sample-project-path> -output <output-path> -framework testng

For example;

    java -jar ./blazetest_java_utility/target/TestExtractor-jar-with-dependencies.jar -input ./blazetest-testng-webdriver-sample-project/ -output ./output -framework testng
