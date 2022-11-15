part of swagger.api;

class MainCreateCollectionBody {
  
  String description = null;

  String name = null;

  MainCreateCollectionBody();

  @override
  String toString() {
    return 'MainCreateCollectionBody[description=$description, name=$name, ]';
  }

  MainCreateCollectionBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    description = json['description'];
    name = json['name'];
  }

  Map<String, dynamic> toJson() {
    return {
      'description': description,
      'name': name
     };
  }

  static List<MainCreateCollectionBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<MainCreateCollectionBody>() : json.map((value) => new MainCreateCollectionBody.fromJson(value)).toList();
  }

  static Map<String, MainCreateCollectionBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MainCreateCollectionBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MainCreateCollectionBody.fromJson(value));
    }
    return map;
  }
}
