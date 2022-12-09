part of swagger.api;

class MinerSuspendMinerBody {
  
  String reason = null;

  MinerSuspendMinerBody();

  @override
  String toString() {
    return 'MinerSuspendMinerBody[reason=$reason, ]';
  }

  MinerSuspendMinerBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    reason = json['reason'];
  }

  Map<String, dynamic> toJson() {
    return {
      'reason': reason
     };
  }

  static List<MinerSuspendMinerBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<MinerSuspendMinerBody>() : json.map((value) => new MinerSuspendMinerBody.fromJson(value)).toList();
  }

  static Map<String, MinerSuspendMinerBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MinerSuspendMinerBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MinerSuspendMinerBody.fromJson(value));
    }
    return map;
  }
}
