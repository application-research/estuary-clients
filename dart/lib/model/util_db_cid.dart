part of swagger.api;

class UtilDbCID {
  
  CidCid cid = null;

  UtilDbCID();

  @override
  String toString() {
    return 'UtilDbCID[cid=$cid, ]';
  }

  UtilDbCID.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    cid = new CidCid.fromJson(json['cid']);
  }

  Map<String, dynamic> toJson() {
    return {
      'cid': cid
     };
  }

  static List<UtilDbCID> listFromJson(List<dynamic> json) {
    return json == null ? new List<UtilDbCID>() : json.map((value) => new UtilDbCID.fromJson(value)).toList();
  }

  static Map<String, UtilDbCID> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, UtilDbCID>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new UtilDbCID.fromJson(value));
    }
    return map;
  }
}
