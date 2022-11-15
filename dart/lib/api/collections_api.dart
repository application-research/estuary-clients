part of swagger.api;



class CollectionsApi {
  final ApiClient apiClient;

  CollectionsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Produce a CID of the collection contents
  ///
  /// This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
  Future<String> collectionsColuuidCommitPost(String coluuid) async {
    Object postBody = null;

    // verify required params are set
    if(coluuid == null) {
     throw new ApiException(400, "Missing required param: coluuid");
    }

    // create path and map variables
    String path = "/collections/{coluuid}/commit".replaceAll("{format}","json").replaceAll("{" + "coluuid" + "}", coluuid.toString());

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
  /// Deletes a content from a collection
  ///
  /// This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
  Future<String> collectionsColuuidContentsDelete(MainDeleteContentFromCollectionBody body, String coluuid, String contentid) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }
    if(coluuid == null) {
     throw new ApiException(400, "Missing required param: coluuid");
    }
    if(contentid == null) {
     throw new ApiException(400, "Missing required param: contentid");
    }

    // create path and map variables
    String path = "/collections/{coluuid}/contents".replaceAll("{format}","json").replaceAll("{" + "coluuid" + "}", coluuid.toString()).replaceAll("{" + "contentid" + "}", contentid.toString());

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
          apiClient.deserialize(response.body, 'String') as String ;
    } else {
      return null;
    }
  }
  /// Deletes a collection
  ///
  /// This endpoint is used to delete an existing collection.
  Future<String> collectionsColuuidDelete(String coluuid) async {
    Object postBody = null;

    // verify required params are set
    if(coluuid == null) {
     throw new ApiException(400, "Missing required param: coluuid");
    }

    // create path and map variables
    String path = "/collections/{coluuid}".replaceAll("{format}","json").replaceAll("{" + "coluuid" + "}", coluuid.toString());

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
          apiClient.deserialize(response.body, 'String') as String ;
    } else {
      return null;
    }
  }
  /// Get contents in a collection
  ///
  /// This endpoint is used to get contents in a collection. If no colpath query param is passed
  Future<String> collectionsColuuidGet(String coluuid, { String dir }) async {
    Object postBody = null;

    // verify required params are set
    if(coluuid == null) {
     throw new ApiException(400, "Missing required param: coluuid");
    }

    // create path and map variables
    String path = "/collections/{coluuid}".replaceAll("{format}","json").replaceAll("{" + "coluuid" + "}", coluuid.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(dir != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "dir", dir));
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
  /// Add contents to a collection
  ///
  /// This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
  Future<String> collectionsColuuidPost(List<int> body, String coluuid) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }
    if(coluuid == null) {
     throw new ApiException(400, "Missing required param: coluuid");
    }

    // create path and map variables
    String path = "/collections/{coluuid}".replaceAll("{format}","json").replaceAll("{" + "coluuid" + "}", coluuid.toString());

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
          apiClient.deserialize(response.body, 'String') as String ;
    } else {
      return null;
    }
  }
  /// Add a file to a collection
  ///
  /// This endpoint adds a file to a collection
  Future<String> collectionsFsAddPost(String coluuid, String content, String path) async {
    Object postBody = null;

    // verify required params are set
    if(coluuid == null) {
     throw new ApiException(400, "Missing required param: coluuid");
    }
    if(content == null) {
     throw new ApiException(400, "Missing required param: content");
    }
    if(path == null) {
     throw new ApiException(400, "Missing required param: path");
    }

    // create path and map variables
    String path = "/collections/fs/add".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "coluuid", coluuid));
      queryParams.addAll(_convertParametersForCollectionFormat("", "content", content));
      queryParams.addAll(_convertParametersForCollectionFormat("", "path", path));
    
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
  /// List all collections
  ///
  /// This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
  Future<List<List<CollectionsCollection>>> collectionsGet() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/collections/".replaceAll("{format}","json");

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
        (apiClient.deserialize(response.body, 'List<List<CollectionsCollection>>') as List).map((item) => item as List).toList();
    } else {
      return null;
    }
  }
  /// Create a new collection
  ///
  /// This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
  Future<CollectionsCollection> collectionsPost(MainCreateCollectionBody body) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }

    // create path and map variables
    String path = "/collections/".replaceAll("{format}","json");

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
          apiClient.deserialize(response.body, 'CollectionsCollection') as CollectionsCollection ;
    } else {
      return null;
    }
  }
}
