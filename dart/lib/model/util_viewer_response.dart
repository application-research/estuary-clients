part of swagger.api;

class UtilViewerResponse {
  
  String address = null;

  String authExpiry = null;

  int id = null;

  List<String> miners = [];

  int perms = null;

  UtilUserSettings settings = null;

  String username = null;

  UtilViewerResponse();

  @override
  String toString() {
    return 'UtilViewerResponse[address=$address, authExpiry=$authExpiry, id=$id, miners=$miners, perms=$perms, settings=$settings, username=$username, ]';
  }

  UtilViewerResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    address = json['address'];
    authExpiry = json['auth_expiry'];
    id = json['id'];
    miners = (json['miners'] as List).map((item) => item as String).toList();
    perms = json['perms'];
    settings = new UtilUserSettings.fromJson(json['settings']);
    username = json['username'];
  }

  Map<String, dynamic> toJson() {
    return {
      'address': address,
      'auth_expiry': authExpiry,
      'id': id,
      'miners': miners,
      'perms': perms,
      'settings': settings,
      'username': username
     };
  }

  static List<UtilViewerResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<UtilViewerResponse>() : json.map((value) => new UtilViewerResponse.fromJson(value)).toList();
  }

  static Map<String, UtilViewerResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, UtilViewerResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new UtilViewerResponse.fromJson(value));
    }
    return map;
  }
}
