package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-02T18:38:36.904Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Estuary API")
            .description("This is the API for the Estuary application.")
            .license("Apache 2.0 Apache-2.0 OR MIT")
            .licenseUrl("https://github.com/application-research/estuary/blob/master/LICENSE.md")
            .termsOfServiceUrl("https://docs.estuary.tech/feedback")
            .version("0.0.0")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("Estuary API")
                .description("This is the API for the Estuary application.")
                .termsOfService("https://docs.estuary.tech/feedback")
                .version("0.0.0")
                .license(new License()
                    .name("Apache 2.0 Apache-2.0 OR MIT")
                    .url("https://github.com/application-research/estuary/blob/master/LICENSE.md"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("")));
    }

}
