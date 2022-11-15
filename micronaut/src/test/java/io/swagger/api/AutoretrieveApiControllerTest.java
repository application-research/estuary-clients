package io.swagger.api;

import io.swagger.model.UtilHttpError;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class AutoretrieveApiControllerTest {

    @Inject
    private AutoretrieveApi api;

    @Test
    void autoretrieveHeartbeatPostTest() {
        String token = "token_example";
        try {
            api.autoretrieveHeartbeatPost(token).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
