part of swagger.api;

class PinnerIpfsPin {
  
  String cid = null;

  Map meta = {};

  String name = null;

  List<String> origins = [];

  PinnerIpfsPin();

  @override
  String toString() {
    return 'PinnerIpfsPin[cid=$cid, meta=$meta, name=$name, origins=$origins, ]';
  }

  PinnerIpfsPin.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    cid = json['cid'];
    meta = Object.mapFromJson(json['meta']);
    name = json['name'];
    origins = (json['origins'] as List).map((item) => item as String).toList();
  }

  Map<String, dynamic> toJson() {
    return {
      'cid': cid,
      'meta': meta,
      'name': name,
      'origins': origins
     };
  }

  static List<PinnerIpfsPin> listFromJson(List<dynamic> json) {
    return json == null ? new List<PinnerIpfsPin>() : json.map((value) => new PinnerIpfsPin.fromJson(value)).toList();
  }

  static Map<String, PinnerIpfsPin> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, PinnerIpfsPin>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new PinnerIpfsPin.fromJson(value));
    }
    return map;
  }
}
