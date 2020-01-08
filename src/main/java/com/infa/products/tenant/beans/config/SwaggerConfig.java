package com.infa.products.tenant.beans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infa.products.tenant.common.EndPoints;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Shailesh Singh
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.infa.products.tenant.controller"))
                .paths(PathSelectors.regex(EndPoints.PROJECT+EndPoints.V1_API_VERSION+".*"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "TennatApplication",
                "An application to manage multi-tenancy information",
                "TennatApplication v1",
                "Terms of service",
                "support@informatica.com",
                "License of API",
                "https://swagger.io/docs/");
        return apiInfo;
    }

}
