part of swagger.api;



class MinerApi {
  final ApiClient apiClient;

  MinerApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Get Claim Miner Message
  ///
  /// This endpoint lets a user get the message in order to claim a miner
  Future<GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse> minerClaimMinerGet(String miner) async {
    Object postBody = null;

    // verify required params are set
    if(miner == null) {
     throw new ApiException(400, "Missing required param: miner");
    }

    // create path and map variables
    String path = "/miner/claim/{miner}".replaceAll("{format}","json").replaceAll("{" + "miner" + "}", miner.toString());

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
          apiClient.deserialize(response.body, 'GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse') as GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse ;
    } else {
      return null;
    }
  }
  /// Claim Miner
  ///
  /// This endpoint lets a user claim a miner
  Future<GithubComApplicationResearchEstuaryApiV1ClaimResponse> minerClaimPost(MinerClaimMinerBody body) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }

    // create path and map variables
    String path = "/miner/claim".replaceAll("{format}","json");

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
          apiClient.deserialize(response.body, 'GithubComApplicationResearchEstuaryApiV1ClaimResponse') as GithubComApplicationResearchEstuaryApiV1ClaimResponse ;
    } else {
      return null;
    }
  }
  /// Set Miner Info
  ///
  /// This endpoint lets a user set miner info.
  Future<Map<String, String>> minerSetInfoMinerPut(MinerMinerSetInfoParams body, String miner) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }
    if(miner == null) {
     throw new ApiException(400, "Missing required param: miner");
    }

    // create path and map variables
    String path = "/miner/set-info/{miner}".replaceAll("{format}","json").replaceAll("{" + "miner" + "}", miner.toString());

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
          new Map<String, String>.from(apiClient.deserialize(response.body, 'Map<String, String>')) ;
    } else {
      return null;
    }
  }
  /// Suspend Miner
  ///
  /// This endpoint lets a user suspend a miner.
  Future<Map<String, String>> minerSuspendMinerPost(MinerSuspendMinerBody body, String miner) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }
    if(miner == null) {
     throw new ApiException(400, "Missing required param: miner");
    }

    // create path and map variables
    String path = "/miner/suspend/{miner}".replaceAll("{format}","json").replaceAll("{" + "miner" + "}", miner.toString());

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
  /// Unuspend Miner
  ///
  /// This endpoint lets a user unsuspend a miner.
  Future<Map<String, String>> minerUnsuspendMinerPut(String miner) async {
    Object postBody = null;

    // verify required params are set
    if(miner == null) {
     throw new ApiException(400, "Missing required param: miner");
    }

    // create path and map variables
    String path = "/miner/unsuspend/{miner}".replaceAll("{format}","json").replaceAll("{" + "miner" + "}", miner.toString());

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
          new Map<String, String>.from(apiClient.deserialize(response.body, 'Map<String, String>')) ;
    } else {
      return null;
    }
  }
  /// Get all miners deals
  ///
  /// This endpoint returns all miners deals
  Future<String> publicMinersDealsMinerGet(String miner, { String ignoreFailed }) async {
    Object postBody = null;

    // verify required params are set
    if(miner == null) {
     throw new ApiException(400, "Missing required param: miner");
    }

    // create path and map variables
    String path = "/public/miners/deals/{miner}".replaceAll("{format}","json").replaceAll("{" + "miner" + "}", miner.toString());

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
  /// Get miner stats
  ///
  /// This endpoint returns miner stats
  Future<String> publicMinersStatsMinerGet(String miner) async {
    Object postBody = null;

    // verify required params are set
    if(miner == null) {
     throw new ApiException(400, "Missing required param: miner");
    }

    // create path and map variables
    String path = "/public/miners/stats/{miner}".replaceAll("{format}","json").replaceAll("{" + "miner" + "}", miner.toString());

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
}
