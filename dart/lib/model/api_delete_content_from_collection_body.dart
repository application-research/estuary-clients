part of swagger.api;

class ApiDeleteContentFromCollectionBody {
  
  String by = null;

  String value = null;

  ApiDeleteContentFromCollectionBody();

  @override
  String toString() {
    return 'ApiDeleteContentFromCollectionBody[by=$by, value=$value, ]';
  }

  ApiDeleteContentFromCollectionBody.fromJson(Map<String, dynamic> json) {
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

  static List<ApiDeleteContentFromCollectionBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<ApiDeleteContentFromCollectionBody>() : json.map((value) => new ApiDeleteContentFromCollectionBody.fromJson(value)).toList();
  }

  static Map<String, ApiDeleteContentFromCollectionBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ApiDeleteContentFromCollectionBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ApiDeleteContentFromCollectionBody.fromJson(value));
    }
    return map;
  }
}
