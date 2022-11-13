package com.jpa_crud_restapi_mysql.demo.Config;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwagConfig{
    @Bean
    public Docket swag() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/**"))
                .build()
                .apiInfo(new ApiInfo("Projects details", "THEME PARK mgnt api descri", "1.0",
                        "http://THEME PARK.com//terms/use",
                        new Contact("RESTAPI", "www.restapi.com", "kecemp@kongu.com"),
                        "opensource", "http://kecemp.com/license", Collections.emptyList()));
    }
}
