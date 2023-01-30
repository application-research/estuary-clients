package io.swagger.api;

import io.swagger.model.PinnerIpfsListPinStatusResponse;
import io.swagger.model.PinnerIpfsPin;
import io.swagger.model.PinnerIpfsPinStatusResponse;
import io.swagger.model.UtilHttpError;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class PinningApiControllerTest {

    @Inject
    private PinningApi api;

    @Test
    void pinningPinsGetTest() {
        try {
            api.pinningPinsGet().blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void pinningPinsPinidDeleteTest() {
        String pinid = "pinid_example";
        try {
            api.pinningPinsPinidDelete(pinid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void pinningPinsPinidGetTest() {
        String pinid = "pinid_example";
        try {
            api.pinningPinsPinidGet(pinid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void pinningPinsPinidPostTest() {
        PinnerIpfsPin body = new PinnerIpfsPin();
        String pinid = "pinid_example";
        try {
            api.pinningPinsPinidPost(body, pinid).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void pinningPinsPostTest() {
        PinnerIpfsPin body = new PinnerIpfsPin();
        String ignoreDupes = "ignoreDupes_example";
        String overwrite = "overwrite_example";
        try {
            api.pinningPinsPost(body, ignoreDupes, overwrite).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
