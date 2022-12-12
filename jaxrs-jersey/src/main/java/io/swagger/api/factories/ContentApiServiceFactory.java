package io.swagger.api.factories;

import io.swagger.api.ContentApiService;
import io.swagger.api.impl.ContentApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-12-12T21:11:35.185Z[GMT]")public class ContentApiServiceFactory {
    private final static ContentApiService service = new ContentApiServiceImpl();

    public static ContentApiService getContentApi() {
        return service;
    }
}
