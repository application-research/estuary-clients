part of swagger.api;



class ContentApi {
  final ApiClient apiClient;

  ContentApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Create an Estuary invite
  ///
  /// This endpoint is used to create an estuary invite.
  Future<String> adminInvitesCodePost(String code) async {
    Object postBody = null;

    // verify required params are set
    if(code == null) {
     throw new ApiException(400, "Missing required param: code");
    }

    // create path and map variables
    String path = "/admin/invites/{code}".replaceAll("{format}","json").replaceAll("{" + "code" + "}", code.toString());

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
  /// Get Estuary invites
  ///
  /// This endpoint is used to list all estuary invites.
  Future<String> adminInvitesGet() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/admin/invites".replaceAll("{format}","json");

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
  /// Add Car object
  ///
  /// This endpoint is used to add a car object to the network. The object can be a file or a directory.
  Future<UtilContentAddResponse> contentAddCarPost(String body, { String ignoreDupes, String filename }) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }

    // create path and map variables
    String path = "/content/add-car".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(ignoreDupes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "ignore-dupes", ignoreDupes));
    }
    if(filename != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "filename", filename));
    }
    
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
          apiClient.deserialize(response.body, 'UtilContentAddResponse') as UtilContentAddResponse ;
    } else {
      return null;
    }
  }
  /// Add IPFS object
  ///
  /// This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
  Future<String> contentAddIpfsPost(PinnerIpfsPin body, { String ignoreDupes, String overwrite }) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }

    // create path and map variables
    String path = "/content/add-ipfs".replaceAll("{format}","json");

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
          apiClient.deserialize(response.body, 'String') as String ;
    } else {
      return null;
    }
  }
  /// Add new content
  ///
  /// This endpoint is used to upload new content.
  Future<UtilContentAddResponse> contentAddPost(String data, String filename, { String coluuid, int replication, String ignoreDupes, String overwrite, String lazyProvide, String dir }) async {
    Object postBody = null;

    // verify required params are set
    if(data == null) {
     throw new ApiException(400, "Missing required param: data");
    }
    if(filename == null) {
     throw new ApiException(400, "Missing required param: filename");
    }

    // create path and map variables
    String path = "/content/add".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(coluuid != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "coluuid", coluuid));
    }
    if(replication != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "replication", replication));
    }
    if(ignoreDupes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "ignore-dupes", ignoreDupes));
    }
    if(overwrite != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "overwrite", overwrite));
    }
    if(lazyProvide != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "lazy-provide", lazyProvide));
    }
    if(dir != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "dir", dir));
    }
    
    List<String> contentTypes = ["multipart/form-data"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["bearerAuth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if (data != null) {
        hasFields = true;
        mp.fields['data'] = data.field;
        mp.files.add(data);
      }
      if (filename != null) {
        hasFields = true;
        mp.fields['filename'] = parameterToString(filename);
      }
      if(hasFields)
        postBody = mp;
    }
    else {
      
if (filename != null)
        formParams['filename'] = parameterToString(filename);
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
          apiClient.deserialize(response.body, 'UtilContentAddResponse') as UtilContentAddResponse ;
    } else {
      return null;
    }
  }
  /// Get aggregated content stats
  ///
  /// This endpoint returns aggregated content stats
  Future<String> contentAggregatedContentGet(String content) async {
    Object postBody = null;

    // verify required params are set
    if(content == null) {
     throw new ApiException(400, "Missing required param: content");
    }

    // create path and map variables
    String path = "/content/aggregated/{content}".replaceAll("{format}","json").replaceAll("{" + "content" + "}", content.toString());

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
  /// Get all deals for a user
  ///
  /// This endpoint is used to get all deals for a user
  Future<String> contentAllDealsGet(String begin, String duration, String all) async {
    Object postBody = null;

    // verify required params are set
    if(begin == null) {
     throw new ApiException(400, "Missing required param: begin");
    }
    if(duration == null) {
     throw new ApiException(400, "Missing required param: duration");
    }
    if(all == null) {
     throw new ApiException(400, "Missing required param: all");
    }

    // create path and map variables
    String path = "/content/all-deals".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "begin", begin));
      queryParams.addAll(_convertParametersForCollectionFormat("", "duration", duration));
      queryParams.addAll(_convertParametersForCollectionFormat("", "all", all));
    
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
  /// Get content bandwidth
  ///
  /// This endpoint returns content bandwidth
  Future<String> contentBwUsageContentGet(String content) async {
    Object postBody = null;

    // verify required params are set
    if(content == null) {
     throw new ApiException(400, "Missing required param: content");
    }

    // create path and map variables
    String path = "/content/bw-usage/{content}".replaceAll("{format}","json").replaceAll("{" + "content" + "}", content.toString());

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
  /// Get user contents
  ///
  /// This endpoint is used to get user contents
  Future<String> contentContentsGet(String limit, String offset) async {
    Object postBody = null;

    // verify required params are set
    if(limit == null) {
     throw new ApiException(400, "Missing required param: limit");
    }
    if(offset == null) {
     throw new ApiException(400, "Missing required param: offset");
    }

    // create path and map variables
    String path = "/content/contents".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "limit", limit));
      queryParams.addAll(_convertParametersForCollectionFormat("", "offset", offset));
    
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
  /// Add a new content
  ///
  /// This endpoint adds a new content
  Future<String> contentCreatePost(UtilContentCreateBody body, { String ignoreDupes }) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }

    // create path and map variables
    String path = "/content/create".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(ignoreDupes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "ignore-dupes", ignoreDupes));
    }
    
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
          apiClient.deserialize(response.body, 'String') as String ;
    } else {
      return null;
    }
  }
  /// Content with deals
  ///
  /// This endpoint lists all content with deals
  Future<String> contentDealsGet({ int limit, int offset }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/content/deals".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(limit != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "limit", limit));
    }
    if(offset != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "offset", offset));
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
  /// Ensure Replication
  ///
  /// This endpoint ensures that the content is replicated to the specified number of providers
  Future<String> contentEnsureReplicationDatacidGet(String datacid) async {
    Object postBody = null;

    // verify required params are set
    if(datacid == null) {
     throw new ApiException(400, "Missing required param: datacid");
    }

    // create path and map variables
    String path = "/content/ensure-replication/{datacid}".replaceAll("{format}","json").replaceAll("{" + "datacid" + "}", datacid.toString());

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
  /// List all failures for a content
  ///
  /// This endpoint returns all failures for a content
  Future<String> contentFailuresContentGet(String content) async {
    Object postBody = null;

    // verify required params are set
    if(content == null) {
     throw new ApiException(400, "Missing required param: content");
    }

    // create path and map variables
    String path = "/content/failures/{content}".replaceAll("{format}","json").replaceAll("{" + "content" + "}", content.toString());

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
  /// Content
  ///
  /// This endpoint returns a content by its ID
  Future<String> contentIdGet(int id) async {
    Object postBody = null;

    // verify required params are set
    if(id == null) {
     throw new ApiException(400, "Missing required param: id");
    }

    // create path and map variables
    String path = "/content/{id}".replaceAll("{format}","json").replaceAll("{" + "id" + "}", id.toString());

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
  /// List all pinned content
  ///
  /// This endpoint lists all content
  Future<String> contentListGet() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/content/list".replaceAll("{format}","json");

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
  /// Get staging zone for user, excluding its contents
  ///
  /// This endpoint is used to get staging zone for user, excluding its contents.
  Future<String> contentStagingZonesGet() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/content/staging-zones".replaceAll("{format}","json");

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
  /// Get contents for a staging zone
  ///
  /// This endpoint is used to get the contents for a staging zone
  Future<String> contentStagingZonesStagingZoneContentsGet(int stagingZone, String limit, String offset) async {
    Object postBody = null;

    // verify required params are set
    if(stagingZone == null) {
     throw new ApiException(400, "Missing required param: stagingZone");
    }
    if(limit == null) {
     throw new ApiException(400, "Missing required param: limit");
    }
    if(offset == null) {
     throw new ApiException(400, "Missing required param: offset");
    }

    // create path and map variables
    String path = "/content/staging-zones/{staging_zone}/contents".replaceAll("{format}","json").replaceAll("{" + "staging_zone" + "}", stagingZone.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "limit", limit));
      queryParams.addAll(_convertParametersForCollectionFormat("", "offset", offset));
    
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
  /// Get staging zone without its contents field populated
  ///
  /// This endpoint is used to get a staging zone, excluding its contents.
  Future<String> contentStagingZonesStagingZoneGet(int stagingZone) async {
    Object postBody = null;

    // verify required params are set
    if(stagingZone == null) {
     throw new ApiException(400, "Missing required param: stagingZone");
    }

    // create path and map variables
    String path = "/content/staging-zones/{staging_zone}".replaceAll("{format}","json").replaceAll("{" + "staging_zone" + "}", stagingZone.toString());

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
  /// Get content statistics
  ///
  /// This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content
  Future<String> contentStatsGet(String limit, String offset) async {
    Object postBody = null;

    // verify required params are set
    if(limit == null) {
     throw new ApiException(400, "Missing required param: limit");
    }
    if(offset == null) {
     throw new ApiException(400, "Missing required param: offset");
    }

    // create path and map variables
    String path = "/content/stats".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "limit", limit));
      queryParams.addAll(_convertParametersForCollectionFormat("", "offset", offset));
    
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
  /// Content Status
  ///
  /// This endpoint returns the status of a content
  Future<String> contentStatusIdGet(int id) async {
    Object postBody = null;

    // verify required params are set
    if(id == null) {
     throw new ApiException(400, "Missing required param: id");
    }

    // create path and map variables
    String path = "/content/status/{id}".replaceAll("{format}","json").replaceAll("{" + "id" + "}", id.toString());

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
