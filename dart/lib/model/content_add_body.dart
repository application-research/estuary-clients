part of swagger.api;

class ContentAddBody {
  /* File to upload */
  String data = null;
/* Filenam to use for upload */
  String filename = null;

  ContentAddBody();

  @override
  String toString() {
    return 'ContentAddBody[data=$data, filename=$filename, ]';
  }

  ContentAddBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    data = json['data'];
    filename = json['filename'];
  }

  Map<String, dynamic> toJson() {
    return {
      'data': data,
      'filename': filename
     };
  }

  static List<ContentAddBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<ContentAddBody>() : json.map((value) => new ContentAddBody.fromJson(value)).toList();
  }

  static Map<String, ContentAddBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ContentAddBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ContentAddBody.fromJson(value));
    }
    return map;
  }
}
