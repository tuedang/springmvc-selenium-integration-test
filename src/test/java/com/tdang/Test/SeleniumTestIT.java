
package com.tdang.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumTestIT extends AbstractTestIT {

    @Test
    public void testWeSeeHelloWorld() {
        WebDriver webDriver = getWebDriver("/");
        assertEquals("Hello World !", webDriver.findElement(By.cssSelector("h1")).getText());
    }

}
