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
class AdminApiControllerTest {

    @Inject
    private AdminApi api;

    @Test
    void adminAutoretrieveInitPostWithFormTest() {
        String addresses = "addresses_example";
        String pubKey = "pubKey_example";
        try {
            api.adminAutoretrieveInitPost(addresses, pubKey).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void adminAutoretrieveListGetTest() {
        try {
            api.adminAutoretrieveListGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void adminPeeringPeersDeleteTest() {
        List<Boolean> body = Arrays.asList(true);
        try {
            api.adminPeeringPeersDelete(body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void adminPeeringPeersGetTest() {
        try {
            api.adminPeeringPeersGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void adminPeeringPeersPostTest() {
        try {
            api.adminPeeringPeersPost().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void adminPeeringStartPostTest() {
        try {
            api.adminPeeringStartPost().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void adminPeeringStatusGetTest() {
        try {
            api.adminPeeringStatusGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void adminPeeringStopPostTest() {
        try {
            api.adminPeeringStopPost().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void adminSystemConfigGetTest() {
        try {
            api.adminSystemConfigGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void adminUsersGetTest() {
        try {
            api.adminUsersGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
