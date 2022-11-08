part of swagger.api;

class MainChannelIDParam {
  
  int id = null;
  

  String initiator = null;
  

  String responder = null;
  
  MainChannelIDParam();

  @override
  String toString() {
    return 'MainChannelIDParam[id=$id, initiator=$initiator, responder=$responder, ]';
  }

  MainChannelIDParam.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id =
        json['id']
    ;
    initiator =
        json['initiator']
    ;
    responder =
        json['responder']
    ;
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'initiator': initiator,
      'responder': responder
     };
  }

  static List<MainChannelIDParam> listFromJson(List<dynamic> json) {
    return json == null ? new List<MainChannelIDParam>() : json.map((value) => new MainChannelIDParam.fromJson(value)).toList();
  }

  static Map<String, MainChannelIDParam> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MainChannelIDParam>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MainChannelIDParam.fromJson(value));
    }
    return map;
  }
}

