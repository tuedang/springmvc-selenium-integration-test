
package com.tdang.Test;

import java.net.URI;
import java.net.URISyntaxException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Value("${baseUrl}")
    private String baseUrl;//http://localhost:10001/spring-selenium-test-1.0.0

	@Bean
	public URI getSiteBase() throws URISyntaxException {
        return new URI(baseUrl);
    }    
    
	@Bean(destroyMethod="quit")
	public FirefoxDriver getDrv() {
        return new FirefoxDriver();
    }
    
}
