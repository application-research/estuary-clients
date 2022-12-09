package io.swagger.api.factories;

import io.swagger.api.GetApiService;
import io.swagger.api.impl.GetApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-12-09T03:38:44.975Z[GMT]")public class GetApiServiceFactory {
    private final static GetApiService service = new GetApiServiceImpl();

    public static GetApiService getGetApi() {
        return service;
    }
}
