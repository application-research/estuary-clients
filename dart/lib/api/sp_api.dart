part of swagger.api;



class SpApi {
  final ApiClient apiClient;

  SpApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Claim Storage Provider
  ///
  /// This endpoint lets a user claim a storage provider
  Future<GithubComApplicationResearchEstuaryApiV2ClaimResponse> storageProvidersClaimPost(MinerClaimMinerBody body) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }

    // create path and map variables
    String path = "/storage-providers/claim".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["*/*"];

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
          apiClient.deserialize(response.body, 'GithubComApplicationResearchEstuaryApiV2ClaimResponse') as GithubComApplicationResearchEstuaryApiV2ClaimResponse ;
    } else {
      return null;
    }
  }
  /// Get Claim Storage Provider
  ///
  /// This endpoint lets a user get the message in order to claim a storage provider
  Future<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse> storageProvidersClaimSpGet(String sp) async {
    Object postBody = null;

    // verify required params are set
    if(sp == null) {
     throw new ApiException(400, "Missing required param: sp");
    }

    // create path and map variables
    String path = "/storage-providers/claim/{sp}".replaceAll("{format}","json").replaceAll("{" + "sp" + "}", sp.toString());

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
          apiClient.deserialize(response.body, 'GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse') as GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse ;
    } else {
      return null;
    }
  }
  /// Get all storage providers deals
  ///
  /// This endpoint returns all storage providers deals
  Future<String> storageProvidersDealsSpGet(String sp, { String ignoreFailed }) async {
    Object postBody = null;

    // verify required params are set
    if(sp == null) {
     throw new ApiException(400, "Missing required param: sp");
    }

    // create path and map variables
    String path = "/storage-providers/deals/{sp}".replaceAll("{format}","json").replaceAll("{" + "sp" + "}", sp.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(ignoreFailed != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "ignore-failed", ignoreFailed));
    }
    
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
  /// Get all storage providers
  ///
  /// This endpoint returns all storage providers
  Future<String> storageProvidersFailuresSpGet(String sp) async {
    Object postBody = null;

    // verify required params are set
    if(sp == null) {
     throw new ApiException(400, "Missing required param: sp");
    }

    // create path and map variables
    String path = "/storage-providers/failures/{sp}".replaceAll("{format}","json").replaceAll("{" + "sp" + "}", sp.toString());

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
  /// Get all storage providers
  ///
  /// This endpoint returns all storage providers
  Future<List<ApiStorageProviderResp>> storageProvidersGet() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/storage-providers".replaceAll("{format}","json");

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
        (apiClient.deserialize(response.body, 'List<ApiStorageProviderResp>') as List).map((item) => item as ApiStorageProviderResp).toList();
    } else {
      return null;
    }
  }
  /// Set Storage Provider Info
  ///
  /// This endpoint lets a user set storage provider info.
  Future storageProvidersSetInfoSpPut(MinerMinerSetInfoParams body, String sp) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }
    if(sp == null) {
     throw new ApiException(400, "Missing required param: sp");
    }

    // create path and map variables
    String path = "/storage-providers/set-info/{sp}".replaceAll("{format}","json").replaceAll("{" + "sp" + "}", sp.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["*/*"];

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
                                             'PUT',
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
          ;
    } else {
      return ;
    }
  }
  /// Get storage provider stats
  ///
  /// This endpoint returns storage provider stats
  Future<String> storageProvidersStatsSpGet(String sp) async {
    Object postBody = null;

    // verify required params are set
    if(sp == null) {
     throw new ApiException(400, "Missing required param: sp");
    }

    // create path and map variables
    String path = "/storage-providers/stats/{sp}".replaceAll("{format}","json").replaceAll("{" + "sp" + "}", sp.toString());

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
  /// Suspend Storage Provider
  ///
  /// This endpoint lets a user suspend a storage provider.
  Future<Map<String, String>> storageProvidersSuspendSpPost(MinerSuspendMinerBody body, String sp) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }
    if(sp == null) {
     throw new ApiException(400, "Missing required param: sp");
    }

    // create path and map variables
    String path = "/storage-providers/suspend/{sp}".replaceAll("{format}","json").replaceAll("{" + "sp" + "}", sp.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["*/*"];

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
          new Map<String, String>.from(apiClient.deserialize(response.body, 'Map<String, String>')) ;
    } else {
      return null;
    }
  }
  /// Unuspend Storage Provider
  ///
  /// This endpoint lets a user unsuspend a Storage Provider.
  Future storageProvidersUnsuspendSpPut(String sp) async {
    Object postBody = null;

    // verify required params are set
    if(sp == null) {
     throw new ApiException(400, "Missing required param: sp");
    }

    // create path and map variables
    String path = "/storage-providers/unsuspend/{sp}".replaceAll("{format}","json").replaceAll("{" + "sp" + "}", sp.toString());

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
                                             'PUT',
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
          ;
    } else {
      return ;
    }
  }
}
