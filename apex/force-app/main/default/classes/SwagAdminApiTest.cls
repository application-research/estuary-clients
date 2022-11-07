@isTest
private class SwagAdminApiTest {
    /**
     * Remove peers on Peering Service
     *
     * This endpoint can be used to remove a Peer from the Peering Service
     */
    @isTest
    private static void adminPeeringPeersDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'peerIds' => new List<Boolean>{true}
        };

        SwagClient client;
        SwagAdminApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.adminPeeringPeersDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List all Peering peers
     *
     * This endpoint can be used to list all peers on Peering Service
     */
    @isTest
    private static void adminPeeringPeersGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagAdminApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.adminPeeringPeersGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Add peers on Peering Service
     *
     * This endpoint can be used to add a Peer from the Peering Service
     */
    @isTest
    private static void adminPeeringPeersPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagAdminApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.adminPeeringPeersPost();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Start Peering
     *
     * This endpoint can be used to start the Peering Service
     */
    @isTest
    private static void adminPeeringStartPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagAdminApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.adminPeeringStartPost();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Check Peering Status
     *
     * This endpoint can be used to check the Peering status
     */
    @isTest
    private static void adminPeeringStatusGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagAdminApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.adminPeeringStatusGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Stop Peering
     *
     * This endpoint can be used to stop the Peering Service
     */
    @isTest
    private static void adminPeeringStopPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagAdminApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.adminPeeringStopPost();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get systems(estuary/shuttle) config
     *
     * This endpoint is used to get system configs.
     */
    @isTest
    private static void adminSystemConfigGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagAdminApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.adminSystemConfigGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get all users
     *
     * This endpoint is used to get all users.
     */
    @isTest
    private static void adminUsersGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagAdminApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.adminUsersGet();
        System.assertEquals(expectedResponse, response);
    }
}