part of swagger.api;



class PinningApi {
  final ApiClient apiClient;

  PinningApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// List all pin status objects
  ///
  /// This endpoint lists all pin status objects
  Future<PinnerIpfsListPinStatusResponse> pinningPinsGet() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/pinning/pins".replaceAll("{format}","json");

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
          apiClient.deserialize(response.body, 'PinnerIpfsListPinStatusResponse') as PinnerIpfsListPinStatusResponse ;
    } else {
      return null;
    }
  }
  /// Delete a pinned object
  ///
  /// This endpoint deletes a pinned object.
  Future pinningPinsPinidDelete(String pinid) async {
    Object postBody = null;

    // verify required params are set
    if(pinid == null) {
     throw new ApiException(400, "Missing required param: pinid");
    }

    // create path and map variables
    String path = "/pinning/pins/{pinid}".replaceAll("{format}","json").replaceAll("{" + "pinid" + "}", pinid.toString());

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
                                             'DELETE',
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
  /// Get a pin status object
  ///
  /// This endpoint returns a pin status object.
  Future<PinnerIpfsPinStatusResponse> pinningPinsPinidGet(String pinid) async {
    Object postBody = null;

    // verify required params are set
    if(pinid == null) {
     throw new ApiException(400, "Missing required param: pinid");
    }

    // create path and map variables
    String path = "/pinning/pins/{pinid}".replaceAll("{format}","json").replaceAll("{" + "pinid" + "}", pinid.toString());

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
          apiClient.deserialize(response.body, 'PinnerIpfsPinStatusResponse') as PinnerIpfsPinStatusResponse ;
    } else {
      return null;
    }
  }
  /// Replace a pinned object
  ///
  /// This endpoint replaces a pinned object.
  Future<PinnerIpfsPinStatusResponse> pinningPinsPinidPost(PinnerIpfsPin body, String pinid) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }
    if(pinid == null) {
     throw new ApiException(400, "Missing required param: pinid");
    }

    // create path and map variables
    String path = "/pinning/pins/{pinid}".replaceAll("{format}","json").replaceAll("{" + "pinid" + "}", pinid.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["application/json"];

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
          apiClient.deserialize(response.body, 'PinnerIpfsPinStatusResponse') as PinnerIpfsPinStatusResponse ;
    } else {
      return null;
    }
  }
  /// Add and pin object
  ///
  /// This endpoint adds a pin to the IPFS daemon.
  Future<PinnerIpfsPinStatusResponse> pinningPinsPost(PinnerIpfsPin body, { String ignoreDupes, String overwrite }) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }

    // create path and map variables
    String path = "/pinning/pins".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(ignoreDupes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "ignore-dupes", ignoreDupes));
    }
    if(overwrite != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "overwrite", overwrite));
    }
    
    List<String> contentTypes = ["application/json"];

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
          apiClient.deserialize(response.body, 'PinnerIpfsPinStatusResponse') as PinnerIpfsPinStatusResponse ;
    } else {
      return null;
    }
  }
}
