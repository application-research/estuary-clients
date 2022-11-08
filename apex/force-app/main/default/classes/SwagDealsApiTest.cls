@isTest
private class SwagDealsApiTest {
    /**
     * Estimate the cost of a deal
     *
     * This endpoint estimates the cost of a deal
     */
    @isTest
    private static void dealEstimatePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => SwagMainEstimateDealBody.getExample()
        };

        SwagClient client;
        SwagDealsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagDealsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.dealEstimatePost(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Deal Info
     *
     * This endpoint returns the deal info for a deal
     */
    @isTest
    private static void dealInfoDealidGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'dealid' => 56
        };

        SwagClient client;
        SwagDealsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagDealsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.dealInfoDealidGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Proposal
     *
     * This endpoint returns the proposal for a deal
     */
    @isTest
    private static void dealProposalPropcidGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'propcid' => 'propcid_example'
        };

        SwagClient client;
        SwagDealsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagDealsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.dealProposalPropcidGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     */
    @isTest
    private static void dealQueryMinerGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'miner' => 'miner_example'
        };

        SwagClient client;
        SwagDealsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagDealsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.dealQueryMinerGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Deal Status by PropCid
     *
     * Get Deal Status by PropCid
     */
    @isTest
    private static void dealStatusByProposalPropcidGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'propcid' => 'propcid_example'
        };

        SwagClient client;
        SwagDealsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagDealsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.dealStatusByProposalPropcidGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Deal Status
     *
     * This endpoint returns the status of a deal
     */
    @isTest
    private static void dealStatusMinerPropcidGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'miner' => 'miner_example',
            'propcid' => 'propcid_example'
        };

        SwagClient client;
        SwagDealsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagDealsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.dealStatusMinerPropcidGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Transfer In Progress
     *
     * This endpoint returns the in-progress transfers
     */
    @isTest
    private static void dealTransferInProgressGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagDealsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagDealsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.dealTransferInProgressGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Transfer Status
     *
     * This endpoint returns the status of a transfer
     */
    @isTest
    private static void dealTransferStatusPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'chanid' => SwagMainChannelIDParam.getExample()
        };

        SwagClient client;
        SwagDealsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagDealsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.dealTransferStatusPost(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get storage failures for user
     *
     * This endpoint returns a list of storage failures for user
     */
    @isTest
    private static void dealsFailuresGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagDealsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagDealsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.dealsFailuresGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Make Deal
     *
     * This endpoint makes a deal for a given content and miner
     */
    @isTest
    private static void dealsMakeMinerPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'miner' => 'miner_example',
            'dealRequest' => 'dealRequest_example'
        };

        SwagClient client;
        SwagDealsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagDealsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.dealsMakeMinerPost(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Deal Status
     *
     * This endpoint returns the status of a deal
     */
    @isTest
    private static void dealsStatusDealGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'deal' => 56
        };

        SwagClient client;
        SwagDealsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagDealsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.dealsStatusDealGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get storage failures
     *
     * This endpoint returns a list of storage failures
     */
    @isTest
    private static void publicDealsFailuresGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagDealsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagDealsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicDealsFailuresGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     */
    @isTest
    private static void publicMinersStorageQueryMinerGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'miner' => 'miner_example'
        };

        SwagClient client;
        SwagDealsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagDealsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicMinersStorageQueryMinerGet(params);
        System.assertEquals(expectedResponse, response);
    }
}