part of swagger.api;

class ApiClaimMsgResponse {
  
  String hexmsg = null;

  ApiClaimMsgResponse();

  @override
  String toString() {
    return 'ApiClaimMsgResponse[hexmsg=$hexmsg, ]';
  }

  ApiClaimMsgResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    hexmsg = json['hexmsg'];
  }

  Map<String, dynamic> toJson() {
    return {
      'hexmsg': hexmsg
     };
  }

  static List<ApiClaimMsgResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<ApiClaimMsgResponse>() : json.map((value) => new ApiClaimMsgResponse.fromJson(value)).toList();
  }

  static Map<String, ApiClaimMsgResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ApiClaimMsgResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ApiClaimMsgResponse.fromJson(value));
    }
    return map;
  }
}
