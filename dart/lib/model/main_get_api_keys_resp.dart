part of swagger.api;

class MainGetApiKeysResp {
  
  String expiry = null;
  

  String token = null;
  
  MainGetApiKeysResp();

  @override
  String toString() {
    return 'MainGetApiKeysResp[expiry=$expiry, token=$token, ]';
  }

  MainGetApiKeysResp.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    expiry =
        json['expiry']
    ;
    token =
        json['token']
    ;
  }

  Map<String, dynamic> toJson() {
    return {
      'expiry': expiry,
      'token': token
     };
  }

  static List<MainGetApiKeysResp> listFromJson(List<dynamic> json) {
    return json == null ? new List<MainGetApiKeysResp>() : json.map((value) => new MainGetApiKeysResp.fromJson(value)).toList();
  }

  static Map<String, MainGetApiKeysResp> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MainGetApiKeysResp>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MainGetApiKeysResp.fromJson(value));
    }
    return map;
  }
}

