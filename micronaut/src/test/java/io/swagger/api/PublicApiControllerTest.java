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
class PublicApiControllerTest {

    @Inject
    private PublicApi api;

    @Test
    void publicByCidCidGetTest() {
        String cid = "cid_example";
        try {
            api.publicByCidCidGet(cid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void publicDealsFailuresGetTest() {
        try {
            api.publicDealsFailuresGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void publicInfoGetTest() {
        try {
            api.publicInfoGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void publicMetricsDealsOnChainGetTest() {
        try {
            api.publicMetricsDealsOnChainGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void publicMinersDealsMinerGetTest() {
        String miner = "miner_example";
        String ignoreFailed = "ignoreFailed_example";
        try {
            api.publicMinersDealsMinerGet(miner, ignoreFailed).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void publicMinersFailuresMinerGetTest() {
        String miner = "miner_example";
        try {
            api.publicMinersFailuresMinerGet(miner).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void publicMinersGetTest() {
        try {
            api.publicMinersGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void publicMinersStatsMinerGetTest() {
        String miner = "miner_example";
        try {
            api.publicMinersStatsMinerGet(miner).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void publicMinersStorageQueryMinerGetTest() {
        String miner = "miner_example";
        try {
            api.publicMinersStorageQueryMinerGet(miner).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void publicNetAddrsGetTest() {
        try {
            api.publicNetAddrsGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void publicNetPeersGetTest() {
        try {
            api.publicNetPeersGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void publicStatsGetTest() {
        try {
            api.publicStatsGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
