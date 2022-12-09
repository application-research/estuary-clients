part of swagger.api;

class ApiChannelIDParam {
  
  int id = null;

  String initiator = null;

  String responder = null;

  ApiChannelIDParam();

  @override
  String toString() {
    return 'ApiChannelIDParam[id=$id, initiator=$initiator, responder=$responder, ]';
  }

  ApiChannelIDParam.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    initiator = json['initiator'];
    responder = json['responder'];
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'initiator': initiator,
      'responder': responder
     };
  }

  static List<ApiChannelIDParam> listFromJson(List<dynamic> json) {
    return json == null ? new List<ApiChannelIDParam>() : json.map((value) => new ApiChannelIDParam.fromJson(value)).toList();
  }

  static Map<String, ApiChannelIDParam> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ApiChannelIDParam>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ApiChannelIDParam.fromJson(value));
    }
    return map;
  }
}
