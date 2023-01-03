part of swagger.api;

class ApiClaimResponse {
  
  bool success = null;

  ApiClaimResponse();

  @override
  String toString() {
    return 'ApiClaimResponse[success=$success, ]';
  }

  ApiClaimResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    success = json['success'];
  }

  Map<String, dynamic> toJson() {
    return {
      'success': success
     };
  }

  static List<ApiClaimResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<ApiClaimResponse>() : json.map((value) => new ApiClaimResponse.fromJson(value)).toList();
  }

  static Map<String, ApiClaimResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ApiClaimResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ApiClaimResponse.fromJson(value));
    }
    return map;
  }
}
