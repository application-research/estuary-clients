package io.swagger.api.factories;

import io.swagger.api.MinerApiService;
import io.swagger.api.impl.MinerApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-02-02T18:38:37.222Z[GMT]")public class MinerApiServiceFactory {
    private final static MinerApiService service = new MinerApiServiceImpl();

    public static MinerApiService getMinerApi() {
        return service;
    }
}
