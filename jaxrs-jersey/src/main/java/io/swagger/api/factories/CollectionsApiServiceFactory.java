package io.swagger.api.factories;

import io.swagger.api.CollectionsApiService;
import io.swagger.api.impl.CollectionsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-11-22T22:05:02.048Z[GMT]")public class CollectionsApiServiceFactory {
    private final static CollectionsApiService service = new CollectionsApiServiceImpl();

    public static CollectionsApiService getCollectionsApi() {
        return service;
    }
}
