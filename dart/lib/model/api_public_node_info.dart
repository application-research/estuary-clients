part of swagger.api;

class ApiPublicNodeInfo {
  
  AddressAddress primaryAddress = null;

  ApiPublicNodeInfo();

  @override
  String toString() {
    return 'ApiPublicNodeInfo[primaryAddress=$primaryAddress, ]';
  }

  ApiPublicNodeInfo.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    primaryAddress = new AddressAddress.fromJson(json['primaryAddress']);
  }

  Map<String, dynamic> toJson() {
    return {
      'primaryAddress': primaryAddress
     };
  }

  static List<ApiPublicNodeInfo> listFromJson(List<dynamic> json) {
    return json == null ? new List<ApiPublicNodeInfo>() : json.map((value) => new ApiPublicNodeInfo.fromJson(value)).toList();
  }

  static Map<String, ApiPublicNodeInfo> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ApiPublicNodeInfo>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ApiPublicNodeInfo.fromJson(value));
    }
    return map;
  }
}
