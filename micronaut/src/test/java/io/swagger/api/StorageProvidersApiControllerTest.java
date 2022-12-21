package io.swagger.api;

import io.swagger.model.ApiStorageProviderResp;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimResponse;
import java.util.Map;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
import io.swagger.model.UtilHttpError;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class StorageProvidersApiControllerTest {

    @Inject
    private StorageProvidersApi api;

    @Test
    void storageProvidersClaimPostTest() {
        MinerClaimMinerBody body = new MinerClaimMinerBody();
        try {
            api.storageProvidersClaimPost(body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void storageProvidersClaimSpGetTest() {
        String sp = "sp_example";
        try {
            api.storageProvidersClaimSpGet(sp).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void storageProvidersDealsSpGetTest() {
        String sp = "sp_example";
        String ignoreFailed = "ignoreFailed_example";
        try {
            api.storageProvidersDealsSpGet(sp, ignoreFailed).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void storageProvidersFailuresSpGetTest() {
        String sp = "sp_example";
        try {
            api.storageProvidersFailuresSpGet(sp).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void storageProvidersGetTest() {
        try {
            api.storageProvidersGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void storageProvidersSetInfoSpPutTest() {
        MinerMinerSetInfoParams body = new MinerMinerSetInfoParams();
        String sp = "sp_example";
        try {
            api.storageProvidersSetInfoSpPut(body, sp).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void storageProvidersStatsSpGetTest() {
        String sp = "sp_example";
        try {
            api.storageProvidersStatsSpGet(sp).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void storageProvidersStorageQueryCidGetTest() {
        String cid = "cid_example";
        try {
            api.storageProvidersStorageQueryCidGet(cid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void storageProvidersSuspendSpPostTest() {
        MinerSuspendMinerBody body = new MinerSuspendMinerBody();
        String sp = "sp_example";
        try {
            api.storageProvidersSuspendSpPost(body, sp).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void storageProvidersUnsuspendSpPutTest() {
        String sp = "sp_example";
        try {
            api.storageProvidersUnsuspendSpPut(sp).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
