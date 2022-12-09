package io.swagger.api;

import io.swagger.model.UtilHttpError;
import io.swagger.model.UtilViewerResponse;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class ViewerApiControllerTest {

    @Inject
    private ViewerApi api;

    @Test
    void viewerGetTest() {
        try {
            api.viewerGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
