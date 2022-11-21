package io.swagger.api.factories;

import io.swagger.api.PublicApiService;
import io.swagger.api.impl.PublicApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-11-21T15:23:18.958Z[GMT]")public class PublicApiServiceFactory {
    private final static PublicApiService service = new PublicApiServiceImpl();

    public static PublicApiService getPublicApi() {
        return service;
    }
}
