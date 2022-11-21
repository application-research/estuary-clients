package io.swagger.api.factories;

import io.swagger.api.CollectionsApiService;
import io.swagger.api.impl.CollectionsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-11-21T16:22:17.074Z[GMT]")public class CollectionsApiServiceFactory {
    private final static CollectionsApiService service = new CollectionsApiServiceImpl();

    public static CollectionsApiService getCollectionsApi() {
        return service;
    }
}
