@isTest
private class SwagPublicApiTest {
    /**
     * Get Content by Cid
     *
     * This endpoint returns the content associated with a CID
     */
    @isTest
    private static void publicByCidCidGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'cid' => 'cid_example'
        };

        SwagClient client;
        SwagPublicApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagPublicApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicByCidCidGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get public node info
     *
     * This endpoint returns information about the node
     */
    @isTest
    private static void publicInfoGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagPublicApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagPublicApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicInfoGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get deal metrics
     *
     * This endpoint is used to get deal metrics
     */
    @isTest
    private static void publicMetricsDealsOnChainGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagPublicApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagPublicApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicMetricsDealsOnChainGet();
        System.assertEquals(expectedResponse, response);
    }

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
        SwagPublicApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagPublicApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicMinersDealsMinerGet(params);
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
        SwagPublicApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagPublicApi(client);
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
        SwagPublicApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagPublicApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicMinersGet();
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
        SwagPublicApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagPublicApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicMinersStatsMinerGet(params);
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
        SwagPublicApi api;
        List<String> response;
        List<String> expectedResponse;

        client = new SwagClient();
        api = new SwagPublicApi(client);
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
        SwagPublicApi api;
        List<String> response;
        List<String> expectedResponse;

        client = new SwagClient();
        api = new SwagPublicApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{}');
        expectedResponse = new List<String>{'aeiou'};
        response = (List<String>) api.publicNetPeersGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Public stats
     *
     * This endpoint is used to get public stats.
     */
    @isTest
    private static void publicStatsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagPublicApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagPublicApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicStatsGet();
        System.assertEquals(expectedResponse, response);
    }
}