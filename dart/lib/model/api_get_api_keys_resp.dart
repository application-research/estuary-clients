part of swagger.api;

class ApiGetApiKeysResp {
  
  String expiry = null;

  bool isSession = null;

  String label = null;

  String token = null;

  String tokenHash = null;

  ApiGetApiKeysResp();

  @override
  String toString() {
    return 'ApiGetApiKeysResp[expiry=$expiry, isSession=$isSession, label=$label, token=$token, tokenHash=$tokenHash, ]';
  }

  ApiGetApiKeysResp.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    expiry = json['expiry'];
    isSession = json['isSession'];
    label = json['label'];
    token = json['token'];
    tokenHash = json['tokenHash'];
  }

  Map<String, dynamic> toJson() {
    return {
      'expiry': expiry,
      'isSession': isSession,
      'label': label,
      'token': token,
      'tokenHash': tokenHash
     };
  }

  static List<ApiGetApiKeysResp> listFromJson(List<dynamic> json) {
    return json == null ? new List<ApiGetApiKeysResp>() : json.map((value) => new ApiGetApiKeysResp.fromJson(value)).toList();
  }

  static Map<String, ApiGetApiKeysResp> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ApiGetApiKeysResp>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ApiGetApiKeysResp.fromJson(value));
    }
    return map;
  }
}
