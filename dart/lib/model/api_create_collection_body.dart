part of swagger.api;

class ApiCreateCollectionBody {
  
  String description = null;

  String name = null;

  ApiCreateCollectionBody();

  @override
  String toString() {
    return 'ApiCreateCollectionBody[description=$description, name=$name, ]';
  }

  ApiCreateCollectionBody.fromJson(Map<String, dynamic> json) {
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

  static List<ApiCreateCollectionBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<ApiCreateCollectionBody>() : json.map((value) => new ApiCreateCollectionBody.fromJson(value)).toList();
  }

  static Map<String, ApiCreateCollectionBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ApiCreateCollectionBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ApiCreateCollectionBody.fromJson(value));
    }
    return map;
  }
}
