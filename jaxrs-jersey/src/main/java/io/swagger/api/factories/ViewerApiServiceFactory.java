package io.swagger.api.factories;

import io.swagger.api.ViewerApiService;
import io.swagger.api.impl.ViewerApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-12-09T03:38:44.975Z[GMT]")public class ViewerApiServiceFactory {
    private final static ViewerApiService service = new ViewerApiServiceImpl();

    public static ViewerApiService getViewerApi() {
        return service;
    }
}
