part of swagger.api;

class ApiEstimateDealBody {
  
  int durationBlks = null;

  int replication = null;

  int size = null;

  bool verified = null;

  ApiEstimateDealBody();

  @override
  String toString() {
    return 'ApiEstimateDealBody[durationBlks=$durationBlks, replication=$replication, size=$size, verified=$verified, ]';
  }

  ApiEstimateDealBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    durationBlks = json['durationBlks'];
    replication = json['replication'];
    size = json['size'];
    verified = json['verified'];
  }

  Map<String, dynamic> toJson() {
    return {
      'durationBlks': durationBlks,
      'replication': replication,
      'size': size,
      'verified': verified
     };
  }

  static List<ApiEstimateDealBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<ApiEstimateDealBody>() : json.map((value) => new ApiEstimateDealBody.fromJson(value)).toList();
  }

  static Map<String, ApiEstimateDealBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ApiEstimateDealBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ApiEstimateDealBody.fromJson(value));
    }
    return map;
  }
}
