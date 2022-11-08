part of swagger.api;

class MainGetApiKeysResp {
  
  String expiry = null;
  

  String label = null;
  

  String token = null;
  

  String tokenHash = null;
  
  MainGetApiKeysResp();

  @override
  String toString() {
    return 'MainGetApiKeysResp[expiry=$expiry, label=$label, token=$token, tokenHash=$tokenHash, ]';
  }

  MainGetApiKeysResp.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    expiry =
        json['expiry']
    ;
    label =
        json['label']
    ;
    token =
        json['token']
    ;
    tokenHash =
        json['tokenHash']
    ;
  }

  Map<String, dynamic> toJson() {
    return {
      'expiry': expiry,
      'label': label,
      'token': token,
      'tokenHash': tokenHash
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

