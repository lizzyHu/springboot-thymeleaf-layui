package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket postApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("public-api")
				.apiInfo(apiInfo())
				.select()
				.paths(postPaths())
				.build();
	}
	
	private Predicate<String> postPaths() {
		return or(regex("/user.*"), regex("/api/javainuse.*"));
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("SpringBoot-Thymeleaf demo")
				.description("This is a simple demo")
				.termsOfServiceUrl("localhost:8080")
				.contact("lizzy@gmail.com")
				.license("Free License")
				.licenseUrl("lizzy@gmail.com")
				.version("1.0")
				.build();
	}
	
}
