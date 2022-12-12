package io.swagger.api.factories;

import io.swagger.api.GetApiService;
import io.swagger.api.impl.GetApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-12-12T21:11:35.185Z[GMT]")public class GetApiServiceFactory {
    private final static GetApiService service = new GetApiServiceImpl();

    public static GetApiService getGetApi() {
        return service;
    }
}
