@isTest
private class SwagCollectionsApiTest {
    /**
     * Produce a CID of the collection contents
     *
     * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
     */
    @isTest
    private static void collectionsColuuidCommitPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'coluuid' => 'coluuid_example'
        };

        SwagClient client;
        SwagCollectionsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagCollectionsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.collectionsColuuidCommitPost(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Deletes a content from a collection
     *
     * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
     */
    @isTest
    private static void collectionsColuuidContentsDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'coluuid' => 'coluuid_example',
            'contentid' => 'contentid_example',
            'body' => SwagMainDeleteContentFromCollectionB.getExample()
        };

        SwagClient client;
        SwagCollectionsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagCollectionsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.collectionsColuuidContentsDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Deletes a collection
     *
     * This endpoint is used to delete an existing collection.
     */
    @isTest
    private static void collectionsColuuidDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'coluuid' => 'coluuid_example'
        };

        SwagClient client;
        SwagCollectionsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagCollectionsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.collectionsColuuidDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get contents in a collection
     *
     * This endpoint is used to get contents in a collection. If no colpath query param is passed
     */
    @isTest
    private static void collectionsColuuidGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'coluuid' => 'coluuid_example',
            'dir' => 'dir_example'
        };

        SwagClient client;
        SwagCollectionsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagCollectionsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.collectionsColuuidGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Add contents to a collection
     *
     * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
     */
    @isTest
    private static void collectionsColuuidPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'coluuid' => 'coluuid_example',
            'contentIDs' => new List<Integer>{123}
        };

        SwagClient client;
        SwagCollectionsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagCollectionsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.collectionsColuuidPost(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Add a file to a collection
     *
     * This endpoint adds a file to a collection
     */
    @isTest
    private static void collectionsFsAddPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'coluuid' => 'coluuid_example',
            'content' => 'content_example',
            'path' => 'path_example'
        };

        SwagClient client;
        SwagCollectionsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagCollectionsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.collectionsFsAddPost(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List all collections
     *
     * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     */
    @isTest
    private static void collectionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagCollectionsApi api;
        List<List<SwagCollectionsCollection>> response;
        List<List<SwagCollectionsCollection>> expectedResponse;

        client = new SwagClient();
        api = new SwagCollectionsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{}');
        expectedResponse = new List<List<SwagCollectionsCollection>>{new List<SwagCollectionsCollection>{SwagCollectionsCollection.getExample()}};
        response = (List<List<SwagCollectionsCollection>>) api.collectionsGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create a new collection
     *
     * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     */
    @isTest
    private static void collectionsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => SwagMainCreateCollectionBody.getExample()
        };

        SwagClient client;
        SwagCollectionsApi api;
        SwagCollectionsCollection response;
        SwagCollectionsCollection expectedResponse;

        client = new SwagClient();
        api = new SwagCollectionsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{"empty": false}');
        expectedResponse = SwagCollectionsCollection.getExample();
        response = (SwagCollectionsCollection) api.collectionsPost(params);
        System.assertEquals(expectedResponse, response);
    }
}