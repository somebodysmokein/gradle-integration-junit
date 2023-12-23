package com.browserstack.examples.helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver webDriver;

    @BeforeEach
    public void init() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();

    }

    @AfterEach
    public void teardown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
