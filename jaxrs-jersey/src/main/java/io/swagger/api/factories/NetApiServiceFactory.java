package io.swagger.api.factories;

import io.swagger.api.NetApiService;
import io.swagger.api.impl.NetApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-11-19T20:28:51.425Z[GMT]")public class NetApiServiceFactory {
    private final static NetApiService service = new NetApiServiceImpl();

    public static NetApiService getNetApi() {
        return service;
    }
}
