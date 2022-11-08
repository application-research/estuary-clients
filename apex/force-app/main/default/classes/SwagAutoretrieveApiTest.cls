@isTest
private class SwagAutoretrieveApiTest {
    /**
     * Register autoretrieve server
     *
     * This endpoint registers a new autoretrieve server
     */
    @isTest
    private static void adminAutoretrieveInitPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'addresses' => 'addresses_example',
            'pubKey' => 'pubKey_example'
        };

        SwagClient client;
        SwagAutoretrieveApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagAutoretrieveApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.adminAutoretrieveInitPost(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List autoretrieve servers
     *
     * This endpoint lists all registered autoretrieve servers
     */
    @isTest
    private static void adminAutoretrieveListGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagAutoretrieveApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagAutoretrieveApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.adminAutoretrieveListGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Marks autoretrieve server as up
     *
     * This endpoint updates the lastConnection field for autoretrieve
     */
    @isTest
    private static void autoretrieveHeartbeatPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'token' => 'token_example'
        };

        SwagClient client;
        SwagAutoretrieveApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagAutoretrieveApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.autoretrieveHeartbeatPost(params);
        System.assertEquals(expectedResponse, response);
    }
}