package com.java8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Objects;

public class StreamsPractice {

    private static WebDriver driver;

    @Test
    public void amazonApp() {

        WebDriverManager.chromedriver().setup();
        if (Objects.isNull(driver))
            driver = new ChromeDriver();

        driver.get("http://www.amazon.in");

        driver.findElements(By.xpath("//a"))
                .stream()
                .map(e -> e.getText())
                .filter(a -> !a.isEmpty())
                .distinct()
                .sorted()
                .filter(b -> b.startsWith("C"))
                .forEach(System.out::println);

        driver.quit();
    }


}
