package io.swagger.api;

import java.io.File;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.model.UtilContentCreateBody;
import io.swagger.model.UtilHttpError;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class ContentApiControllerTest {

    @Inject
    private ContentApi api;

    @Test
    void contentAddCarPostTest() {
        String body = "body_example";
        String ignoreDupes = "ignoreDupes_example";
        String filename = "filename_example";
        try {
            api.contentAddCarPost(body, ignoreDupes, filename).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentAddIpfsPostTest() {
        UtilContentAddIpfsBody body = new UtilContentAddIpfsBody();
        String ignoreDupes = "ignoreDupes_example";
        try {
            api.contentAddIpfsPost(body, ignoreDupes).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentAddPostWithFormTest() {
        File data = new File("data_example");
        String filename = "filename_example";
        String coluuid = "coluuid_example";
        Integer replication = 56;
        String ignoreDupes = "ignoreDupes_example";
        String lazyProvide = "lazyProvide_example";
        String dir = "dir_example";
        try {
            api.contentAddPost(data, filename, coluuid, replication, ignoreDupes, lazyProvide, dir).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentAggregatedContentGetTest() {
        String content = "content_example";
        try {
            api.contentAggregatedContentGet(content).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentAllDealsGetTest() {
        String begin = "begin_example";
        String duration = "duration_example";
        String all = "all_example";
        try {
            api.contentAllDealsGet(begin, duration, all).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentBwUsageContentGetTest() {
        String content = "content_example";
        try {
            api.contentBwUsageContentGet(content).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentCreatePostTest() {
        UtilContentCreateBody body = new UtilContentCreateBody();
        String ignoreDupes = "ignoreDupes_example";
        try {
            api.contentCreatePost(body, ignoreDupes).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentDealsGetTest() {
        Integer limit = 56;
        Integer offset = 56;
        try {
            api.contentDealsGet(limit, offset).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentEnsureReplicationDatacidGetTest() {
        String datacid = "datacid_example";
        try {
            api.contentEnsureReplicationDatacidGet(datacid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentFailuresContentGetTest() {
        String content = "content_example";
        try {
            api.contentFailuresContentGet(content).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentIdGetTest() {
        Integer id = 56;
        try {
            api.contentIdGet(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentImportdealPostTest() {
        MainImportDealBody body = new MainImportDealBody();
        try {
            api.contentImportdealPost(body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentListGetTest() {
        try {
            api.contentListGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentReadContGetTest() {
        String cont = "cont_example";
        try {
            api.contentReadContGet(cont).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentStagingZonesGetTest() {
        try {
            api.contentStagingZonesGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentStatsGetTest() {
        String limit = "limit_example";
        String offset = "offset_example";
        try {
            api.contentStatsGet(limit, offset).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void contentStatusIdGetTest() {
        Integer id = 56;
        try {
            api.contentStatusIdGet(id).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
