package io.swagger.api.factories;

import io.swagger.api.MinerApiService;
import io.swagger.api.impl.MinerApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-19T16:30:00.833Z[GMT]")public class MinerApiServiceFactory {
    private final static MinerApiService service = new MinerApiServiceImpl();

    public static MinerApiService getMinerApi() {
        return service;
    }
}
