part of swagger.api;

class ApiEmptyResp {
  
  ApiEmptyResp();

  @override
  String toString() {
    return 'ApiEmptyResp[]';
  }

  ApiEmptyResp.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<ApiEmptyResp> listFromJson(List<dynamic> json) {
    return json == null ? new List<ApiEmptyResp>() : json.map((value) => new ApiEmptyResp.fromJson(value)).toList();
  }

  static Map<String, ApiEmptyResp> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ApiEmptyResp>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ApiEmptyResp.fromJson(value));
    }
    return map;
  }
}
