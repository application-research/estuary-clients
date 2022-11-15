package io.swagger.api;

import io.swagger.model.MainChannelIDParam;
import io.swagger.model.MainEstimateDealBody;
import io.swagger.model.UtilHttpError;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class DealApiControllerTest {

    @Inject
    private DealApi api;

    @Test
    void dealEstimatePostTest() {
        MainEstimateDealBody body = new MainEstimateDealBody();
        try {
            api.dealEstimatePost(body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void dealInfoDealidGetTest() {
        Integer dealid = 56;
        try {
            api.dealInfoDealidGet(dealid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void dealProposalPropcidGetTest() {
        String propcid = "propcid_example";
        try {
            api.dealProposalPropcidGet(propcid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void dealQueryMinerGetTest() {
        String miner = "miner_example";
        try {
            api.dealQueryMinerGet(miner).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void dealStatusByProposalPropcidGetTest() {
        String propcid = "propcid_example";
        try {
            api.dealStatusByProposalPropcidGet(propcid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void dealStatusMinerPropcidGetTest() {
        String miner = "miner_example";
        String propcid = "propcid_example";
        try {
            api.dealStatusMinerPropcidGet(miner, propcid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void dealTransferInProgressGetTest() {
        try {
            api.dealTransferInProgressGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void dealTransferStatusPostTest() {
        MainChannelIDParam body = new MainChannelIDParam();
        try {
            api.dealTransferStatusPost(body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
