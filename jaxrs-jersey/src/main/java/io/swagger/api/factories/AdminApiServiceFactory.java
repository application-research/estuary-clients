package io.swagger.api.factories;

import io.swagger.api.AdminApiService;
import io.swagger.api.impl.AdminApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-13T19:43:16.543Z[GMT]")public class AdminApiServiceFactory {
    private final static AdminApiService service = new AdminApiServiceImpl();

    public static AdminApiService getAdminApi() {
        return service;
    }
}
