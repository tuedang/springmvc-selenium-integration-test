
package com.tdang.Test;

import java.net.URI;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ TestConfig.class })
public abstract class AbstractTestIT {
    
    @Autowired
    protected URI siteBase;
    
    @Autowired
    protected WebDriver drv;
    {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                drv.close();
            }
        });
    }

    protected WebDriver getWebDriver(String contextPath) {
        drv.get(siteBase.toString() + contextPath);
        return drv;
    }

}
