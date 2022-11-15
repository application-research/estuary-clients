package io.swagger.api;

import io.swagger.model.MainGetApiKeysResp;
import io.swagger.model.UtilHttpError;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class UserApiControllerTest {

    @Inject
    private UserApi api;

    @Test
    void userApiKeysGetTest() {
        try {
            api.userApiKeysGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void userApiKeysKeyOrHashDeleteTest() {
        String keyOrHash = "keyOrHash_example";
        try {
            api.userApiKeysKeyOrHashDelete(keyOrHash).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void userApiKeysPostTest() {
        String expiry = "expiry_example";
        String perms = "perms_example";
        try {
            api.userApiKeysPost(expiry, perms).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void userExportGetTest() {
        try {
            api.userExportGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void userStatsGetTest() {
        try {
            api.userStatsGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
