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
            'body' => new List<String>{'aeiou'}
        };

        SwagClient client;
        SwagAdminApi api;

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.adminPeeringPeersDelete(params);
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

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.adminPeeringPeersGet();
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

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.adminPeeringPeersPost();
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

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.adminPeeringStartPost();
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

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.adminPeeringStatusGet();
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

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.adminPeeringStopPost();
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

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.adminSystemConfigGet();
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

        client = new SwagClient();
        api = new SwagAdminApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.adminUsersGet();
    }
}