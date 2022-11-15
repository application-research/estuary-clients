package io.swagger;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
    info = @Info(
            title = "Estuary API",
            version = "0.0.0",
            description = "This is the API for the Estuary application.",
            contact = @Contact(
                    name = "API Support",
                    email = ""
            ),
            license = @License(
                    name = "Apache 2.0 Apache-2.0 OR MIT",
                    url = "https://github.com/application-research/estuary/blob/master/LICENSE.md"
            )
    )
)
public class MainApplication {

    public static void main(String[] args) {
        Micronaut.run(MainApplication.class);
    }
}