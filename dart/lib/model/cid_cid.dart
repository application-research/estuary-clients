part of swagger.api;

class CidCid {
  
  CidCid();

  @override
  String toString() {
    return 'CidCid[]';
  }

  CidCid.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<CidCid> listFromJson(List<dynamic> json) {
    return json == null ? new List<CidCid>() : json.map((value) => new CidCid.fromJson(value)).toList();
  }

  static Map<String, CidCid> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, CidCid>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new CidCid.fromJson(value));
    }
    return map;
  }
}
