part of swagger.api;

class QueryParam {
  String name;
  String value;

  QueryParam(this.name, this.value);
}

class ApiClient {

  String basePath;
  var client = new BrowserClient();

  Map<String, String> _defaultHeaderMap = {};
  Map<String, Authentication> _authentications = {};

  final _RegList = new RegExp(r'^List<(.*)>$');
  final _RegMap = new RegExp(r'^Map<String,(.*)>$');

  ApiClient({this.basePath: "//api.estuary.tech/"}) {
    // Setup authentications (key: authentication name, value: authentication).
    _authentications['bearerAuth'] = new ApiKeyAuth("header", "Authorization");
  }

  void addDefaultHeader(String key, String value) {
     _defaultHeaderMap[key] = value;
  }

  dynamic _deserialize(dynamic value, String targetType) {
    try {
      switch (targetType) {
        case 'String':
          return '$value';
        case 'int':
          return value is int ? value : int.parse('$value');
        case 'bool':
          return value is bool ? value : '$value'.toLowerCase() == 'true';
        case 'double':
          return value is double ? value : double.parse('$value');
        case 'AddressAddress':
          return new AddressAddress.fromJson(value);
        case 'ApiChannelIDParam':
          return new ApiChannelIDParam.fromJson(value);
        case 'ApiClaimMsgResponse':
          return new ApiClaimMsgResponse.fromJson(value);
        case 'ApiClaimResponse':
          return new ApiClaimResponse.fromJson(value);
        case 'ApiCreateCollectionBody':
          return new ApiCreateCollectionBody.fromJson(value);
        case 'ApiDeleteContentFromCollectionBody':
          return new ApiDeleteContentFromCollectionBody.fromJson(value);
        case 'ApiEmptyResp':
          return new ApiEmptyResp.fromJson(value);
        case 'ApiEstimateDealBody':
          return new ApiEstimateDealBody.fromJson(value);
        case 'ApiGetApiKeysResp':
          return new ApiGetApiKeysResp.fromJson(value);
        case 'ApiPublicNodeInfo':
          return new ApiPublicNodeInfo.fromJson(value);
        case 'AutoretrieveInitBody':
          return new AutoretrieveInitBody.fromJson(value);
        case 'CidCid':
          return new CidCid.fromJson(value);
        case 'CollectionsCidType':
           return new CollectionsCidType.fromJson(value);
        case 'CollectionsCollection':
          return new CollectionsCollection.fromJson(value);
        case 'CollectionsCollectionListResponse':
          return new CollectionsCollectionListResponse.fromJson(value);
        case 'MainImportDealBody':
          return new MainImportDealBody.fromJson(value);
        case 'MinerClaimMinerBody':
          return new MinerClaimMinerBody.fromJson(value);
        case 'MinerMinerSetInfoParams':
          return new MinerMinerSetInfoParams.fromJson(value);
        case 'MinerSuspendMinerBody':
          return new MinerSuspendMinerBody.fromJson(value);
        case 'TypesIpfsListPinStatusResponse':
          return new TypesIpfsListPinStatusResponse.fromJson(value);
        case 'TypesIpfsPin':
          return new TypesIpfsPin.fromJson(value);
        case 'TypesIpfsPinStatusResponse':
          return new TypesIpfsPinStatusResponse.fromJson(value);
        case 'TypesPinningStatus':
           return new TypesPinningStatus.fromJson(value);
        case 'UtilContentAddResponse':
          return new UtilContentAddResponse.fromJson(value);
        case 'UtilContentCreateBody':
          return new UtilContentCreateBody.fromJson(value);
        case 'UtilContentType':
           return new UtilContentType.fromJson(value);
        case 'UtilDbCID':
          return new UtilDbCID.fromJson(value);
        case 'UtilHttpError':
          return new UtilHttpError.fromJson(value);
        case 'UtilUserSettings':
          return new UtilUserSettings.fromJson(value);
        case 'UtilViewerResponse':
          return new UtilViewerResponse.fromJson(value);
        default:
          {
            Match match;
            if (value is List &&
                (match = _RegList.firstMatch(targetType)) != null) {
              var newTargetType = match[1];
              return value.map((v) => _deserialize(v, newTargetType)).toList();
            } else if (value is Map &&
                (match = _RegMap.firstMatch(targetType)) != null) {
              var newTargetType = match[1];
              return new Map.fromIterables(value.keys,
                  value.values.map((v) => _deserialize(v, newTargetType)));
            }
          }
      }
    } catch (e, stack) {
      throw new ApiException.withInner(500, 'Exception during deserialization.', e, stack);
    }
    throw new ApiException(500, 'Could not find a suitable class for deserialization');
  }

  dynamic deserialize(String jsonVal, String targetType) {
    // Remove all spaces.  Necessary for reg expressions as well.
    targetType = targetType.replaceAll(' ', '');

    if (targetType == 'String') return jsonVal;

    var decodedJson = json.decode(jsonVal);
    return _deserialize(decodedJson, targetType);
  }

  String serialize(Object obj) {
    String serialized = '';
    if (obj == null) {
      serialized = '';
    } else {
      serialized = json.encode(obj);
    }
    return serialized;
  }

  // We don't use a Map<String, String> for queryParams.
  // If collectionFormat is 'multi' a key might appear multiple times.
  Future<Response> invokeAPI(String path,
                             String method,
                             Iterable<QueryParam> queryParams,
                             Object body,
                             Map<String, String> headerParams,
                             Map<String, String> formParams,
                             String contentType,
                             List<String> authNames) async {

    _updateParamsForAuth(authNames, queryParams, headerParams);

    var ps = queryParams.where((p) => p.value != null).map((p) => '${Uri.encodeComponent(p.name)}=${Uri.encodeComponent(p.value)}');
    String queryString = ps.isNotEmpty ?
                         '?' + ps.join('&') :
                         '';

    String url = basePath + path + queryString;

    headerParams.addAll(_defaultHeaderMap);
    headerParams['Content-Type'] = contentType;

    if(body is MultipartRequest) {
      var request = new MultipartRequest(method, Uri.parse(url));
      request.fields.addAll(body.fields);
      request.files.addAll(body.files);
      request.headers.addAll(body.headers);
      request.headers.addAll(headerParams);
      var response = await client.send(request);
      return Response.fromStream(response);
    } else {
      var msgBody = contentType == "application/x-www-form-urlencoded" ? formParams : serialize(body);
      switch(method) {
        case "POST":
          return client.post(url, headers: headerParams, body: msgBody);
        case "PUT":
          return client.put(url, headers: headerParams, body: msgBody);
        case "DELETE":
          return client.delete(url, headers: headerParams);
        case "PATCH":
          return client.patch(url, headers: headerParams, body: msgBody);
        default:
          return client.get(url, headers: headerParams);
      }
    }
  }

  /// Update query and header parameters based on authentication settings.
  /// @param authNames The authentications to apply
  void _updateParamsForAuth(List<String> authNames, List<QueryParam> queryParams, Map<String, String> headerParams) {
    authNames.forEach((authName) {
      Authentication auth = _authentications[authName];
      if (auth == null) throw new ArgumentError("Authentication undefined: " + authName);
      auth.applyToParams(queryParams, headerParams);
    });
  }

  void setAccessToken(String accessToken) {
    _authentications.forEach((key, auth) {
      if (auth is OAuth) {
        auth.setAccessToken(accessToken);
      }
    });
  }
}
