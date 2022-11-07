@isTest
private class SwagMetricsApiTest {
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
        SwagMetricsApi api;
        String response;
        String expectedResponse;

        client = new SwagClient();
        api = new SwagMetricsApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('bearerAuth');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "bytes": [],\n  "empty": true\n}');
        expectedResponse = 'aeiou';
        response = (String) api.publicMetricsDealsOnChainGet();
        System.assertEquals(expectedResponse, response);
    }
}