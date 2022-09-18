//package com.farhadi.fanapspringbootmodulesnormal.config;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.Resource;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.server.ServerWebExchange;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.*;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spi.service.contexts.SecurityContext;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger.web.*;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//import static java.util.Collections.singletonList;
//import static java.util.stream.Collectors.toSet;
//
//@Configuration
//@RequiredArgsConstructor
//public class SwaggerConfig {
//    private static final String SECURITY_KEY_NAME = "Bearer";
//
////    @Bean
////    public Docket docket() {
////        return new Docket(DocumentationType.SWAGGER_2)
////                .select()
////                .apis(RequestHandlerSelectors.any())
////                .build()
////                .useDefaultResponseMessages(false)
////                .produces(Arrays.asList("application/json;charset=UTF-8").stream().collect(toSet()))
////                .securitySchemes(singletonList(securityScheme()))
////                .securityContexts(singletonList(securityContext()))
////                .ignoredParameterTypes(ServerWebExchange.class, Resource.class, ResponseEntity.class)
////                .apiInfo(apiInfo());
////    }
////
////    @Bean
////    public UiConfiguration uiConfig() {
////        return UiConfigurationBuilder.builder() //<20>
////                .deepLinking(true)
////                .displayOperationId(false)
////                .defaultModelsExpandDepth(1)
////                .defaultModelExpandDepth(1)
////                .defaultModelRendering(ModelRendering.MODEL)
////                .displayRequestDuration(false)
////                .docExpansion(DocExpansion.LIST)
////                .filter(false)
////                .maxDisplayedTags(null)
////                .operationsSorter(OperationsSorter.ALPHA)
////                .showExtensions(false)
////                .showCommonExtensions(false)
////                .tagsSorter(TagsSorter.ALPHA)
////                .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
////                .validatorUrl(null)
////                .build();
////    }
//
//    private ApiInfo apiInfo() {
//        final String title = "Fanap Spring Boot Modules";
//        final String description = "هر چی بود همینجا میزنیم";
//        final String version = "1.0";
//        final String termOfServiceUrl = "www.hichi.com";
//        final String contactName = "خودمون";
//        final String contactUrl = "www.hichi.com";
//        final String contactEmail = "yechizi@gmail.com";
//        final String license = "License of API";
//        final String licenseUrl = "www.hichi.com";
//        return new ApiInfo(
//                title,
//                description,
//                version,
//                termOfServiceUrl,
//                new Contact(contactName, contactUrl, contactEmail),
//                license,
//                licenseUrl,
//                Collections.emptyList()
//        );
//    }
//
//    private SecurityScheme securityScheme() {
//        return new ApiKey(SECURITY_KEY_NAME, "Authorization", "header");
//    }
//
//    private SecurityContext securityContext() {
//        return SecurityContext.builder()
//                .securityReferences(defaultAuth())
//                .forPaths(path -> {
//                    if (path.startsWith("/auth/")) {
//                        return false;
//                    }
//                    if (path.startsWith("/public/")) {
//                        return false;
//                    }
//                    return true;
//                })
//                .build();
//    }
//
//    private List<SecurityReference> defaultAuth() {
//        return singletonList(new SecurityReference(SECURITY_KEY_NAME, new AuthorizationScope[]{
//                new AuthorizationScope("global", "accessEverything")
//        }));
//    }
//}
