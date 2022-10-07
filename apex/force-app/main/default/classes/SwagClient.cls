public class SwagClient extends Swagger.ApiClient {
    public SwagClient() {
        basePath = 'https://api.estuary.tech';
        calloutName = 'Estuary_API';
        authentications.put('bearerAuth', new Swagger.ApiKeyHeaderAuth('Authorization'));
    }
}
