package io.swagger.api.factories;

import io.swagger.api.ViewerApiService;
import io.swagger.api.impl.ViewerApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-04T12:55:53.153Z[GMT]")public class ViewerApiServiceFactory {
    private final static ViewerApiService service = new ViewerApiServiceImpl();

    public static ViewerApiService getViewerApi() {
        return service;
    }
}
