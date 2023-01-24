package io.swagger.api.factories;

import io.swagger.api.DealApiService;
import io.swagger.api.impl.DealApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-24T07:25:42.112Z[GMT]")public class DealApiServiceFactory {
    private final static DealApiService service = new DealApiServiceImpl();

    public static DealApiService getDealApi() {
        return service;
    }
}
