package io.swagger.api.factories;

import io.swagger.api.AutoretrieveApiService;
import io.swagger.api.impl.AutoretrieveApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-04T12:55:53.153Z[GMT]")public class AutoretrieveApiServiceFactory {
    private final static AutoretrieveApiService service = new AutoretrieveApiServiceImpl();

    public static AutoretrieveApiService getAutoretrieveApi() {
        return service;
    }
}
