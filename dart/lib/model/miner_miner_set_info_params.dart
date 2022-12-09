part of swagger.api;

class MinerMinerSetInfoParams {
  
  String name = null;

  MinerMinerSetInfoParams();

  @override
  String toString() {
    return 'MinerMinerSetInfoParams[name=$name, ]';
  }

  MinerMinerSetInfoParams.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name
     };
  }

  static List<MinerMinerSetInfoParams> listFromJson(List<dynamic> json) {
    return json == null ? new List<MinerMinerSetInfoParams>() : json.map((value) => new MinerMinerSetInfoParams.fromJson(value)).toList();
  }

  static Map<String, MinerMinerSetInfoParams> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MinerMinerSetInfoParams>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MinerMinerSetInfoParams.fromJson(value));
    }
    return map;
  }
}
