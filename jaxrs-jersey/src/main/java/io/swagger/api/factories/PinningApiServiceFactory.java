package io.swagger.api.factories;

import io.swagger.api.PinningApiService;
import io.swagger.api.impl.PinningApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-11-23T18:54:24.309Z[GMT]")public class PinningApiServiceFactory {
    private final static PinningApiService service = new PinningApiServiceImpl();

    public static PinningApiService getPinningApi() {
        return service;
    }
}
