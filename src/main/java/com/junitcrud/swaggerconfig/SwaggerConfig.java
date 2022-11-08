package com.junitcrud.swaggerconfig;

import static springfox.documentation.builders.PathSelectors.regex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig  {

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("junitdrud").apiInfo(apiInfo()).select()
                                                      .paths(regex("/punit.*")).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Junit API")
                .description("Junit  API Documentation Generated Using Sawwgger2 for our Rest API")
                .termsOfServiceUrl("https://www.youtube.com/watch?v=NOY-LjNHSpU")
                .license("Junit Rest API License")
                .licenseUrl("https://www.youtube.com/watch?v=NOY-LjNHSpU").version("1.0").build();
    };
}
