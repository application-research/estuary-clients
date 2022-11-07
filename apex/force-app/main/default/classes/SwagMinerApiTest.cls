@isTest
private class SwagMinerApiTest {
    /**
     * Get all miners deals
     *
     * This endpoint returns all miners deals
     */
    @isTest
    private static void publicMinersDealsMinerGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'miner' => 'miner_example',
            'ignoreFailed' => 'ignoreFailed_example'
        };

        SwagClient client;
        SwagMinerApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagMinerApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicMinersDealsMinerGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get miner stats
     *
     * This endpoint returns miner stats
     */
    @isTest
    private static void publicMinersStatsMinerGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'miner' => 'miner_example'
        };

        SwagClient client;
        SwagMinerApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagMinerApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicMinersStatsMinerGet(params);
        System.assertEquals(expectedResponse, response);
    }
}