part of swagger.api;



class AutoretrieveApi {
  final ApiClient apiClient;

  AutoretrieveApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Register autoretrieve server
  ///
  /// This endpoint registers a new autoretrieve server
  Future<String> adminAutoretrieveInitPost(String addresses, String pubKey) async {
    Object postBody = null;

    // verify required params are set
    if(addresses == null) {
     throw new ApiException(400, "Missing required param: addresses");
    }
    if(pubKey == null) {
     throw new ApiException(400, "Missing required param: pubKey");
    }

    // create path and map variables
    String path = "/admin/autoretrieve/init".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["bearerAuth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (addresses != null) {
        hasFields = true;
        mp.fields['addresses'] = parameterToString(addresses);
      }
      
      if (pubKey != null) {
        hasFields = true;
        mp.fields['pubKey'] = parameterToString(pubKey);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (addresses != null)
        formParams['addresses'] = parameterToString(addresses);
if (pubKey != null)
        formParams['pubKey'] = parameterToString(pubKey);
    }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return 
          apiClient.deserialize(response.body, 'String') as String ;
    } else {
      return null;
    }
  }
  /// List autoretrieve servers
  ///
  /// This endpoint lists all registered autoretrieve servers
  Future<String> adminAutoretrieveListGet() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/admin/autoretrieve/list".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["bearerAuth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return 
          apiClient.deserialize(response.body, 'String') as String ;
    } else {
      return null;
    }
  }
  /// Marks autoretrieve server as up
  ///
  /// This endpoint updates the lastConnection field for autoretrieve
  Future<String> autoretrieveHeartbeatPost(String token) async {
    Object postBody = null;

    // verify required params are set
    if(token == null) {
     throw new ApiException(400, "Missing required param: token");
    }

    // create path and map variables
    String path = "/autoretrieve/heartbeat".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    headerParams["token"] = token;

    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["bearerAuth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return 
          apiClient.deserialize(response.body, 'String') as String ;
    } else {
      return null;
    }
  }
}
