package io.swagger.api.factories;

import io.swagger.api.StorageProvidersApiService;
import io.swagger.api.impl.StorageProvidersApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-12-21T01:22:10.613Z[GMT]")public class StorageProvidersApiServiceFactory {
    private final static StorageProvidersApiService service = new StorageProvidersApiServiceImpl();

    public static StorageProvidersApiService getStorageProvidersApi() {
        return service;
    }
}
