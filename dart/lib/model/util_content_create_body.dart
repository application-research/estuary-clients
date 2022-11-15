part of swagger.api;

class UtilContentCreateBody {
  
  String coluuid = null;

  String dir = null;

  String location = null;

  String name = null;

  String root = null;

  int type = null;

  UtilContentCreateBody();

  @override
  String toString() {
    return 'UtilContentCreateBody[coluuid=$coluuid, dir=$dir, location=$location, name=$name, root=$root, type=$type, ]';
  }

  UtilContentCreateBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    coluuid = json['coluuid'];
    dir = json['dir'];
    location = json['location'];
    name = json['name'];
    root = json['root'];
    type = json['type'];
  }

  Map<String, dynamic> toJson() {
    return {
      'coluuid': coluuid,
      'dir': dir,
      'location': location,
      'name': name,
      'root': root,
      'type': type
     };
  }

  static List<UtilContentCreateBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<UtilContentCreateBody>() : json.map((value) => new UtilContentCreateBody.fromJson(value)).toList();
  }

  static Map<String, UtilContentCreateBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, UtilContentCreateBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new UtilContentCreateBody.fromJson(value));
    }
    return map;
  }
}
