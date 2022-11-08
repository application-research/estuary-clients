part of swagger.api;

class TypesIpfsPin {
  
  String cid = null;
  

  Object meta = null;
  

  String name = null;
  

  List<String> origins = [];
  
  TypesIpfsPin();

  @override
  String toString() {
    return 'TypesIpfsPin[cid=$cid, meta=$meta, name=$name, origins=$origins, ]';
  }

  TypesIpfsPin.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    cid =
        json['cid']
    ;
    meta =
      
      
      new Object.fromJson(json['meta'])
;
    name =
        json['name']
    ;
    origins =
        (json['origins'] as List).map((item) => item as String).toList()
    ;
  }

  Map<String, dynamic> toJson() {
    return {
      'cid': cid,
      'meta': meta,
      'name': name,
      'origins': origins
     };
  }

  static List<TypesIpfsPin> listFromJson(List<dynamic> json) {
    return json == null ? new List<TypesIpfsPin>() : json.map((value) => new TypesIpfsPin.fromJson(value)).toList();
  }

  static Map<String, TypesIpfsPin> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, TypesIpfsPin>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new TypesIpfsPin.fromJson(value));
    }
    return map;
  }
}

