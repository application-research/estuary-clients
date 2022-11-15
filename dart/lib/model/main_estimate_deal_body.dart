part of swagger.api;

class MainEstimateDealBody {
  
  int durationBlks = null;

  int replication = null;

  int size = null;

  bool verified = null;

  MainEstimateDealBody();

  @override
  String toString() {
    return 'MainEstimateDealBody[durationBlks=$durationBlks, replication=$replication, size=$size, verified=$verified, ]';
  }

  MainEstimateDealBody.fromJson(Map<String, dynamic> json) {
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

  static List<MainEstimateDealBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<MainEstimateDealBody>() : json.map((value) => new MainEstimateDealBody.fromJson(value)).toList();
  }

  static Map<String, MainEstimateDealBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MainEstimateDealBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MainEstimateDealBody.fromJson(value));
    }
    return map;
  }
}
