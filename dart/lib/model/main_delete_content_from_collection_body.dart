part of swagger.api;

class MainDeleteContentFromCollectionBody {
  
  String by = null;

  String value = null;

  MainDeleteContentFromCollectionBody();

  @override
  String toString() {
    return 'MainDeleteContentFromCollectionBody[by=$by, value=$value, ]';
  }

  MainDeleteContentFromCollectionBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    by = json['by'];
    value = json['value'];
  }

  Map<String, dynamic> toJson() {
    return {
      'by': by,
      'value': value
     };
  }

  static List<MainDeleteContentFromCollectionBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<MainDeleteContentFromCollectionBody>() : json.map((value) => new MainDeleteContentFromCollectionBody.fromJson(value)).toList();
  }

  static Map<String, MainDeleteContentFromCollectionBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MainDeleteContentFromCollectionBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MainDeleteContentFromCollectionBody.fromJson(value));
    }
    return map;
  }
}
