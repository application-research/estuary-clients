package io.swagger.api.factories;

import io.swagger.api.UserApiService;
import io.swagger.api.impl.UserApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-12-21T01:22:10.613Z[GMT]")public class UserApiServiceFactory {
    private final static UserApiService service = new UserApiServiceImpl();

    public static UserApiService getUserApi() {
        return service;
    }
}
