package io.swagger.api.factories;

import io.swagger.api.GetApiService;
import io.swagger.api.impl.GetApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-04T12:55:53.153Z[GMT]")public class GetApiServiceFactory {
    private final static GetApiService service = new GetApiServiceImpl();

    public static GetApiService getGetApi() {
        return service;
    }
}
