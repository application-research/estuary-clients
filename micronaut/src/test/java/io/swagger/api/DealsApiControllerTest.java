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
class DealsApiControllerTest {

    @Inject
    private DealsApi api;

    @Test
    void dealsFailuresGetTest() {
        try {
            api.dealsFailuresGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void dealsMakeMinerPostTest() {
        String body = "body_example";
        String miner = "miner_example";
        try {
            api.dealsMakeMinerPost(body, miner).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void dealsStatusDealGetTest() {
        Integer deal = 56;
        try {
            api.dealsStatusDealGet(deal).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
