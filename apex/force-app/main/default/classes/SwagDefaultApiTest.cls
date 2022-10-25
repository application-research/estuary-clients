@isTest
private class SwagDefaultApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void dealTransferStatusPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        SwagClient client;
        SwagDefaultApi api;

        client = new SwagClient();
        api = new SwagDefaultApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        api.dealTransferStatusPost();
    }
}