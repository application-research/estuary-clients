package io.swagger.api;

import io.swagger.model.CollectionsCollection;
import io.swagger.model.MainCreateCollectionBody;
import io.swagger.model.MainDeleteContentFromCollectionBody;
import io.swagger.model.UtilHttpError;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class CollectionsApiControllerTest {

    @Inject
    private CollectionsApi api;

    @Test
    void collectionsColuuidCommitPostTest() {
        String coluuid = "coluuid_example";
        try {
            api.collectionsColuuidCommitPost(coluuid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void collectionsColuuidContentsDeleteTest() {
        MainDeleteContentFromCollectionBody body = new MainDeleteContentFromCollectionBody();
        String coluuid = "coluuid_example";
        String contentid = "contentid_example";
        try {
            api.collectionsColuuidContentsDelete(body, coluuid, contentid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void collectionsColuuidDeleteTest() {
        String coluuid = "coluuid_example";
        try {
            api.collectionsColuuidDelete(coluuid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void collectionsColuuidGetTest() {
        String coluuid = "coluuid_example";
        String dir = "dir_example";
        try {
            api.collectionsColuuidGet(coluuid, dir).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void collectionsColuuidPostTest() {
        List<Integer> body = Arrays.asList(56);
        String coluuid = "coluuid_example";
        try {
            api.collectionsColuuidPost(body, coluuid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void collectionsFsAddPostTest() {
        String coluuid = "coluuid_example";
        String content = "content_example";
        String path = "path_example";
        try {
            api.collectionsFsAddPost(coluuid, content, path).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void collectionsGetTest() {
        try {
            api.collectionsGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void collectionsPostTest() {
        MainCreateCollectionBody body = new MainCreateCollectionBody();
        try {
            api.collectionsPost(body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
