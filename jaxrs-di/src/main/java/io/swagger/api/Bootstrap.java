package io.swagger.api;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
    info = @Info(
        title = "Swagger Server", 
        version = "0.0.0", 
        description = "This is the API for the Estuary application.",
        termsOfService = "http://estuary.tech",
        contact = @Contact(email = ""),
        license = @License(
            name = "Apache 2.0 Apache-2.0 OR MIT",
            url = "https://github.com/application-research/estuary/blob/master/LICENSE.md"
        )
    )
)
public class Bootstrap {
}
