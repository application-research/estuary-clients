@isTest
private class SwagNetApiTest {
    /**
     * Net Addrs
     *
     * This endpoint is used to get net addrs
     */
    @isTest
    private static void netAddrsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagNetApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagNetApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.netAddrsGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get all miners
     *
     * This endpoint returns all miners
     */
    @isTest
    private static void publicMinersFailuresMinerGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'miner' => 'miner_example'
        };

        SwagClient client;
        SwagNetApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagNetApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicMinersFailuresMinerGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get all miners
     *
     * This endpoint returns all miners
     */
    @isTest
    private static void publicMinersGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagNetApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagNetApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicMinersGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Net Addrs
     *
     * This endpoint is used to get net addrs
     */
    @isTest
    private static void publicNetAddrsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagNetApi api;
        List<String> response;
        List<String> expectedResponse;

        client = new SwagClient();
        api = new SwagNetApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{}');
        expectedResponse = new List<String>{'aeiou'};
        response = (List<String>) api.publicNetAddrsGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Net Peers
     *
     * This endpoint is used to get net peers
     */
    @isTest
    private static void publicNetPeersGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagNetApi api;
        List<String> response;
        List<String> expectedResponse;

        client = new SwagClient();
        api = new SwagNetApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{}');
        expectedResponse = new List<String>{'aeiou'};
        response = (List<String>) api.publicNetPeersGet();
        System.assertEquals(expectedResponse, response);
    }
}