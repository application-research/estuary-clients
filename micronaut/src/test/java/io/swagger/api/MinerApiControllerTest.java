package io.swagger.api;

import io.swagger.model.GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV1ClaimResponse;
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
class MinerApiControllerTest {

    @Inject
    private MinerApi api;

    @Test
    void minerClaimMinerGetTest() {
        String miner = "miner_example";
        try {
            api.minerClaimMinerGet(miner).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void minerClaimPostTest() {
        MinerClaimMinerBody body = new MinerClaimMinerBody();
        try {
            api.minerClaimPost(body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void minerSetInfoMinerPutTest() {
        MinerMinerSetInfoParams body = new MinerMinerSetInfoParams();
        String miner = "miner_example";
        try {
            api.minerSetInfoMinerPut(body, miner).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void minerSuspendMinerPostTest() {
        MinerSuspendMinerBody body = new MinerSuspendMinerBody();
        String miner = "miner_example";
        try {
            api.minerSuspendMinerPost(body, miner).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void minerUnsuspendMinerPutTest() {
        String miner = "miner_example";
        try {
            api.minerUnsuspendMinerPut(miner).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
